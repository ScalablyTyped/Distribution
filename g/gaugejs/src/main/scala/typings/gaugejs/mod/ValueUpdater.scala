package typings.gaugejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueUpdater extends js.Object {
  
  /**
    * The animation speed of the gauge pointer (default is 32)
    */
  var animationSpeed: Double = js.native
  
  def update(): Boolean = js.native
  def update(force: Boolean): Boolean = js.native
}
