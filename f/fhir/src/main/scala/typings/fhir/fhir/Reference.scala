package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference from one resource to another
  */
trait Reference
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.undefined
  
  /**
    * Text alternative for the resource
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Logical reference, when literal reference is not known
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Literal reference, Relative, internal or absolute URL
    */
  var reference: js.UndefOr[String] = js.undefined
}
object Reference {
  
  @scala.inline
  def apply(): Reference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    @scala.inline
    def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
  }
}
