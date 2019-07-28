package typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /** Required */
  var action: js.UndefOr[String] = js.undefined
  /** Additional restrictions that must be met */
  var conditions: js.UndefOr[js.Array[Condition]] = js.undefined
  /** Human-readable description of the rule. */
  var description: js.UndefOr[String] = js.undefined
  /** The rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in this set of entries. */
  var ins: js.UndefOr[js.Array[String]] = js.undefined
  /** The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action. */
  var logConfigs: js.UndefOr[js.Array[LogConfig]] = js.undefined
  /** The rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is not in this set of entries. */
  var notIns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '&#42;' matches all permissions, and a verb part of '&#42;' (e.g.,
    * 'storage.buckets.&#42;') matches all verbs.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    action: String = null,
    conditions: js.Array[Condition] = null,
    description: String = null,
    ins: js.Array[String] = null,
    logConfigs: js.Array[LogConfig] = null,
    notIns: js.Array[String] = null,
    permissions: js.Array[String] = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (description != null) __obj.updateDynamic("description")(description)
    if (ins != null) __obj.updateDynamic("ins")(ins)
    if (logConfigs != null) __obj.updateDynamic("logConfigs")(logConfigs)
    if (notIns != null) __obj.updateDynamic("notIns")(notIns)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[Rule]
  }
}

