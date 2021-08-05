package typings.filenamify

import typings.filenamify.filenamifyMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filenamifyPathMod {
  
  /**
  Convert the filename in a path a valid filename and return the augmented path.
  */
  inline def apply(path: String): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(path: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("filenamify/filenamify-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
