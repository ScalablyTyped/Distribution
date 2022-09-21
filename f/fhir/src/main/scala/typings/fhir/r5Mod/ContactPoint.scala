package typings.fhir.r5Mod

import typings.fhir.fhirStrings.email
import typings.fhir.fhirStrings.fax
import typings.fhir.fhirStrings.home
import typings.fhir.fhirStrings.mobile
import typings.fhir.fhirStrings.old
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.pager
import typings.fhir.fhirStrings.phone
import typings.fhir.fhirStrings.sms
import typings.fhir.fhirStrings.temp
import typings.fhir.fhirStrings.url
import typings.fhir.fhirStrings.work
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactPoint
  extends StObject
     with Element {
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Time period when the contact point was/is in use.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Note that rank does not necessarily follow the order in which the contacts are represented in the instance.
    */
  var rank: js.UndefOr[Double] = js.undefined
  
  /**
    * Telecommunications form for contact point - what communications system is required to make use of the contact.
    */
  var system: js.UndefOr[phone | fax | email | pager | url | sms | other] = js.undefined
  
  /**
    * Applications can assume that a contact is current unless it explicitly says that it is temporary or old.
    */
  var use: js.UndefOr[home | work | temp | old | mobile] = js.undefined
  
  /**
    * Additional text data such as phone extension numbers, or notes about use of the contact are sometimes included in the value.
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
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setSystem(value: phone | fax | email | pager | url | sms | other): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setUse(value: home | work | temp | old | mobile): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
