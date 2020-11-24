package typings.firebaseUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/util/dist/src/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  @js.native
  object CONSTANTS extends js.Object {
    
    /**
      * @define {boolean} Whether this is the Admin Node.js SDK.
      */
    var NODE_ADMIN: Boolean = js.native
    
    /**
      * @define {boolean} Whether this is the client Node.js SDK.
      */
    var NODE_CLIENT: Boolean = js.native
    
    /**
      * Firebase SDK Version
      */
    var SDK_VERSION: String = js.native
  }
}
