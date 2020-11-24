package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise-es6", "copy")
@js.native
object copy extends js.Object {
  
  def apply(src: String, dest: String): Unit = js.native
  def apply(
    src: String,
    dest: String,
    callback: js.Function1[(/* err */ Error) | (/* src */ String), Boolean | Unit]
  ): Unit = js.native
  def apply(
    src: String,
    dest: String,
    filter: js.Function1[/* src */ String, Boolean],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
}
