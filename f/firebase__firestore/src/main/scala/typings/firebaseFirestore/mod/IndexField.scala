package typings.firebaseFirestore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.firebaseFirestoreStrings.ASCENDING
import typings.firebaseFirestore.firebaseFirestoreStrings.CONTAINS
import typings.firebaseFirestore.firebaseFirestoreStrings.DESCENDING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexField
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * What type of array index to create. Set to `CONTAINS` for `array-contains`
    * and `array-contains-any` indexes.
    *
    * Only one of `arrayConfig` or `order` should be set;
    */
  val arrayConfig: js.UndefOr[CONTAINS] = js.undefined
  
  /** The field path to index. */
  val fieldPath: String
  
  /**
    * What type of array index to create. Set to `ASCENDING` or 'DESCENDING` for
    * `==`, `!=`, `<=`, `<=`, `in` and `not-in` filters.
    *
    * Only one of `arrayConfig` or `order` should be set.
    */
  val order: js.UndefOr[ASCENDING | DESCENDING] = js.undefined
}
object IndexField {
  
  inline def apply(fieldPath: String): IndexField = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexField]
  }
  
  extension [Self <: IndexField](x: Self) {
    
    inline def setArrayConfig(value: CONTAINS): Self = StObject.set(x, "arrayConfig", value.asInstanceOf[js.Any])
    
    inline def setArrayConfigUndefined: Self = StObject.set(x, "arrayConfig", js.undefined)
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: ASCENDING | DESCENDING): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
