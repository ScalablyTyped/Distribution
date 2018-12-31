package typings
package ejDotWebDotAllLib.ejNs.RatingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the mouse click event args values.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the rating model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the current value.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

