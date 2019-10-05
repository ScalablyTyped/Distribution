package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApkListing extends js.Object {
  /** The language code, in BCP 47 format (eg "en-US"). */
  var language: js.UndefOr[String] = js.undefined
  /** Describe what's new in your APK. */
  var recentChanges: js.UndefOr[String] = js.undefined
}

object ApkListing {
  @scala.inline
  def apply(language: String = null, recentChanges: String = null): ApkListing = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (recentChanges != null) __obj.updateDynamic("recentChanges")(recentChanges)
    __obj.asInstanceOf[ApkListing]
  }
}

