package typings.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{readonly [ key in @firebase/firestore.@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_runner.PersistenceAction ]: boolean}> */
trait SpecDatabaseFailures extends js.Object {
  var `Acknowledge batch`: js.UndefOr[Boolean] = js.undefined
  var `Allocate target`: js.UndefOr[Boolean] = js.undefined
  var `Apply remote event`: js.UndefOr[Boolean] = js.undefined
  var `Collect garbage`: js.UndefOr[Boolean] = js.undefined
  var `Execute query`: js.UndefOr[Boolean] = js.undefined
  var `Get highest unacknowledged batch id`: js.UndefOr[Boolean] = js.undefined
  var `Get last remote snapshot version`: js.UndefOr[Boolean] = js.undefined
  var `Get last stream token`: js.UndefOr[Boolean] = js.undefined
  var `Get new document changes`: js.UndefOr[Boolean] = js.undefined
  var `Get next mutation batch`: js.UndefOr[Boolean] = js.undefined
  var `Get target data`: js.UndefOr[Boolean] = js.undefined
  var `Handle user change`: js.UndefOr[Boolean] = js.undefined
  var `Locally write mutations`: js.UndefOr[Boolean] = js.undefined
  var `Lookup mutation documents`: js.UndefOr[Boolean] = js.undefined
  var `Reject batch`: js.UndefOr[Boolean] = js.undefined
  var `Release target`: js.UndefOr[Boolean] = js.undefined
  var `Remote document keys`: js.UndefOr[Boolean] = js.undefined
  var `Set last remote snapshot version`: js.UndefOr[Boolean] = js.undefined
  var `Set last stream token`: js.UndefOr[Boolean] = js.undefined
  var `Synchronize last document change read time`: js.UndefOr[Boolean] = js.undefined
  var maybeGarbageCollectMultiClientState: js.UndefOr[Boolean] = js.undefined
  var notifyLocalViewChanges: js.UndefOr[Boolean] = js.undefined
  var `read document`: js.UndefOr[Boolean] = js.undefined
  var updateClientMetadataAndTryBecomePrimary: js.UndefOr[Boolean] = js.undefined
}

object SpecDatabaseFailures {
  @scala.inline
  def apply(
    `Acknowledge batch`: js.UndefOr[Boolean] = js.undefined,
    `Allocate target`: js.UndefOr[Boolean] = js.undefined,
    `Apply remote event`: js.UndefOr[Boolean] = js.undefined,
    `Collect garbage`: js.UndefOr[Boolean] = js.undefined,
    `Execute query`: js.UndefOr[Boolean] = js.undefined,
    `Get highest unacknowledged batch id`: js.UndefOr[Boolean] = js.undefined,
    `Get last remote snapshot version`: js.UndefOr[Boolean] = js.undefined,
    `Get last stream token`: js.UndefOr[Boolean] = js.undefined,
    `Get new document changes`: js.UndefOr[Boolean] = js.undefined,
    `Get next mutation batch`: js.UndefOr[Boolean] = js.undefined,
    `Get target data`: js.UndefOr[Boolean] = js.undefined,
    `Handle user change`: js.UndefOr[Boolean] = js.undefined,
    `Locally write mutations`: js.UndefOr[Boolean] = js.undefined,
    `Lookup mutation documents`: js.UndefOr[Boolean] = js.undefined,
    `Reject batch`: js.UndefOr[Boolean] = js.undefined,
    `Release target`: js.UndefOr[Boolean] = js.undefined,
    `Remote document keys`: js.UndefOr[Boolean] = js.undefined,
    `Set last remote snapshot version`: js.UndefOr[Boolean] = js.undefined,
    `Set last stream token`: js.UndefOr[Boolean] = js.undefined,
    `Synchronize last document change read time`: js.UndefOr[Boolean] = js.undefined,
    maybeGarbageCollectMultiClientState: js.UndefOr[Boolean] = js.undefined,
    notifyLocalViewChanges: js.UndefOr[Boolean] = js.undefined,
    `read document`: js.UndefOr[Boolean] = js.undefined,
    updateClientMetadataAndTryBecomePrimary: js.UndefOr[Boolean] = js.undefined
  ): SpecDatabaseFailures = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`Acknowledge batch`)) __obj.updateDynamic("Acknowledge batch")(((`Acknowledge batch`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Allocate target`)) __obj.updateDynamic("Allocate target")(((`Allocate target`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Apply remote event`)) __obj.updateDynamic("Apply remote event")(((`Apply remote event`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Collect garbage`)) __obj.updateDynamic("Collect garbage")(((`Collect garbage`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Execute query`)) __obj.updateDynamic("Execute query")(((`Execute query`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Get highest unacknowledged batch id`)) __obj.updateDynamic("Get highest unacknowledged batch id")(((`Get highest unacknowledged batch id`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Get last remote snapshot version`)) __obj.updateDynamic("Get last remote snapshot version")(((`Get last remote snapshot version`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Get last stream token`)) __obj.updateDynamic("Get last stream token")(((`Get last stream token`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Get new document changes`)) __obj.updateDynamic("Get new document changes")(((`Get new document changes`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Get next mutation batch`)) __obj.updateDynamic("Get next mutation batch")(((`Get next mutation batch`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Get target data`)) __obj.updateDynamic("Get target data")(((`Get target data`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Handle user change`)) __obj.updateDynamic("Handle user change")(((`Handle user change`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Locally write mutations`)) __obj.updateDynamic("Locally write mutations")(((`Locally write mutations`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Lookup mutation documents`)) __obj.updateDynamic("Lookup mutation documents")(((`Lookup mutation documents`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Reject batch`)) __obj.updateDynamic("Reject batch")(((`Reject batch`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Release target`)) __obj.updateDynamic("Release target")(((`Release target`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Remote document keys`)) __obj.updateDynamic("Remote document keys")(((`Remote document keys`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Set last remote snapshot version`)) __obj.updateDynamic("Set last remote snapshot version")(((`Set last remote snapshot version`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Set last stream token`)) __obj.updateDynamic("Set last stream token")(((`Set last stream token`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(`Synchronize last document change read time`)) __obj.updateDynamic("Synchronize last document change read time")(((`Synchronize last document change read time`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(maybeGarbageCollectMultiClientState)) __obj.updateDynamic("maybeGarbageCollectMultiClientState")(maybeGarbageCollectMultiClientState.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyLocalViewChanges)) __obj.updateDynamic("notifyLocalViewChanges")(notifyLocalViewChanges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`read document`)) __obj.updateDynamic("read document")(((`read document`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(updateClientMetadataAndTryBecomePrimary)) __obj.updateDynamic("updateClientMetadataAndTryBecomePrimary")(updateClientMetadataAndTryBecomePrimary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecDatabaseFailures]
  }
}

