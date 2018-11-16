package typings
package ejDotWebDotAllLib.ejNs.AccordionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InActivateEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns in active element
               */
  var inActiveHeader: js.UndefOr[js.Any] = js.undefined
  /** returns active index
               */
  var inActiveIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns true when the Accordion index activated by user interaction otherwise returns false
               */
  var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the accordion model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

