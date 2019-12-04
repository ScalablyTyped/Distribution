package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateMod

import typings.atFirebaseFirestore.distSrcAuthUserMod.User
import typings.atFirebaseFirestore.distSrcPlatformPlatformMod.Platform
import typings.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/shared_client_state", "WebStorageSharedClientState")
@js.native
class WebStorageSharedClientState protected () extends SharedClientState {
  def this(
    queue: AsyncQueue,
    platform: Platform,
    persistenceKey: String,
    localClientId: ClientId,
    initialUser: User
  ) = this()
  val activeClients: js.Any = js.native
  val clientStateKeyRe: js.Any = js.native
  var currentUser: js.Any = js.native
  /**
    * Captures WebStorage events that occur before `start()` is called. These
    * events are replayed once `WebStorageSharedClientState` is started.
    */
  var earlyEvents: js.Any = js.native
  /**
    * Parses a client state in WebStorage. Returns 'null' if the value could not
    * be parsed.
    */
  var fromWebStorageClientState: js.Any = js.native
  /**
    * Parses a client state key in WebStorage. Returns null if the key does not
    * match the expected key format.
    */
  var fromWebStorageClientStateKey: js.Any = js.native
  /**
    * Parses a mutation batch state in WebStorage. Returns 'null' if the value
    * could not be parsed.
    */
  var fromWebStorageMutationMetadata: js.Any = js.native
  /**
    * Parses an online state from WebStorage. Returns 'null' if the value
    * could not be parsed.
    */
  var fromWebStorageOnlineState: js.Any = js.native
  /**
    * Parses a query target state from WebStorage. Returns 'null' if the value
    * could not be parsed.
    */
  var fromWebStorageQueryTargetMetadata: js.Any = js.native
  var getItem: js.Any = js.native
  var handleClientStateEvent: js.Any = js.native
  var handleMutationBatchEvent: js.Any = js.native
  var handleOnlineStateEvent: js.Any = js.native
  var handleQueryTargetEvent: js.Any = js.native
  var handleWebStorageEvent: js.Any = js.native
  val localClientId: js.Any = js.native
  val localClientStorageKey: js.Any = js.native
  val mutationBatchKeyRe: js.Any = js.native
  val onlineStateKey: js.Any = js.native
  var persistClientState: js.Any = js.native
  var persistMutationState: js.Any = js.native
  var persistOnlineState: js.Any = js.native
  var persistQueryTargetState: js.Any = js.native
  val persistenceKey: js.Any = js.native
  val platform: js.Any = js.native
  val queryTargetKeyRe: js.Any = js.native
  val queue: js.Any = js.native
  var removeItem: js.Any = js.native
  var removeMutationState: js.Any = js.native
  val sequenceNumberKey: js.Any = js.native
  var setItem: js.Any = js.native
  var started: js.Any = js.native
  val storage: js.Any = js.native
  val storageListener: js.Any = js.native
  /** Assembles the key for a client state in WebStorage */
  var toWebStorageClientStateKey: js.Any = js.native
  /** Assembles the key for a mutation batch in WebStorage */
  var toWebStorageMutationBatchKey: js.Any = js.native
  /** Assembles the key for a query state in WebStorage */
  var toWebStorageQueryTargetMetadataKey: js.Any = js.native
  /* private */ def localClientState(): js.Any = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/local/shared_client_state", "WebStorageSharedClientState")
@js.native
object WebStorageSharedClientState extends js.Object {
  /** Returns 'true' if WebStorage is available in the current environment. */
  def isAvailable(platform: Platform): Boolean = js.native
}

