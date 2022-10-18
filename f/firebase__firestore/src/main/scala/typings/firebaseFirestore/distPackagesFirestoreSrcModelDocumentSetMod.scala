package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentComparatorMod.DocumentComparator
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcModelDocumentSetMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/document_set", "DocumentSet")
  @js.native
  /** The default ordering is by key if the comparator is omitted */
  open class DocumentSet () extends StObject {
    def this(comp: DocumentComparator) = this()
    
    /** Inserts or updates a document with the same key */
    def add(doc: Document): DocumentSet = js.native
    
    /* private */ var comparator: Any = js.native
    
    /* private */ var copy: Any = js.native
    
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
    
    /* private */ var keyedMap: Any = js.native
    
    def last(): Document | Null = js.native
    
    def size: Double = js.native
    
    /* private */ var sortedSet: Any = js.native
  }
  /* static members */
  object DocumentSet {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/model/document_set", "DocumentSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an empty copy of the existing DocumentSet, using the same
      * comparator.
      */
    inline def emptySet(oldSet: DocumentSet): DocumentSet = ^.asInstanceOf[js.Dynamic].applyDynamic("emptySet")(oldSet.asInstanceOf[js.Any]).asInstanceOf[DocumentSet]
  }
}
