package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A terms and conditions page to be accepted during provisioning.
  */
@js.native
trait SchemaTermsAndConditions extends js.Object {
  /**
    * A well-formatted HTML string. It will be parsed on the client with
    * android.text.Html#fromHtml.
    */
  var content: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * A short header which appears above the HTML content.
    */
  var header: js.UndefOr[SchemaUserFacingMessage] = js.native
}

object SchemaTermsAndConditions {
  @scala.inline
  def apply(content: SchemaUserFacingMessage = null, header: SchemaUserFacingMessage = null): SchemaTermsAndConditions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTermsAndConditions]
  }
}

