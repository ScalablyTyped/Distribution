package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Listing extends js.Object {
  /**
    * Full description of the app; this may be up to 4000 characters in length.
    */
  var fullDescription: js.UndefOr[String] = js.native
  /**
    * Language localization code (for example, &quot;de-AT&quot; for Austrian
    * German).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Short description of the app (previously known as promo text); this may
    * be up to 80 characters in length.
    */
  var shortDescription: js.UndefOr[String] = js.native
  /**
    * App&#39;s localized title.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * URL of a promotional YouTube video for the app.
    */
  var video: js.UndefOr[String] = js.native
}

object Schema$Listing {
  @scala.inline
  def apply(
    fullDescription: String = null,
    language: String = null,
    shortDescription: String = null,
    title: String = null,
    video: String = null
  ): Schema$Listing = {
    val __obj = js.Dynamic.literal()
    if (fullDescription != null) __obj.updateDynamic("fullDescription")(fullDescription.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Listing]
  }
}

