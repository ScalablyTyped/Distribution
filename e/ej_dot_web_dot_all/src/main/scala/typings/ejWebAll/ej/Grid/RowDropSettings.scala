package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDropSettings extends js.Object {
  /** Gets or sets a value that indicates whether move or copy a record from one grid to another or within the grid
    * @Default {ej.Grid.DragBehavior.Move}
    */
  var dragBehavior: js.UndefOr[DragBehavior | String] = js.undefined
  /** This helps in mapping server-side action when rows are dragged from Grid.
    * @Default {null}
    */
  var dragMapper: js.UndefOr[String] = js.undefined
  /** This helps in mapping server-side action when rows are dropped in Grid.
    * @Default {null}
    */
  var dropMapper: js.UndefOr[String] = js.undefined
  /** This specifies the grid to drop the grid rows only at particular target element.
    * @Default {null}
    */
  var dropTargetID: js.UndefOr[js.Any] = js.undefined
}

object RowDropSettings {
  @scala.inline
  def apply(
    dragBehavior: DragBehavior | String = null,
    dragMapper: String = null,
    dropMapper: String = null,
    dropTargetID: js.Any = null
  ): RowDropSettings = {
    val __obj = js.Dynamic.literal()
    if (dragBehavior != null) __obj.updateDynamic("dragBehavior")(dragBehavior.asInstanceOf[js.Any])
    if (dragMapper != null) __obj.updateDynamic("dragMapper")(dragMapper.asInstanceOf[js.Any])
    if (dropMapper != null) __obj.updateDynamic("dropMapper")(dropMapper.asInstanceOf[js.Any])
    if (dropTargetID != null) __obj.updateDynamic("dropTargetID")(dropTargetID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDropSettings]
  }
}

