package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterClassHistory
  extends StObject
     with BackboneElement {
  
  /**
    * inpatient | outpatient | ambulatory | emergency +.
    */
  var `class`: Coding
  
  /**
    * The time that the episode was in the specified class.
    */
  var period: Period
}
object EncounterClassHistory {
  
  inline def apply(`class`: Coding, period: Period): EncounterClassHistory = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncounterClassHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterClassHistory] (val x: Self) extends AnyVal {
    
    inline def setClass(value: Coding): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
  }
}
