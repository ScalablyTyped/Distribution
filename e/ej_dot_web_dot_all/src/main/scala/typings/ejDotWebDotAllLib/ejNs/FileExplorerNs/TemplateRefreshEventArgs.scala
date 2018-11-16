package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TemplateRefreshEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cell object.
               */
  var cell: js.UndefOr[Model] = js.undefined
  /** Returns the column object.
               */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the current row data.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model of FileExplorer.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the current row index.
               */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

