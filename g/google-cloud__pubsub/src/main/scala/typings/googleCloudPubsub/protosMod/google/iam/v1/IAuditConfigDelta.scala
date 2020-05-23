package typings.googleCloudPubsub.protosMod.google.iam.v1

import typings.googleCloudPubsub.protosMod.google.iam.v1.AuditConfigDelta.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an AuditConfigDelta. */
trait IAuditConfigDelta extends js.Object {
  /** AuditConfigDelta action */
  var action: js.UndefOr[
    Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.AuditConfigDelta.Action * / any */ String) | Null
  ] = js.undefined
  /** AuditConfigDelta exemptedMember */
  var exemptedMember: js.UndefOr[String | Null] = js.undefined
  /** AuditConfigDelta logType */
  var logType: js.UndefOr[String | Null] = js.undefined
  /** AuditConfigDelta service */
  var service: js.UndefOr[String | Null] = js.undefined
}

object IAuditConfigDelta {
  @scala.inline
  def apply(
    action: js.UndefOr[
      Null | Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.iam.v1.AuditConfigDelta.Action * / any */ String)
    ] = js.undefined,
    exemptedMember: js.UndefOr[Null | String] = js.undefined,
    logType: js.UndefOr[Null | String] = js.undefined,
    service: js.UndefOr[Null | String] = js.undefined
  ): IAuditConfigDelta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(exemptedMember)) __obj.updateDynamic("exemptedMember")(exemptedMember.asInstanceOf[js.Any])
    if (!js.isUndefined(logType)) __obj.updateDynamic("logType")(logType.asInstanceOf[js.Any])
    if (!js.isUndefined(service)) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuditConfigDelta]
  }
}

