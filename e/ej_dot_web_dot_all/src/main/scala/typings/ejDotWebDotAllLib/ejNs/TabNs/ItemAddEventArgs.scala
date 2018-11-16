package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ItemAddEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the tab model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns new added tab content panel.
               */
  var tabContent: js.UndefOr[js.Any] = js.undefined
  /** returns new added tab header.
               */
  var tabHeader: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

