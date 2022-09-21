package typings.firebaseFirestore.liteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
@js.native
trait DocumentKey extends StObject {
  
  def collectionGroup: String = js.native
  
  /** Returns the collection group (i.e. the name of the parent collection) for this key. */
  def getCollectionGroup(): String = js.native
  
  /** Returns the fully qualified path to the parent collection. */
  def getCollectionPath(): ResourcePath = js.native
  
  /** Returns true if the document is in the specified collectionId. */
  def hasCollectionId(collectionId: String): Boolean = js.native
  
  def isEqual(): Boolean = js.native
  def isEqual(other: DocumentKey): Boolean = js.native
  
  val path: ResourcePath = js.native
}
