package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FocusOutEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Instance of the autocomplete model object.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the autocomplete textbox.
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

