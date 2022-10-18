package typings.floraColossus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNativeModuleTypesMod {
  
  @js.native
  sealed trait NativeModuleType extends StObject
  @JSImport("flora-colossus/lib/nativeModuleTypes", "NativeModuleType")
  @js.native
  object NativeModuleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NativeModuleType & Double] = js.native
    
    @js.native
    sealed trait NODE_GYP
      extends StObject
         with NativeModuleType
    /* 1 */ val NODE_GYP: typings.floraColossus.libNativeModuleTypesMod.NativeModuleType.NODE_GYP & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with NativeModuleType
    /* 0 */ val NONE: typings.floraColossus.libNativeModuleTypesMod.NativeModuleType.NONE & Double = js.native
    
    @js.native
    sealed trait PREBUILD
      extends StObject
         with NativeModuleType
    /* 2 */ val PREBUILD: typings.floraColossus.libNativeModuleTypesMod.NativeModuleType.PREBUILD & Double = js.native
  }
}
