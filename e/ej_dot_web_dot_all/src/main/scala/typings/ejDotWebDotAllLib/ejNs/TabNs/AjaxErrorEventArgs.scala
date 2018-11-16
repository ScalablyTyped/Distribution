package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AjaxErrorEventArgs extends js.Object {
  /** returns the URL of AJAX request.
               */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns AJAX data details.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the tab model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

