package typings.filenamify

import typings.filenamify.filenamifyMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filenamifyPathMod {
  
  @JSImport("filenamify/filenamify-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(path: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
