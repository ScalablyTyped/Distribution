package typings.emberApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/application/-private/default-resolver", JSImport.Namespace)
@js.native
object defaultResolverMod extends js.Object {
  
  @js.native
  trait DefaultResolver
    extends typings.emberObject.mod.default {
    
    /**
      * This will be set to the Application instance when it is
      * created.
      */
    var namespace: typings.emberApplication.mod.default = js.native
    
    /**
      * This method is called via the container's resolver method.
      * It parses the provided `fullName` and then looks up and
      * returns the appropriate template or class.
      */
    def resolve(fullName: String): js.Object = js.native
  }
  
  @js.native
  class default () extends DefaultResolver
}
