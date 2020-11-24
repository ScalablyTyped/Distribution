package typings.forkTsCheckerWebpackPlugin.reportMod

import typings.forkTsCheckerWebpackPlugin.dependenciesMod.Dependencies
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Report extends js.Object {
  
  def close(): js.Promise[Unit] = js.native
  
  def getDependencies(): js.Promise[Dependencies] = js.native
  
  def getIssues(): js.Promise[js.Array[Issue]] = js.native
}
object Report {
  
  @scala.inline
  def apply(
    close: () => js.Promise[Unit],
    getDependencies: () => js.Promise[Dependencies],
    getIssues: () => js.Promise[js.Array[Issue]]
  ): Report = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getDependencies = js.Any.fromFunction0(getDependencies), getIssues = js.Any.fromFunction0(getIssues))
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDependencies(value: () => js.Promise[Dependencies]): Self = this.set("getDependencies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIssues(value: () => js.Promise[js.Array[Issue]]): Self = this.set("getIssues", js.Any.fromFunction0(value))
  }
}
