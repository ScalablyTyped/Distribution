package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Designations to be excluded
  */
@js.native
trait ExpansionProfileDesignationExclude extends BackboneElement {
  
  /**
    * The designation to be excluded
    */
  var designation: js.UndefOr[js.Array[ExpansionProfileDesignationExcludeDesignation]] = js.native
}
object ExpansionProfileDesignationExclude {
  
  @scala.inline
  def apply(): ExpansionProfileDesignationExclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationExclude]
  }
  
  @scala.inline
  implicit class ExpansionProfileDesignationExcludeMutableBuilder[Self <: ExpansionProfileDesignationExclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesignation(value: js.Array[ExpansionProfileDesignationExcludeDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    @scala.inline
    def setDesignationVarargs(value: ExpansionProfileDesignationExcludeDesignation*): Self = StObject.set(x, "designation", js.Array(value :_*))
  }
}
