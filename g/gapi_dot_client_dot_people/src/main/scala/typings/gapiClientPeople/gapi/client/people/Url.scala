package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  /**
    * Output only. The type of the URL translated and formatted in the viewer's
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /** Metadata about the URL. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
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
  var `type`: js.UndefOr[String] = js.undefined
  /** The URL. */
  var value: js.UndefOr[String] = js.undefined
}

object Url {
  @scala.inline
  def apply(
    formattedType: String = null,
    metadata: FieldMetadata = null,
    `type`: String = null,
    value: String = null
  ): Url = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

