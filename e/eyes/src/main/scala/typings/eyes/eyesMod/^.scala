package typings.eyes.eyesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eyes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def inspect(thing: js.Any): Unit = js.native
  def inspect(thing: js.Any, label: String): Unit = js.native
  def inspector(): InspectorFunction = js.native
  def inspector(options: EyesOptions): InspectorFunction = js.native
}

