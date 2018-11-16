package typings
package ejDotWebDotAllLib.ejNs.AccordionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AjaxLoadEventArgs extends js.Object {
  /** returns the name of the URL
               */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the accordion model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

