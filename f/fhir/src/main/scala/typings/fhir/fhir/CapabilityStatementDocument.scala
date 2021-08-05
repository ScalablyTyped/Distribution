package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Document definition
  */
trait CapabilityStatementDocument
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  
  /**
    * Description of document support
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * producer | consumer
    */
  var mode: code
  
  /**
    * Constraint on a resource used in the document
    */
  var profile: Reference
}
object CapabilityStatementDocument {
  
  inline def apply(mode: code, profile: Reference): CapabilityStatementDocument = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementDocument]
  }
  
  extension [Self <: CapabilityStatementDocument](x: Self) {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setMode(value: code): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
  }
}
