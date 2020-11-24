package typings.divaJs.rendererMod

import typings.divaJs.interfacesMod.RendererConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diva.js/renderer", JSImport.Default)
@js.native
class default protected () extends Renderer {
  def this(options: RendererConfig, hooks: js.Object) = this()
}
/* static members */
@JSImport("diva.js/renderer", JSImport.Default)
@js.native
object default extends js.Object {
  
  def getCompatibilityErrors(): String | Null = js.native
}
