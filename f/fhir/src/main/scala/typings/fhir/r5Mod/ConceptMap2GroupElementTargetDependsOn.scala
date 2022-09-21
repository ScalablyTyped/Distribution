package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMap2GroupElementTargetDependsOn
  extends StObject
     with BackboneElement {
  
  var _property: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueCode: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueId: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueUri: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to an element that holds a coded value that corresponds to a code system property. The idea is that the information model carries an element somewhere that is labeled to correspond with a code system property.
    */
  var property: String
  
  /**
    * Property value that the map depends on.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Property value that the map depends on.
    */
  var valueCode: js.UndefOr[String] = js.undefined
  
  /**
    * Property value that the map depends on.
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Property value that the map depends on.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Property value that the map depends on.
    */
  var valueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * Property value that the map depends on.
    */
  var valueId: js.UndefOr[String] = js.undefined
  
  /**
    * Property value that the map depends on.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Property value that the map depends on.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * Property value that the map depends on.
    */
  var valueUri: js.UndefOr[String] = js.undefined
}
object ConceptMap2GroupElementTargetDependsOn {
  
  inline def apply(property: String): ConceptMap2GroupElementTargetDependsOn = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMap2GroupElementTargetDependsOn]
  }
  
  extension [Self <: ConceptMap2GroupElementTargetDependsOn](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCode(value: String): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    inline def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueDecimal(value: Double): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    inline def setValueId(value: String): Self = StObject.set(x, "valueId", value.asInstanceOf[js.Any])
    
    inline def setValueIdUndefined: Self = StObject.set(x, "valueId", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueUri(value: String): Self = StObject.set(x, "valueUri", value.asInstanceOf[js.Any])
    
    inline def setValueUriUndefined: Self = StObject.set(x, "valueUri", js.undefined)
    
    inline def set_property(value: Element): Self = StObject.set(x, "_property", value.asInstanceOf[js.Any])
    
    inline def set_propertyUndefined: Self = StObject.set(x, "_property", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueCode(value: Element): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    inline def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueId(value: Element): Self = StObject.set(x, "_valueId", value.asInstanceOf[js.Any])
    
    inline def set_valueIdUndefined: Self = StObject.set(x, "_valueId", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueUri(value: Element): Self = StObject.set(x, "_valueUri", value.asInstanceOf[js.Any])
    
    inline def set_valueUriUndefined: Self = StObject.set(x, "_valueUri", js.undefined)
  }
}
