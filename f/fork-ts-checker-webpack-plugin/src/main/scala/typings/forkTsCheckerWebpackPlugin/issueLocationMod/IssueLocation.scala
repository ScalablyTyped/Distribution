package typings.forkTsCheckerWebpackPlugin.issueLocationMod

import typings.forkTsCheckerWebpackPlugin.issuePositionMod.IssuePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssueLocation extends js.Object {
  
  var end: IssuePosition = js.native
  
  var start: IssuePosition = js.native
}
object IssueLocation {
  
  @scala.inline
  def apply(end: IssuePosition, start: IssuePosition): IssueLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueLocation]
  }
  
  @scala.inline
  implicit class IssueLocationOps[Self <: IssueLocation] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: IssuePosition): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: IssuePosition): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
