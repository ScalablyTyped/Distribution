package typings.fhir.r5Mod

import typings.fhir.fhirStrings.consumer
import typings.fhir.fhirStrings.producer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementDocument
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[Element] = js.undefined
  
  /**
    * A description of how the application supports or uses the specified document profile.  For example, when documents are created, what action is taken with consumed documents, etc.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Mode of this document declaration - whether an application is a producer or consumer.
    */
  var mode: producer | consumer
  
  /**
    * The profile is actually on the Bundle.
    */
  var profile: String
}
object CapabilityStatementDocument {
  
  inline def apply(mode: producer | consumer, profile: String): CapabilityStatementDocument = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementDocument]
  }
  
  extension [Self <: CapabilityStatementDocument](x: Self) {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setMode(value: producer | consumer): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    inline def set_profile(value: Element): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
  }
}
