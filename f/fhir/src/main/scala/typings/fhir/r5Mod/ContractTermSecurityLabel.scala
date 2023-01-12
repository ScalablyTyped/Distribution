package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermSecurityLabel
  extends StObject
     with BackboneElement {
  
  /**
    * Security label privacy tag that species the applicable privacy and security policies governing this term and/or term elements.
    */
  var category: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Security label privacy tag that species the level of confidentiality protection required for this term and/or term elements.
    */
  var classification: Coding
  
  /**
    * Security label privacy tag that species the manner in which term and/or term elements are to be protected.
    */
  var control: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Number used to link this term or term element to the applicable Security Label.
    */
  var number: js.UndefOr[js.Array[Double]] = js.undefined
}
object ContractTermSecurityLabel {
  
  inline def apply(classification: Coding): ContractTermSecurityLabel = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTermSecurityLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractTermSecurityLabel] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: js.Array[Coding]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: Coding*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setClassification(value: Coding): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setControl(value: js.Array[Coding]): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setControlVarargs(value: Coding*): Self = StObject.set(x, "control", js.Array(value*))
    
    inline def setNumber(value: js.Array[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setNumberVarargs(value: Double*): Self = StObject.set(x, "number", js.Array(value*))
  }
}
