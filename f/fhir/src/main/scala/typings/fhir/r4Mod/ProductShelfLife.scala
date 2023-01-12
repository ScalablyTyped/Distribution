package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductShelfLife
  extends StObject
     with BackboneElement {
  
  var _periodString: js.UndefOr[Element] = js.undefined
  
  /**
    * The shelf life time period can be specified using a numerical value for the period of time and its unit of time measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var periodDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The shelf life time period can be specified using a numerical value for the period of time and its unit of time measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var periodString: js.UndefOr[String] = js.undefined
  
  /**
    * Special precautions for storage, if any, can be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.
    */
  var specialPrecautionsForStorage: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This describes the shelf life, taking into account various scenarios such as shelf life of the packaged Medicinal Product itself, shelf life after transformation where necessary and shelf life after the first opening of a bottle, etc. The shelf life type shall be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ProductShelfLife {
  
  inline def apply(): ProductShelfLife = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductShelfLife]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductShelfLife] (val x: Self) extends AnyVal {
    
    inline def setPeriodDuration(value: Duration): Self = StObject.set(x, "periodDuration", value.asInstanceOf[js.Any])
    
    inline def setPeriodDurationUndefined: Self = StObject.set(x, "periodDuration", js.undefined)
    
    inline def setPeriodString(value: String): Self = StObject.set(x, "periodString", value.asInstanceOf[js.Any])
    
    inline def setPeriodStringUndefined: Self = StObject.set(x, "periodString", js.undefined)
    
    inline def setSpecialPrecautionsForStorage(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialPrecautionsForStorage", value.asInstanceOf[js.Any])
    
    inline def setSpecialPrecautionsForStorageUndefined: Self = StObject.set(x, "specialPrecautionsForStorage", js.undefined)
    
    inline def setSpecialPrecautionsForStorageVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialPrecautionsForStorage", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_periodString(value: Element): Self = StObject.set(x, "_periodString", value.asInstanceOf[js.Any])
    
    inline def set_periodStringUndefined: Self = StObject.set(x, "_periodString", js.undefined)
  }
}
