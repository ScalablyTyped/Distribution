package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.operationsProtos.google.api.CustomHttpPattern
import typings.googleGax.mod.operationsProtos.google.api.Http
import typings.googleGax.mod.operationsProtos.google.api.HttpRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofapiCustomHttpPatternHttp extends StObject {
  
  /** Represents a CustomHttpPattern. */
  var CustomHttpPattern: Instantiable0[typings.googleGax.mod.operationsProtos.google.api.CustomHttpPattern] & TypeofCustomHttpPatternDecode
  
  /** Represents a Http. */
  var Http: Instantiable0[typings.googleGax.mod.operationsProtos.google.api.Http] & TypeofHttpDecode
  
  /** Represents a HttpRule. */
  var HttpRule: Instantiable0[typings.googleGax.mod.operationsProtos.google.api.HttpRule] & TypeofHttpRuleDecode
}
object TypeofapiCustomHttpPatternHttp {
  
  inline def apply(
    CustomHttpPattern: Instantiable0[CustomHttpPattern] & TypeofCustomHttpPatternDecode,
    Http: Instantiable0[Http] & TypeofHttpDecode,
    HttpRule: Instantiable0[HttpRule] & TypeofHttpRuleDecode
  ): TypeofapiCustomHttpPatternHttp = {
    val __obj = js.Dynamic.literal(CustomHttpPattern = CustomHttpPattern.asInstanceOf[js.Any], Http = Http.asInstanceOf[js.Any], HttpRule = HttpRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofapiCustomHttpPatternHttp]
  }
  
  extension [Self <: TypeofapiCustomHttpPatternHttp](x: Self) {
    
    inline def setCustomHttpPattern(value: Instantiable0[CustomHttpPattern] & TypeofCustomHttpPatternDecode): Self = StObject.set(x, "CustomHttpPattern", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: Instantiable0[Http] & TypeofHttpDecode): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
    
    inline def setHttpRule(value: Instantiable0[HttpRule] & TypeofHttpRuleDecode): Self = StObject.set(x, "HttpRule", value.asInstanceOf[js.Any])
  }
}
