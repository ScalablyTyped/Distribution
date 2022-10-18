package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TargetChange specifies the set of changes for a specific target as part of
  * a RemoteEvent. These changes track which documents are added, modified or
  * removed, as well as the target's resume token and whether the target is
  * marked CURRENT.
  * The actual changes *to* documents are not part of the TargetChange since
  * documents may be part of multiple targets.
  */
trait TargetChange extends StObject {
  
  /**
    * The set of documents that were newly assigned to this target as part of
    * this remote event.
    */
  val addedDocuments: DocumentKeySet
  
  /**
    * The "current" (synced) status of this target. Note that "current"
    * has special meaning in the RPC protocol that implies that a target is
    * both up-to-date and consistent with the rest of the watch stream.
    */
  val current: Boolean
  
  /**
    * The set of documents that were already assigned to this target but received
    * an update during this remote event.
    */
  val modifiedDocuments: DocumentKeySet
  
  /**
    * The set of documents that were removed from this target as part of this
    * remote event.
    */
  val removedDocuments: DocumentKeySet
  
  /**
    * An opaque, server-assigned token that allows watching a query to be resumed
    * after disconnecting without retransmitting all the data that matches the
    * query. The resume token essentially identifies a point in time from which
    * the server should resume sending results.
    */
  val resumeToken: ByteString
}
object TargetChange {
  
  inline def apply(
    addedDocuments: DocumentKeySet,
    current: Boolean,
    modifiedDocuments: DocumentKeySet,
    removedDocuments: DocumentKeySet,
    resumeToken: ByteString
  ): TargetChange = {
    val __obj = js.Dynamic.literal(addedDocuments = addedDocuments.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], modifiedDocuments = modifiedDocuments.asInstanceOf[js.Any], removedDocuments = removedDocuments.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetChange]
  }
  
  extension [Self <: TargetChange](x: Self) {
    
    inline def setAddedDocuments(value: DocumentKeySet): Self = StObject.set(x, "addedDocuments", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setModifiedDocuments(value: DocumentKeySet): Self = StObject.set(x, "modifiedDocuments", value.asInstanceOf[js.Any])
    
    inline def setRemovedDocuments(value: DocumentKeySet): Self = StObject.set(x, "removedDocuments", value.asInstanceOf[js.Any])
    
    inline def setResumeToken(value: ByteString): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
  }
}
