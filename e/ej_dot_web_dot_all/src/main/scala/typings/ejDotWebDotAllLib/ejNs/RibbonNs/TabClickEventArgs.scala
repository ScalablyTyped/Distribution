package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabClickEventArgs extends js.Object {
  /** returns current active tab header .
    */
  var activeHeader: js.UndefOr[js.Any] = js.undefined
  /** returns current active index.
    */
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns previous active tab header.
    */
  var prevActiveHeader: js.UndefOr[js.Any] = js.undefined
  /** returns previous active index.
    */
  var prevActiveIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

