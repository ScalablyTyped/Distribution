package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("fancybox")
  var fancybox_Original: FancyboxMethods = js.native
  def fancybox(): scala.Unit = js.native
  def fancybox(group: js.Array[_]): scala.Unit = js.native
  def fancybox(group: js.Array[_], options: FancyboxOptions): scala.Unit = js.native
  def fancybox(options: FancyboxOptions): scala.Unit = js.native
  def fancybox(selector: JQuery): scala.Unit = js.native
  def fancybox(selector: JQuery, options: FancyboxOptions): scala.Unit = js.native
  def fancybox(selector: java.lang.String): scala.Unit = js.native
  def fancybox(selector: java.lang.String, options: FancyboxOptions): scala.Unit = js.native
}

