package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.anon.Flag
import typings.easyXapiSupertest.anon.`1`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "readFileSync")
@js.native
object readFileSync extends js.Object {
  
  def apply(filename: String): Buffer = js.native
  def apply(filename: String, encoding: String): String = js.native
  def apply(filename: String, options: Flag): String = js.native
  def apply(filename: String, options: `1`): Buffer = js.native
}
