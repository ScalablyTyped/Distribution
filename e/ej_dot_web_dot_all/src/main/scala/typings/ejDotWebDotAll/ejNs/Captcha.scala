package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Captcha")
@js.native
class Captcha protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.CaptchaNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.CaptchaNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.CaptchaNs.Model = js.native
  @JSName("model")
  var model_Captcha: typings.ejDotWebDotAll.ejNs.CaptchaNs.Model = js.native
}

/* static members */
@JSGlobal("ej.Captcha")
@js.native
object Captcha extends js.Object {
  var Locale: js.Any = js.native
  var fn: Captcha = js.native
}

