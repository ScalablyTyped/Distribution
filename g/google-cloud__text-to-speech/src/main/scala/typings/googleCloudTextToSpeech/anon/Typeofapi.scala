package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.IamProtos.google.api.CustomHttpPattern
import typings.googleGax.mod.IamProtos.google.api.Http
import typings.googleGax.mod.IamProtos.google.api.HttpRule
import typings.googleGax.mod.IamProtos.google.api.ResourceDescriptor
import typings.googleGax.mod.IamProtos.google.api.ResourceReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofapi extends StObject {
  
  /** Represents a CustomHttpPattern. */
  var CustomHttpPattern: Instantiable0[typings.googleGax.mod.IamProtos.google.api.CustomHttpPattern] & TypeofCustomHttpPattern
  
  /** Represents a Http. */
  var Http: Instantiable0[typings.googleGax.mod.IamProtos.google.api.Http] & TypeofHttp
  
  /** Represents a HttpRule. */
  var HttpRule: Instantiable0[typings.googleGax.mod.IamProtos.google.api.HttpRule] & TypeofHttpRule
  
  /** Represents a ResourceDescriptor. */
  var ResourceDescriptor: Instantiable0[typings.googleGax.mod.IamProtos.google.api.ResourceDescriptor] & TypeofResourceDescriptor
  
  /** Represents a ResourceReference. */
  var ResourceReference: Instantiable0[typings.googleGax.mod.IamProtos.google.api.ResourceReference] & TypeofResourceReference
}
object Typeofapi {
  
  inline def apply(
    CustomHttpPattern: Instantiable0[CustomHttpPattern] & TypeofCustomHttpPattern,
    Http: Instantiable0[Http] & TypeofHttp,
    HttpRule: Instantiable0[HttpRule] & TypeofHttpRule,
    ResourceDescriptor: Instantiable0[ResourceDescriptor] & TypeofResourceDescriptor,
    ResourceReference: Instantiable0[ResourceReference] & TypeofResourceReference
  ): Typeofapi = {
    val __obj = js.Dynamic.literal(CustomHttpPattern = CustomHttpPattern.asInstanceOf[js.Any], Http = Http.asInstanceOf[js.Any], HttpRule = HttpRule.asInstanceOf[js.Any], ResourceDescriptor = ResourceDescriptor.asInstanceOf[js.Any], ResourceReference = ResourceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofapi]
  }
  
  extension [Self <: Typeofapi](x: Self) {
    
    inline def setCustomHttpPattern(value: Instantiable0[CustomHttpPattern] & TypeofCustomHttpPattern): Self = StObject.set(x, "CustomHttpPattern", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: Instantiable0[Http] & TypeofHttp): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
    
    inline def setHttpRule(value: Instantiable0[HttpRule] & TypeofHttpRule): Self = StObject.set(x, "HttpRule", value.asInstanceOf[js.Any])
    
    inline def setResourceDescriptor(value: Instantiable0[ResourceDescriptor] & TypeofResourceDescriptor): Self = StObject.set(x, "ResourceDescriptor", value.asInstanceOf[js.Any])
    
    inline def setResourceReference(value: Instantiable0[ResourceReference] & TypeofResourceReference): Self = StObject.set(x, "ResourceReference", value.asInstanceOf[js.Any])
  }
}
