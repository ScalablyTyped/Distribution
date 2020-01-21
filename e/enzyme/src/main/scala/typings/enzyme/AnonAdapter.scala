package typings.enzyme

import typings.enzyme.mod.EnzymeAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdapter extends js.Object {
  var adapter: EnzymeAdapter
  // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/guides/migration-from-2-to-3.md#lifecycle-methods
  // Actually, `{adapter:} & Pick<ShallowRendererProps,"disableLifecycleMethods">` is more precise. However,
  // in that case jsdoc won't be shown
  /**
    * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
    * setProps and setContext. Default to false.
    */
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.undefined
}

object AnonAdapter {
  @scala.inline
  def apply(adapter: EnzymeAdapter, disableLifecycleMethods: js.UndefOr[Boolean] = js.undefined): AnonAdapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLifecycleMethods)) __obj.updateDynamic("disableLifecycleMethods")(disableLifecycleMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdapter]
  }
}

