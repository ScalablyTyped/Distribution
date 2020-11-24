package typings.glaze.styleInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glaze/dist-types/StyleInjector", "DebuggableStyleInjector")
@js.native
class DebuggableStyleInjector () extends StyleInjector {
  
  var freeIndexes: js.Any = js.native
  
  var nodes: js.Any = js.native
  
  def replaceRule(index: Double, cssText: String): Double = js.native
  
  var styleEl: js.Any = js.native
}
