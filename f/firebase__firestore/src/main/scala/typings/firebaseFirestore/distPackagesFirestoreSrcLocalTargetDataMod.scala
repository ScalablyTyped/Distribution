package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Target
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString
import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
import typings.firebaseFirestore.firebaseFirestoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalTargetDataMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/target_data", "TargetData")
  @js.native
  open class TargetData protected () extends StObject {
    def this(
      /** The target being listened to. */
    target: Target,
      /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    targetId: TargetId,
      /** The purpose of the target. */
    purpose: TargetPurpose,
      /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    sequenceNumber: ListenSequenceNumber
    ) = this()
    def this(
      /** The target being listened to. */
    target: Target,
      /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    targetId: TargetId,
      /** The purpose of the target. */
    purpose: TargetPurpose,
      /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    sequenceNumber: ListenSequenceNumber,
      /** The latest snapshot version seen for this target. */
    snapshotVersion: SnapshotVersion
    ) = this()
    def this(
      /** The target being listened to. */
    target: Target,
      /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    targetId: TargetId,
      /** The purpose of the target. */
    purpose: TargetPurpose,
      /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    sequenceNumber: ListenSequenceNumber,
      /** The latest snapshot version seen for this target. */
    snapshotVersion: Unit,
      /**
      * The maximum snapshot version at which the associated view
      * contained no limbo documents.
      */
    lastLimboFreeSnapshotVersion: SnapshotVersion
    ) = this()
    def this(
      /** The target being listened to. */
    target: Target,
      /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    targetId: TargetId,
      /** The purpose of the target. */
    purpose: TargetPurpose,
      /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    sequenceNumber: ListenSequenceNumber,
      /** The latest snapshot version seen for this target. */
    snapshotVersion: SnapshotVersion,
      /**
      * The maximum snapshot version at which the associated view
      * contained no limbo documents.
      */
    lastLimboFreeSnapshotVersion: SnapshotVersion
    ) = this()
    def this(
      /** The target being listened to. */
    target: Target,
      /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    targetId: TargetId,
      /** The purpose of the target. */
    purpose: TargetPurpose,
      /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    sequenceNumber: ListenSequenceNumber,
      /** The latest snapshot version seen for this target. */
    snapshotVersion: Unit,
      /**
      * The maximum snapshot version at which the associated view
      * contained no limbo documents.
      */
    lastLimboFreeSnapshotVersion: Unit,
      /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    resumeToken: ByteString
    ) = this()
    def this(
      /** The target being listened to. */
    target: Target,
      /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    targetId: TargetId,
      /** The purpose of the target. */
    purpose: TargetPurpose,
      /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    sequenceNumber: ListenSequenceNumber,
      /** The latest snapshot version seen for this target. */
    snapshotVersion: Unit,
      /**
      * The maximum snapshot version at which the associated view
      * contained no limbo documents.
      */
    lastLimboFreeSnapshotVersion: SnapshotVersion,
      /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    resumeToken: ByteString
    ) = this()
    def this(
      /** The target being listened to. */
    target: Target,
      /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    targetId: TargetId,
      /** The purpose of the target. */
    purpose: TargetPurpose,
      /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    sequenceNumber: ListenSequenceNumber,
      /** The latest snapshot version seen for this target. */
    snapshotVersion: SnapshotVersion,
      /**
      * The maximum snapshot version at which the associated view
      * contained no limbo documents.
      */
    lastLimboFreeSnapshotVersion: Unit,
      /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    resumeToken: ByteString
    ) = this()
    def this(
      /** The target being listened to. */
    target: Target,
      /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    targetId: TargetId,
      /** The purpose of the target. */
    purpose: TargetPurpose,
      /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    sequenceNumber: ListenSequenceNumber,
      /** The latest snapshot version seen for this target. */
    snapshotVersion: SnapshotVersion,
      /**
      * The maximum snapshot version at which the associated view
      * contained no limbo documents.
      */
    lastLimboFreeSnapshotVersion: SnapshotVersion,
      /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    resumeToken: ByteString
    ) = this()
    
    /**
      * The maximum snapshot version at which the associated view
      * contained no limbo documents.
      */
    val lastLimboFreeSnapshotVersion: SnapshotVersion = js.native
    
    /** The purpose of the target. */
    val purpose: TargetPurpose = js.native
    
    /**
      * An opaque, server-assigned token that allows watching a target to be
      * resumed after disconnecting without retransmitting all the data that
      * matches the target. The resume token essentially identifies a point in
      * time from which the server should resume sending results.
      */
    val resumeToken: ByteString = js.native
    
    /**
      * The sequence number of the last transaction during which this target data
      * was modified.
      */
    val sequenceNumber: ListenSequenceNumber = js.native
    
    /** The latest snapshot version seen for this target. */
    val snapshotVersion: SnapshotVersion = js.native
    
    /** The target being listened to. */
    val target: Target = js.native
    
    /**
      * The target ID to which the target corresponds; Assigned by the
      * LocalStore for user listens and by the SyncEngine for limbo watches.
      */
    val targetId: TargetId = js.native
    
    /**
      * Creates a new target data instance with an updated last limbo free
      * snapshot version number.
      */
    def withLastLimboFreeSnapshotVersion(lastLimboFreeSnapshotVersion: SnapshotVersion): TargetData = js.native
    
    /**
      * Creates a new target data instance with an updated resume token and
      * snapshot version.
      */
    def withResumeToken(resumeToken: ByteString, snapshotVersion: SnapshotVersion): TargetData = js.native
    
    /** Creates a new target data instance with an updated sequence number. */
    def withSequenceNumber(sequenceNumber: Double): TargetData = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreInts.`0`
    - typings.firebaseFirestore.firebaseFirestoreInts.`1`
    - typings.firebaseFirestore.firebaseFirestoreInts.`2`
  */
  trait TargetPurpose extends StObject
  object TargetPurpose {
    
    /**
      * The query target was used to refill a query after an existence filter mismatch.
      */
    inline def ExistenceFilterMismatch: `1` = 1.asInstanceOf[`1`]
    
    /** The query target was used to resolve a limbo document. */
    inline def LimboResolution: `2` = 2.asInstanceOf[`2`]
    
    /** A regular, normal query target. */
    inline def Listen: `0` = 0.asInstanceOf[`0`]
  }
}
