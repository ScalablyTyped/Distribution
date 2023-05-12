package typings.glimmerUtil

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibStringMod {
  
  @JSImport("@glimmer/util/dist/types/lib/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def strip(strings: TemplateStringsArray, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(scala.List(strings.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
