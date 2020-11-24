package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise-es6", "symlink")
@js.native
object symlink extends js.Object {
  
  def apply(srcpath: String, dstpath: String): Unit = js.native
  def apply(
    srcpath: String,
    dstpath: String,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def apply(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  def apply(srcpath: String, dstpath: String, `type`: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
