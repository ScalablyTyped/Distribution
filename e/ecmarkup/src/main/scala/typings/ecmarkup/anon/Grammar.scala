package typings.ecmarkup.anon

import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grammar extends js.Object {
  var grammar: typings.std.Element
  var lists: js.Array[HTMLUListElement]
}

object Grammar {
  @scala.inline
  def apply(grammar: typings.std.Element, lists: js.Array[HTMLUListElement]): Grammar = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar]
  }
}

