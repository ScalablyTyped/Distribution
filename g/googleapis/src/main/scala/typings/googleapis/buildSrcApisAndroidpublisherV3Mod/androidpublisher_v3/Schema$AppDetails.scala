package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AppDetails extends js.Object {
  /**
    * The user-visible support email for this app.
    */
  var contactEmail: js.UndefOr[String] = js.native
  /**
    * The user-visible support telephone number for this app.
    */
  var contactPhone: js.UndefOr[String] = js.native
  /**
    * The user-visible website for this app.
    */
  var contactWebsite: js.UndefOr[String] = js.native
  /**
    * Default language code, in BCP 47 format (eg &quot;en-US&quot;).
    */
  var defaultLanguage: js.UndefOr[String] = js.native
}

object Schema$AppDetails {
  @scala.inline
  def apply(
    contactEmail: String = null,
    contactPhone: String = null,
    contactWebsite: String = null,
    defaultLanguage: String = null
  ): Schema$AppDetails = {
    val __obj = js.Dynamic.literal()
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail.asInstanceOf[js.Any])
    if (contactPhone != null) __obj.updateDynamic("contactPhone")(contactPhone.asInstanceOf[js.Any])
    if (contactWebsite != null) __obj.updateDynamic("contactWebsite")(contactWebsite.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AppDetails]
  }
}

