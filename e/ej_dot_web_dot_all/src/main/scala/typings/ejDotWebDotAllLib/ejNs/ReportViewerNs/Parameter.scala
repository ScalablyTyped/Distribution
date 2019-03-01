package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter extends js.Object {
  /** Gets or sets the parameter labels.
    * @Default {null}
    */
  var labels: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets the name of the parameter.
    * @Default {empty}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets whether the parameter allows nullable value or not.
    * @Default {false}
    */
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets the prompt message associated with the specified parameter.
    * @Default {empty}
    */
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets the parameter values.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object Parameter {
  @scala.inline
  def apply(
    labels: js.Array[_] = null,
    name: java.lang.String = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: java.lang.String = null,
    values: js.Array[_] = null
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Parameter]
  }
}

