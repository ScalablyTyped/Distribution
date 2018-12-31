package typings
package ejDotWebDotAllLib.ejNs.ProgressBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the ProgressBar model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current progress percentage
    */
  var percentage: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the current progress value
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

