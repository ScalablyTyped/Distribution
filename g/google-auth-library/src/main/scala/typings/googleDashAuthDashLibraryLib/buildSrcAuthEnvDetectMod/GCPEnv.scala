package typings
package googleDashAuthDashLibraryLib.buildSrcAuthEnvDetectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GCPEnv extends js.Object

@JSImport("google-auth-library/build/src/auth/envDetect", "GCPEnv")
@js.native
object GCPEnv extends js.Object {
  @js.native
  sealed trait APP_ENGINE
    extends googleDashAuthDashLibraryLib.buildSrcAuthEnvDetectMod.GCPEnv
  
  @js.native
  sealed trait CLOUD_FUNCTIONS
    extends googleDashAuthDashLibraryLib.buildSrcAuthEnvDetectMod.GCPEnv
  
  @js.native
  sealed trait COMPUTE_ENGINE
    extends googleDashAuthDashLibraryLib.buildSrcAuthEnvDetectMod.GCPEnv
  
  @js.native
  sealed trait KUBERNETES_ENGINE
    extends googleDashAuthDashLibraryLib.buildSrcAuthEnvDetectMod.GCPEnv
  
  @js.native
  sealed trait NONE
    extends googleDashAuthDashLibraryLib.buildSrcAuthEnvDetectMod.GCPEnv
  
  /* "APP_ENGINE" */ val APP_ENGINE: APP_ENGINE with java.lang.String = js.native
  /* "CLOUD_FUNCTIONS" */ val CLOUD_FUNCTIONS: CLOUD_FUNCTIONS with java.lang.String = js.native
  /* "COMPUTE_ENGINE" */ val COMPUTE_ENGINE: COMPUTE_ENGINE with java.lang.String = js.native
  /* "KUBERNETES_ENGINE" */ val KUBERNETES_ENGINE: KUBERNETES_ENGINE with java.lang.String = js.native
  /* "NONE" */ val NONE: NONE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAuthDashLibraryLib.buildSrcAuthEnvDetectMod.GCPEnv with java.lang.String
  ] = js.native
}

