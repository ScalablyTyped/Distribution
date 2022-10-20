package typings.electronOsxSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsUtilIdentitiesMod {
  
  @JSImport("@electron/osx-sign/dist/cjs/util-identities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@electron/osx-sign/dist/cjs/util-identities", "Identity")
  @js.native
  open class Identity protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, hash: String) = this()
    
    var hash: js.UndefOr[String] = js.native
    
    var name: String = js.native
  }
  
  inline def findIdentities(keychain: String, identity: String): js.Promise[js.Array[Identity]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentities")(keychain.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Identity]]]
  inline def findIdentities(keychain: Null, identity: String): js.Promise[js.Array[Identity]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentities")(keychain.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Identity]]]
}
