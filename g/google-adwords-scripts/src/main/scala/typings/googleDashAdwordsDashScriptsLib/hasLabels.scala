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
    applyLabel: js.Function1[java.lang.String, scala.Unit],
    labels: js.Function0[AdWordsSelector[Label]],
    removeLabel: js.Function1[java.lang.String, scala.Unit]
  ): hasLabels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyLabel")(applyLabel)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("removeLabel")(removeLabel)
    __obj.asInstanceOf[hasLabels]
  }
}

