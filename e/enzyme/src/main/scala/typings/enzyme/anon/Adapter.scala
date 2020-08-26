package typings.enzyme.anon

import typings.enzyme.mod.EnzymeAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  var adapter: EnzymeAdapter = js.native
  // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/guides/migration-from-2-to-3.md#lifecycle-methods
  // Actually, `{adapter:} & Pick<ShallowRendererProps,"disableLifecycleMethods">` is more precise. However,
  // in that case jsdoc won't be shown
  /**
    * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
    * setProps and setContext. Default to false.
    */
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.native
}

object Adapter {
  @scala.inline
  def apply(adapter: EnzymeAdapter): Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdapter(value: EnzymeAdapter): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableLifecycleMethods(value: Boolean): Self = this.set("disableLifecycleMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableLifecycleMethods: Self = this.set("disableLifecycleMethods", js.undefined)
  }
  
}

