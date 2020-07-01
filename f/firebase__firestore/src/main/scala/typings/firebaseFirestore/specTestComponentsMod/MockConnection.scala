package typings.firebaseFirestore.specTestComponentsMod

import org.scalablytyped.runtime.NumberDictionary
import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.promiseMod.Deferred
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.firebaseFirestore.streamBridgeMod.StreamBridge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_components", "MockConnection")
@js.native
class MockConnection protected () extends Connection {
  def this(queue: AsyncQueue) = this()
  /**
    * Tracks the currently active watch targets as detected by the mock watch
    * stream, as a mapping from target ID to query Target.
    */
  var activeTargets: NumberDictionary[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Target */ js.Any
  ] = js.native
  /**
    * The set of mutations sent out before there was a corresponding
    * writeSendBarrier.
    */
  var earlyWrites: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteRequest */ _
  ] = js.native
  /** Whether the Watch stream is open. */
  var isWatchOpen: Boolean = js.native
  var nextWriteStreamToken: Double = js.native
  var queue: js.Any = js.native
  var resetAndCloseWatchStream: js.Any = js.native
  var resetAndCloseWriteStream: js.Any = js.native
  /** A Deferred that is resolved once watch opens. */
  var watchOpen: Deferred[Unit] = js.native
  var watchStream: (StreamBridge[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ListenRequest */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ListenResponse */ _
  ]) | Null = js.native
  /** The total number of requests sent to the watch stream. */
  var watchStreamRequestCount: Double = js.native
  /**
    * Used to make sure a write was actually sent out on the network before the
    * test runner continues.
    */
  var writeSendBarriers: js.Array[
    Deferred[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteRequest */ _
    ]
  ] = js.native
  var writeStream: (StreamBridge[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteRequest */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteResponse */ _
  ]) | Null = js.native
  /** The total number of requests sent to the write stream. */
  var writeStreamRequestCount: Double = js.native
  def ackWrite(): Unit = js.native
  def ackWrite(
    commitTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Timestamp */ js.Any
  ): Unit = js.native
  def ackWrite(
    commitTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Timestamp */ js.Any,
    mutationResults: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteResult */ _
    ]
  ): Unit = js.native
  def failWatchStream(): Unit = js.native
  def failWatchStream(err: FirestoreError): Unit = js.native
  def failWrite(err: FirestoreError): Unit = js.native
  def waitForWatchOpen(): js.Promise[Unit] = js.native
  def waitForWriteRequest(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteRequest */ _
  ] = js.native
}

