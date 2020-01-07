package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Proto for all phishing alerts with common payload. Supported types are any
  * of the following:  * User reported phishing * User reported spam spike *
  * Suspicious message reported * Phishing reclassification * Malware
  * reclassification
  */
@js.native
trait Schema$MailPhishing extends js.Object {
  /**
    * The domain ID.
    */
  var domainId: js.UndefOr[Schema$DomainId] = js.native
  /**
    * If `true`, the email originated from within the organization.
    */
  var isInternal: js.UndefOr[Boolean] = js.native
  /**
    * The entity whose actions triggered a Gmail phishing alert.
    */
  var maliciousEntity: js.UndefOr[Schema$MaliciousEntity] = js.native
  /**
    * The list of messages contained by this alert.
    */
  var messages: js.UndefOr[js.Array[Schema$GmailMessageInfo]] = js.native
}

object Schema$MailPhishing {
  @scala.inline
  def apply(
    domainId: Schema$DomainId = null,
    isInternal: js.UndefOr[Boolean] = js.undefined,
    maliciousEntity: Schema$MaliciousEntity = null,
    messages: js.Array[Schema$GmailMessageInfo] = null
  ): Schema$MailPhishing = {
    val __obj = js.Dynamic.literal()
    if (domainId != null) __obj.updateDynamic("domainId")(domainId.asInstanceOf[js.Any])
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal.asInstanceOf[js.Any])
    if (maliciousEntity != null) __obj.updateDynamic("maliciousEntity")(maliciousEntity.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MailPhishing]
  }
}

