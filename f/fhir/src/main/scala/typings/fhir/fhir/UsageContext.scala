package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the context of use for a conformance or knowledge resource
  */
@js.native
trait UsageContext extends Element {
  
  /**
    * Type of context being specified
    */
  var code: Coding = js.native
  
  /**
    * Value that defines the context
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Value that defines the context
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Value that defines the context
    */
  var valueRange: js.UndefOr[Range] = js.native
}
object UsageContext {
  
  @scala.inline
  def apply(code: Coding): UsageContext = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageContext]
  }
  
  @scala.inline
  implicit class UsageContextOps[Self <: UsageContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Coding): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = this.set("valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueCodeableConcept: Self = this.set("valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = this.set("valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueQuantity: Self = this.set("valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
  }
}
