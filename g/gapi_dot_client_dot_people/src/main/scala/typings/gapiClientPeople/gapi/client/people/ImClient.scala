package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImClient extends js.Object {
  /**
    * Output only. The protocol of the IM client formatted in the viewer's account
    * locale or the `Accept-Language` HTTP header locale.
    */
  var formattedProtocol: js.UndefOr[String] = js.native
  /**
    * Output only. The type of the IM client translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /** Metadata about the IM client. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  /**
    * The protocol of the IM client. The protocol can be custom or one of these
    * predefined values:
    *
    * &#42; `aim`
    * &#42; `msn`
    * &#42; `yahoo`
    * &#42; `skype`
    * &#42; `qq`
    * &#42; `googleTalk`
    * &#42; `icq`
    * &#42; `jabber`
    * &#42; `netMeeting`
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The type of the IM client. The type can be custom or one of these
    * predefined values:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /** The user name used in the IM client. */
  var username: js.UndefOr[String] = js.native
}

object ImClient {
  @scala.inline
  def apply(): ImClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImClient]
  }
  @scala.inline
  implicit class ImClientOps[Self <: ImClient] (val x: Self) extends AnyVal {
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
    def setFormattedProtocol(value: String): Self = this.set("formattedProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedProtocol: Self = this.set("formattedProtocol", js.undefined)
    @scala.inline
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedType: Self = this.set("formattedType", js.undefined)
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

