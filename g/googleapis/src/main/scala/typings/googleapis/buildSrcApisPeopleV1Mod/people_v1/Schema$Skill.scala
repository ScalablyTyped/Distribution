package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A skill that the person has.
  */
@js.native
trait Schema$Skill extends js.Object {
  /**
    * Metadata about the skill.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The skill; for example, `underwater basket weaving`.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Skill {
  @scala.inline
  def apply(metadata: Schema$FieldMetadata = null, value: String = null): Schema$Skill = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Skill]
  }
}

