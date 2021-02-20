package typings.firebasePerformance

import typings.firebasePerformance.anon.OnFirstInputDelay
import typings.firebasePerformance.anon.TypeofPerformanceObserver
import typings.firebasePerformance.apiServiceMod.global.Window
import typings.std.Document
import typings.std.Navigator
import typings.std.PerformanceEntry
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/api_service", "Api")
  @js.native
  class Api () extends StObject {
    def this(window: Window) = this()
    
    /** PreformanceObserver constructor function. */
    val PerformanceObserver: js.Any = js.native
    
    val document: Document = js.native
    
    def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
    
    def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
    
    def getTimeOrigin(): Double = js.native
    
    def getUrl(): String = js.native
    
    val localStorage: js.UndefOr[Storage] = js.native
    
    def mark(name: String): Unit = js.native
    
    def measure(measureName: String, mark1: String, mark2: String): Unit = js.native
    
    val navigator: Navigator = js.native
    
    val onFirstInputDelay: js.UndefOr[js.Function] = js.native
    
    val performance: js.Any = js.native
    
    def requiredApisAvailable(): Boolean = js.native
    
    def setupObserver(entryType: EntryType, callback: js.Function1[/* entry */ PerformanceEntry, Unit]): Unit = js.native
    
    val window: js.UndefOr[Window] = js.native
    
    val windowLocation: js.Any = js.native
  }
  /* static members */
  object Api {
    
    @JSImport("@firebase/performance/dist/src/services/api_service", "Api.getInstance")
    @js.native
    def getInstance(): Api = js.native
  }
  
  @JSImport("@firebase/performance/dist/src/services/api_service", "setupApi")
  @js.native
  def setupApi(window: Window): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebasePerformance.firebasePerformanceStrings.mark
    - typings.firebasePerformance.firebasePerformanceStrings.measure
    - typings.firebasePerformance.firebasePerformanceStrings.paint
    - typings.firebasePerformance.firebasePerformanceStrings.resource
    - typings.firebasePerformance.firebasePerformanceStrings.frame
    - typings.firebasePerformance.firebasePerformanceStrings.navigation
  */
  trait EntryType extends StObject
  object EntryType {
    
    @scala.inline
    def frame: typings.firebasePerformance.firebasePerformanceStrings.frame = "frame".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.frame]
    
    @scala.inline
    def mark: typings.firebasePerformance.firebasePerformanceStrings.mark = "mark".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.mark]
    
    @scala.inline
    def measure: typings.firebasePerformance.firebasePerformanceStrings.measure = "measure".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.measure]
    
    @scala.inline
    def navigation: typings.firebasePerformance.firebasePerformanceStrings.navigation = "navigation".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.navigation]
    
    @scala.inline
    def paint: typings.firebasePerformance.firebasePerformanceStrings.paint = "paint".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.paint]
    
    @scala.inline
    def resource: typings.firebasePerformance.firebasePerformanceStrings.resource = "resource".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.resource]
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var PerformanceObserver: TypeofPerformanceObserver = js.native
      
      var perfMetrics: js.UndefOr[OnFirstInputDelay] = js.native
    }
    object Window {
      
      @scala.inline
      def apply(PerformanceObserver: TypeofPerformanceObserver): Window = {
        val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPerfMetrics(value: OnFirstInputDelay): Self = StObject.set(x, "perfMetrics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPerfMetricsUndefined: Self = StObject.set(x, "perfMetrics", js.undefined)
        
        @scala.inline
        def setPerformanceObserver(value: TypeofPerformanceObserver): Self = StObject.set(x, "PerformanceObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
