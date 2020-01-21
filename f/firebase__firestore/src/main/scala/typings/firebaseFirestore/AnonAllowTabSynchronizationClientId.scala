package typings.firebaseFirestore

import typings.firebaseFirestore.coreListenSequenceMod.SequenceNumberSyncer
import typings.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import typings.firebaseFirestore.localSharedClientStateMod.ClientId
import typings.firebaseFirestore.platformPlatformMod.Platform
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowTabSynchronizationClientId extends js.Object {
  var allowTabSynchronization: Boolean
  var clientId: ClientId
  var lruParams: LruParams
  var persistenceKey: String
  var platform: Platform
  var queue: AsyncQueue
  var sequenceNumberSyncer: SequenceNumberSyncer
  var serializer: JsonProtoSerializer
}

object AnonAllowTabSynchronizationClientId {
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
  ): AnonAllowTabSynchronizationClientId = {
    val __obj = js.Dynamic.literal(allowTabSynchronization = allowTabSynchronization.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], lruParams = lruParams.asInstanceOf[js.Any], persistenceKey = persistenceKey.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], sequenceNumberSyncer = sequenceNumberSyncer.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllowTabSynchronizationClientId]
  }
}

