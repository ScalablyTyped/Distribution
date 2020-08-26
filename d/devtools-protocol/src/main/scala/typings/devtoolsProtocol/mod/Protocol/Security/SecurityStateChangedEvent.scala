package typings.devtoolsProtocol.mod.Protocol.Security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityStateChangedEvent extends js.Object {
  /**
    * List of explanations for the security state. If the overall security state is `insecure` or
    * `warning`, at least one corresponding explanation should be included.
    */
  var explanations: js.Array[SecurityStateExplanation] = js.native
  /**
    * Information about insecure content on the page.
    */
  var insecureContentStatus: InsecureContentStatus = js.native
  /**
    * True if the page was loaded over cryptographic transport such as HTTPS.
    */
  var schemeIsCryptographic: Boolean = js.native
  /**
    * Security state.
    */
  var securityState: SecurityState = js.native
  /**
    * Overrides user-visible description of the state.
    */
  var summary: js.UndefOr[String] = js.native
}

object SecurityStateChangedEvent {
  @scala.inline
  def apply(
    explanations: js.Array[SecurityStateExplanation],
    insecureContentStatus: InsecureContentStatus,
    schemeIsCryptographic: Boolean,
    securityState: SecurityState
  ): SecurityStateChangedEvent = {
    val __obj = js.Dynamic.literal(explanations = explanations.asInstanceOf[js.Any], insecureContentStatus = insecureContentStatus.asInstanceOf[js.Any], schemeIsCryptographic = schemeIsCryptographic.asInstanceOf[js.Any], securityState = securityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityStateChangedEvent]
  }
  @scala.inline
  implicit class SecurityStateChangedEventOps[Self <: SecurityStateChangedEvent] (val x: Self) extends AnyVal {
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
    def setExplanationsVarargs(value: SecurityStateExplanation*): Self = this.set("explanations", js.Array(value :_*))
    @scala.inline
    def setExplanations(value: js.Array[SecurityStateExplanation]): Self = this.set("explanations", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsecureContentStatus(value: InsecureContentStatus): Self = this.set("insecureContentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemeIsCryptographic(value: Boolean): Self = this.set("schemeIsCryptographic", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityState(value: SecurityState): Self = this.set("securityState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

