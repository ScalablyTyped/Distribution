package typings.firebase

import typings.firebaseApp.mod.FirebaseApp
import typings.firebasePerformance.distSrcPublicTypesMod.FirebasePerformance
import typings.firebasePerformance.distSrcPublicTypesMod.PerformanceSettings
import typings.firebasePerformance.distSrcPublicTypesMod.PerformanceTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatDistPerformanceMod {
  
  @JSImport("firebase/compat/dist/performance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPerformance(): FirebasePerformance = ^.asInstanceOf[js.Dynamic].applyDynamic("getPerformance")().asInstanceOf[FirebasePerformance]
  inline def getPerformance(app: FirebaseApp): FirebasePerformance = ^.asInstanceOf[js.Dynamic].applyDynamic("getPerformance")(app.asInstanceOf[js.Any]).asInstanceOf[FirebasePerformance]
  
  inline def initializePerformance(app: FirebaseApp): FirebasePerformance = ^.asInstanceOf[js.Dynamic].applyDynamic("initializePerformance")(app.asInstanceOf[js.Any]).asInstanceOf[FirebasePerformance]
  inline def initializePerformance(app: FirebaseApp, settings: PerformanceSettings): FirebasePerformance = (^.asInstanceOf[js.Dynamic].applyDynamic("initializePerformance")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[FirebasePerformance]
  
  inline def trace(performance: FirebasePerformance, name: String): PerformanceTrace = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(performance.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[PerformanceTrace]
}
