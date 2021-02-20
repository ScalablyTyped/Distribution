package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  object CONSTANTS {
    
    @JSImport("@firebase/util/dist/src/constants", "CONSTANTS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @define {boolean} Whether this is the Admin Node.js SDK.
      */
    @JSImport("@firebase/util/dist/src/constants", "CONSTANTS.NODE_ADMIN")
    @js.native
    def NODE_ADMIN: Boolean = js.native
    @scala.inline
    def NODE_ADMIN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_ADMIN")(x.asInstanceOf[js.Any])
    
    /**
      * @define {boolean} Whether this is the client Node.js SDK.
      */
    @JSImport("@firebase/util/dist/src/constants", "CONSTANTS.NODE_CLIENT")
    @js.native
    def NODE_CLIENT: Boolean = js.native
    @scala.inline
    def NODE_CLIENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_CLIENT")(x.asInstanceOf[js.Any])
    
    /**
      * Firebase SDK Version
      */
    @JSImport("@firebase/util/dist/src/constants", "CONSTANTS.SDK_VERSION")
    @js.native
    def SDK_VERSION: String = js.native
    @scala.inline
    def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])
  }
}
