package typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod

import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.reportMod.Report
import typings.tapable.mod.Tap
import typings.tapable.mod.TapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForkTsCheckerWebpackPluginState extends js.Object {
  
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
  implicit class ForkTsCheckerWebpackPluginStateOps[Self <: ForkTsCheckerWebpackPluginState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDependenciesPromise(value: js.Promise[js.UndefOr[Dependencies]]): Self = this.set("dependenciesPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialized(value: Boolean): Self = this.set("initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesPromise(value: js.Promise[js.UndefOr[js.Array[Issue]]]): Self = this.set("issuesPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportPromise(value: js.Promise[js.UndefOr[Report]]): Self = this.set("reportPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatching(value: Boolean): Self = this.set("watching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDependencies(value: Dependencies): Self = this.set("lastDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDependencies: Self = this.set("lastDependencies", js.undefined)
    
    @scala.inline
    def setWebpackDevServerDoneTap(value: Tap[TapType, _, _, _, _]): Self = this.set("webpackDevServerDoneTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebpackDevServerDoneTap: Self = this.set("webpackDevServerDoneTap", js.undefined)
  }
}
