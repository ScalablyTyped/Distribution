package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreListenUnderscoreSequenceMod.SequenceNumberSyncer
import typings.atFirebaseFirestore.distSrcLocalLruUnderscoreGarbageUnderscoreCollectorMod.LruParams
import typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateMod.ClientId
import typings.atFirebaseFirestore.distSrcPlatformPlatformMod.Platform
import typings.atFirebaseFirestore.distSrcRemoteSerializerMod.JsonProtoSerializer
import typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowTabSynchronization extends js.Object {
  var allowTabSynchronization: Boolean
  var clientId: ClientId
  var lruParams: LruParams
  var persistenceKey: String
  var platform: Platform
  var queue: AsyncQueue
  var sequenceNumberSyncer: SequenceNumberSyncer
  var serializer: JsonProtoSerializer
}

object Anon_AllowTabSynchronization {
  @scala.inline
  def apply(
    allowTabSynchronization: Boolean,
    clientId: ClientId,
    lruParams: LruParams,
    persistenceKey: String,
    platform: Platform,
    queue: AsyncQueue,
    sequenceNumberSyncer: SequenceNumberSyncer,
    serializer: JsonProtoSerializer
  ): Anon_AllowTabSynchronization = {
    val __obj = js.Dynamic.literal(allowTabSynchronization = allowTabSynchronization.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], lruParams = lruParams.asInstanceOf[js.Any], persistenceKey = persistenceKey.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], sequenceNumberSyncer = sequenceNumberSyncer.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllowTabSynchronization]
  }
}

