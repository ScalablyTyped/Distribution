package typings.googleAuthLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthEnvDetectMod {
  
  @JSImport("google-auth-library/build/src/auth/envDetect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait GCPEnv extends StObject
  @JSImport("google-auth-library/build/src/auth/envDetect", "GCPEnv")
  @js.native
  object GCPEnv extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GCPEnv & String] = js.native
    
    @js.native
    sealed trait APP_ENGINE
      extends StObject
         with GCPEnv
    /* "APP_ENGINE" */ val APP_ENGINE: typings.googleAuthLibrary.buildSrcAuthEnvDetectMod.GCPEnv.APP_ENGINE & String = js.native
    
    @js.native
    sealed trait CLOUD_FUNCTIONS
      extends StObject
         with GCPEnv
    /* "CLOUD_FUNCTIONS" */ val CLOUD_FUNCTIONS: typings.googleAuthLibrary.buildSrcAuthEnvDetectMod.GCPEnv.CLOUD_FUNCTIONS & String = js.native
    
    @js.native
    sealed trait CLOUD_RUN
      extends StObject
         with GCPEnv
    /* "CLOUD_RUN" */ val CLOUD_RUN: typings.googleAuthLibrary.buildSrcAuthEnvDetectMod.GCPEnv.CLOUD_RUN & String = js.native
    
    @js.native
    sealed trait COMPUTE_ENGINE
      extends StObject
         with GCPEnv
    /* "COMPUTE_ENGINE" */ val COMPUTE_ENGINE: typings.googleAuthLibrary.buildSrcAuthEnvDetectMod.GCPEnv.COMPUTE_ENGINE & String = js.native
    
    @js.native
    sealed trait KUBERNETES_ENGINE
      extends StObject
         with GCPEnv
    /* "KUBERNETES_ENGINE" */ val KUBERNETES_ENGINE: typings.googleAuthLibrary.buildSrcAuthEnvDetectMod.GCPEnv.KUBERNETES_ENGINE & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with GCPEnv
    /* "NONE" */ val NONE: typings.googleAuthLibrary.buildSrcAuthEnvDetectMod.GCPEnv.NONE & String = js.native
  }
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def getEnv(): js.Promise[GCPEnv] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[js.Promise[GCPEnv]]
}
