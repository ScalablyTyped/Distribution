package typings.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/framework/Context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    var bindings: js.Array[typings.forgeDi.bindingMod.default] = js.native
    def has(binding: typings.forgeDi.bindingMod.default): Boolean = js.native
    def pop(): typings.forgeDi.bindingMod.default = js.native
    def push(binding: typings.forgeDi.bindingMod.default): Double = js.native
    def toString(indent: Double): String = js.native
  }
  
  @js.native
  class default () extends Context
  
}

