package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningMod {
  
  inline def apply(condition: Any, format: String, args: Any*): String = (^.asInstanceOf[js.Dynamic].apply((scala.List(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
  
  @JSImport("fbjs/lib/warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
