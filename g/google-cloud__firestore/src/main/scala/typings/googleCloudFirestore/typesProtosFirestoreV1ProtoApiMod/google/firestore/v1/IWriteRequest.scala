package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a WriteRequest. */
trait IWriteRequest extends StObject {
  
  /** WriteRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** WriteRequest labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** WriteRequest streamId */
  var streamId: js.UndefOr[String | Null] = js.undefined
  
  /** WriteRequest streamToken */
  var streamToken: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** WriteRequest writes */
  var writes: js.UndefOr[js.Array[IWrite] | Null] = js.undefined
}
object IWriteRequest {
  
  inline def apply(): IWriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWriteRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdNull: Self = StObject.set(x, "streamId", null)
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setStreamToken(value: js.typedarray.Uint8Array): Self = StObject.set(x, "streamToken", value.asInstanceOf[js.Any])
    
    inline def setStreamTokenNull: Self = StObject.set(x, "streamToken", null)
    
    inline def setStreamTokenUndefined: Self = StObject.set(x, "streamToken", js.undefined)
    
    inline def setWrites(value: js.Array[IWrite]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesNull: Self = StObject.set(x, "writes", null)
    
    inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    inline def setWritesVarargs(value: IWrite*): Self = StObject.set(x, "writes", js.Array(value*))
  }
}
