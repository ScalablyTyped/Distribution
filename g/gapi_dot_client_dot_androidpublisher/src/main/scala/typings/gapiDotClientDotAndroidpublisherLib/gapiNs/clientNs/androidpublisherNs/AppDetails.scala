package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppDetails extends js.Object {
  /** The user-visible support email for this app. */
  var contactEmail: js.UndefOr[java.lang.String] = js.undefined
  /** The user-visible support telephone number for this app. */
  var contactPhone: js.UndefOr[java.lang.String] = js.undefined
  /** The user-visible website for this app. */
  var contactWebsite: js.UndefOr[java.lang.String] = js.undefined
  /** Default language code, in BCP 47 format (eg "en-US"). */
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
}

object AppDetails {
  @scala.inline
  def apply(
    contactEmail: java.lang.String = null,
    contactPhone: java.lang.String = null,
    contactWebsite: java.lang.String = null,
    defaultLanguage: java.lang.String = null
  ): AppDetails = {
    val __obj = js.Dynamic.literal()
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail)
    if (contactPhone != null) __obj.updateDynamic("contactPhone")(contactPhone)
    if (contactWebsite != null) __obj.updateDynamic("contactWebsite")(contactWebsite)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    __obj.asInstanceOf[AppDetails]
  }
}

