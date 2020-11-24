package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ratio of two Quantity values - a numerator and a denominator
  */
@js.native
trait Ratio extends Element {
  
  /**
    * Denominator value
    */
  var denominator: js.UndefOr[Quantity] = js.native
  
  /**
    * Numerator value
    */
  var numerator: js.UndefOr[Quantity] = js.native
}
object Ratio {
  
  @scala.inline
  def apply(): Ratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ratio]
  }
  
  @scala.inline
  implicit class RatioOps[Self <: Ratio] (val x: Self) extends AnyVal {
    
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
    def setDenominator(value: Quantity): Self = this.set("denominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenominator: Self = this.set("denominator", js.undefined)
    
    @scala.inline
    def setNumerator(value: Quantity): Self = this.set("numerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumerator: Self = this.set("numerator", js.undefined)
  }
}
