package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverPhoto extends js.Object {
  /**
    * True if the cover photo is the default cover photo;
    * false if the cover photo is a user-provided cover photo.
    */
  var default: js.UndefOr[scala.Boolean] = js.undefined
  /** Metadata about the cover photo. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The URL of the cover photo. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object CoverPhoto {
  @scala.inline
  def apply(
    default: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: FieldMetadata = null,
    url: java.lang.String = null
  ): CoverPhoto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CoverPhoto]
  }
}

