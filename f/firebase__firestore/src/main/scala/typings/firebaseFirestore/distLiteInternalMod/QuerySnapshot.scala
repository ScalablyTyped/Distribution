package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/internal", "QuerySnapshot")
@js.native
open class QuerySnapshot[T] protected () extends StObject {
  /** @hideconstructor */
  def this(_query: Query_[T], _docs: js.Array[QueryDocumentSnapshot[T]]) = this()
  
  val _docs: js.Array[QueryDocumentSnapshot[T]] = js.native
  
  /** An array of all the documents in the `QuerySnapshot`. */
  def docs: js.Array[QueryDocumentSnapshot[T]] = js.native
  
  /** True if there are no documents in the `QuerySnapshot`. */
  def empty: Boolean = js.native
  
  /**
    * Enumerates all of the documents in the `QuerySnapshot`.
    *
    * @param callback - A callback to be called with a `QueryDocumentSnapshot` for
    * each document in the snapshot.
    * @param thisArg - The `this` binding for the callback.
    */
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit]): Unit = js.native
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit], thisArg: Any): Unit = js.native
  
  /**
    * The query on which you called {@link getDocs} in order to get this
    * `QuerySnapshot`.
    */
  val query: Query_[T] = js.native
  
  /** The number of documents in the `QuerySnapshot`. */
  def size: Double = js.native
}
