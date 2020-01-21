package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasLabels extends js.Object {
  def applyLabel(name: String): Unit
  def labels(): AdWordsSelector[Label]
  def removeLabel(name: String): Unit
}

object hasLabels {
  @scala.inline
  def apply(applyLabel: String => Unit, labels: () => AdWordsSelector[Label], removeLabel: String => Unit): hasLabels = {
    val __obj = js.Dynamic.literal(applyLabel = js.Any.fromFunction1(applyLabel), labels = js.Any.fromFunction0(labels), removeLabel = js.Any.fromFunction1(removeLabel))
  
    __obj.asInstanceOf[hasLabels]
  }
}

