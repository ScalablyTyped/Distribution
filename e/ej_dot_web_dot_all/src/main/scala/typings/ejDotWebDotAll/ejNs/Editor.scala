package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Editor")
@js.native
class Editor protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.EditorNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.EditorNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.EditorNs.Model = js.native
  @JSName("model")
  var model_Editor: typings.ejDotWebDotAll.ejNs.EditorNs.Model = js.native
  /** To disable the corresponding Editors
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the corresponding Editors
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To get value from corresponding Editors
    * @returns {number}
    */
  def getValue(): Double = js.native
}

/* static members */
@JSGlobal("ej.Editor")
@js.native
object Editor extends js.Object {
  var Locale: js.Any = js.native
  var fn: Editor = js.native
}

