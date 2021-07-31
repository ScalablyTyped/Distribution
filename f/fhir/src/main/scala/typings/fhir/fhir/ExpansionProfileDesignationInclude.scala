package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Designations to be included
  */
trait ExpansionProfileDesignationInclude
  extends StObject
     with BackboneElement {
  
  /**
    * The designation to be included
    */
  var designation: js.UndefOr[js.Array[ExpansionProfileDesignationIncludeDesignation]] = js.undefined
}
object ExpansionProfileDesignationInclude {
  
  @scala.inline
  def apply(): ExpansionProfileDesignationInclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationInclude]
  }
  
  @scala.inline
  implicit class ExpansionProfileDesignationIncludeMutableBuilder[Self <: ExpansionProfileDesignationInclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesignation(value: js.Array[ExpansionProfileDesignationIncludeDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    @scala.inline
    def setDesignationVarargs(value: ExpansionProfileDesignationIncludeDesignation*): Self = StObject.set(x, "designation", js.Array(value :_*))
  }
}
