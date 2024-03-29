package typings.firebasePerformance

import typings.firebasePerformance.anon.OnFirstInputDelay
import typings.firebasePerformance.anon.TypeofPerformanceObserver
import typings.firebasePerformance.distSrcServicesApiServiceMod.global.Window
import typings.std.Document
import typings.std.Navigator
import typings.std.PerformanceEntry
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServicesApiServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/api_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/performance/dist/src/services/api_service", "Api")
  @js.native
  open class Api () extends StObject {
    def this(window: Window) = this()
    
    /** PreformanceObserver constructor function. */
    /* private */ val PerformanceObserver: Any = js.native
    
    val document: Document = js.native
    
    def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
    
    def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
    
    def getTimeOrigin(): Double = js.native
    
    def getUrl(): String = js.native
    
    val localStorage: js.UndefOr[Storage] = js.native
    
    def mark(name: String): Unit = js.native
    
    def measure(measureName: String, mark1: String, mark2: String): Unit = js.native
    
    val navigator: Navigator = js.native
    
    val onFirstInputDelay: js.UndefOr[js.Function1[/* fn */ js.Function1[/* fid */ Double, Unit], Unit]] = js.native
    
    /* private */ val performance: Any = js.native
    
    def requiredApisAvailable(): Boolean = js.native
    
    def setupObserver(entryType: EntryType, callback: js.Function1[/* entry */ PerformanceEntry, Unit]): Unit = js.native
    
    val window: js.UndefOr[Window] = js.native
    
    /* private */ val windowLocation: Any = js.native
  }
  /* static members */
  object Api {
    
    @JSImport("@firebase/performance/dist/src/services/api_service", "Api")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Api]
  }
  
  inline def setupApi(window: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupApi")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    inline def frame: typings.firebasePerformance.firebasePerformanceStrings.frame = "frame".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.frame]
    
    inline def mark: typings.firebasePerformance.firebasePerformanceStrings.mark = "mark".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.mark]
    
    inline def measure: typings.firebasePerformance.firebasePerformanceStrings.measure = "measure".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.measure]
    
    inline def navigation: typings.firebasePerformance.firebasePerformanceStrings.navigation = "navigation".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.navigation]
    
    inline def paint: typings.firebasePerformance.firebasePerformanceStrings.paint = "paint".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.paint]
    
    inline def resource: typings.firebasePerformance.firebasePerformanceStrings.resource = "resource".asInstanceOf[typings.firebasePerformance.firebasePerformanceStrings.resource]
  }
  
  object global {
    
    trait Window extends StObject {
      
      var PerformanceObserver: TypeofPerformanceObserver
      
      var perfMetrics: js.UndefOr[OnFirstInputDelay] = js.undefined
    }
    object Window {
      
      inline def apply(PerformanceObserver: TypeofPerformanceObserver): Window = {
        val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setPerfMetrics(value: OnFirstInputDelay): Self = StObject.set(x, "perfMetrics", value.asInstanceOf[js.Any])
        
        inline def setPerfMetricsUndefined: Self = StObject.set(x, "perfMetrics", js.undefined)
        
        inline def setPerformanceObserver(value: TypeofPerformanceObserver): Self = StObject.set(x, "PerformanceObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
