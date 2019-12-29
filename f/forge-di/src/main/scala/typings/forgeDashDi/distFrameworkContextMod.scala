package typings.forgeDashDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/framework/Context", JSImport.Namespace)
@js.native
object distFrameworkContextMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    var bindings: js.Array[typings.forgeDashDi.distFrameworkBindingMod.default] = js.native
    def has(binding: typings.forgeDashDi.distFrameworkBindingMod.default): Boolean = js.native
    def pop(): typings.forgeDashDi.distFrameworkBindingMod.default = js.native
    def push(binding: typings.forgeDashDi.distFrameworkBindingMod.default): Double = js.native
    def toString(indent: Double): String = js.native
  }
  
  @js.native
  class default () extends Context
  
}

