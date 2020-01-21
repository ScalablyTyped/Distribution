package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule to be applied in a Policy.
  */
@js.native
trait SchemaRule extends js.Object {
  /**
    * Required
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Additional restrictions that must be met. All conditions must pass for
    * the rule to match.
    */
  var conditions: js.UndefOr[js.Array[SchemaCondition]] = js.native
  /**
    * Human-readable description of the rule.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If one or more &#39;in&#39; clauses are specified, the rule matches if
    * the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
    */
  var ins: js.UndefOr[js.Array[String]] = js.native
  /**
    * The config returned to callers of tech.iam.IAM.CheckPolicy for any
    * entries that match the LOG action.
    */
  var logConfigs: js.UndefOr[js.Array[SchemaLogConfig]] = js.native
  /**
    * If one or more &#39;not_in&#39; clauses are specified, the rule matches
    * if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
    */
  var notIns: js.UndefOr[js.Array[String]] = js.native
  /**
    * A permission is a string of form &#39;..&#39; (e.g.,
    * &#39;storage.buckets.list&#39;). A value of &#39;*&#39; matches all
    * permissions, and a verb part of &#39;*&#39; (e.g.,
    * &#39;storage.buckets.*&#39;) matches all verbs.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRule {
  @scala.inline
  def apply(
    action: String = null,
    conditions: js.Array[SchemaCondition] = null,
    description: String = null,
    ins: js.Array[String] = null,
    logConfigs: js.Array[SchemaLogConfig] = null,
    notIns: js.Array[String] = null,
    permissions: js.Array[String] = null
  ): SchemaRule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ins != null) __obj.updateDynamic("ins")(ins.asInstanceOf[js.Any])
    if (logConfigs != null) __obj.updateDynamic("logConfigs")(logConfigs.asInstanceOf[js.Any])
    if (notIns != null) __obj.updateDynamic("notIns")(notIns.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRule]
  }
}

