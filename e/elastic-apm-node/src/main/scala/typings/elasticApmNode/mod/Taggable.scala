package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Taggable extends js.Object {
  def addLabels(labels: Labels): Boolean
  def setLabel(name: String, value: LabelValue): Boolean
}

object Taggable {
  @scala.inline
  def apply(addLabels: Labels => Boolean, setLabel: (String, LabelValue) => Boolean): Taggable = {
    val __obj = js.Dynamic.literal(addLabels = js.Any.fromFunction1(addLabels), setLabel = js.Any.fromFunction2(setLabel))
  
    __obj.asInstanceOf[Taggable]
  }
}

