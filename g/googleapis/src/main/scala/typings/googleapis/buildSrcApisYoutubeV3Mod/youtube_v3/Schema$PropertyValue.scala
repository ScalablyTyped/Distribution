package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pair Property / Value.
  */
@js.native
trait Schema$PropertyValue extends js.Object {
  /**
    * A property.
    */
  var property: js.UndefOr[String] = js.native
  /**
    * The property&#39;s value.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$PropertyValue {
  @scala.inline
  def apply(property: String = null, value: String = null): Schema$PropertyValue = {
    val __obj = js.Dynamic.literal()
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PropertyValue]
  }
}

