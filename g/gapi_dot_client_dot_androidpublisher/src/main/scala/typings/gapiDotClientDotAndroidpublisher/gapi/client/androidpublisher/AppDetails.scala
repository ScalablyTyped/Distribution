package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppDetails extends js.Object {
  /** The user-visible support email for this app. */
  var contactEmail: js.UndefOr[String] = js.undefined
  /** The user-visible support telephone number for this app. */
  var contactPhone: js.UndefOr[String] = js.undefined
  /** The user-visible website for this app. */
  var contactWebsite: js.UndefOr[String] = js.undefined
  /** Default language code, in BCP 47 format (eg "en-US"). */
  var defaultLanguage: js.UndefOr[String] = js.undefined
}

object AppDetails {
  @scala.inline
  def apply(
    contactEmail: String = null,
    contactPhone: String = null,
    contactWebsite: String = null,
    defaultLanguage: String = null
  ): AppDetails = {
    val __obj = js.Dynamic.literal()
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail)
    if (contactPhone != null) __obj.updateDynamic("contactPhone")(contactPhone)
    if (contactWebsite != null) __obj.updateDynamic("contactWebsite")(contactWebsite)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    __obj.asInstanceOf[AppDetails]
  }
}

