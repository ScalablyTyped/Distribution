package typings.gapiDotClientDotFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataType extends js.Object {
  /** A field represents one dimension of a data type. */
  var field: js.UndefOr[js.Array[DataTypeField]] = js.undefined
  /** Each data type has a unique, namespaced, name. All data types in the com.google namespace are shared as part of the platform. */
  var name: js.UndefOr[String] = js.undefined
}

object DataType {
  @scala.inline
  def apply(field: js.Array[DataTypeField] = null, name: String = null): DataType = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
}

