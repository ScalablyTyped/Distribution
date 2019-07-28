package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImClient extends js.Object {
  /**
    * The read-only protocol of the IM client formatted in the viewer's account
    * locale or the `Accept-Language` HTTP header locale.
    */
  var formattedProtocol: js.UndefOr[String] = js.undefined
  /**
    * The read-only type of the IM client translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /** Metadata about the IM client. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The protocol of the IM client. The protocol can be custom or predefined.
    * Possible values include, but are not limited to, the following:
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
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * The type of the IM client. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** The user name used in the IM client. */
  var username: js.UndefOr[String] = js.undefined
}

object ImClient {
  @scala.inline
  def apply(
    formattedProtocol: String = null,
    formattedType: String = null,
    metadata: FieldMetadata = null,
    protocol: String = null,
    `type`: String = null,
    username: String = null
  ): ImClient = {
    val __obj = js.Dynamic.literal()
    if (formattedProtocol != null) __obj.updateDynamic("formattedProtocol")(formattedProtocol)
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ImClient]
  }
}

