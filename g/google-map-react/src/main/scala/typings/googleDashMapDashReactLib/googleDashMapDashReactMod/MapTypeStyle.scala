package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeStyle extends js.Object {
  var elementType: js.UndefOr[java.lang.String] = js.undefined
  var featureType: js.UndefOr[java.lang.String] = js.undefined
  var stylers: js.Array[_]
}

object MapTypeStyle {
  @scala.inline
  def apply(stylers: js.Array[_], elementType: java.lang.String = null, featureType: java.lang.String = null): MapTypeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stylers")(stylers)
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    if (featureType != null) __obj.updateDynamic("featureType")(featureType)
    __obj.asInstanceOf[MapTypeStyle]
  }
}

