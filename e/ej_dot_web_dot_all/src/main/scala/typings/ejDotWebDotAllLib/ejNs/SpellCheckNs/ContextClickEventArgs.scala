package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextClickEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the SpellCheck model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the request type value.
               */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the selected option in the context menu.
               */
  var selectedOption: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the selected error word.
               */
  var selectedValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the input string.
               */
  var targetContent: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

