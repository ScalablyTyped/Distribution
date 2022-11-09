package typings.expoImageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEnvMod {
  
  @JSImport("@expo/image-utils/build/env", "env")
  @js.native
  val env: Env_ = js.native
  
  @js.native
  trait Env_ extends StObject {
    
    /** Enable image utils related debugging messages */
    def EXPO_IMAGE_UTILS_DEBUG: Boolean = js.native
    
    /** Disable all Sharp related functionality. */
    def EXPO_IMAGE_UTILS_NO_SHARP: Boolean = js.native
  }
}
