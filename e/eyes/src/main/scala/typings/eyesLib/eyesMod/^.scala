package typings
package eyesLib.eyesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eyes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def inspect(thing: js.Any): scala.Unit = js.native
  def inspect(thing: js.Any, label: java.lang.String): scala.Unit = js.native
  def inspector(): eyesLib.eyesMod.InspectorFunction = js.native
  def inspector(options: eyesLib.eyesMod.EyesOptions): eyesLib.eyesMod.InspectorFunction = js.native
}

