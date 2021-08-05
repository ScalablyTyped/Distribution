package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constraints on fulfillment tasks
  */
trait TaskRestriction
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'repetitions'.
    */
  var _repetitions: js.UndefOr[Element] = js.undefined
  
  /**
    * When fulfillment sought
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * For whom is fulfillment sought?
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * How many times to repeat
    */
  var repetitions: js.UndefOr[positiveInt] = js.undefined
}
object TaskRestriction {
  
  inline def apply(): TaskRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRestriction]
  }
  
  extension [Self <: TaskRestriction](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value :_*))
    
    inline def setRepetitions(value: positiveInt): Self = StObject.set(x, "repetitions", value.asInstanceOf[js.Any])
    
    inline def setRepetitionsUndefined: Self = StObject.set(x, "repetitions", js.undefined)
    
    inline def set_repetitions(value: Element): Self = StObject.set(x, "_repetitions", value.asInstanceOf[js.Any])
    
    inline def set_repetitionsUndefined: Self = StObject.set(x, "_repetitions", js.undefined)
  }
}
