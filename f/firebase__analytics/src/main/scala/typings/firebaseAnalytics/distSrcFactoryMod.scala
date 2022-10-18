package typings.firebaseAnalytics

import typings.firebaseAnalytics.anon.InitializationPromisesMap
import typings.firebaseAnalytics.distSrcPublicTypesMod.Analytics
import typings.firebaseAnalytics.distSrcPublicTypesMod.AnalyticsSettings
import typings.firebaseAnalytics.distSrcPublicTypesMod.SettingsOptions
import typings.firebaseAnalytics.distSrcTypesMod.Gtag
import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoryMod {
  
  @JSImport("@firebase/analytics/dist/src/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/analytics/dist/src/factory", "AnalyticsService")
  @js.native
  open class AnalyticsService protected ()
    extends StObject
       with Analytics {
    def this(app: FirebaseApp) = this()
    
    def _delete(): js.Promise[Unit] = js.native
    
    /**
      * The {@link @firebase/app#FirebaseApp} this {@link Analytics} instance is associated with.
      */
    /* CompleteClass */
    var app: FirebaseApp = js.native
  }
  
  inline def factory(
    app: FirebaseApp,
    installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any
  ): AnalyticsService = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(app.asInstanceOf[js.Any], installations.asInstanceOf[js.Any])).asInstanceOf[AnalyticsService]
  inline def factory(
    app: FirebaseApp,
    installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any,
    options: AnalyticsSettings
  ): AnalyticsService = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(app.asInstanceOf[js.Any], installations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnalyticsService]
  
  inline def getGlobalVars(): InitializationPromisesMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalVars")().asInstanceOf[InitializationPromisesMap]
  
  inline def resetGlobalVars(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")().asInstanceOf[Unit]
  inline def resetGlobalVars(newGlobalInitDone: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def resetGlobalVars(newGlobalInitDone: Boolean, newInitializationPromisesMap: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any], newDynamicPromises.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: Unit,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any], newDynamicPromises.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(newGlobalInitDone: Unit, newInitializationPromisesMap: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(
    newGlobalInitDone: Unit,
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any], newDynamicPromises.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(
    newGlobalInitDone: Unit,
    newInitializationPromisesMap: Unit,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any], newDynamicPromises.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def settings(options: SettingsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@firebase/analytics/dist/src/factory", "wrappedGtagFunction")
  @js.native
  def wrappedGtagFunction: Gtag = js.native
  inline def wrappedGtagFunction_=(x: Gtag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappedGtagFunction")(x.asInstanceOf[js.Any])
}
