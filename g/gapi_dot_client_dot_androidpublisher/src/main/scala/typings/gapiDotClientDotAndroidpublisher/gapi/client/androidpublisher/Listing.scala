package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listing extends js.Object {
  /** Full description of the app; this may be up to 4000 characters in length. */
  var fullDescription: js.UndefOr[String] = js.undefined
  /** Language localization code (for example, "de-AT" for Austrian German). */
  var language: js.UndefOr[String] = js.undefined
  /** Short description of the app (previously known as promo text); this may be up to 80 characters in length. */
  var shortDescription: js.UndefOr[String] = js.undefined
  /** App's localized title. */
  var title: js.UndefOr[String] = js.undefined
  /** URL of a promotional YouTube video for the app. */
  var video: js.UndefOr[String] = js.undefined
}

object Listing {
  @scala.inline
  def apply(
    fullDescription: String = null,
    language: String = null,
    shortDescription: String = null,
    title: String = null,
    video: String = null
  ): Listing = {
    val __obj = js.Dynamic.literal()
    if (fullDescription != null) __obj.updateDynamic("fullDescription")(fullDescription)
    if (language != null) __obj.updateDynamic("language")(language)
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription)
    if (title != null) __obj.updateDynamic("title")(title)
    if (video != null) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[Listing]
  }
}

