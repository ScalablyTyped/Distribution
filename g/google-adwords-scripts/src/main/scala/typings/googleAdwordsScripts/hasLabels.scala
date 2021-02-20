package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasLabels extends StObject {
  
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
  implicit class hasLabelsMutableBuilder[Self <: hasLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyLabel(value: String => Unit): Self = StObject.set(x, "applyLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabels(value: () => AdWordsSelector[Label]): Self = StObject.set(x, "labels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveLabel(value: String => Unit): Self = StObject.set(x, "removeLabel", js.Any.fromFunction1(value))
  }
}
