package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiologicallyDerivedProductCollection
  extends StObject
     with BackboneElement {
  
  var _collectedDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Time of product collection.
    */
  var collectedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Time of product collection.
    */
  var collectedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Healthcare professional who is performing the collection.
    */
  var collector: js.UndefOr[Reference] = js.undefined
  
  /**
    * The patient or entity, such as a hospital or vendor in the case of a processed/manipulated/manufactured product, providing the product.
    */
  var source: js.UndefOr[Reference] = js.undefined
}
object BiologicallyDerivedProductCollection {
  
  inline def apply(): BiologicallyDerivedProductCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiologicallyDerivedProductCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiologicallyDerivedProductCollection] (val x: Self) extends AnyVal {
    
    inline def setCollectedDateTime(value: String): Self = StObject.set(x, "collectedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCollectedDateTimeUndefined: Self = StObject.set(x, "collectedDateTime", js.undefined)
    
    inline def setCollectedPeriod(value: Period): Self = StObject.set(x, "collectedPeriod", value.asInstanceOf[js.Any])
    
    inline def setCollectedPeriodUndefined: Self = StObject.set(x, "collectedPeriod", js.undefined)
    
    inline def setCollector(value: Reference): Self = StObject.set(x, "collector", value.asInstanceOf[js.Any])
    
    inline def setCollectorUndefined: Self = StObject.set(x, "collector", js.undefined)
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def set_collectedDateTime(value: Element): Self = StObject.set(x, "_collectedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_collectedDateTimeUndefined: Self = StObject.set(x, "_collectedDateTime", js.undefined)
  }
}
