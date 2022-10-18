package typings.firebasePerformance

import typings.firebaseApp.mod.FirebaseApp
import typings.firebasePerformance.distSrcPublicTypesMod.FirebasePerformance
import typings.firebasePerformance.distSrcPublicTypesMod.PerformanceSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcControllersPerfMod {
  
  @JSImport("@firebase/performance/dist/src/controllers/perf", "PerformanceController")
  @js.native
  open class PerformanceController protected ()
    extends StObject
       with FirebasePerformance {
    def this(
      app: FirebaseApp,
      installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
    ) = this()
    
    /**
      * This method *must* be called internally as part of creating a
      * PerformanceController instance.
      *
      * Currently it's not possible to pass the settings object through the
      * constructor using Components, so this method exists to be called with the
      * desired settings, to ensure nothing is collected without the user's
      * consent.
      */
    def _init(): Unit = js.native
    def _init(settings: PerformanceSettings): Unit = js.native
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `FirebasePerformance` instance is associated with.
      */
    /* CompleteClass */
    var app: FirebaseApp = js.native
    
    /**
      * Controls the logging of custom traces.
      */
    /* CompleteClass */
    var dataCollectionEnabled: Boolean = js.native
    @JSName("dataCollectionEnabled")
    def dataCollectionEnabled_MPerformanceController: Boolean = js.native
    
    /* private */ var initialized: Any = js.native
    
    val installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any = js.native
    
    /**
      * Controls the logging of automatic traces and HTTP/S network monitoring.
      */
    /* CompleteClass */
    var instrumentationEnabled: Boolean = js.native
    @JSName("instrumentationEnabled")
    def instrumentationEnabled_MPerformanceController: Boolean = js.native
  }
}
