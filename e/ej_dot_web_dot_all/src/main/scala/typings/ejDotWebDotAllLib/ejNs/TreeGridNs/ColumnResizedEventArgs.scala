package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColumnResizedEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the column data which is resized
               */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the column being resized.
               */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the control model values.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns resized column width after resized.
               */
  var newWidth: js.UndefOr[scala.Double] = js.undefined
  /** Returns resized column width before resizing
               */
  var oldWidth: js.UndefOr[scala.Double] = js.undefined
  /** Returns the event Type.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

