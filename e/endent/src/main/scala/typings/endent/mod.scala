package typings.endent

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
    @JSImport("endent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("endent", "default.pretty")
    @js.native
    def pretty: js.Function1[
        /* data */ js.UndefOr[String | Double | js.Object | Null], 
        js.UndefOr[String | Double | js.Object | Null]
      ] = js.native
    inline def pretty_=(
      x: js.Function1[
          /* data */ js.UndefOr[String | Double | js.Object | Null], 
          js.UndefOr[String | Double | js.Object | Null]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pretty")(x.asInstanceOf[js.Any])
  }
}
