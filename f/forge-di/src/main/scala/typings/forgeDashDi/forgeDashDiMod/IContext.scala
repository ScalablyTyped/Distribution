package typings.forgeDashDi.forgeDashDiMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContext extends Instantiable0[IContext] {
  var bindings: js.Array[IBinding] = js.native
  def has(binding: IBinding): Boolean = js.native
  def pop(): IBinding = js.native
  def push(binding: IBinding): Unit = js.native
  def toString(indent: Double): String = js.native
}

