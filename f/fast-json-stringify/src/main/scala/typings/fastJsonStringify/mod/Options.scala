package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.ceil
import typings.fastJsonStringify.fastJsonStringifyStrings.debug
import typings.fastJsonStringify.fastJsonStringifyStrings.floor
import typings.fastJsonStringify.fastJsonStringifyStrings.round
import typings.fastJsonStringify.fastJsonStringifyStrings.standalone
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Configure Ajv, which is used to evaluate conditional schemas and combined (anyOf) schemas
    */
  var ajv: js.UndefOr[typings.ajv.distCoreMod.Options] = js.undefined
  
  /**
    * @deprecated 
    * Enable debug mode. Please use `mode: "debug"` instead
    */
  var debugMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Running mode of fast-json-stringify
    */
  var mode: js.UndefOr[debug | standalone] = js.undefined
  
  /**
    * Optionally configure how the integer will be rounded
    */
  var rounding: js.UndefOr[ceil | floor | round] = js.undefined
  
  /**
    * Optionally add an external definition to reference from your schema
    */
  var schema: js.UndefOr[Record[String, Schema]] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAjv(value: typings.ajv.distCoreMod.Options): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
    
    inline def setAjvUndefined: Self = StObject.set(x, "ajv", js.undefined)
    
    inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
    
    inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
    
    inline def setMode(value: debug | standalone): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRounding(value: ceil | floor | round): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setSchema(value: Record[String, Schema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
