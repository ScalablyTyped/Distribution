package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s associated URLs.
  */
@js.native
trait Schema$Url extends js.Object {
  /**
    * The read-only type of the URL translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * Metadata about the URL.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The type of the URL. The type can be custom or one of these predefined
    * values:  * `home` * `work` * `blog` * `profile` * `homePage` * `ftp` *
    * `reservations` * `appInstallPage`: website for a Google+ application. *
    * `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The URL.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Url {
  @scala.inline
  def apply(
    formattedType: String = null,
    metadata: Schema$FieldMetadata = null,
    `type`: String = null,
    value: String = null
  ): Schema$Url = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Url]
  }
}

