package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ProgressBar")
@js.native
class ProgressBar protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ProgressBarNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ProgressBarNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ProgressBarNs.Model = js.native
  @JSName("model")
  var model_ProgressBar: ejDotWebDotAllLib.ejNs.ProgressBarNs.Model = js.native
  /** Disables the progressbar control
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Enables the progressbar control
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Returns the current progress value in percent.
    * @returns {number}
    */
  def getPercentage(): scala.Double = js.native
  /** Returns the current progress value
    * @returns {number}
    */
  def getValue(): scala.Double = js.native
}

/* static members */
@JSGlobal("ej.ProgressBar")
@js.native
object ProgressBar extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.ProgressBar = js.native
}

