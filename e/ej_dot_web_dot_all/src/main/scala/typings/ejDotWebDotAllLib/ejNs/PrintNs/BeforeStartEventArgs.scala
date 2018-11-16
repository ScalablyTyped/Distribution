package typings
package ejDotWebDotAllLib.ejNs.PrintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeStartEventArgs extends js.Object {
  /** Set this option as true to cancel the event.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the printed element
               */
  var content: js.UndefOr[js.Any] = js.undefined
  /** Returns the Print model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of an event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

