package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Taggable extends js.Object {
   // Deprecated
  def addLabels(labels: Labels): Boolean
  def addTags(labels: Labels): Boolean
  def setLabel(name: String, value: LabelValue): Boolean
  def setTag(name: String, value: LabelValue): Boolean
}

object Taggable {
  @scala.inline
  def apply(
    addLabels: Labels => Boolean,
    addTags: Labels => Boolean,
    setLabel: (String, LabelValue) => Boolean,
    setTag: (String, LabelValue) => Boolean
  ): Taggable = {
    val __obj = js.Dynamic.literal(addLabels = js.Any.fromFunction1(addLabels), addTags = js.Any.fromFunction1(addTags), setLabel = js.Any.fromFunction2(setLabel), setTag = js.Any.fromFunction2(setTag))
  
    __obj.asInstanceOf[Taggable]
  }
}

