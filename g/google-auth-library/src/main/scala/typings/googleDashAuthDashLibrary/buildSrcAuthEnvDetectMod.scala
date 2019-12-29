package typings.googleDashAuthDashLibrary

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GCPEnv with String] = js.native
    /* "APP_ENGINE" */ @js.native
    object APP_ENGINE extends TopLevel[APP_ENGINE with String]
    
    /* "CLOUD_FUNCTIONS" */ @js.native
    object CLOUD_FUNCTIONS extends TopLevel[CLOUD_FUNCTIONS with String]
    
    /* "COMPUTE_ENGINE" */ @js.native
    object COMPUTE_ENGINE extends TopLevel[COMPUTE_ENGINE with String]
    
    /* "KUBERNETES_ENGINE" */ @js.native
    object KUBERNETES_ENGINE extends TopLevel[KUBERNETES_ENGINE with String]
    
    /* "NONE" */ @js.native
    object NONE extends TopLevel[NONE with String]
    
  }
  
}

