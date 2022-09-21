package typings.filenamify

import typings.filenamify.filenamifyMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("filenamify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(string: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def filenamifyPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filenamifyPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def filenamifyPath(path: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("filenamifyPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
