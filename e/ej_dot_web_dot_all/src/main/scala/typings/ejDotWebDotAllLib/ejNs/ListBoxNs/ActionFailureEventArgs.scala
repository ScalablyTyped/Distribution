package typings
package ejDotWebDotAllLib.ejNs.ListBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActionFailureEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the error message
               */
  var error: js.UndefOr[js.Any] = js.undefined
  /** returns the ListBox model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the query for data retrieval
               */
  var query: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

