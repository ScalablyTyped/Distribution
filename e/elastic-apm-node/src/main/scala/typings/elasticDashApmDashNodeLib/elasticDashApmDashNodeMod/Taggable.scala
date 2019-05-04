package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Taggable extends js.Object {
   // Deprecated
  def addLabels(labels: Labels): scala.Boolean
  def addTags(labels: Labels): scala.Boolean
  def setLabel(name: java.lang.String, value: LabelValue): scala.Boolean
  def setTag(name: java.lang.String, value: LabelValue): scala.Boolean
}

object Taggable {
  @scala.inline
  def apply(
    addLabels: Labels => scala.Boolean,
    addTags: Labels => scala.Boolean,
    setLabel: (java.lang.String, LabelValue) => scala.Boolean,
    setTag: (java.lang.String, LabelValue) => scala.Boolean
  ): Taggable = {
    val __obj = js.Dynamic.literal(addLabels = js.Any.fromFunction1(addLabels), addTags = js.Any.fromFunction1(addTags), setLabel = js.Any.fromFunction2(setLabel), setTag = js.Any.fromFunction2(setTag))
  
    __obj.asInstanceOf[Taggable]
  }
}

