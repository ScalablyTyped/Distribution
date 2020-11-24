package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Taggable extends js.Object {
  
  def addLabels(labels: Labels): Boolean = js.native
  
  def setLabel(name: String, value: LabelValue): Boolean = js.native
}
object Taggable {
  
  @scala.inline
  def apply(addLabels: Labels => Boolean, setLabel: (String, LabelValue) => Boolean): Taggable = {
    val __obj = js.Dynamic.literal(addLabels = js.Any.fromFunction1(addLabels), setLabel = js.Any.fromFunction2(setLabel))
    __obj.asInstanceOf[Taggable]
  }
  
  @scala.inline
  implicit class TaggableOps[Self <: Taggable] (val x: Self) extends AnyVal {
    
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
    def setAddLabels(value: Labels => Boolean): Self = this.set("addLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabel(value: (String, LabelValue) => Boolean): Self = this.set("setLabel", js.Any.fromFunction2(value))
  }
}
