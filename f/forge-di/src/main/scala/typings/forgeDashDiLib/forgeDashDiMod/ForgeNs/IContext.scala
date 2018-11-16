package typings
package forgeDashDiLib.forgeDashDiMod.ForgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContext
  extends ScalablyTyped.runtime.Instantiable0[IContext] {
  var bindings: js.Array[IBinding] = js.native
  def has(binding: IBinding): scala.Boolean = js.native
  def pop(): IBinding = js.native
  def push(binding: IBinding): scala.Unit = js.native
  def toString(indent: scala.Double): java.lang.String = js.native
}

