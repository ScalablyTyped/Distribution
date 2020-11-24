package typings.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMSearchable extends js.Object {
  
  def getElementById(id: String): Node | Null = js.native
  
  def getElementsByClassName(className: String): js.Array[Node] | Null = js.native
  
  def getElementsByName(name: String): js.Array[Node] | Null = js.native
  
  def getElementsByTagName(tagName: String): js.Array[Node] | Null = js.native
}
object DOMSearchable {
  
  @scala.inline
  def apply(
    getElementById: String => Node | Null,
    getElementsByClassName: String => js.Array[Node] | Null,
    getElementsByName: String => js.Array[Node] | Null,
    getElementsByTagName: String => js.Array[Node] | Null
  ): DOMSearchable = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
    __obj.asInstanceOf[DOMSearchable]
  }
  
  @scala.inline
  implicit class DOMSearchableOps[Self <: DOMSearchable] (val x: Self) extends AnyVal {
    
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
    def setGetElementById(value: String => Node | Null): Self = this.set("getElementById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByClassName(value: String => js.Array[Node] | Null): Self = this.set("getElementsByClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByName(value: String => js.Array[Node] | Null): Self = this.set("getElementsByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagName(value: String => js.Array[Node] | Null): Self = this.set("getElementsByTagName", js.Any.fromFunction1(value))
  }
}
