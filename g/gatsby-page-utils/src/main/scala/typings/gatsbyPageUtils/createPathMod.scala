package typings.gatsbyPageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPathMod {
  
  @JSImport("gatsby-page-utils/dist/create-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPath(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def createPath(filePath: String, withTrailingSlash: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(filePath.asInstanceOf[js.Any], withTrailingSlash.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createPath(filePath: String, withTrailingSlash: Boolean, usePathBase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(filePath.asInstanceOf[js.Any], withTrailingSlash.asInstanceOf[js.Any], usePathBase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createPath(filePath: String, withTrailingSlash: Unit, usePathBase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(filePath.asInstanceOf[js.Any], withTrailingSlash.asInstanceOf[js.Any], usePathBase.asInstanceOf[js.Any])).asInstanceOf[String]
}
