package typings.fsExtra.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "mkdirs")
@js.native
object mkdirs extends js.Object {
  
  def apply(dir: String): js.Promise[Unit] = js.native
  def apply(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
