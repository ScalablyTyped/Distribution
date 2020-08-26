package typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeScriptReporterExtension extends js.Object {
  var extendIssues: js.UndefOr[js.Function1[/* issues */ js.Array[Issue], js.Array[Issue]]] = js.native
}

object TypeScriptReporterExtension {
  @scala.inline
  def apply(): TypeScriptReporterExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeScriptReporterExtension]
  }
  @scala.inline
  implicit class TypeScriptReporterExtensionOps[Self <: TypeScriptReporterExtension] (val x: Self) extends AnyVal {
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
    def setExtendIssues(value: /* issues */ js.Array[Issue] => js.Array[Issue]): Self = this.set("extendIssues", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExtendIssues: Self = this.set("extendIssues", js.undefined)
  }
  
}

