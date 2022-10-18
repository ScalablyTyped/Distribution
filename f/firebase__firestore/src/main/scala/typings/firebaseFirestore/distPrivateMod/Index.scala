package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** The ID of the collection to index. */
  val collectionGroup: String
  
  /** A list of fields to index. */
  val fields: js.UndefOr[js.Array[IndexField]] = js.undefined
}
object Index {
  
  inline def apply(collectionGroup: String): Index = {
    val __obj = js.Dynamic.literal(collectionGroup = collectionGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[IndexField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: IndexField*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
