package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Designations to be excluded
  */
trait ExpansionProfileDesignationExclude
  extends StObject
     with BackboneElement {
  
  /**
    * The designation to be excluded
    */
  var designation: js.UndefOr[js.Array[ExpansionProfileDesignationExcludeDesignation]] = js.undefined
}
object ExpansionProfileDesignationExclude {
  
  inline def apply(): ExpansionProfileDesignationExclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationExclude]
  }
  
  extension [Self <: ExpansionProfileDesignationExclude](x: Self) {
    
    inline def setDesignation(value: js.Array[ExpansionProfileDesignationExcludeDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setDesignationVarargs(value: ExpansionProfileDesignationExcludeDesignation*): Self = StObject.set(x, "designation", js.Array(value :_*))
  }
}
