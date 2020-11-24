package typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeScriptExtension
  extends TypeScriptHostExtension
     with TypeScriptReporterExtension
object TypeScriptExtension {
  
  @scala.inline
  def apply(): TypeScriptExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeScriptExtension]
  }
}
