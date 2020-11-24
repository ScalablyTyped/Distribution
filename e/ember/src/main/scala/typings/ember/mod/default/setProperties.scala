package typings.ember.mod.default

import typings.emberObject.typesMod.UnwrapComputedPropertySetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "setProperties")
@js.native
object setProperties extends js.Object {
  
  def apply[T, K /* <: /* keyof T */ java.lang.String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[T, K] = js.native
}
