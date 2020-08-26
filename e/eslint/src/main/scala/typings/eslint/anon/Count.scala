package typings.eslint.anon

import typings.eslint.mod.AST.Token
import typings.eslint.mod.SourceCode.FilterPredicate
import typings.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[FilterPredicate] = js.native
  var includeComments: js.UndefOr[Boolean] = js.native
}

object Count {
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFilter(value: /* tokenOrComment */ Token | Comment => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIncludeComments(value: Boolean): Self = this.set("includeComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeComments: Self = this.set("includeComments", js.undefined)
  }
  
}

