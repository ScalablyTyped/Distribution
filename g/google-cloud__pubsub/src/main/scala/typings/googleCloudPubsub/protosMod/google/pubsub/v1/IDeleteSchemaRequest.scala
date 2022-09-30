package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteSchemaRequest. */
trait IDeleteSchemaRequest extends StObject {
  
  /** DeleteSchemaRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteSchemaRequest {
  
  inline def apply(): IDeleteSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteSchemaRequest]
  }
  
  extension [Self <: IDeleteSchemaRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
