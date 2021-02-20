package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of past encounter classes
  */
@js.native
trait EncounterClassHistory extends BackboneElement {
  
  /**
    * inpatient | outpatient | ambulatory | emergency +
    */
  var `class`: Coding = js.native
  
  /**
    * The time that the episode was in the specified class
    */
  var period: Period = js.native
}
object EncounterClassHistory {
  
  @scala.inline
  def apply(`class`: Coding, period: Period): EncounterClassHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterClassHistory]
  }
  
  @scala.inline
  implicit class EncounterClassHistoryMutableBuilder[Self <: EncounterClassHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: Coding): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
  }
}
