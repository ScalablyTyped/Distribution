package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryYAxisAlternateGridBand extends js.Object {
  
  /** Options for customizing even grid band.
    */
  var even: js.UndefOr[PrimaryYAxisAlternateGridBandEven] = js.native
  
  /** Options for customizing odd grid band.
    */
  var odd: js.UndefOr[PrimaryYAxisAlternateGridBandOdd] = js.native
}
object PrimaryYAxisAlternateGridBand {
  
  @scala.inline
  def apply(): PrimaryYAxisAlternateGridBand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisAlternateGridBand]
  }
  
  @scala.inline
  implicit class PrimaryYAxisAlternateGridBandOps[Self <: PrimaryYAxisAlternateGridBand] (val x: Self) extends AnyVal {
    
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
    def setEven(value: PrimaryYAxisAlternateGridBandEven): Self = this.set("even", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEven: Self = this.set("even", js.undefined)
    
    @scala.inline
    def setOdd(value: PrimaryYAxisAlternateGridBandOdd): Self = this.set("odd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOdd: Self = this.set("odd", js.undefined)
  }
}
