package typings.firebasePerformance

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import typings.firebasePerformance.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPublicTypesMod {
  
  trait FirebasePerformance extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `FirebasePerformance` instance is associated with.
      */
    var app: FirebaseApp
    
    /**
      * Controls the logging of custom traces.
      */
    var dataCollectionEnabled: Boolean
    
    /**
      * Controls the logging of automatic traces and HTTP/S network monitoring.
      */
    var instrumentationEnabled: Boolean
  }
  object FirebasePerformance {
    
    inline def apply(app: FirebaseApp, dataCollectionEnabled: Boolean, instrumentationEnabled: Boolean): FirebasePerformance = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], dataCollectionEnabled = dataCollectionEnabled.asInstanceOf[js.Any], instrumentationEnabled = instrumentationEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebasePerformance]
    }
    
    extension [Self <: FirebasePerformance](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "dataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setInstrumentationEnabled(value: Boolean): Self = StObject.set(x, "instrumentationEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait PerformanceSettings extends StObject {
    
    /** Whether to collect custom events. */
    var dataCollectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to collect out of the box events. */
    var instrumentationEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object PerformanceSettings {
    
    inline def apply(): PerformanceSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerformanceSettings]
    }
    
    extension [Self <: PerformanceSettings](x: Self) {
      
      inline def setDataCollectionEnabled(value: Boolean): Self = StObject.set(x, "dataCollectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setDataCollectionEnabledUndefined: Self = StObject.set(x, "dataCollectionEnabled", js.undefined)
      
      inline def setInstrumentationEnabled(value: Boolean): Self = StObject.set(x, "instrumentationEnabled", value.asInstanceOf[js.Any])
      
      inline def setInstrumentationEnabledUndefined: Self = StObject.set(x, "instrumentationEnabled", js.undefined)
    }
  }
  
  @js.native
  trait PerformanceTrace extends StObject {
    
    /**
      * Retrieves the value which a custom attribute is set to.
      *
      * @param attr - Name of the custom attribute.
      */
    def getAttribute(attr: String): js.UndefOr[String] = js.native
    
    /**
      * Returns a map of all custom attributes of a trace instance.
      */
    def getAttributes(): StringDictionary[String] = js.native
    
    /**
      * Returns the value of the custom metric by that name. If a custom metric with that name does
      * not exist will return zero.
      *
      * @param metricName - Name of the custom metric.
      */
    def getMetric(metricName: String): Double = js.native
    
    /**
      * Adds to the value of a custom metric. If a custom metric with the provided name does not
      * exist, it creates one with that name and the value equal to the given number. The value will be floored down to an
      * integer.
      *
      * @param metricName - The name of the custom metric.
      * @param num - The number to be added to the value of the custom metric. If not provided, it
      * uses a default value of one.
      */
    def incrementMetric(metricName: String): Unit = js.native
    def incrementMetric(metricName: String, num: Double): Unit = js.native
    
    /**
      * Set a custom attribute of a trace to a certain value.
      *
      * @param attr - Name of the custom attribute.
      * @param value - Value of the custom attribute.
      */
    def putAttribute(attr: String, value: String): Unit = js.native
    
    /**
      * Sets the value of the specified custom metric to the given number regardless of whether
      * a metric with that name already exists on the trace instance or not. The value will be floored down to an
      * integer.
      *
      * @param metricName - Name of the custom metric.
      * @param num - Value to of the custom metric.
      */
    def putMetric(metricName: String, num: Double): Unit = js.native
    
    /**
      * Records a trace from given parameters. This provides a direct way to use trace without a need to
      * start/stop. This is useful for use cases in which the trace cannot directly be used
      * (e.g. if the duration was captured before the Performance SDK was loaded).
      *
      * @param startTime - trace start time since epoch in millisec.
      * @param duration - The duraction of the trace in millisec.
      * @param options - An object which can optionally hold maps of custom metrics and
      * custom attributes.
      */
    def record(startTime: Double, duration: Double): Unit = js.native
    def record(startTime: Double, duration: Double, options: Attributes): Unit = js.native
    
    /**
      * Removes the specified custom attribute from a trace instance.
      *
      * @param attr - Name of the custom attribute.
      */
    def removeAttribute(attr: String): Unit = js.native
    
    /**
      * Starts the timing for the trace instance.
      */
    def start(): Unit = js.native
    
    /**
      * Stops the timing of the trace instance and logs the data of the instance.
      */
    def stop(): Unit = js.native
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var performance: FirebasePerformance
    }
    object NameServiceMapping {
      
      inline def apply(performance: FirebasePerformance): NameServiceMapping = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setPerformance(value: FirebasePerformance): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      }
    }
  }
}
