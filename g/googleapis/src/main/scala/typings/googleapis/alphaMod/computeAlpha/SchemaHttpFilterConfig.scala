package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpFilterConfig extends StObject {
  
  /**
    * The configuration needed to enable the networkservices.HttpFilter resource. The configuration must be YAML formatted and only contain fields defined in the protobuf identified in configTypeUrl
    */
  var config: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fully qualified versioned proto3 type url of the protobuf that the filter expects for its contextual settings, for example: type.googleapis.com/google.protobuf.Struct
    */
  var configTypeUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the networkservices.HttpFilter resource this configuration belongs to. This name must be known to the xDS client. Example: envoy.wasm
    */
  var filterName: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpFilterConfig {
  
  inline def apply(): SchemaHttpFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFilterConfig]
  }
  
  extension [Self <: SchemaHttpFilterConfig](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigNull: Self = StObject.set(x, "config", null)
    
    inline def setConfigTypeUrl(value: String): Self = StObject.set(x, "configTypeUrl", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUrlNull: Self = StObject.set(x, "configTypeUrl", null)
    
    inline def setConfigTypeUrlUndefined: Self = StObject.set(x, "configTypeUrl", js.undefined)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setFilterName(value: String): Self = StObject.set(x, "filterName", value.asInstanceOf[js.Any])
    
    inline def setFilterNameNull: Self = StObject.set(x, "filterName", null)
    
    inline def setFilterNameUndefined: Self = StObject.set(x, "filterName", js.undefined)
  }
}
