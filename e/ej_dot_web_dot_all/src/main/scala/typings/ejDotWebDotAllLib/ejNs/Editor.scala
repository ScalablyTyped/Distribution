package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Editor")
@js.native
class Editor protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.EditorNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.EditorNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.EditorNs.Model = js.native
  @JSName("model")
  var model_Editor: ejDotWebDotAllLib.ejNs.EditorNs.Model = js.native
  /** To disable the corresponding Editors
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** To enable the corresponding Editors
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** To get value from corresponding Editors
    * @returns {number}
    */
  def getValue(): scala.Double = js.native
}

@JSGlobal("ej.Editor")
@js.native
object Editor extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Editor = js.native
}

