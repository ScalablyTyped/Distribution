package typings
package ejDotWebDotAllLib.ejNs.DroppableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OutEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the autocomplete model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the mouse out over the element
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

