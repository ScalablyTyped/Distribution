package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Measure results for each group
  */
@js.native
trait MeasureReportGroup extends BackboneElement {
  
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.native
  
  /**
    * What group of the measure
    */
  var identifier: Identifier = js.native
  
  /**
    * What score this group achieved
    */
  var measureScore: js.UndefOr[decimal] = js.native
  
  /**
    * The populations in the group
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupPopulation]] = js.native
  
  /**
    * Stratification results
    */
  var stratifier: js.UndefOr[js.Array[MeasureReportGroupStratifier]] = js.native
}
object MeasureReportGroup {
  
  @scala.inline
  def apply(identifier: Identifier): MeasureReportGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroup]
  }
  
  @scala.inline
  implicit class MeasureReportGroupOps[Self <: MeasureReportGroup] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_measureScore(value: Element): Self = this.set("_measureScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_measureScore: Self = this.set("_measureScore", js.undefined)
    
    @scala.inline
    def setMeasureScore(value: decimal): Self = this.set("measureScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureScore: Self = this.set("measureScore", js.undefined)
    
    @scala.inline
    def setPopulationVarargs(value: MeasureReportGroupPopulation*): Self = this.set("population", js.Array(value :_*))
    
    @scala.inline
    def setPopulation(value: js.Array[MeasureReportGroupPopulation]): Self = this.set("population", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopulation: Self = this.set("population", js.undefined)
    
    @scala.inline
    def setStratifierVarargs(value: MeasureReportGroupStratifier*): Self = this.set("stratifier", js.Array(value :_*))
    
    @scala.inline
    def setStratifier(value: js.Array[MeasureReportGroupStratifier]): Self = this.set("stratifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStratifier: Self = this.set("stratifier", js.undefined)
  }
}
