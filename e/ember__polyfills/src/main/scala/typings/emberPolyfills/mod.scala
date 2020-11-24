package typings.emberPolyfills

import typings.emberPolyfills.typesMod.Mix
import typings.emberPolyfills.typesMod.Mix3
import typings.emberPolyfills.typesMod.Mix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/polyfills", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def assign(target: js.Object): scala.Nothing = js.native
  def assign(target: js.Object, sources: js.Object*): js.Any = js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): Mix[T, U] = js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): Mix3[T, U, V] = js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): Mix4[T, U, V, W] = js.native
  
  def merge[T /* <: js.Object */, U /* <: js.Object */](original: T, updates: U): Mix[T, U] = js.native
}
