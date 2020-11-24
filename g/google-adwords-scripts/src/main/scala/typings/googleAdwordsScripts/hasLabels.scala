package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasLabels extends js.Object {
  
  def applyLabel(name: String): Unit = js.native
  
  def labels(): AdWordsSelector[Label] = js.native
  
  def removeLabel(name: String): Unit = js.native
}
object hasLabels {
  
  @scala.inline
  def apply(applyLabel: String => Unit, labels: () => AdWordsSelector[Label], removeLabel: String => Unit): hasLabels = {
    val __obj = js.Dynamic.literal(applyLabel = js.Any.fromFunction1(applyLabel), labels = js.Any.fromFunction0(labels), removeLabel = js.Any.fromFunction1(removeLabel))
    __obj.asInstanceOf[hasLabels]
  }
  
  @scala.inline
  implicit class hasLabelsOps[Self <: hasLabels] (val x: Self) extends AnyVal {
    
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
    def setApplyLabel(value: String => Unit): Self = this.set("applyLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabels(value: () => AdWordsSelector[Label]): Self = this.set("labels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveLabel(value: String => Unit): Self = this.set("removeLabel", js.Any.fromFunction1(value))
  }
}
