package typings
package ejDotWebDotAllLib.ejNs.SliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingTicksEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current Li element
    */
  var tick: js.UndefOr[js.Any] = js.undefined
  /** returns slider tick value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** returns the value type either tooltip or label value
    */
  var valueType: js.UndefOr[java.lang.String] = js.undefined
}

