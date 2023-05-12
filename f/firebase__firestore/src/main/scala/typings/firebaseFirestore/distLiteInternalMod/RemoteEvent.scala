package typings.firebaseFirestore.distLiteInternalMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event from the RemoteStore. It is split into targetChanges (changes to the
  * state or the set of documents in our watched targets) and documentUpdates
  * (changes to the actual documents).
  */
trait RemoteEvent extends StObject {
  
  /**
    * A set of which documents have changed or been deleted, along with the
    * doc's new values (if not deleted).
    */
  val documentUpdates: MutableDocumentMap
  
  /**
    * A set of which document updates are due only to limbo resolution targets.
    */
  val resolvedLimboDocuments: DocumentKeySet
  
  /**
    * The snapshot version this event brings us up to, or MIN if not set.
    */
  val snapshotVersion: SnapshotVersion
  
  /**
    * A map from target to changes to the target. See TargetChange.
    */
  val targetChanges: Map[TargetId, TargetChange]
  
  /**
    * A map of targets that is known to be inconsistent, and the purpose for
    * re-listening. Listens for these targets should be re-established without
    * resume tokens.
    */
  val targetMismatches: SortedMap[TargetId, TargetPurpose]
}
object RemoteEvent {
  
  inline def apply(
    documentUpdates: MutableDocumentMap,
    resolvedLimboDocuments: DocumentKeySet,
    snapshotVersion: SnapshotVersion,
    targetChanges: Map[TargetId, TargetChange],
    targetMismatches: SortedMap[TargetId, TargetPurpose]
  ): RemoteEvent = {
    val __obj = js.Dynamic.literal(documentUpdates = documentUpdates.asInstanceOf[js.Any], resolvedLimboDocuments = resolvedLimboDocuments.asInstanceOf[js.Any], snapshotVersion = snapshotVersion.asInstanceOf[js.Any], targetChanges = targetChanges.asInstanceOf[js.Any], targetMismatches = targetMismatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteEvent] (val x: Self) extends AnyVal {
    
    inline def setDocumentUpdates(value: MutableDocumentMap): Self = StObject.set(x, "documentUpdates", value.asInstanceOf[js.Any])
    
    inline def setResolvedLimboDocuments(value: DocumentKeySet): Self = StObject.set(x, "resolvedLimboDocuments", value.asInstanceOf[js.Any])
    
    inline def setSnapshotVersion(value: SnapshotVersion): Self = StObject.set(x, "snapshotVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetChanges(value: Map[TargetId, TargetChange]): Self = StObject.set(x, "targetChanges", value.asInstanceOf[js.Any])
    
    inline def setTargetMismatches(value: SortedMap[TargetId, TargetPurpose]): Self = StObject.set(x, "targetMismatches", value.asInstanceOf[js.Any])
  }
}
