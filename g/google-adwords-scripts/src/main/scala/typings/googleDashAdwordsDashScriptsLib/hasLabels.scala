package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasLabels extends js.Object {
  def applyLabel(name: java.lang.String): scala.Unit
  def labels(): AdWordsSelector[Label]
  def removeLabel(name: java.lang.String): scala.Unit
}

object hasLabels {
  @scala.inline
  def apply(
    applyLabel: java.lang.String => scala.Unit,
    labels: () => AdWordsSelector[Label],
    removeLabel: java.lang.String => scala.Unit
  ): hasLabels = {
    val __obj = js.Dynamic.literal(applyLabel = js.Any.fromFunction1(applyLabel), labels = js.Any.fromFunction0(labels), removeLabel = js.Any.fromFunction1(removeLabel))
  
    __obj.asInstanceOf[hasLabels]
  }
}

