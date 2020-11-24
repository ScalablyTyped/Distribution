package typings.forkTsCheckerWebpackPlugin.reporterReporterMod

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.reportMod.Report
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reporter extends js.Object {
  
  def getReport(change: FilesChange): js.Promise[Report] = js.native
}
object Reporter {
  
  @scala.inline
  def apply(getReport: FilesChange => js.Promise[Report]): Reporter = {
    val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction1(getReport))
    __obj.asInstanceOf[Reporter]
  }
  
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    
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
    def setGetReport(value: FilesChange => js.Promise[Report]): Self = this.set("getReport", js.Any.fromFunction1(value))
  }
}
