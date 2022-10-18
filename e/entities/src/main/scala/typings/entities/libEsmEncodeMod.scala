package typings.entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmEncodeMod {
  
  @JSImport("entities/lib/esm/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeHTML(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeHTML")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeNonAsciiHTML(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeNonAsciiHTML")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
