package typings.firebasePerformance

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AttributeName extends StObject {
    
    var attributeName: String = js.native
  }
  object AttributeName {
    
    @scala.inline
    def apply(attributeName: String): AttributeName = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeName]
    }
    
    @scala.inline
    implicit class AttributeNameMutableBuilder[Self <: AttributeName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AttributeValue extends StObject {
    
    var attributeValue: String = js.native
  }
  object AttributeValue {
    
    @scala.inline
    def apply(attributeValue: String): AttributeValue = {
      val __obj = js.Dynamic.literal(attributeValue = attributeValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeValue]
    }
    
    @scala.inline
    implicit class AttributeValueMutableBuilder[Self <: AttributeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeValue(value: String): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.native
    
    var metrics: js.UndefOr[StringDictionary[Double]] = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setMetrics(value: StringDictionary[Double]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    }
  }
  
  @js.native
  trait CustomMetricName extends StObject {
    
    var customMetricName: String = js.native
  }
  object CustomMetricName {
    
    @scala.inline
    def apply(customMetricName: String): CustomMetricName = {
      val __obj = js.Dynamic.literal(customMetricName = customMetricName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMetricName]
    }
    
    @scala.inline
    implicit class CustomMetricNameMutableBuilder[Self <: CustomMetricName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomMetricName(value: String): Self = StObject.set(x, "customMetricName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnFirstInputDelay extends StObject {
    
    var onFirstInputDelay: js.Function = js.native
  }
  object OnFirstInputDelay {
    
    @scala.inline
    def apply(onFirstInputDelay: js.Function): OnFirstInputDelay = {
      val __obj = js.Dynamic.literal(onFirstInputDelay = onFirstInputDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnFirstInputDelay]
    }
    
    @scala.inline
    implicit class OnFirstInputDelayMutableBuilder[Self <: OnFirstInputDelay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFirstInputDelay(value: js.Function): Self = StObject.set(x, "onFirstInputDelay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TraceName extends StObject {
    
    var traceName: String = js.native
  }
  object TraceName {
    
    @scala.inline
    def apply(traceName: String): TraceName = {
      val __obj = js.Dynamic.literal(traceName = traceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceName]
    }
    
    @scala.inline
    implicit class TraceNameMutableBuilder[Self <: TraceName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTraceName(value: String): Self = StObject.set(x, "traceName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofPerformanceObserver extends StObject {
    
    val supportedEntryTypes: js.Array[String] = js.native
  }
  object TypeofPerformanceObserver {
    
    @scala.inline
    def apply(supportedEntryTypes: js.Array[String]): TypeofPerformanceObserver = {
      val __obj = js.Dynamic.literal(supportedEntryTypes = supportedEntryTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofPerformanceObserver]
    }
    
    @scala.inline
    implicit class TypeofPerformanceObserverMutableBuilder[Self <: TypeofPerformanceObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSupportedEntryTypes(value: js.Array[String]): Self = StObject.set(x, "supportedEntryTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedEntryTypesVarargs(value: String*): Self = StObject.set(x, "supportedEntryTypes", js.Array(value :_*))
    }
  }
}
