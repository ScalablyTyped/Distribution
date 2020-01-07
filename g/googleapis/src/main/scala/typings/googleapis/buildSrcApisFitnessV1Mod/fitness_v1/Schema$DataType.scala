package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DataType extends js.Object {
  /**
    * A field represents one dimension of a data type.
    */
  var field: js.UndefOr[js.Array[Schema$DataTypeField]] = js.native
  /**
    * Each data type has a unique, namespaced, name. All data types in the
    * com.google namespace are shared as part of the platform.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$DataType {
  @scala.inline
  def apply(field: js.Array[Schema$DataTypeField] = null, name: String = null): Schema$DataType = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DataType]
  }
}

