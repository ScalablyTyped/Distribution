package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.reportMod.Report
import typings.tapable.mod.Tap
import typings.tapable.mod.TapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginStateMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPluginState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createForkTsCheckerWebpackPluginState(): ForkTsCheckerWebpackPluginState = ^.asInstanceOf[js.Dynamic].applyDynamic("createForkTsCheckerWebpackPluginState")().asInstanceOf[ForkTsCheckerWebpackPluginState]
  
  trait ForkTsCheckerWebpackPluginState extends StObject {
    
    var dependenciesPromise: js.Promise[js.UndefOr[Dependencies]]
    
    var initialized: Boolean
    
    var issuesPromise: js.Promise[js.UndefOr[js.Array[Issue]]]
    
    var lastDependencies: js.UndefOr[Dependencies] = js.undefined
    
    var reportPromise: js.Promise[js.UndefOr[Report]]
    
    var watching: Boolean
    
    var webpackDevServerDoneTap: js.UndefOr[Tap[TapType, js.Any, js.Any, js.Any, js.Any]] = js.undefined
  }
  object ForkTsCheckerWebpackPluginState {
    
    @scala.inline
    def apply(
      dependenciesPromise: js.Promise[js.UndefOr[Dependencies]],
      initialized: Boolean,
      issuesPromise: js.Promise[js.UndefOr[js.Array[Issue]]],
      reportPromise: js.Promise[js.UndefOr[Report]],
      watching: Boolean
    ): ForkTsCheckerWebpackPluginState = {
      val __obj = js.Dynamic.literal(dependenciesPromise = dependenciesPromise.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], issuesPromise = issuesPromise.asInstanceOf[js.Any], reportPromise = reportPromise.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForkTsCheckerWebpackPluginState]
    }
    
    @scala.inline
    implicit class ForkTsCheckerWebpackPluginStateMutableBuilder[Self <: ForkTsCheckerWebpackPluginState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependenciesPromise(value: js.Promise[js.UndefOr[Dependencies]]): Self = StObject.set(x, "dependenciesPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuesPromise(value: js.Promise[js.UndefOr[js.Array[Issue]]]): Self = StObject.set(x, "issuesPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDependencies(value: Dependencies): Self = StObject.set(x, "lastDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDependenciesUndefined: Self = StObject.set(x, "lastDependencies", js.undefined)
      
      @scala.inline
      def setReportPromise(value: js.Promise[js.UndefOr[Report]]): Self = StObject.set(x, "reportPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatching(value: Boolean): Self = StObject.set(x, "watching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackDevServerDoneTap(value: Tap[TapType, js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "webpackDevServerDoneTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackDevServerDoneTapUndefined: Self = StObject.set(x, "webpackDevServerDoneTap", js.undefined)
    }
  }
}
