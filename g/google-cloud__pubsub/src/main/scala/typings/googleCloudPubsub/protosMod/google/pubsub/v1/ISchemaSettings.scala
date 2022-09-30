package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SchemaSettings. */
trait ISchemaSettings extends StObject {
  
  /** SchemaSettings encoding */
  var encoding: js.UndefOr[
    Encoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String) | Null
  ] = js.undefined
  
  /** SchemaSettings schema */
  var schema: js.UndefOr[String | Null] = js.undefined
}
object ISchemaSettings {
  
  inline def apply(): ISchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISchemaSettings]
  }
  
  extension [Self <: ISchemaSettings](x: Self) {
    
    inline def setEncoding(
      value: Encoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String)
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
