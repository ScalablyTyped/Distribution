package typings.firebaseAuth

import typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.User
import typings.firebaseAuth.distEsm5SrcModelUserMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreUserReloadMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/user/reload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reload(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def reloadWithoutSaving(user: UserInternal): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_reloadWithoutSaving")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
