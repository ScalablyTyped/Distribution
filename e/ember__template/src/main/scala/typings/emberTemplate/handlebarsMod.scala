package typings.emberTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/template/-private/handlebars", JSImport.Namespace)
@js.native
object handlebarsMod extends js.Object {
  
  @js.native
  class SafeString protected () extends js.Object {
    def this(str: String) = this()
    
    def toHTML(): String = js.native
  }
}
