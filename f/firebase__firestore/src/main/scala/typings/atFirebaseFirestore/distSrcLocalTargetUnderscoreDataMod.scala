package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcCoreTargetMod.Target
import typings.atFirebaseFirestore.distSrcCoreTypesMod.ListenSequenceNumber
import typings.atFirebaseFirestore.distSrcCoreTypesMod.ProtoByteString
import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typings.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetData
import typings.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetPurpose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/target_data", JSImport.Namespace)
@js.native
object distSrcLocalTargetUnderscoreDataMod extends js.Object {
  @js.native
  class TargetData protected () extends js.Object {
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
    resumeToken: ProtoByteString
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
    val resumeToken: ProtoByteString = js.native
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
    def isEqual(other: TargetData): Boolean = js.native
    /**
      * Creates a new target data instance with an updated last limbo free
      * snapshot version number.
      */
    def withLastLimboFreeSnapshotVersion(lastLimboFreeSnapshotVersion: SnapshotVersion): TargetData = js.native
    /**
      * Creates a new target data instance with an updated resume token and
      * snapshot version.
      */
    def withResumeToken(resumeToken: ProtoByteString, snapshotVersion: SnapshotVersion): TargetData = js.native
    /** Creates a new target data instance with an updated sequence number. */
    def withSequenceNumber(sequenceNumber: Double): TargetData = js.native
  }
  
  @js.native
  sealed trait TargetPurpose extends js.Object
  
  @js.native
  object TargetPurpose extends js.Object {
    /**
      * The query target was used to refill a query after an existence filter mismatch.
      */
    @js.native
    sealed trait ExistenceFilterMismatch extends TargetPurpose
    
    /** The query target was used to resolve a limbo document. */
    @js.native
    sealed trait LimboResolution extends TargetPurpose
    
    /** A regular, normal query target. */
    @js.native
    sealed trait Listen extends TargetPurpose
    
    /* 1 */ val ExistenceFilterMismatch: typings.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetPurpose.ExistenceFilterMismatch with Double = js.native
    /* 2 */ val LimboResolution: typings.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetPurpose.LimboResolution with Double = js.native
    /* 0 */ val Listen: typings.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetPurpose.Listen with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TargetPurpose with Double] = js.native
  }
  
}

