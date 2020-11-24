package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise-es6", "fchown")
@js.native
object fchown extends js.Object {
  
  def apply(fd: Double, uid: Double, gid: Double): Unit = js.native
  def apply(fd: Double, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
