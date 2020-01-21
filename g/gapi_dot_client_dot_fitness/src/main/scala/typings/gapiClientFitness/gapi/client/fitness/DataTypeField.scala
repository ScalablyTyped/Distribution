package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeField extends js.Object {
  /** The different supported formats for each field in a data type. */
  var format: js.UndefOr[String] = js.undefined
  /** Defines the name and format of data. Unlike data type names, field names are not namespaced, and only need to be unique within the data type. */
  var name: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
}

object DataTypeField {
  @scala.inline
  def apply(format: String = null, name: String = null, optional: js.UndefOr[Boolean] = js.undefined): DataTypeField = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeField]
  }
}

