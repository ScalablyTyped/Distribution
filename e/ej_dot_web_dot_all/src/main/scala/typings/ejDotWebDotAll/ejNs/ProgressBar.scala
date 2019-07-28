package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ProgressBar")
@js.native
class ProgressBar protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.ProgressBarNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.ProgressBarNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.ProgressBarNs.Model = js.native
  @JSName("model")
  var model_ProgressBar: typings.ejDotWebDotAll.ejNs.ProgressBarNs.Model = js.native
  /** Disables the progressbar control
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the progressbar control
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Returns the current progress value in percent.
    * @returns {number}
    */
  def getPercentage(): Double = js.native
  /** Returns the current progress value
    * @returns {number}
    */
  def getValue(): Double = js.native
}

/* static members */
@JSGlobal("ej.ProgressBar")
@js.native
object ProgressBar extends js.Object {
  var Locale: js.Any = js.native
  var fn: ProgressBar = js.native
}

