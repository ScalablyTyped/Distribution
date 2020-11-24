package typings.electronBuilder.builderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-builder/out/builder", "build")
@js.native
object build extends js.Object {
  
  def apply(): js.Promise[js.Array[String]] = js.native
  def apply(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
}
