package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericSpan extends Taggable {
  var traceparent: String
  // The following properties and methods are currently not documented as their API isn't considered official:
  // timestamp, ended, id, traceId, parentId, sampled, duration()
  var `type`: String
}

object GenericSpan {
  @scala.inline
  def apply(
    addLabels: Labels => Boolean,
    addTags: Labels => Boolean,
    setLabel: (String, LabelValue) => Boolean,
    setTag: (String, LabelValue) => Boolean,
    traceparent: String,
    `type`: String
  ): GenericSpan = {
    val __obj = js.Dynamic.literal(addLabels = js.Any.fromFunction1(addLabels), addTags = js.Any.fromFunction1(addTags), setLabel = js.Any.fromFunction2(setLabel), setTag = js.Any.fromFunction2(setTag), traceparent = traceparent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GenericSpan]
  }
}

