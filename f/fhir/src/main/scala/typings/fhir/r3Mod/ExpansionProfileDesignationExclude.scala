package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionProfileDesignationExclude
  extends StObject
     with BackboneElement {
  
  /**
    * At least one of designation.language or designation.use must be provided for each exclude.designation element.
    */
  var designation: js.UndefOr[js.Array[ExpansionProfileDesignationExcludeDesignation]] = js.undefined
}
object ExpansionProfileDesignationExclude {
  
  inline def apply(): ExpansionProfileDesignationExclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationExclude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpansionProfileDesignationExclude] (val x: Self) extends AnyVal {
    
    inline def setDesignation(value: js.Array[ExpansionProfileDesignationExcludeDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setDesignationVarargs(value: ExpansionProfileDesignationExcludeDesignation*): Self = StObject.set(x, "designation", js.Array(value*))
  }
}
