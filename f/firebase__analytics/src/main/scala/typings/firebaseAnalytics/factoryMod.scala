package typings.firebaseAnalytics

import typings.firebaseAnalytics.anon.DynamicConfigPromisesList
import typings.firebaseAnalytics.publicTypesMod.Analytics
import typings.firebaseAnalytics.publicTypesMod.AnalyticsSettings
import typings.firebaseAnalytics.publicTypesMod.SettingsOptions
import typings.firebaseAnalytics.typesMod.Gtag
import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@firebase/analytics/dist/esm/src/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/analytics/dist/esm/src/factory", "AnalyticsService")
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
  
  inline def getGlobalVars(): DynamicConfigPromisesList = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalVars")().asInstanceOf[DynamicConfigPromisesList]
  
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
  
  @JSImport("@firebase/analytics/dist/esm/src/factory", "wrappedGtagFunction")
  @js.native
  def wrappedGtagFunction: Gtag = js.native
  inline def wrappedGtagFunction_=(x: Gtag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappedGtagFunction")(x.asInstanceOf[js.Any])
}
