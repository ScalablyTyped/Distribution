package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DocumentSet is an immutable (copy-on-write) collection that holds documents
  * in order specified by the provided comparator. We always add a document key
  * comparator on top of what is provided to guarantee document equality based on
  * the key.
  */
@js.native
trait DocumentSet extends StObject {
  
  /** Inserts or updates a document with the same key */
  def add(doc: Document2): DocumentSet = js.native
  
  /* private */ var comparator: Any = js.native
  
  /* private */ var copy: Any = js.native
  
  /** Deletes a document with a given key */
  def delete(key: DocumentKey): DocumentSet = js.native
  
  def first(): Document2 | Null = js.native
  
  /** Iterates documents in order defined by "comparator" */
  def forEach(cb: js.Function1[/* doc */ Document2, Unit]): Unit = js.native
  
  def get(key: DocumentKey): Document2 | Null = js.native
  
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
  
  def last(): Document2 | Null = js.native
  
  def size: Double = js.native
  
  /* private */ var sortedSet: Any = js.native
}
