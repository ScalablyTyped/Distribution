package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextWrapSettings extends js.Object {
  /** This specifies the grid to apply the auto wrap for grid content or header or both.
    * @Default {ej.Grid.WrapMode.Both}
    */
  var wrapMode: js.UndefOr[WrapMode | java.lang.String] = js.undefined
}

object TextWrapSettings {
  @scala.inline
  def apply(wrapMode: WrapMode | java.lang.String = null): TextWrapSettings = {
    val __obj = js.Dynamic.literal()
    if (wrapMode != null) __obj.updateDynamic("wrapMode")(wrapMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWrapSettings]
  }
}

