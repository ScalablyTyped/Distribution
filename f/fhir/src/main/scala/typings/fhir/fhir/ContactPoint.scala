package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a Technology mediated contact point (phone, fax, email, etc.)
  */
trait ContactPoint
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Time period when the contact point was/is in use
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Specify preferred order of use (1 = highest)
    */
  var rank: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * phone | fax | email | pager | url | sms | other
    */
  var system: js.UndefOr[code] = js.undefined
  
  /**
    * home | work | temp | old | mobile - purpose of this contact point
    */
  var use: js.UndefOr[code] = js.undefined
  
  /**
    * The actual contact point details
    */
  var value: js.UndefOr[String] = js.undefined
}
object ContactPoint {
  
  inline def apply(): ContactPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactPoint]
  }
  
  extension [Self <: ContactPoint](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRank(value: positiveInt): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setSystem(value: code): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setUse(value: code): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_rank(value: Element): Self = StObject.set(x, "_rank", value.asInstanceOf[js.Any])
    
    inline def set_rankUndefined: Self = StObject.set(x, "_rank", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
