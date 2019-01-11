package typings
package electronDashOsxDashSignLib.electronDashOsxDashSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-osx-sign", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flat(
    opts: electronDashOsxDashSignLib.electronDashOsxDashSignMod.FlatOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def flatAsync(opts: electronDashOsxDashSignLib.electronDashOsxDashSignMod.FlatOptions): js.Promise[_] = js.native
  def sign(
    opts: electronDashOsxDashSignLib.electronDashOsxDashSignMod.SignOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def signAsync(opts: electronDashOsxDashSignLib.electronDashOsxDashSignMod.SignOptions): js.Promise[_] = js.native
}

