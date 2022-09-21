package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gr extends StObject {
  
  var _dataReader: xn
  
  var _firestore: Any
  
  var _transaction: Any
  
  /**
    * Deletes the document referred to by the provided {@link DocumentReference}.
    *
    * @param documentRef - A reference to the document to be deleted.
    * @returns This `Transaction` instance. Used for chaining method calls.
    */ def delete(t: Any): Gr
  
  /**
    * Reads the document referenced by the provided {@link DocumentReference}.
    *
    * @param documentRef - A reference to the document to be read.
    * @returns A `DocumentSnapshot` with the read data.
    */ def get(t: Any): Any
  
  def set(t: Any, e: Any, n: Any): Gr
  
  def update(t: Any, e: Any, n: Any, r: Any*): Gr
}
object Gr {
  
  inline def apply(
    _dataReader: xn,
    _firestore: Any,
    _transaction: Any,
    delete: Any => Gr,
    get: Any => Any,
    set: (Any, Any, Any) => Gr,
    update: (Any, Any, Any, /* repeated */ Any) => Gr
  ): Gr = {
    val __obj = js.Dynamic.literal(_dataReader = _dataReader.asInstanceOf[js.Any], _firestore = _firestore.asInstanceOf[js.Any], _transaction = _transaction.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction3(set), update = js.Any.fromFunction4(update))
    __obj.asInstanceOf[Gr]
  }
  
  extension [Self <: Gr](x: Self) {
    
    inline def setDelete(value: Any => Gr): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (Any, Any, Any) => Gr): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (Any, Any, Any, /* repeated */ Any) => Gr): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    
    inline def set_dataReader(value: xn): Self = StObject.set(x, "_dataReader", value.asInstanceOf[js.Any])
    
    inline def set_firestore(value: Any): Self = StObject.set(x, "_firestore", value.asInstanceOf[js.Any])
    
    inline def set_transaction(value: Any): Self = StObject.set(x, "_transaction", value.asInstanceOf[js.Any])
  }
}
