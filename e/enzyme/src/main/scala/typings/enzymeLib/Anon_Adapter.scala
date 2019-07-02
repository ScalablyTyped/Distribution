package typings
package enzymeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adapter extends js.Object {
  var adapter: enzymeLib.enzymeMod.EnzymeAdapter
  // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/guides/migration-from-2-to-3.md#lifecycle-methods
  // Actually, `{adapter:} & Pick<ShallowRendererProps,"disableLifecycleMethods">` is more precise. However,
  // in that case jsdoc won't be shown
  /**
    * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
    * setProps and setContext. Default to false.
    */
  var disableLifecycleMethods: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Adapter {
  @scala.inline
  def apply(
    adapter: enzymeLib.enzymeMod.EnzymeAdapter,
    disableLifecycleMethods: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter)
    if (!js.isUndefined(disableLifecycleMethods)) __obj.updateDynamic("disableLifecycleMethods")(disableLifecycleMethods)
    __obj.asInstanceOf[Anon_Adapter]
  }
}

