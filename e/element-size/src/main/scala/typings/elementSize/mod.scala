package typings.elementSize

import typings.std.Document
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("element-size", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(element: Document): js.Tuple2[Double, Double] = js.native
  def apply(element: EventTarget): js.Tuple2[Double, Double] = js.native
  def apply(element: HTMLElement): js.Tuple2[Double, Double] = js.native
}

