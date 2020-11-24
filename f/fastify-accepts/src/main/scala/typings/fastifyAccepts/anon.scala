package typings.fastifyAccepts

import typings.fastifyAccepts.fastifyAcceptsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(): js.Array[String] = js.native
    def apply(languages: String*): String | `false` = js.native
    def apply(languages: js.Array[String]): String | `false` = js.native
  }
  
  @js.native
  trait FnCallTypes extends js.Object {
    
    def apply(types: String*): js.Array[String] | String | `false` = js.native
    def apply(types: js.Array[String]): js.Array[String] | String | `false` = js.native
  }
}
