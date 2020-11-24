package typings.ember.mod.default

import typings.emberPolyfills.typesMod.Mix
import typings.emberPolyfills.typesMod.Mix3
import typings.emberPolyfills.typesMod.Mix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: replace with an es6 reexport when declare module 'ember' is removed
/**
  * Copy properties from a source object to a target object.
  */
@JSImport("ember", "assign")
@js.native
object assign extends js.Object {
  
  def apply(target: js.Object): scala.Nothing = js.native
  def apply(target: js.Object, sources: js.Object*): js.Any = js.native
  def apply[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): Mix[T, U] = js.native
  def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): Mix3[T, U, V] = js.native
  def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): Mix4[T, U, V, W] = js.native
}
