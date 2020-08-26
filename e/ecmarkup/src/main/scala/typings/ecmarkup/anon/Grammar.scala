package typings.ecmarkup.anon

import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grammar extends js.Object {
  var grammar: typings.std.Element = js.native
  var lists: js.Array[HTMLUListElement] = js.native
}

object Grammar {
  @scala.inline
  def apply(grammar: typings.std.Element, lists: js.Array[HTMLUListElement]): Grammar = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar]
  }
  @scala.inline
  implicit class GrammarOps[Self <: Grammar] (val x: Self) extends AnyVal {
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
    def setGrammar(value: typings.std.Element): Self = this.set("grammar", value.asInstanceOf[js.Any])
    @scala.inline
    def setListsVarargs(value: HTMLUListElement*): Self = this.set("lists", js.Array(value :_*))
    @scala.inline
    def setLists(value: js.Array[HTMLUListElement]): Self = this.set("lists", value.asInstanceOf[js.Any])
  }
  
}

