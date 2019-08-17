package typings.atEmberPolyfills

import typings.atEmberPolyfills.typesMod.Mix
import typings.atEmberPolyfills.typesMod.Mix3
import typings.atEmberPolyfills.typesMod.Mix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/polyfills", JSImport.Namespace)
@js.native
object atEmberPolyfillsMod extends js.Object {
  def assign(target: js.Object, sources: js.Object*): js.Any = js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): Mix[T, U] = js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): Mix3[T, U, V] = js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): Mix4[T, U, V, W] = js.native
  def merge[T /* <: js.Object */, U /* <: js.Object */](original: T, updates: U): Mix[T, U] = js.native
}

