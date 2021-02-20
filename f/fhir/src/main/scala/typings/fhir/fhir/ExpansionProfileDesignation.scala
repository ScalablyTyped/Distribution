package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When the expansion profile imposes designation contraints
  */
@js.native
trait ExpansionProfileDesignation extends BackboneElement {
  
  /**
    * Designations to be excluded
    */
  var exclude: js.UndefOr[ExpansionProfileDesignationExclude] = js.native
  
  /**
    * Designations to be included
    */
  var include: js.UndefOr[ExpansionProfileDesignationInclude] = js.native
}
object ExpansionProfileDesignation {
  
  @scala.inline
  def apply(): ExpansionProfileDesignation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignation]
  }
  
  @scala.inline
  implicit class ExpansionProfileDesignationMutableBuilder[Self <: ExpansionProfileDesignation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: ExpansionProfileDesignationExclude): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setInclude(value: ExpansionProfileDesignationInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}
