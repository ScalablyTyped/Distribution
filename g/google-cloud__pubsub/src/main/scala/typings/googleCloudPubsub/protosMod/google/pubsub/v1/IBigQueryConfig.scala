package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.pubsub.v1.BigQueryConfig.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BigQueryConfig. */
trait IBigQueryConfig extends StObject {
  
  /** BigQueryConfig dropUnknownFields */
  var dropUnknownFields: js.UndefOr[Boolean | Null] = js.undefined
  
  /** BigQueryConfig state */
  var state: js.UndefOr[
    State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.BigQueryConfig.State * / any */ String) | Null
  ] = js.undefined
  
  /** BigQueryConfig table */
  var table: js.UndefOr[String | Null] = js.undefined
  
  /** BigQueryConfig useTopicSchema */
  var useTopicSchema: js.UndefOr[Boolean | Null] = js.undefined
  
  /** BigQueryConfig writeMetadata */
  var writeMetadata: js.UndefOr[Boolean | Null] = js.undefined
}
object IBigQueryConfig {
  
  inline def apply(): IBigQueryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBigQueryConfig]
  }
  
  extension [Self <: IBigQueryConfig](x: Self) {
    
    inline def setDropUnknownFields(value: Boolean): Self = StObject.set(x, "dropUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setDropUnknownFieldsNull: Self = StObject.set(x, "dropUnknownFields", null)
    
    inline def setDropUnknownFieldsUndefined: Self = StObject.set(x, "dropUnknownFields", js.undefined)
    
    inline def setState(
      value: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.BigQueryConfig.State * / any */ String)
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setUseTopicSchema(value: Boolean): Self = StObject.set(x, "useTopicSchema", value.asInstanceOf[js.Any])
    
    inline def setUseTopicSchemaNull: Self = StObject.set(x, "useTopicSchema", null)
    
    inline def setUseTopicSchemaUndefined: Self = StObject.set(x, "useTopicSchema", js.undefined)
    
    inline def setWriteMetadata(value: Boolean): Self = StObject.set(x, "writeMetadata", value.asInstanceOf[js.Any])
    
    inline def setWriteMetadataNull: Self = StObject.set(x, "writeMetadata", null)
    
    inline def setWriteMetadataUndefined: Self = StObject.set(x, "writeMetadata", js.undefined)
  }
}
