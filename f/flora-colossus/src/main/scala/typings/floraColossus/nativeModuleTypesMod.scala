package typings.floraColossus

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flora-colossus/lib/nativeModuleTypes", JSImport.Namespace)
@js.native
object nativeModuleTypesMod extends js.Object {
  @js.native
  sealed trait NativeModuleType extends js.Object
  
  @js.native
  object NativeModuleType extends js.Object {
    @js.native
    sealed trait NODE_GYP extends NativeModuleType
    
    @js.native
    sealed trait NONE extends NativeModuleType
    
    @js.native
    sealed trait PREBUILD extends NativeModuleType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NativeModuleType with Double] = js.native
    /* 1 */ @js.native
    object NODE_GYP extends TopLevel[NODE_GYP with Double]
    
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
    /* 2 */ @js.native
    object PREBUILD extends TopLevel[PREBUILD with Double]
    
  }
  
}

