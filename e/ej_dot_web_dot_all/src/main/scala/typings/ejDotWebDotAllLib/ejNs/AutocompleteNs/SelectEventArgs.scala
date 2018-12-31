package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** Data object of the selected item.
    */
  var Item: js.UndefOr[Model] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Key of the selected item.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Instance of the autocomplete model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Text of the selected item.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the autocomplete textbox.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

