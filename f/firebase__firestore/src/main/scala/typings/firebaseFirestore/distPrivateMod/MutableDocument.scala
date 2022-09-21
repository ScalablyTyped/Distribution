package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a document in Firestore with a key, version, data and whether it
  * has local mutations applied to it.
  *
  * Documents can transition between states via `convertToFoundDocument()`,
  * `convertToNoDocument()` and `convertToUnknownDocument()`. If a document does
  * not transition to one of these states even after all mutations have been
  * applied, `isValidDocument()` returns false and the document should be removed
  * from all views.
  */
@js.native
trait MutableDocument
  extends StObject
     with Document2 {
  
  /**
    * Changes the document type to indicate that it exists and that its version
    * and data are known.
    */
  def convertToFoundDocument(version: SnapshotVersion, value: ObjectValue): MutableDocument = js.native
  
  /**
    * Changes the document type to indicate that it doesn't exist at the given
    * version.
    */
  def convertToNoDocument(version: SnapshotVersion): MutableDocument = js.native
  
  /**
    * Changes the document type to indicate that it exists at a given version but
    * that its data is not known (e.g. a document that was updated without a known
    * base document).
    */
  def convertToUnknownDocument(version: SnapshotVersion): MutableDocument = js.native
  
  /* private */ var documentState: Any = js.native
  
  /* private */ var documentType: Any = js.native
  
  @JSName("hasCommittedMutations")
  def hasCommittedMutations_MMutableDocument: Boolean = js.native
  
  @JSName("hasLocalMutations")
  def hasLocalMutations_MMutableDocument: Boolean = js.native
  
  @JSName("hasPendingWrites")
  def hasPendingWrites_MMutableDocument: Boolean = js.native
  
  def setHasCommittedMutations(): MutableDocument = js.native
  
  def setHasLocalMutations(): MutableDocument = js.native
  
  def setReadTime(readTime: SnapshotVersion): MutableDocument = js.native
}
