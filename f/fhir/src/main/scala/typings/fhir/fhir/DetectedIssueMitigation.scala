package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Step taken to address
  */
trait DetectedIssueMitigation
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * What mitigation?
    */
  var action: CodeableConcept
  
  /**
    * Who is committing?
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Date committed
    */
  var date: js.UndefOr[dateTime] = js.undefined
}
object DetectedIssueMitigation {
  
  @scala.inline
  def apply(action: CodeableConcept): DetectedIssueMitigation = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedIssueMitigation]
  }
  
  @scala.inline
  implicit class DetectedIssueMitigationMutableBuilder[Self <: DetectedIssueMitigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: CodeableConcept): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
