package typings.firebaseFirestore.localTargetDataMod

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.coreTargetMod.Target
import typings.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.utilByteStringMod.ByteString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/target_data", "TargetData")
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
  def withResumeToken(resumeToken: ByteString, snapshotVersion: SnapshotVersion): TargetData = js.native
  /** Creates a new target data instance with an updated sequence number. */
  def withSequenceNumber(sequenceNumber: Double): TargetData = js.native
}

