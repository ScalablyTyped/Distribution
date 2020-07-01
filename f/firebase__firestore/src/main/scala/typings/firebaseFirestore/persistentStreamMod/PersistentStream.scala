package typings.firebaseFirestore.persistentStreamMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.asyncQueueMod.TimerId
import typings.firebaseFirestore.backoffMod.ExponentialBackoff
import typings.firebaseFirestore.credentialsMod.CredentialsProvider
import typings.firebaseFirestore.credentialsMod.Token
import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.firebaseFirestore.remoteConnectionMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/remote/persistent_stream", "PersistentStream")
@js.native
abstract class PersistentStream[SendType, ReceiveType, ListenerType /* <: PersistentStreamListener */] protected () extends js.Object {
  def this(
    queue: AsyncQueue,
    connectionTimerId: TimerId,
    idleTimerId: TimerId,
    connection: Connection,
    credentialsProvider: CredentialsProvider,
    listener: ListenerType
  ) = this()
  var auth: js.Any = js.native
  var backoff: ExponentialBackoff = js.native
  /** Marks the stream as active again. */
  var cancelIdleCheck: js.Any = js.native
  /**
    * Closes the stream and cleans up as necessary:
    *
    * * closes the underlying GRPC stream;
    * * calls the onClose handler with the given 'error';
    * * sets internal stream state to 'finalState';
    * * adjusts the backoff timer based on the error
    *
    * A new stream can be opened by calling start().
    *
    * @param finalState the intended state of the stream after closing.
    * @param error the error the connection was closed with.
    */
  var close: js.Any = js.native
  /**
    * A close count that's incremented every time the stream is closed; used by
    * getCloseGuardedDispatcher() to invalidate callbacks that happen after
    * close.
    */
  var closeCount: js.Any = js.native
  var connection: Connection = js.native
  var credentialsProvider: js.Any = js.native
  /**
    * Returns a "dispatcher" function that dispatches operations onto the
    * AsyncQueue but only runs them if closeCount remains unchanged. This allows
    * us to turn auth / stream callbacks into no-ops if the stream is closed /
    * re-opened, etc.
    */
  var getCloseGuardedDispatcher: js.Any = js.native
  /** Called by the idle timer when the stream should close due to inactivity. */
  var handleIdleCloseTimer: js.Any = js.native
  var idleTimer: js.Any = js.native
  var idleTimerId: js.Any = js.native
  var listener: ListenerType = js.native
  var performBackoff: js.Any = js.native
  var queue: js.Any = js.native
  var startStream: js.Any = js.native
  var state: js.Any = js.native
  var stream: js.Any = js.native
  def handleStreamClose(): js.Promise[Unit] = js.native
  def handleStreamClose(error: FirestoreError): js.Promise[Unit] = js.native
  /**
    * After an error the stream will usually back off on the next attempt to
    * start it. If the error warrants an immediate restart of the stream, the
    * sender can use this to indicate that the receiver should not back off.
    *
    * Each error will call the onClose() listener. That function can decide to
    * inhibit backoff if required.
    */
  def inhibitBackoff(): Unit = js.native
  /**
    * Returns true if the underlying RPC is open (the onOpen() listener has been
    * called) and the stream is ready for outbound requests.
    */
  def isOpen(): Boolean = js.native
  /**
    * Returns true if start() has been called and no error has occurred. True
    * indicates the stream is open or in the process of opening (which
    * encompasses respecting backoff, getting auth tokens, and starting the
    * actual RPC). Use isOpen() to determine if the stream is open and ready for
    * outbound requests.
    */
  def isStarted(): Boolean = js.native
  /**
    * Marks this stream as idle. If no further actions are performed on the
    * stream for one minute, the stream will automatically close itself and
    * notify the stream's onClose() handler with Status.OK. The stream will then
    * be in a !isStarted() state, requiring the caller to start the stream again
    * before further use.
    *
    * Only streams that are in state 'Open' can be marked idle, as all other
    * states imply pending network operations.
    */
  def markIdle(): Unit = js.native
  /**
    * Called after the stream has received a message. The function will be
    * called on the right queue and must return a Promise.
    * @param message The message received from the stream.
    */
  /* protected */ def onMessage(message: ReceiveType): js.Promise[Unit] = js.native
  /** Sends a message to the underlying stream. */
  /* protected */ def sendRequest(msg: SendType): Unit = js.native
  /**
    * Starts the RPC. Only allowed if isStarted() returns false. The stream is
    * not immediately ready for use: onOpen() will be invoked when the RPC is
    * ready for outbound requests, at which point isOpen() will return true.
    *
    * When start returns, isStarted() will return true.
    */
  def start(): Unit = js.native
  /* protected */ def startRpc(): Stream[SendType, ReceiveType] = js.native
  /**
    * Used by subclasses to start the concrete RPC and return the underlying
    * connection stream.
    */
  /* protected */ def startRpc(token: Token): Stream[SendType, ReceiveType] = js.native
  /**
    * Stops the RPC. This call is idempotent and allowed regardless of the
    * current isStarted() state.
    *
    * When stop returns, isStarted() and isOpen() will both return false.
    */
  def stop(): js.Promise[Unit] = js.native
  /**
    * Can be overridden to perform additional cleanup before the stream is closed.
    * Calling super.tearDown() is not required.
    */
  /* protected */ def tearDown(): Unit = js.native
}

