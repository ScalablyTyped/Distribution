package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductShelfLife
  extends StObject
     with BackboneElement {
  
  /**
    * Unique identifier for the packaged Medicinal Product.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The shelf life time period can be specified using a numerical value for the period of time and its unit of time measurement The unit of measurement shall be specified in accordance with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used.
    */
  var period: Quantity
  
  /**
    * Special precautions for storage, if any, can be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.
    */
  var specialPrecautionsForStorage: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This describes the shelf life, taking into account various scenarios such as shelf life of the packaged Medicinal Product itself, shelf life after transformation where necessary and shelf life after the first opening of a bottle, etc. The shelf life type shall be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.
    */
  var `type`: CodeableConcept
}
object ProductShelfLife {
  
  inline def apply(period: Quantity, `type`: CodeableConcept): ProductShelfLife = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductShelfLife]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductShelfLife] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPeriod(value: Quantity): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setSpecialPrecautionsForStorage(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialPrecautionsForStorage", value.asInstanceOf[js.Any])
    
    inline def setSpecialPrecautionsForStorageUndefined: Self = StObject.set(x, "specialPrecautionsForStorage", js.undefined)
    
    inline def setSpecialPrecautionsForStorageVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialPrecautionsForStorage", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
