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
    addTags: Tags => scala.Boolean,
    setTag: (java.lang.String, TagValue) => scala.Boolean,
    traceparent: java.lang.String,
    `type`: java.lang.String
  ): GenericSpan = {
    val __obj = js.Dynamic.literal(addTags = js.Any.fromFunction1(addTags), setTag = js.Any.fromFunction2(setTag), traceparent = traceparent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GenericSpan]
  }
}

