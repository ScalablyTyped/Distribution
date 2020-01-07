package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DomainMappingCondition contains state information for a DomainMapping.
  */
@js.native
trait Schema$DomainMappingCondition extends js.Object {
  /**
    * Human readable message indicating details about the current status.
    * +optional
    */
  var message: js.UndefOr[String] = js.native
  /**
    * One-word CamelCase reason for the condition&#39;s current status.
    * +optional
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Type of domain mapping condition.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DomainMappingCondition {
  @scala.inline
  def apply(message: String = null, reason: String = null, status: String = null, `type`: String = null): Schema$DomainMappingCondition = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainMappingCondition]
  }
}

