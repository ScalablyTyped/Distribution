package typings.globalModulesPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("global-modules-path", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getPath(module: String): String | Null = js.native
  def getPath(module: String, executable: String): String | Null = js.native
}
