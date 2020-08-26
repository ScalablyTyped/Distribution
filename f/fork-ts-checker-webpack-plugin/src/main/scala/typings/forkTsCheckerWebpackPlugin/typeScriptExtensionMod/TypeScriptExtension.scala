package typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

