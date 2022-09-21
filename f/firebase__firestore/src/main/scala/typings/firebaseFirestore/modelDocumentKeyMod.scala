package typings.firebaseFirestore

import typings.firebaseFirestore.modelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelDocumentKeyMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/document_key", "DocumentKey")
  @js.native
  open class DocumentKey protected () extends StObject {
    def this(path: ResourcePath) = this()
    
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
  /* static members */
  object DocumentKey {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/model/document_key", "DocumentKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def comparator(k1: DocumentKey, k2: DocumentKey): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("comparator")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def empty(): DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[DocumentKey]
    
    inline def fromName(name: String): DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[DocumentKey]
    
    inline def fromPath(path: String): DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any]).asInstanceOf[DocumentKey]
    
    /**
      * Creates and returns a new document key with the given segments.
      *
      * @param segments - The segments of the path to the document
      * @returns A new instance of DocumentKey
      */
    inline def fromSegments(segments: js.Array[String]): DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegments")(segments.asInstanceOf[js.Any]).asInstanceOf[DocumentKey]
    
    inline def isDocumentKey(path: ResourcePath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentKey")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
