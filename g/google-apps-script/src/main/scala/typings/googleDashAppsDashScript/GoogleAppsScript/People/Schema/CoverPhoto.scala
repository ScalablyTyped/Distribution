package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverPhoto extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object CoverPhoto {
  @scala.inline
  def apply(default: js.UndefOr[Boolean] = js.undefined, metadata: FieldMetadata = null, url: String = null): CoverPhoto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverPhoto]
  }
}

