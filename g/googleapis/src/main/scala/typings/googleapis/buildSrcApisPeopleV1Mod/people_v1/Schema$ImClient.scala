package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s instant messaging client.
  */
@js.native
trait Schema$ImClient extends js.Object {
  /**
    * The read-only protocol of the IM client formatted in the viewer&#39;s
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedProtocol: js.UndefOr[String] = js.native
  /**
    * The read-only type of the IM client translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * Metadata about the IM client.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The protocol of the IM client. The protocol can be custom or one of these
    * predefined values:  * `aim` * `msn` * `yahoo` * `skype` * `qq` *
    * `googleTalk` * `icq` * `jabber` * `netMeeting`
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The type of the IM client. The type can be custom or one of these
    * predefined values:  * `home` * `work` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The user name used in the IM client.
    */
  var username: js.UndefOr[String] = js.native
}

object Schema$ImClient {
  @scala.inline
  def apply(
    formattedProtocol: String = null,
    formattedType: String = null,
    metadata: Schema$FieldMetadata = null,
    protocol: String = null,
    `type`: String = null,
    username: String = null
  ): Schema$ImClient = {
    val __obj = js.Dynamic.literal()
    if (formattedProtocol != null) __obj.updateDynamic("formattedProtocol")(formattedProtocol.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImClient]
  }
}

