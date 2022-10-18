package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSprintfMod {
  
  inline def apply(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("fbjs/lib/sprintf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
