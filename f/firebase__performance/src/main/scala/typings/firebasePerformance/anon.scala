package typings.firebasePerformance

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttributeName extends StObject {
    
    var attributeName: String
  }
  object AttributeName {
    
    inline def apply(attributeName: String): AttributeName = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeName]
    }
    
    extension [Self <: AttributeName](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributeValue extends StObject {
    
    var attributeValue: String
  }
  object AttributeValue {
    
    inline def apply(attributeValue: String): AttributeValue = {
      val __obj = js.Dynamic.literal(attributeValue = attributeValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeValue]
    }
    
    extension [Self <: AttributeValue](x: Self) {
      
      inline def setAttributeValue(value: String): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var metrics: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setMetrics(value: StringDictionary[Double]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    }
  }
  
  trait CustomMetricName extends StObject {
    
    var customMetricName: String
  }
  object CustomMetricName {
    
    inline def apply(customMetricName: String): CustomMetricName = {
      val __obj = js.Dynamic.literal(customMetricName = customMetricName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMetricName]
    }
    
    extension [Self <: CustomMetricName](x: Self) {
      
      inline def setCustomMetricName(value: String): Self = StObject.set(x, "customMetricName", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnFirstInputDelay extends StObject {
    
    def onFirstInputDelay(fn: js.Function1[/* fid */ Double, Unit]): Unit
  }
  object OnFirstInputDelay {
    
    inline def apply(onFirstInputDelay: js.Function1[/* fid */ Double, Unit] => Unit): OnFirstInputDelay = {
      val __obj = js.Dynamic.literal(onFirstInputDelay = js.Any.fromFunction1(onFirstInputDelay))
      __obj.asInstanceOf[OnFirstInputDelay]
    }
    
    extension [Self <: OnFirstInputDelay](x: Self) {
      
      inline def setOnFirstInputDelay(value: js.Function1[/* fid */ Double, Unit] => Unit): Self = StObject.set(x, "onFirstInputDelay", js.Any.fromFunction1(value))
    }
  }
  
  trait TraceName extends StObject {
    
    var traceName: String
  }
  object TraceName {
    
    inline def apply(traceName: String): TraceName = {
      val __obj = js.Dynamic.literal(traceName = traceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceName]
    }
    
    extension [Self <: TraceName](x: Self) {
      
      inline def setTraceName(value: String): Self = StObject.set(x, "traceName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofPerformanceObserver extends StObject {
    
    /* standard dom */
    val supportedEntryTypes: js.Array[String]
  }
  object TypeofPerformanceObserver {
    
    inline def apply(supportedEntryTypes: js.Array[String]): TypeofPerformanceObserver = {
      val __obj = js.Dynamic.literal(supportedEntryTypes = supportedEntryTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofPerformanceObserver]
    }
    
    extension [Self <: TypeofPerformanceObserver](x: Self) {
      
      inline def setSupportedEntryTypes(value: js.Array[String]): Self = StObject.set(x, "supportedEntryTypes", value.asInstanceOf[js.Any])
      
      inline def setSupportedEntryTypesVarargs(value: String*): Self = StObject.set(x, "supportedEntryTypes", js.Array(value*))
    }
  }
}
