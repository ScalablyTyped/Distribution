package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Taggable extends js.Object {
  def addTags(tags: Tags): scala.Boolean
  def setTag(name: java.lang.String, value: elasticDashApmDashNodeLib.TagValue): scala.Boolean
}

object Taggable {
  @scala.inline
  def apply(
    addTags: Tags => scala.Boolean,
    setTag: (java.lang.String, elasticDashApmDashNodeLib.TagValue) => scala.Boolean
  ): Taggable = {
    val __obj = js.Dynamic.literal(addTags = js.Any.fromFunction1(addTags), setTag = js.Any.fromFunction2(setTag))
  
    __obj.asInstanceOf[Taggable]
  }
}

