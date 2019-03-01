package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Skill extends js.Object {
  /** Metadata about the skill. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The skill; for example, `underwater basket weaving`. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Skill {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: java.lang.String = null): Skill = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Skill]
  }
}

