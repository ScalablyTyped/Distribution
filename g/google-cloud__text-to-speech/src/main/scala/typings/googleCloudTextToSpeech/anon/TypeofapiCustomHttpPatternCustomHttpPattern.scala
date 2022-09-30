package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.LocationProtos.google.api.CustomHttpPattern
import typings.googleGax.mod.LocationProtos.google.api.Http
import typings.googleGax.mod.LocationProtos.google.api.HttpRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofapiCustomHttpPatternCustomHttpPattern extends StObject {
  
  /** Represents a CustomHttpPattern. */
  var CustomHttpPattern: Instantiable0[typings.googleGax.mod.LocationProtos.google.api.CustomHttpPattern] & TypeofCustomHttpPatternCreate
  
  /** Represents a Http. */
  var Http: Instantiable0[typings.googleGax.mod.LocationProtos.google.api.Http] & TypeofHttpCreate
  
  /** Represents a HttpRule. */
  var HttpRule: Instantiable0[typings.googleGax.mod.LocationProtos.google.api.HttpRule] & TypeofHttpRuleCreate
}
object TypeofapiCustomHttpPatternCustomHttpPattern {
  
  inline def apply(
    CustomHttpPattern: Instantiable0[CustomHttpPattern] & TypeofCustomHttpPatternCreate,
    Http: Instantiable0[Http] & TypeofHttpCreate,
    HttpRule: Instantiable0[HttpRule] & TypeofHttpRuleCreate
  ): TypeofapiCustomHttpPatternCustomHttpPattern = {
    val __obj = js.Dynamic.literal(CustomHttpPattern = CustomHttpPattern.asInstanceOf[js.Any], Http = Http.asInstanceOf[js.Any], HttpRule = HttpRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofapiCustomHttpPatternCustomHttpPattern]
  }
  
  extension [Self <: TypeofapiCustomHttpPatternCustomHttpPattern](x: Self) {
    
    inline def setCustomHttpPattern(value: Instantiable0[CustomHttpPattern] & TypeofCustomHttpPatternCreate): Self = StObject.set(x, "CustomHttpPattern", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: Instantiable0[Http] & TypeofHttpCreate): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
    
    inline def setHttpRule(value: Instantiable0[HttpRule] & TypeofHttpRuleCreate): Self = StObject.set(x, "HttpRule", value.asInstanceOf[js.Any])
  }
}
