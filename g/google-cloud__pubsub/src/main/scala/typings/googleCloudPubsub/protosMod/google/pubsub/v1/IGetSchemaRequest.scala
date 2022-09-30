package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetSchemaRequest. */
trait IGetSchemaRequest extends StObject {
  
  /** GetSchemaRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** GetSchemaRequest view */
  var view: js.UndefOr[
    SchemaView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.SchemaView * / any */ String) | Null
  ] = js.undefined
}
object IGetSchemaRequest {
  
  inline def apply(): IGetSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetSchemaRequest]
  }
  
  extension [Self <: IGetSchemaRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(
      value: SchemaView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.SchemaView * / any */ String)
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
