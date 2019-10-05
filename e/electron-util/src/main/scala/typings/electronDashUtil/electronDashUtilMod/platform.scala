package typings.electronDashUtil.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", "platform")
@js.native
object platform extends js.Object {
  def apply[Macos, Windows, Linux, Default](choices: Choices[Macos, Windows, Linux, Default]): Macos | Windows | Linux | Default = js.native
}

