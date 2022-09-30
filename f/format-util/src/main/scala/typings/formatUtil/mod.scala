package typings.formatUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(message: String, optionalParams: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("format-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
