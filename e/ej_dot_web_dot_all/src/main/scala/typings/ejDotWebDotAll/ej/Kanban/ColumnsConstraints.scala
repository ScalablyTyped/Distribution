package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsConstraints extends js.Object {
  /** It is used to specify the maximum amount of card in particular column cell or swimlane cell can hold.
    * @Default {null}
    */
  var max: js.UndefOr[Double] = js.undefined
  /** It is used to specify the minimum amount of card in particular column cell or swimlane cell can hold.
    * @Default {null}
    */
  var min: js.UndefOr[Double] = js.undefined
  /** It is used to specify the type of constraints as column or swimlane.
    * @Default {null}
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnsConstraints {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null, `type`: String = null): ColumnsConstraints = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnsConstraints]
  }
}

