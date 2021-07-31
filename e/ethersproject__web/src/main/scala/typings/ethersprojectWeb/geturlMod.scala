package typings.ethersprojectWeb

import typings.ethersprojectWeb.typesMod.GetUrlResponse
import typings.ethersprojectWeb.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geturlMod {
  
  @JSImport("@ethersproject/web/lib/geturl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getUrl(href: String): js.Promise[GetUrlResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(href.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetUrlResponse]]
  @scala.inline
  def getUrl(href: String, options: Options): js.Promise[GetUrlResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(href.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetUrlResponse]]
}
