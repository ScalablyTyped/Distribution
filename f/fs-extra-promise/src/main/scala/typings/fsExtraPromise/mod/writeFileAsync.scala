package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import typings.fsExtra.mod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "writeFileAsync")
@js.native
object writeFileAsync extends js.Object {
  
  def apply(filename: String, data: js.Any): ^[Unit] = js.native
  def apply(filename: String, data: js.Any, options: String): ^[Unit] = js.native
  def apply(filename: String, data: js.Any, options: WriteOptions): ^[Unit] = js.native
}
