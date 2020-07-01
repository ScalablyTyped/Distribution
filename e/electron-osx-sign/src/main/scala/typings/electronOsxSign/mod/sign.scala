package typings.electronOsxSign.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-osx-sign", "sign")
@js.native
object sign extends js.Object {
  def apply(opts: SignOptions, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
}

