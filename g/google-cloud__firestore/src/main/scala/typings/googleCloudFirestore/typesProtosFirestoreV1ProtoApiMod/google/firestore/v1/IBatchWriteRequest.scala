package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchWriteRequest. */
trait IBatchWriteRequest extends StObject {
  
  /** BatchWriteRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** BatchWriteRequest labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** BatchWriteRequest writes */
  var writes: js.UndefOr[js.Array[IWrite] | Null] = js.undefined
}
object IBatchWriteRequest {
  
  inline def apply(): IBatchWriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchWriteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBatchWriteRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setWrites(value: js.Array[IWrite]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesNull: Self = StObject.set(x, "writes", null)
    
    inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    inline def setWritesVarargs(value: IWrite*): Self = StObject.set(x, "writes", js.Array(value*))
  }
}
