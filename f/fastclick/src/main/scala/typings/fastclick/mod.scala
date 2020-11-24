package typings.fastclick

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastclick", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(layer: js.Any): FastClickObject = js.native
  def apply(layer: js.Any, options: FastClickOptions): FastClickObject = js.native
  
  @js.native
  class FastClick protected () extends FastClickObject {
    def this(layer: js.Any) = this()
    def this(layer: js.Any, options: FastClickOptions) = this()
  }
  @js.native
  object FastClick extends TopLevel[FastClickStatic]
}
