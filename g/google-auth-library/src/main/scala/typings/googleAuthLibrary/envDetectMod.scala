package typings.googleAuthLibrary

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-auth-library/build/src/auth/envDetect", JSImport.Namespace)
@js.native
object envDetectMod extends js.Object {
  
  def clear(): Unit = js.native
  
  def getEnv(): js.Promise[GCPEnv] = js.native
  
  @js.native
  sealed trait GCPEnv extends js.Object
  @js.native
  object GCPEnv extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GCPEnv with String] = js.native
    
    @js.native
    sealed trait APP_ENGINE extends GCPEnv
    /* "APP_ENGINE" */ @js.native
    object APP_ENGINE extends TopLevel[APP_ENGINE with String]
    
    @js.native
    sealed trait CLOUD_FUNCTIONS extends GCPEnv
    /* "CLOUD_FUNCTIONS" */ @js.native
    object CLOUD_FUNCTIONS extends TopLevel[CLOUD_FUNCTIONS with String]
    
    @js.native
    sealed trait COMPUTE_ENGINE extends GCPEnv
    /* "COMPUTE_ENGINE" */ @js.native
    object COMPUTE_ENGINE extends TopLevel[COMPUTE_ENGINE with String]
    
    @js.native
    sealed trait KUBERNETES_ENGINE extends GCPEnv
    /* "KUBERNETES_ENGINE" */ @js.native
    object KUBERNETES_ENGINE extends TopLevel[KUBERNETES_ENGINE with String]
    
    @js.native
    sealed trait NONE extends GCPEnv
    /* "NONE" */ @js.native
    object NONE extends TopLevel[NONE with String]
  }
}
