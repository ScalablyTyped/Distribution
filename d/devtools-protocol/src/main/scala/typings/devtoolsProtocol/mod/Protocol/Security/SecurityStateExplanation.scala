package typings.devtoolsProtocol.mod.Protocol.Security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityStateExplanation extends js.Object {
  /**
    * Page certificate.
    */
  var certificate: js.Array[String] = js.native
  /**
    * Full text explanation of the factor.
    */
  var description: String = js.native
  /**
    * The type of mixed content described by the explanation.
    */
  var mixedContentType: MixedContentType = js.native
  /**
    * Recommendations to fix any issues.
    */
  var recommendations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Security state representing the severity of the factor being explained.
    */
  var securityState: SecurityState = js.native
  /**
    * Short phrase describing the type of factor.
    */
  var summary: String = js.native
  /**
    * Title describing the type of factor.
    */
  var title: String = js.native
}

object SecurityStateExplanation {
  @scala.inline
  def apply(
    certificate: js.Array[String],
    description: String,
    mixedContentType: MixedContentType,
    securityState: SecurityState,
    summary: String,
    title: String
  ): SecurityStateExplanation = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], mixedContentType = mixedContentType.asInstanceOf[js.Any], securityState = securityState.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityStateExplanation]
  }
  @scala.inline
  implicit class SecurityStateExplanationOps[Self <: SecurityStateExplanation] (val x: Self) extends AnyVal {
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
    def setCertificateVarargs(value: String*): Self = this.set("certificate", js.Array(value :_*))
    @scala.inline
    def setCertificate(value: js.Array[String]): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setMixedContentType(value: MixedContentType): Self = this.set("mixedContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityState(value: SecurityState): Self = this.set("securityState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecommendationsVarargs(value: String*): Self = this.set("recommendations", js.Array(value :_*))
    @scala.inline
    def setRecommendations(value: js.Array[String]): Self = this.set("recommendations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendations: Self = this.set("recommendations", js.undefined)
  }
  
}

