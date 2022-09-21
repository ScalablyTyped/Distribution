package typings.firebaseAuthCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistenceMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/persistence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Persistence {
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/persistence", "Persistence")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/persistence", "Persistence.LOCAL")
    @js.native
    def LOCAL: String = js.native
    inline def LOCAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/persistence", "Persistence.NONE")
    @js.native
    def NONE: String = js.native
    inline def NONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/auth-compat/dist/auth-compat/src/persistence", "Persistence.SESSION")
    @js.native
    def SESSION: String = js.native
    inline def SESSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(x.asInstanceOf[js.Any])
  }
  
  inline def getPersistencesFromRedirect(apiKey: String, appName: String): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Persistence */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getPersistencesFromRedirect")(apiKey.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Persistence */ Any
  ]]
  
  inline def savePersistenceForRedirect(
    auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.AuthInternal */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_savePersistenceForRedirect")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def validatePersistenceArgument(
    auth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.Auth */ Any,
    persistence: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validatePersistenceArgument")(auth.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
