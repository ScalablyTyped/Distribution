package typings.floraColossus

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flora-colossus/lib/nativeModuleTypes", JSImport.Namespace)
@js.native
object nativeModuleTypesMod extends js.Object {
  
  @js.native
  sealed trait NativeModuleType extends js.Object
  @js.native
  object NativeModuleType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NativeModuleType with Double] = js.native
    
    @js.native
    sealed trait NODE_GYP extends NativeModuleType
    /* 1 */ @js.native
    object NODE_GYP extends TopLevel[NODE_GYP with Double]
    
    @js.native
    sealed trait NONE extends NativeModuleType
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
    @js.native
    sealed trait PREBUILD extends NativeModuleType
    /* 2 */ @js.native
    object PREBUILD extends TopLevel[PREBUILD with Double]
  }
}
