package typings.firebaseFirestore

import typings.firebaseFirestore.documentComparatorMod.DocumentComparator
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/document_set", JSImport.Namespace)
@js.native
object documentSetMod extends js.Object {
  @js.native
  /** The default ordering is by key if the comparator is omitted */
  class DocumentSet () extends js.Object {
    def this(comp: DocumentComparator) = this()
    var comparator: js.Any = js.native
    var copy: js.Any = js.native
    var keyedMap: js.Any = js.native
    var sortedSet: js.Any = js.native
    /** Inserts or updates a document with the same key */
    def add(doc: Document): DocumentSet = js.native
    /** Deletes a document with a given key */
    def delete(key: DocumentKey): DocumentSet = js.native
    def first(): Document | Null = js.native
    /** Iterates documents in order defined by "comparator" */
    def forEach(cb: js.Function1[/* doc */ Document, Unit]): Unit = js.native
    def get(key: DocumentKey): Document | Null = js.native
    def has(key: DocumentKey): Boolean = js.native
    /**
      * Returns the index of the provided key in the document set, or -1 if the
      * document key is not present in the set;
      */
    def indexOf(key: DocumentKey): Double = js.native
    def isEmpty(): Boolean = js.native
    def isEqual(): Boolean = js.native
    def isEqual(other: DocumentSet): Boolean = js.native
    def last(): Document | Null = js.native
    def size: Double = js.native
  }
  
  /* static members */
  @js.native
  object DocumentSet extends js.Object {
    /**
      * Returns an empty copy of the existing DocumentSet, using the same
      * comparator.
      */
    def emptySet(oldSet: DocumentSet): DocumentSet = js.native
  }
  
}

