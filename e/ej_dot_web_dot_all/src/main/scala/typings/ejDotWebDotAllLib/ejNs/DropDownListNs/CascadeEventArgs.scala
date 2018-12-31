package typings
package ejDotWebDotAllLib.ejNs.DropDownListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascadeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the cascading dropdown model.
    */
  var cascadeModel: js.UndefOr[js.Any] = js.undefined
  /** returns the current selected value in first dropdown.
    */
  var cascadeValue: js.UndefOr[java.lang.String] = js.undefined
  /** returns the DropDownList model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the default filter action for second dropdown data should happen or not.
    */
  var requiresDefaultFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

