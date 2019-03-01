package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApkListing extends js.Object {
  /** The language code, in BCP 47 format (eg "en-US"). */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** Describe what's new in your APK. */
  var recentChanges: js.UndefOr[java.lang.String] = js.undefined
}

object ApkListing {
  @scala.inline
  def apply(language: java.lang.String = null, recentChanges: java.lang.String = null): ApkListing = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    if (recentChanges != null) __obj.updateDynamic("recentChanges")(recentChanges)
    __obj.asInstanceOf[ApkListing]
  }
}

