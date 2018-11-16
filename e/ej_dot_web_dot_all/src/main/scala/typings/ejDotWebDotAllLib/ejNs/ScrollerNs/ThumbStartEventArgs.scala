package typings
package ejDotWebDotAllLib.ejNs.ScrollerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ThumbStartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the scroller model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the original event name and its event properties of the current event.
               */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  /** returns the current data related to the event.
               */
  var scrollData: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

