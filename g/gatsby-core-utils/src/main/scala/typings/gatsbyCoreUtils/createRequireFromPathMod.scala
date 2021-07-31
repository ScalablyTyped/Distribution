package typings.gatsbyCoreUtils

import typings.node.NodeRequire
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRequireFromPathMod {
  
  @JSImport("gatsby-core-utils/dist/create-require-from-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createRequireFromPath(path: String): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequireFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  @scala.inline
  def createRequireFromPath(path: URL_): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequireFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
}
