package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AjaxSuccessEventArgs extends js.Object {
  /** returns AJAX URL
               */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns content of AJAX request.
               */
  var content: js.UndefOr[js.Any] = js.undefined
  /** return AJAX data.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the tab model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

