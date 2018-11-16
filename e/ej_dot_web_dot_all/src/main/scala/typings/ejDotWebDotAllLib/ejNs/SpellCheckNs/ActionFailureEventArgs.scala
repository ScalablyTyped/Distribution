package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActionFailureEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns AJAX request failure error message.
               */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the SpellCheck model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the request type value.
               */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

