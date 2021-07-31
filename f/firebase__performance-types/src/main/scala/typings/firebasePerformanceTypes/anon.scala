package typings.firebasePerformanceTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var metrics: js.UndefOr[StringDictionary[Double]] = js.undefined
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
}
