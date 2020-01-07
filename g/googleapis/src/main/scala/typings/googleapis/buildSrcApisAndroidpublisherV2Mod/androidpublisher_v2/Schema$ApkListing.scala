package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ApkListing extends js.Object {
  /**
    * The language code, in BCP 47 format (eg &quot;en-US&quot;).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Describe what&#39;s new in your APK.
    */
  var recentChanges: js.UndefOr[String] = js.native
}

object Schema$ApkListing {
  @scala.inline
  def apply(language: String = null, recentChanges: String = null): Schema$ApkListing = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (recentChanges != null) __obj.updateDynamic("recentChanges")(recentChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApkListing]
  }
}

