package typings.devtoolsProtocol.mod.Protocol.Security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsecureContentStatus extends js.Object {
  /**
    * Always false.
    */
  var containedMixedForm: Boolean = js.native
  /**
    * Always false.
    */
  var displayedContentWithCertErrors: Boolean = js.native
  /**
    * Always set to unknown.
    */
  var displayedInsecureContentStyle: SecurityState = js.native
  /**
    * Always false.
    */
  var displayedMixedContent: Boolean = js.native
  /**
    * Always false.
    */
  var ranContentWithCertErrors: Boolean = js.native
  /**
    * Always set to unknown.
    */
  var ranInsecureContentStyle: SecurityState = js.native
  /**
    * Always false.
    */
  var ranMixedContent: Boolean = js.native
}

object InsecureContentStatus {
  @scala.inline
  def apply(
    containedMixedForm: Boolean,
    displayedContentWithCertErrors: Boolean,
    displayedInsecureContentStyle: SecurityState,
    displayedMixedContent: Boolean,
    ranContentWithCertErrors: Boolean,
    ranInsecureContentStyle: SecurityState,
    ranMixedContent: Boolean
  ): InsecureContentStatus = {
    val __obj = js.Dynamic.literal(containedMixedForm = containedMixedForm.asInstanceOf[js.Any], displayedContentWithCertErrors = displayedContentWithCertErrors.asInstanceOf[js.Any], displayedInsecureContentStyle = displayedInsecureContentStyle.asInstanceOf[js.Any], displayedMixedContent = displayedMixedContent.asInstanceOf[js.Any], ranContentWithCertErrors = ranContentWithCertErrors.asInstanceOf[js.Any], ranInsecureContentStyle = ranInsecureContentStyle.asInstanceOf[js.Any], ranMixedContent = ranMixedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsecureContentStatus]
  }
  @scala.inline
  implicit class InsecureContentStatusOps[Self <: InsecureContentStatus] (val x: Self) extends AnyVal {
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
    def setContainedMixedForm(value: Boolean): Self = this.set("containedMixedForm", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayedContentWithCertErrors(value: Boolean): Self = this.set("displayedContentWithCertErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayedInsecureContentStyle(value: SecurityState): Self = this.set("displayedInsecureContentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayedMixedContent(value: Boolean): Self = this.set("displayedMixedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRanContentWithCertErrors(value: Boolean): Self = this.set("ranContentWithCertErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setRanInsecureContentStyle(value: SecurityState): Self = this.set("ranInsecureContentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRanMixedContent(value: Boolean): Self = this.set("ranMixedContent", value.asInstanceOf[js.Any])
  }
  
}

