package typings.electronDashBuilder.outBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder/out/builder", "build")
@js.native
object build extends js.Object {
  def apply(): js.Promise[js.Array[String]] = js.native
  def apply(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
}

