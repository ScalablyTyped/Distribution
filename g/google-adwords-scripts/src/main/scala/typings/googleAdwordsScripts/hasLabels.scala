package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasLabels extends StObject {
  
  def applyLabel(name: String): Unit
  
  def labels(): AdWordsSelector[Label]
  
  def removeLabel(name: String): Unit
}
object hasLabels {
  
  inline def apply(applyLabel: String => Unit, labels: () => AdWordsSelector[Label], removeLabel: String => Unit): hasLabels = {
    val __obj = js.Dynamic.literal(applyLabel = js.Any.fromFunction1(applyLabel), labels = js.Any.fromFunction0(labels), removeLabel = js.Any.fromFunction1(removeLabel))
    __obj.asInstanceOf[hasLabels]
  }
  
  extension [Self <: hasLabels](x: Self) {
    
    inline def setApplyLabel(value: String => Unit): Self = StObject.set(x, "applyLabel", js.Any.fromFunction1(value))
    
    inline def setLabels(value: () => AdWordsSelector[Label]): Self = StObject.set(x, "labels", js.Any.fromFunction0(value))
    
    inline def setRemoveLabel(value: String => Unit): Self = StObject.set(x, "removeLabel", js.Any.fromFunction1(value))
  }
}
