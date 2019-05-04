package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericSpan extends Taggable {
  var traceparent: java.lang.String
  // The following properties and methods are currently not documented as their API isn't considered official:
  // timestamp, ended, id, traceId, parentId, sampled, duration()
  var `type`: java.lang.String
}

object GenericSpan {
  @scala.inline
  def apply(
    addLabels: Labels => scala.Boolean,
    addTags: Labels => scala.Boolean,
    setLabel: (java.lang.String, LabelValue) => scala.Boolean,
    setTag: (java.lang.String, LabelValue) => scala.Boolean,
    traceparent: java.lang.String,
    `type`: java.lang.String
  ): GenericSpan = {
    val __obj = js.Dynamic.literal(addLabels = js.Any.fromFunction1(addLabels), addTags = js.Any.fromFunction1(addTags), setLabel = js.Any.fromFunction2(setLabel), setTag = js.Any.fromFunction2(setTag), traceparent = traceparent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GenericSpan]
  }
}

