package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dynamsoft")
@js.native
object DynamsoftNs extends js.Object {
  var Lib: dwtLib.DynamsoftLib = js.native
  var WebTwainEnv: dwtLib.dwtEnv = js.native
  @JSName("DWT")
  @js.native
  object DWTNs extends js.Object {
    var defaultEnv: dwtLib.dwtEnv = js.native
  }
  
  @JSName("WebTwain")
  @js.native
  object WebTwainNs extends js.Object {
    @JSName("Addon")
    @js.native
    object AddonNs extends js.Object {
      var OCRPro: dwtLib.OCRProAddon = js.native
    }
    
  }
  
}

