package typings.firebaseAuthCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/test/helpers/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/test/helpers/helpers", "FAKE_HEARTBEAT_CONTROLLER_PROVIDER")
  @js.native
  val FAKE_HEARTBEAT_CONTROLLER_PROVIDER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider<'heartbeat'> */ Any = js.native
  
  inline def cleanUpTestInstance(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpTestInstance")().asInstanceOf[js.Promise[Unit]]
  
  inline def initializeTestInstance(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeTestInstance")().asInstanceOf[Unit]
  
  inline def randomEmail(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomEmail")().asInstanceOf[String]
}
