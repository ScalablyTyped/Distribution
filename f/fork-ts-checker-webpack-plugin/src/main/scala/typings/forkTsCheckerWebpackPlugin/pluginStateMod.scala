package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.filesMatchMod.FilesMatch
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.nodeAbortController.mod.AbortController
import typings.tapable.mod.FullTap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginStateMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/plugin-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPluginState(): ForkTsCheckerWebpackPluginState = ^.asInstanceOf[js.Dynamic].applyDynamic("createPluginState")().asInstanceOf[ForkTsCheckerWebpackPluginState]
  
  trait ForkTsCheckerWebpackPluginState extends StObject {
    
    var abortController: js.UndefOr[AbortController] = js.undefined
    
    var aggregatedFilesChange: js.UndefOr[FilesChange] = js.undefined
    
    var dependenciesPromise: js.Promise[js.UndefOr[FilesMatch]]
    
    var initialized: Boolean
    
    var issuesPromise: js.Promise[js.UndefOr[js.Array[Issue]]]
    
    var iteration: Double
    
    var lastDependencies: js.UndefOr[FilesMatch] = js.undefined
    
    var watching: Boolean
    
    var webpackDevServerDoneTap: js.UndefOr[FullTap] = js.undefined
  }
  object ForkTsCheckerWebpackPluginState {
    
    inline def apply(
      dependenciesPromise: js.Promise[js.UndefOr[FilesMatch]],
      initialized: Boolean,
      issuesPromise: js.Promise[js.UndefOr[js.Array[Issue]]],
      iteration: Double,
      watching: Boolean
    ): ForkTsCheckerWebpackPluginState = {
      val __obj = js.Dynamic.literal(dependenciesPromise = dependenciesPromise.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], issuesPromise = issuesPromise.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForkTsCheckerWebpackPluginState]
    }
    
    extension [Self <: ForkTsCheckerWebpackPluginState](x: Self) {
      
      inline def setAbortController(value: AbortController): Self = StObject.set(x, "abortController", value.asInstanceOf[js.Any])
      
      inline def setAbortControllerUndefined: Self = StObject.set(x, "abortController", js.undefined)
      
      inline def setAggregatedFilesChange(value: FilesChange): Self = StObject.set(x, "aggregatedFilesChange", value.asInstanceOf[js.Any])
      
      inline def setAggregatedFilesChangeUndefined: Self = StObject.set(x, "aggregatedFilesChange", js.undefined)
      
      inline def setDependenciesPromise(value: js.Promise[js.UndefOr[FilesMatch]]): Self = StObject.set(x, "dependenciesPromise", value.asInstanceOf[js.Any])
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setIssuesPromise(value: js.Promise[js.UndefOr[js.Array[Issue]]]): Self = StObject.set(x, "issuesPromise", value.asInstanceOf[js.Any])
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setLastDependencies(value: FilesMatch): Self = StObject.set(x, "lastDependencies", value.asInstanceOf[js.Any])
      
      inline def setLastDependenciesUndefined: Self = StObject.set(x, "lastDependencies", js.undefined)
      
      inline def setWatching(value: Boolean): Self = StObject.set(x, "watching", value.asInstanceOf[js.Any])
      
      inline def setWebpackDevServerDoneTap(value: FullTap): Self = StObject.set(x, "webpackDevServerDoneTap", value.asInstanceOf[js.Any])
      
      inline def setWebpackDevServerDoneTapUndefined: Self = StObject.set(x, "webpackDevServerDoneTap", js.undefined)
    }
  }
}
