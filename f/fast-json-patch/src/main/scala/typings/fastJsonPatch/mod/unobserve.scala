package typings.fastJsonPatch.mod

import typings.fastJsonPatch.moduleDuplexMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "unobserve")
@js.native
object unobserve extends js.Object {
  def apply[T](root: T, observer: Observer[T]): Unit = js.native
}

