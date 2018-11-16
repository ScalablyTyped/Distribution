package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DestroyEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns current ribbon tab item index
               */
  var deleteIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the ribbon model.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

