package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What other data should be reported with the measure
  */
@js.native
trait MeasureSupplementalData extends BackboneElement {
  
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  
  /**
    * Expression describing additional data to be reported
    */
  var criteria: js.UndefOr[String] = js.native
  
  /**
    * Identifier, unique within the measure
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Path to the supplemental data element
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * supplemental-data | risk-adjustment-factor
    */
  var usage: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object MeasureSupplementalData {
  
  @scala.inline
  def apply(): MeasureSupplementalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureSupplementalData]
  }
  
  @scala.inline
  implicit class MeasureSupplementalDataMutableBuilder[Self <: MeasureSupplementalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: String): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setUsage(value: js.Array[CodeableConcept]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    @scala.inline
    def setUsageVarargs(value: CodeableConcept*): Self = StObject.set(x, "usage", js.Array(value :_*))
    
    @scala.inline
    def set_criteria(value: Element): Self = StObject.set(x, "_criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_criteriaUndefined: Self = StObject.set(x, "_criteria", js.undefined)
    
    @scala.inline
    def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
  }
}
