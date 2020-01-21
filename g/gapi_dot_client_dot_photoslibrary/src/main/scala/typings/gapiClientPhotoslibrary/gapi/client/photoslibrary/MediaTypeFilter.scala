package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTypeFilter extends js.Object {
  /**
    * The types of media items to be included. This field should be populated
    * with only one media type. If you specify multiple media types, it results
    * in an error.
    */
  var mediaTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object MediaTypeFilter {
  @scala.inline
  def apply(mediaTypes: js.Array[String] = null): MediaTypeFilter = {
    val __obj = js.Dynamic.literal()
    if (mediaTypes != null) __obj.updateDynamic("mediaTypes")(mediaTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeFilter]
  }
}

