package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When the expansion profile imposes designation contraints
  */
trait ExpansionProfileDesignation
  extends StObject
     with BackboneElement {
  
  /**
    * Designations to be excluded
    */
  var exclude: js.UndefOr[ExpansionProfileDesignationExclude] = js.undefined
  
  /**
    * Designations to be included
    */
  var include: js.UndefOr[ExpansionProfileDesignationInclude] = js.undefined
}
object ExpansionProfileDesignation {
  
  inline def apply(): ExpansionProfileDesignation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignation]
  }
  
  extension [Self <: ExpansionProfileDesignation](x: Self) {
    
    inline def setExclude(value: ExpansionProfileDesignationExclude): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setInclude(value: ExpansionProfileDesignationInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}
