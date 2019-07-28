package typings.atFeathersjsFeathers.atFeathersjsFeathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feathers extends js.Object {
  var SKIP: SkipSymbol = js.native
  @JSName("default")
  var default_Original: Feathers = js.native
  var version: String = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def apply[T](): Application[T] = js.native
  // tslint:disable-next-line no-unnecessary-generics
  def default[T](): Application[T] = js.native
}

