package typings.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dom extends DOMSearchable {
  
  def getElementsByAttribute(attribute: String): js.Array[Node] | Null = js.native
}
object Dom {
  
  @scala.inline
  def apply(
    getElementById: String => Node | Null,
    getElementsByAttribute: String => js.Array[Node] | Null,
    getElementsByClassName: String => js.Array[Node] | Null,
    getElementsByName: String => js.Array[Node] | Null,
    getElementsByTagName: String => js.Array[Node] | Null
  ): Dom = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByAttribute = js.Any.fromFunction1(getElementsByAttribute), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
    __obj.asInstanceOf[Dom]
  }
  
  @scala.inline
  implicit class DomOps[Self <: Dom] (val x: Self) extends AnyVal {
    
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
    def setGetElementsByAttribute(value: String => js.Array[Node] | Null): Self = this.set("getElementsByAttribute", js.Any.fromFunction1(value))
  }
}
