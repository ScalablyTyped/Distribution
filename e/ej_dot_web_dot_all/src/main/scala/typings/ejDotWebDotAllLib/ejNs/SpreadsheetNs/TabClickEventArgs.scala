package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TabClickEventArgs extends js.Object {
  /** Returns active tab header element.
               */
  var activeHeader: js.UndefOr[js.Any] = js.undefined
  /** Returns the active tab index.
               */
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the Spreadsheet model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns previous active tab header element.
               */
  var prevActiveHeader: js.UndefOr[js.Any] = js.undefined
  /** Returns previous active tab index.
               */
  var prevActiveIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the target element.
               */
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

