package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stratifier criteria for the measure
  */
trait MeasureGroupStratifier
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * How the measure should be stratified
    */
  var criteria: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the stratifier used to coordinate the reported data back to this stratifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Path to the stratifier
    */
  var path: js.UndefOr[String] = js.undefined
}
object MeasureGroupStratifier {
  
  @scala.inline
  def apply(): MeasureGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroupStratifier]
  }
  
  @scala.inline
  implicit class MeasureGroupStratifierMutableBuilder[Self <: MeasureGroupStratifier] (val x: Self) extends AnyVal {
    
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
    def set_criteria(value: Element): Self = StObject.set(x, "_criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_criteriaUndefined: Self = StObject.set(x, "_criteria", js.undefined)
    
    @scala.inline
    def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
  }
}
