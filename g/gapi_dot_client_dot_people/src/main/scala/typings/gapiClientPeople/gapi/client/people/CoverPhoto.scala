package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverPhoto extends js.Object {
  /**
    * True if the cover photo is the default cover photo;
    * false if the cover photo is a user-provided cover photo.
    */
  var default: js.UndefOr[Boolean] = js.undefined
  /** Metadata about the cover photo. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The URL of the cover photo. */
  var url: js.UndefOr[String] = js.undefined
}

object CoverPhoto {
  @scala.inline
  def apply(default: js.UndefOr[Boolean] = js.undefined, metadata: FieldMetadata = null, url: String = null): CoverPhoto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverPhoto]
  }
}

