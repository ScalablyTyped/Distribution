package typings.ethersprojectWeb

import typings.ethersprojectWeb.typesMod.GetUrlResponse
import typings.ethersprojectWeb.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/web/lib/browser-geturl", JSImport.Namespace)
@js.native
object browserGeturlMod extends js.Object {
  
  def getUrl(href: String): js.Promise[GetUrlResponse] = js.native
  def getUrl(href: String, options: Options): js.Promise[GetUrlResponse] = js.native
}
