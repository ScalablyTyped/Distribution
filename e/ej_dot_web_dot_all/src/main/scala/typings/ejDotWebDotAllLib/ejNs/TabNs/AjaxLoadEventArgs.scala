package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AjaxLoadEventArgs extends js.Object {
  /** returns the URL of AJAX request
               */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** returns current active tab header .
               */
  var activeHeader: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns current active index.
               */
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns, is it triggered by interaction or not.
               */
  var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the tab model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns previous active tab header.
               */
  var prevActiveHeader: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** returns previous active index.
               */
  var prevActiveIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

