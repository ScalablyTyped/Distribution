package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColumnResizeEndEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the column data in which the resizing started
               */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the column index in which the resizing started
               */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the column width difference, before and after the resizing
               */
  var extra: js.UndefOr[scala.Double] = js.undefined
  /** Returns the control model values.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the new column width after resized
               */
  var newWidth: js.UndefOr[scala.Double] = js.undefined
  /** Returns column width before dragging
               */
  var oldWidth: js.UndefOr[scala.Double] = js.undefined
  /** Returns initial column element object.
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the event Type.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

