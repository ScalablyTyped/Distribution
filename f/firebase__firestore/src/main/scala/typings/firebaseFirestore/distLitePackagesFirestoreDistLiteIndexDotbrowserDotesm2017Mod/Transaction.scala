package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "Transaction")
@js.native
open class Transaction protected ()
  extends StObject
     with bs {
  /** @hideconstructor */
  def this(t: Any, e: Any) = this()
  
  /* CompleteClass */
  var _dataReader: Yn = js.native
  
  /* CompleteClass */
  var _firestore: Any = js.native
  
  /* CompleteClass */
  var _transaction: Any = js.native
  
  /**
    * Deletes the document referred to by the provided {@link DocumentReference}.
    *
    * @param documentRef - A reference to the document to be deleted.
    * @returns This `Transaction` instance. Used for chaining method calls.
    */ /* CompleteClass */
  override def delete(t: Any): bs = js.native
  
  /**
    * Reads the document referenced by the provided {@link DocumentReference}.
    *
    * @param documentRef - A reference to the document to be read.
    * @returns A `DocumentSnapshot` with the read data.
    */ /* CompleteClass */
  override def get(t: Any): Any = js.native
  
  /* CompleteClass */
  override def set(t: Any, e: Any, n: Any): bs = js.native
  
  /* CompleteClass */
  override def update(t: Any, e: Any, n: Any, r: Any*): bs = js.native
}
