package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentFilter extends js.Object {
  /**
    * The set of categories which are not to be included in the media item search
    * results. The items in the set are ORed. There's a maximum of 10
    * `excludedContentCategories` per request.
    */
  var excludedContentCategories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The set of categories to be included in the media item search results.
    * The items in the set are ORed. There's a maximum of 10
    * `includedContentCategories` per request.
    */
  var includedContentCategories: js.UndefOr[js.Array[String]] = js.undefined
}

object ContentFilter {
  @scala.inline
  def apply(
    excludedContentCategories: js.Array[String] = null,
    includedContentCategories: js.Array[String] = null
  ): ContentFilter = {
    val __obj = js.Dynamic.literal()
    if (excludedContentCategories != null) __obj.updateDynamic("excludedContentCategories")(excludedContentCategories.asInstanceOf[js.Any])
    if (includedContentCategories != null) __obj.updateDynamic("includedContentCategories")(includedContentCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentFilter]
  }
}

