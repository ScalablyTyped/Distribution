package typings.emberApplication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultResolverMod {
  
  @JSImport("@ember/application/-private/default-resolver", JSImport.Default)
  @js.native
  class default () extends DefaultResolver
  
  @js.native
  trait DefaultResolver
    extends typings.emberEngine.resolverMod.default {
    
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
}
