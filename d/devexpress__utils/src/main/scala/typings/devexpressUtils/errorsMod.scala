package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class Errors () extends js.Object
  /* static members */
  @js.native
  object Errors extends js.Object {
    
    var InternalException: String = js.native
    
    var NotImplemented: String = js.native
    
    var ValueCannotBeNull: String = js.native
    
    def internalExceptionTemplate(str: String): String = js.native
  }
}
