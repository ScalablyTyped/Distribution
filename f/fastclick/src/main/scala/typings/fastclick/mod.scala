package typings.fastclick

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fastclick", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class FastClick protected () extends FastClickObject {
    def this(layer: js.Any) = this()
    def this(layer: js.Any, options: FastClickOptions) = this()
  }
  
  def apply(layer: js.Any): FastClickObject = js.native
  def apply(layer: js.Any, options: FastClickOptions): FastClickObject = js.native
  @js.native
  object FastClick extends TopLevel[FastClickStatic]
  
}

