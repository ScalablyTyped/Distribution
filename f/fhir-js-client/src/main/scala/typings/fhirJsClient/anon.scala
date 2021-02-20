package typings.fhirJsClient

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Any extends StObject {
    
    /**
      * Returns the valueQuantity value as number. (As it is)
      */
    def any(valueQuantity: js.Any): Double = js.native
    
    /**
      * Converts the valueQuantity passed into cm based on the code
      */
    def cm(valueQuantity: js.Any): Double = js.native
    
    /**
      * Converts the valueQuantity passed into kg based on the code
      */
    def kg(valueQuantity: js.Any): Double = js.native
  }
  object Any {
    
    @scala.inline
    def apply(any: js.Any => Double, cm: js.Any => Double, kg: js.Any => Double): Any = {
      val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), cm = js.Any.fromFunction1(cm), kg = js.Any.fromFunction1(kg))
      __obj.asInstanceOf[Any]
    }
    
    @scala.inline
    implicit class AnyMutableBuilder[Self <: Any] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAny(value: js.Any => Double): Self = StObject.set(x, "any", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCm(value: js.Any => Double): Self = StObject.set(x, "cm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKg(value: js.Any => Double): Self = StObject.set(x, "kg", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DictpropName
    extends /**
    * Making this interface extendable since this is not a complete type definition of FHIR Resource
    */
  /* propName */ StringDictionary[js.Any] {
    
    /**
      * Type: dateTime    Only include resource versions that were current at some point during the time period specified
      * in the date time value (may be more than one)
      */
    var _at: js.UndefOr[String] = js.native
    
    /**
      * To specify alternative response formats by their MIME-types.
      * This parameter allows a client to override the accept header value when it is unable to set it correctly due to internal limitations
      * (e.g. XSLT usage). For the _format parameter, the values xml, text/xml, application/xml, and application/fhir+xml SHALL be interpreted
      * to mean the XML format, the codes json, application/json and application/fhir+json SHALL be interpreted
      * to mean the JSON format, and the codes ttl and text/turtle SHALL be interpreted to mean the Turtle RDF format.
      * In addition, the values html and text/html are allowed.
      */
    var _format: js.UndefOr[String] = js.native
  }
  object DictpropName {
    
    @scala.inline
    def apply(): DictpropName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictpropName]
    }
    
    @scala.inline
    implicit class DictpropNameMutableBuilder[Self <: DictpropName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_at(value: String): Self = StObject.set(x, "_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_atUndefined: Self = StObject.set(x, "_at", js.undefined)
      
      @scala.inline
      def set_format(value: String): Self = StObject.set(x, "_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_formatUndefined: Self = StObject.set(x, "_format", js.undefined)
    }
  }
}
