package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldViolation extends js.Object {
  /**
    * Description of the error.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Path of field with violation.
    */
  var field: js.UndefOr[String] = js.native
}

object SchemaFieldViolation {
  @scala.inline
  def apply(description: String = null, field: String = null): SchemaFieldViolation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldViolation]
  }
}

