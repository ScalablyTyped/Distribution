package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAppDetails extends js.Object {
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

object SchemaAppDetails {
  @scala.inline
  def apply(
    contactEmail: String = null,
    contactPhone: String = null,
    contactWebsite: String = null,
    defaultLanguage: String = null
  ): SchemaAppDetails = {
    val __obj = js.Dynamic.literal()
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail.asInstanceOf[js.Any])
    if (contactPhone != null) __obj.updateDynamic("contactPhone")(contactPhone.asInstanceOf[js.Any])
    if (contactWebsite != null) __obj.updateDynamic("contactWebsite")(contactWebsite.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppDetails]
  }
}

