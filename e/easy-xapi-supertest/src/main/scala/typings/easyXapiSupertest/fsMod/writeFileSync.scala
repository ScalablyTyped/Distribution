package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.anon.EncodingFlag
import typings.easyXapiSupertest.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "writeFileSync")
@js.native
object writeFileSync extends js.Object {
  
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
  def apply(filename: String, data: js.Any, options: Mode): Unit = js.native
}
