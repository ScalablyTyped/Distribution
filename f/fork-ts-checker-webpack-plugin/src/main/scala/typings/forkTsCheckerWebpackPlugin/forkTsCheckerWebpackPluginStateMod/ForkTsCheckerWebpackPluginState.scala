package typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod

import typings.forkTsCheckerWebpackPlugin.reportMod.Report
import typings.tapable.mod.Tap
import typings.tapable.mod.TapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForkTsCheckerWebpackPluginState extends js.Object {
  var initialized: Boolean = js.native
  var removedFiles: js.Array[String] = js.native
  var report: js.Promise[js.UndefOr[Report]] = js.native
  var watching: Boolean = js.native
  var webpackDevServerDoneTap: js.UndefOr[Tap[TapType, _, _, _, _]] = js.native
}

object ForkTsCheckerWebpackPluginState {
  @scala.inline
  def apply(
    initialized: Boolean,
    removedFiles: js.Array[String],
    report: js.Promise[js.UndefOr[Report]],
    watching: Boolean
  ): ForkTsCheckerWebpackPluginState = {
    val __obj = js.Dynamic.literal(initialized = initialized.asInstanceOf[js.Any], removedFiles = removedFiles.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
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
    def setInitialized(value: Boolean): Self = this.set("initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedFilesVarargs(value: String*): Self = this.set("removedFiles", js.Array(value :_*))
    @scala.inline
    def setRemovedFiles(value: js.Array[String]): Self = this.set("removedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport(value: js.Promise[js.UndefOr[Report]]): Self = this.set("report", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatching(value: Boolean): Self = this.set("watching", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebpackDevServerDoneTap(value: Tap[TapType, _, _, _, _]): Self = this.set("webpackDevServerDoneTap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebpackDevServerDoneTap: Self = this.set("webpackDevServerDoneTap", js.undefined)
  }
  
}

