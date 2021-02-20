package typings.googleAuthLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object envDetectMod {
  
  @js.native
  sealed trait GCPEnv extends StObject
  @JSImport("google-auth-library/build/src/auth/envDetect", "GCPEnv")
  @js.native
  object GCPEnv extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GCPEnv with String] = js.native
    
    @js.native
    sealed trait APP_ENGINE extends GCPEnv
    /* "APP_ENGINE" */ val APP_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.APP_ENGINE with String = js.native
    
    @js.native
    sealed trait CLOUD_FUNCTIONS extends GCPEnv
    /* "CLOUD_FUNCTIONS" */ val CLOUD_FUNCTIONS: typings.googleAuthLibrary.envDetectMod.GCPEnv.CLOUD_FUNCTIONS with String = js.native
    
    @js.native
    sealed trait COMPUTE_ENGINE extends GCPEnv
    /* "COMPUTE_ENGINE" */ val COMPUTE_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.COMPUTE_ENGINE with String = js.native
    
    @js.native
    sealed trait KUBERNETES_ENGINE extends GCPEnv
    /* "KUBERNETES_ENGINE" */ val KUBERNETES_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.KUBERNETES_ENGINE with String = js.native
    
    @js.native
    sealed trait NONE extends GCPEnv
    /* "NONE" */ val NONE: typings.googleAuthLibrary.envDetectMod.GCPEnv.NONE with String = js.native
  }
  
  @JSImport("google-auth-library/build/src/auth/envDetect", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("google-auth-library/build/src/auth/envDetect", "getEnv")
  @js.native
  def getEnv(): js.Promise[GCPEnv] = js.native
}
