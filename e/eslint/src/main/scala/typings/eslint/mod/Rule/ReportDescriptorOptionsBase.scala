package typings.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDescriptorOptionsBase extends js.Object {
  var data: js.UndefOr[StringDictionary[String]] = js.native
  var fix: js.UndefOr[
    Null | (js.Function1[/* fixer */ RuleFixer, Null | Fix | IterableIterator[Fix] | js.Array[Fix]])
  ] = js.native
}

object ReportDescriptorOptionsBase {
  @scala.inline
  def apply(): ReportDescriptorOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDescriptorOptionsBase]
  }
  @scala.inline
  implicit class ReportDescriptorOptionsBaseOps[Self <: ReportDescriptorOptionsBase] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFix(value: /* fixer */ RuleFixer => Null | Fix | IterableIterator[Fix] | js.Array[Fix]): Self = this.set("fix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    @scala.inline
    def setFixNull: Self = this.set("fix", null)
  }
  
}

