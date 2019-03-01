package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateMetadata extends js.Object {
  /** Optional. A description of the template. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The name of the template. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The parameters for the template. */
  var parameters: js.UndefOr[js.Array[ParameterMetadata]] = js.undefined
}

object TemplateMetadata {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    name: java.lang.String = null,
    parameters: js.Array[ParameterMetadata] = null
  ): TemplateMetadata = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[TemplateMetadata]
  }
}

