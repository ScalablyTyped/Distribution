package typings.googleDashMapDashReact.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeStyle extends js.Object {
  var elementType: js.UndefOr[String] = js.undefined
  var featureType: js.UndefOr[String] = js.undefined
  var stylers: js.Array[_]
}

object MapTypeStyle {
  @scala.inline
  def apply(stylers: js.Array[_], elementType: String = null, featureType: String = null): MapTypeStyle = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (featureType != null) __obj.updateDynamic("featureType")(featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyle]
  }
}

