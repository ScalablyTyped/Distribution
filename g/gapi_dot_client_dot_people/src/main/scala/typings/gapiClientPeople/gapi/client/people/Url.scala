package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Url extends js.Object {
  /**
    * Output only. The type of the URL translated and formatted in the viewer's
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /** Metadata about the URL. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  /**
    * The type of the URL. The type can be custom or one of these predefined
    * values:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `blog`
    * &#42; `profile`
    * &#42; `homePage`
    * &#42; `ftp`
    * &#42; `reservations`
    * &#42; `appInstallPage`: website for a Google+ application.
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /** The URL. */
  var value: js.UndefOr[String] = js.native
}

object Url {
  @scala.inline
  def apply(): Url = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Url]
  }
  @scala.inline
  implicit class UrlOps[Self <: Url] (val x: Self) extends AnyVal {
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
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedType: Self = this.set("formattedType", js.undefined)
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

