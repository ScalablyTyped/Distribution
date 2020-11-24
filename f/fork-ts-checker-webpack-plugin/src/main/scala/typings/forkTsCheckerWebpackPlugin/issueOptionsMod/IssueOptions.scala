package typings.forkTsCheckerWebpackPlugin.issueOptionsMod

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.forkTsCheckerWebpackPlugin.issueMatchMod.IssueMatch
import typings.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssueOptions extends js.Object {
  
  var exclude: js.UndefOr[IssuePredicateOption] = js.native
  
  var include: js.UndefOr[IssuePredicateOption] = js.native
}
object IssueOptions {
  
  @scala.inline
  def apply(): IssueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueOptions]
  }
  
  @scala.inline
  implicit class IssueOptionsOps[Self <: IssueOptions] (val x: Self) extends AnyVal {
    
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
    def setExcludeVarargs(value: (IssuePredicate | IssueMatch)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFunction1(value: /* issue */ Issue => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: IssuePredicateOption): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (IssuePredicate | IssueMatch)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setIncludeFunction1(value: /* issue */ Issue => Boolean): Self = this.set("include", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInclude(value: IssuePredicateOption): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
}
