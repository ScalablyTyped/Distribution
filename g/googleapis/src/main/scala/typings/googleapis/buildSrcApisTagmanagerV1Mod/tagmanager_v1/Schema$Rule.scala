package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Rule.
  */
@js.native
trait Schema$Rule extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The list of conditions that make up this rule (implicit AND between
    * them).
    */
  var condition: js.UndefOr[js.Array[Schema$Condition]] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM Rule as computed at storage time. This value
    * is recomputed whenever the rule is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Rule display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User notes on how to apply this rule in the container.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The Rule ID uniquely identifies the GTM Rule.
    */
  var ruleId: js.UndefOr[String] = js.native
}

object Schema$Rule {
  @scala.inline
  def apply(
    accountId: String = null,
    condition: js.Array[Schema$Condition] = null,
    containerId: String = null,
    fingerprint: String = null,
    name: String = null,
    notes: String = null,
    ruleId: String = null
  ): Schema$Rule = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Rule]
  }
}

