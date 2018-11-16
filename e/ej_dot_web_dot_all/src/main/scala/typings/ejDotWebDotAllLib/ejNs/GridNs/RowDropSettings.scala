package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RowDropSettings extends js.Object {
  /** Gets or sets a value that indicates whether move or copy a record from one grid to another or within the grid
               * @Default {ej.Grid.DragBehavior.Move}
               */
  var dragBehavior: js.UndefOr[DragBehavior | java.lang.String] = js.undefined
  /** This helps in mapping server-side action when rows are dragged from Grid.
               * @Default {null}
               */
  var dragMapper: js.UndefOr[java.lang.String] = js.undefined
  /** This helps in mapping server-side action when rows are dropped in Grid.
               * @Default {null}
               */
  var dropMapper: js.UndefOr[java.lang.String] = js.undefined
  /** This specifies the grid to drop the grid rows only at particular target element.
               * @Default {null}
               */
  var dropTargetID: js.UndefOr[js.Any] = js.undefined
}

