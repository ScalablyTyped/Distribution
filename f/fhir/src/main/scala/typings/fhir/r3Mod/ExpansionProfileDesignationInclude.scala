package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionProfileDesignationInclude
  extends StObject
     with BackboneElement {
  
  /**
    * At least one of designation.language or designation.use must be provided for each include.designation element.
    */
  var designation: js.UndefOr[js.Array[ExpansionProfileDesignationIncludeDesignation]] = js.undefined
}
object ExpansionProfileDesignationInclude {
  
  inline def apply(): ExpansionProfileDesignationInclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationInclude]
  }
  
  extension [Self <: ExpansionProfileDesignationInclude](x: Self) {
    
    inline def setDesignation(value: js.Array[ExpansionProfileDesignationIncludeDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setDesignationVarargs(value: ExpansionProfileDesignationIncludeDesignation*): Self = StObject.set(x, "designation", js.Array(value*))
  }
}
