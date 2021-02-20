package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.reportMod.Report
import typings.tapable.mod.Tap
import typings.tapable.mod.TapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkTsCheckerWebpackPluginStateMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/ForkTsCheckerWebpackPluginState", "createForkTsCheckerWebpackPluginState")
  @js.native
  def createForkTsCheckerWebpackPluginState(): ForkTsCheckerWebpackPluginState = js.native
  
  @js.native
  trait ForkTsCheckerWebpackPluginState extends StObject {
    
    var dependenciesPromise: js.Promise[js.UndefOr[Dependencies]] = js.native
    
    var initialized: Boolean = js.native
    
    var issuesPromise: js.Promise[js.UndefOr[js.Array[Issue]]] = js.native
    
    var lastDependencies: js.UndefOr[Dependencies] = js.native
    
    var reportPromise: js.Promise[js.UndefOr[Report]] = js.native
    
    var watching: Boolean = js.native
    
    var webpackDevServerDoneTap: js.UndefOr[Tap[TapType, _, _, _, _]] = js.native
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
      def setWebpackDevServerDoneTap(value: Tap[TapType, _, _, _, _]): Self = StObject.set(x, "webpackDevServerDoneTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackDevServerDoneTapUndefined: Self = StObject.set(x, "webpackDevServerDoneTap", js.undefined)
    }
  }
}
