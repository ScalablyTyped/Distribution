package typings
package ejDotWebDotAllLib.ejNs.NavigationDrawerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AjaxErrorEventArgs extends js.Object {
  /** URL of the content.
               */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** Set this option to true to cancel the event.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Instance of the navigation drawer model object.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Error page content.
               */
  var responseText: js.UndefOr[java.lang.String] = js.undefined
  /** Error code.
               */
  var status: js.UndefOr[scala.Double] = js.undefined
  /** The corresponding error description.
               */
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

