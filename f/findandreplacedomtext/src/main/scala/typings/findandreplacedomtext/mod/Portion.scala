package typings.findandreplacedomtext.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Portion extends js.Object {
  
  var endIndexInNode: Double = js.native
  
  var index: Double = js.native
  
  var indexInMatch: Double = js.native
  
  var indexInNode: Double = js.native
  
  var isEnd: Boolean = js.native
  
  var node: HTMLElement = js.native
  
  var text: String = js.native
}
object Portion {
  
  @scala.inline
  def apply(
    endIndexInNode: Double,
    index: Double,
    indexInMatch: Double,
    indexInNode: Double,
    isEnd: Boolean,
    node: HTMLElement,
    text: String
  ): Portion = {
    val __obj = js.Dynamic.literal(endIndexInNode = endIndexInNode.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexInMatch = indexInMatch.asInstanceOf[js.Any], indexInNode = indexInNode.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Portion]
  }
  
  @scala.inline
  implicit class PortionOps[Self <: Portion] (val x: Self) extends AnyVal {
    
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
    def setEndIndexInNode(value: Double): Self = this.set("endIndexInNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexInMatch(value: Double): Self = this.set("indexInMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexInNode(value: Double): Self = this.set("indexInNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnd(value: Boolean): Self = this.set("isEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
