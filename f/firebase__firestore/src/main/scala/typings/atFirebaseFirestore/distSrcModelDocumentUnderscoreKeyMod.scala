package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/document_key", JSImport.Namespace)
@js.native
object distSrcModelDocumentUnderscoreKeyMod extends js.Object {
  @js.native
  class DocumentKey protected () extends js.Object {
    def this(path: ResourcePath) = this()
    val path: ResourcePath = js.native
    /** Returns true if the document is in the specified collectionId. */
    def hasCollectionId(collectionId: String): Boolean = js.native
    def isEqual(): Boolean = js.native
    def isEqual(other: DocumentKey): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DocumentKey extends js.Object {
    var EMPTY: DocumentKey = js.native
    def comparator(k1: DocumentKey, k2: DocumentKey): Double = js.native
    /**
      * Creates and returns a new document key using '/' to split the string into
      * segments.
      *
      * @param path The slash-separated path string to the document
      * @return A new instance of DocumentKey
      */
    def fromPathString(path: String): DocumentKey = js.native
    /**
      * Creates and returns a new document key with the given segments.
      *
      * @param path The segments of the path to the document
      * @return A new instance of DocumentKey
      */
    def fromSegments(segments: js.Array[String]): DocumentKey = js.native
    def isDocumentKey(path: ResourcePath): Boolean = js.native
  }
  
}

