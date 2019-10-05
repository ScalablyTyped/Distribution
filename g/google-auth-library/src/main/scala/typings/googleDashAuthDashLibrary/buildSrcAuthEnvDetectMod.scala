package typings.googleDashAuthDashLibrary

import typings.googleDashAuthDashLibrary.buildSrcAuthEnvDetectMod.GCPEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/envDetect", JSImport.Namespace)
@js.native
object buildSrcAuthEnvDetectMod extends js.Object {
  @js.native
  sealed trait GCPEnv extends js.Object
  
  def clear(): Unit = js.native
  def getEnv(): js.Promise[GCPEnv] = js.native
  @js.native
  object GCPEnv extends js.Object {
    @js.native
    sealed trait APP_ENGINE extends GCPEnv
    
    @js.native
    sealed trait CLOUD_FUNCTIONS extends GCPEnv
    
    @js.native
    sealed trait COMPUTE_ENGINE extends GCPEnv
    
    @js.native
    sealed trait KUBERNETES_ENGINE extends GCPEnv
    
    @js.native
    sealed trait NONE extends GCPEnv
    
    /* "APP_ENGINE" */ val APP_ENGINE: typings.googleDashAuthDashLibrary.buildSrcAuthEnvDetectMod.GCPEnv.APP_ENGINE with String = js.native
    /* "CLOUD_FUNCTIONS" */ val CLOUD_FUNCTIONS: typings.googleDashAuthDashLibrary.buildSrcAuthEnvDetectMod.GCPEnv.CLOUD_FUNCTIONS with String = js.native
    /* "COMPUTE_ENGINE" */ val COMPUTE_ENGINE: typings.googleDashAuthDashLibrary.buildSrcAuthEnvDetectMod.GCPEnv.COMPUTE_ENGINE with String = js.native
    /* "KUBERNETES_ENGINE" */ val KUBERNETES_ENGINE: typings.googleDashAuthDashLibrary.buildSrcAuthEnvDetectMod.GCPEnv.KUBERNETES_ENGINE with String = js.native
    /* "NONE" */ val NONE: typings.googleDashAuthDashLibrary.buildSrcAuthEnvDetectMod.GCPEnv.NONE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GCPEnv with String] = js.native
  }
  
}

