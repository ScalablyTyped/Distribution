package typings
package electronDashOsxDashSignLib.electronDashOsxDashSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-osx-sign", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flat(opts: FlatOptions, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def flatAsync(opts: FlatOptions): js.Promise[_] = js.native
  def sign(opts: SignOptions, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def signAsync(opts: SignOptions): js.Promise[_] = js.native
}

