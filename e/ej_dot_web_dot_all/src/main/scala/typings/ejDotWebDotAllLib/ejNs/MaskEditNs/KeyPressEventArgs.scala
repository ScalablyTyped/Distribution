package typings
package ejDotWebDotAllLib.ejNs.MaskEditNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyPressEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the mask edit model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns unstripped value in mask edit textbox control.
               */
  var unmaskedValue: js.UndefOr[java.lang.String] = js.undefined
  /** returns the mask edit value
               */
  var value: js.UndefOr[scala.Double] = js.undefined
}

