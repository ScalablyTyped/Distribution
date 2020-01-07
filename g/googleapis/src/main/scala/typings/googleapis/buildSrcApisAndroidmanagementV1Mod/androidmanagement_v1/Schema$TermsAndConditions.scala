package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A terms and conditions page to be accepted during provisioning.
  */
@js.native
trait Schema$TermsAndConditions extends js.Object {
  /**
    * A well-formatted HTML string. It will be parsed on the client with
    * android.text.Html#fromHtml.
    */
  var content: js.UndefOr[Schema$UserFacingMessage] = js.native
  /**
    * A short header which appears above the HTML content.
    */
  var header: js.UndefOr[Schema$UserFacingMessage] = js.native
}

object Schema$TermsAndConditions {
  @scala.inline
  def apply(content: Schema$UserFacingMessage = null, header: Schema$UserFacingMessage = null): Schema$TermsAndConditions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TermsAndConditions]
  }
}

