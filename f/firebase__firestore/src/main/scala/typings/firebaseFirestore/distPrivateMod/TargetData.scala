package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An immutable set of metadata that the local store tracks for each target.
  */
trait TargetData extends StObject {
  
  /**
    * The maximum snapshot version at which the associated view
    * contained no limbo documents.
    */
  val lastLimboFreeSnapshotVersion: SnapshotVersion
  
  /** The purpose of the target. */
  val purpose: TargetPurpose
  
  /**
    * An opaque, server-assigned token that allows watching a target to be
    * resumed after disconnecting without retransmitting all the data that
    * matches the target. The resume token essentially identifies a point in
    * time from which the server should resume sending results.
    */
  val resumeToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ByteString */ Any
  
  /**
    * The sequence number of the last transaction during which this target data
    * was modified.
    */
  val sequenceNumber: ListenSequenceNumber
  
  /** The latest snapshot version seen for this target. */
  val snapshotVersion: SnapshotVersion
  
  /** The target being listened to. */
  val target: Target
  
  /**
    * The target ID to which the target corresponds; Assigned by the
    * LocalStore for user listens and by the SyncEngine for limbo watches.
    */
  val targetId: TargetId
  
  /**
    * Creates a new target data instance with an updated last limbo free
    * snapshot version number.
    */
  def withLastLimboFreeSnapshotVersion(lastLimboFreeSnapshotVersion: SnapshotVersion): TargetData
  
  /**
    * Creates a new target data instance with an updated resume token and
    * snapshot version.
    */
  def withResumeToken(
    resumeToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ByteString */ Any,
    snapshotVersion: SnapshotVersion
  ): TargetData
  
  /** Creates a new target data instance with an updated sequence number. */
  def withSequenceNumber(sequenceNumber: Double): TargetData
}
object TargetData {
  
  inline def apply(
    lastLimboFreeSnapshotVersion: SnapshotVersion,
    purpose: TargetPurpose,
    resumeToken: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ByteString */ Any,
    sequenceNumber: ListenSequenceNumber,
    snapshotVersion: SnapshotVersion,
    target: Target,
    targetId: TargetId,
    withLastLimboFreeSnapshotVersion: SnapshotVersion => TargetData,
    withResumeToken: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ByteString */ Any, SnapshotVersion) => TargetData,
    withSequenceNumber: Double => TargetData
  ): TargetData = {
    val __obj = js.Dynamic.literal(lastLimboFreeSnapshotVersion = lastLimboFreeSnapshotVersion.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], snapshotVersion = snapshotVersion.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], withLastLimboFreeSnapshotVersion = js.Any.fromFunction1(withLastLimboFreeSnapshotVersion), withResumeToken = js.Any.fromFunction2(withResumeToken), withSequenceNumber = js.Any.fromFunction1(withSequenceNumber))
    __obj.asInstanceOf[TargetData]
  }
  
  extension [Self <: TargetData](x: Self) {
    
    inline def setLastLimboFreeSnapshotVersion(value: SnapshotVersion): Self = StObject.set(x, "lastLimboFreeSnapshotVersion", value.asInstanceOf[js.Any])
    
    inline def setPurpose(value: TargetPurpose): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setResumeToken(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ByteString */ Any
    ): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: ListenSequenceNumber): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSnapshotVersion(value: SnapshotVersion): Self = StObject.set(x, "snapshotVersion", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setWithLastLimboFreeSnapshotVersion(value: SnapshotVersion => TargetData): Self = StObject.set(x, "withLastLimboFreeSnapshotVersion", js.Any.fromFunction1(value))
    
    inline def setWithResumeToken(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ByteString */ Any, SnapshotVersion) => TargetData
    ): Self = StObject.set(x, "withResumeToken", js.Any.fromFunction2(value))
    
    inline def setWithSequenceNumber(value: Double => TargetData): Self = StObject.set(x, "withSequenceNumber", js.Any.fromFunction1(value))
  }
}
