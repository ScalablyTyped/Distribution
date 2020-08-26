package typings.eslint.anon

import typings.eslint.mod.AST.Token
import typings.eslint.mod.SourceCode.FilterPredicate
import typings.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  var filter: js.UndefOr[FilterPredicate] = js.native
  var includeComments: js.UndefOr[Boolean] = js.native
  var skip: js.UndefOr[Double] = js.native
}

object Filter {
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setFilter(value: /* tokenOrComment */ Token | Comment => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIncludeComments(value: Boolean): Self = this.set("includeComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeComments: Self = this.set("includeComments", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
  
}

