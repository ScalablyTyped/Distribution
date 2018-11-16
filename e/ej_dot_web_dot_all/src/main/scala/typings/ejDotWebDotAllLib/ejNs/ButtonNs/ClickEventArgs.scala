package typings
package ejDotWebDotAllLib.ejNs.ButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClickEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** return the event model for sever side processing.
               */
  var e: js.UndefOr[js.Any] = js.undefined
  /** returns the button model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** return the button state
               */
  var status: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

