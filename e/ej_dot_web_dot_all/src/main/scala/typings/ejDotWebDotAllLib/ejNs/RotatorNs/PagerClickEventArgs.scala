package typings
package ejDotWebDotAllLib.ejNs.RotatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PagerClickEventArgs extends js.Object {
  /** returns the current slide index.
               */
  var activeItemIndex: js.UndefOr[scala.Double] = js.undefined
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** the current rotator id.
               */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** returns the rotator model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

