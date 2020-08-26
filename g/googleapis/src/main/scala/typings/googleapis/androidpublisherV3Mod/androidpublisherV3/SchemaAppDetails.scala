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
  def apply(): SchemaAppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppDetails]
  }
  @scala.inline
  implicit class SchemaAppDetailsOps[Self <: SchemaAppDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContactEmail(value: String): Self = this.set("contactEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactEmail: Self = this.set("contactEmail", js.undefined)
    @scala.inline
    def setContactPhone(value: String): Self = this.set("contactPhone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactPhone: Self = this.set("contactPhone", js.undefined)
    @scala.inline
    def setContactWebsite(value: String): Self = this.set("contactWebsite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactWebsite: Self = this.set("contactWebsite", js.undefined)
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
  }
  
}

