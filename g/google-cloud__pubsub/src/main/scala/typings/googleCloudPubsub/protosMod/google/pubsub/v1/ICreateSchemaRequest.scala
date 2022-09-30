package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateSchemaRequest. */
trait ICreateSchemaRequest extends StObject {
  
  /** CreateSchemaRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** CreateSchemaRequest schema */
  var schema: js.UndefOr[ISchema | Null] = js.undefined
  
  /** CreateSchemaRequest schemaId */
  var schemaId: js.UndefOr[String | Null] = js.undefined
}
object ICreateSchemaRequest {
  
  inline def apply(): ICreateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateSchemaRequest]
  }
  
  extension [Self <: ICreateSchemaRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaId(value: String): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdNull: Self = StObject.set(x, "schemaId", null)
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
