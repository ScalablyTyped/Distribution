package typings
package ejDotWebDotAllLib.ejNs.SplitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResizeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the splitter model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns next pane details.
               */
  var nextPane: js.UndefOr[js.Any] = js.undefined
  /** returns previous pane details.
               */
  var prevPane: js.UndefOr[js.Any] = js.undefined
  /** returns the current split bar index.
               */
  var splitbarIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

