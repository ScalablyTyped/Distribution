package typings.firebasePerformanceCompat

import typings.firebasePerformance.publicTypesMod.FirebasePerformance
import typings.firebasePerformance.publicTypesMod.PerformanceSettings
import typings.firebasePerformance.publicTypesMod.PerformanceTrace
import typings.firebasePerformanceCompat.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object firebasePerformanceMod {
  
  @JSImport("@firebase/performance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPerformance(app: js.UndefOr[FirebaseApp]): FirebasePerformance = ^.asInstanceOf[js.Dynamic].applyDynamic("getPerformance")(app.asInstanceOf[js.Any]).asInstanceOf[FirebasePerformance]
  
  inline def initializePerformance(app: FirebaseApp, settings: js.UndefOr[PerformanceSettings]): FirebasePerformance = (^.asInstanceOf[js.Dynamic].applyDynamic("initializePerformance")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[FirebasePerformance]
  
  inline def trace(performance: typings.firebasePerformanceTypes.mod.FirebasePerformance, name: String): PerformanceTrace = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(performance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[PerformanceTrace]
}
