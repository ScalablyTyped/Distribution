package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorList extends js.Object {
  /**
    * Selectors in the list.
    */
  var selectors: js.Array[Value] = js.native
  /**
    * Rule selector text.
    */
  var text: String = js.native
}

object SelectorList {
  @scala.inline
  def apply(selectors: js.Array[Value], text: String): SelectorList = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorList]
  }
  @scala.inline
  implicit class SelectorListOps[Self <: SelectorList] (val x: Self) extends AnyVal {
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
    def setSelectorsVarargs(value: Value*): Self = this.set("selectors", js.Array(value :_*))
    @scala.inline
    def setSelectors(value: js.Array[Value]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

