package typings.endent

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("endent", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(strings: TemplateStringsArray, values: js.Any*): String = js.native
    
    var pretty: js.Function1[
        /* data */ js.UndefOr[String | Double | js.Object | Null], 
        js.UndefOr[String | Double | js.Object | Null]
      ] = js.native
  }
}
