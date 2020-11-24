package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import typings.fsExtra.mod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "appendFileAsync")
@js.native
object appendFileAsync extends js.Object {
  
  def apply(filename: String, data: js.Any): ^[Unit] = js.native
  def apply(filename: String, data: js.Any, option: String): ^[Unit] = js.native
  def apply(filename: String, data: js.Any, option: WriteOptions): ^[Unit] = js.native
}
