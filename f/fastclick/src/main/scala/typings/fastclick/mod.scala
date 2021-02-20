package typings.fastclick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastclick", JSImport.Namespace)
  @js.native
  def apply(layer: js.Any): FastClickObject = js.native
  @JSImport("fastclick", JSImport.Namespace)
  @js.native
  def apply(layer: js.Any, options: FastClickOptions): FastClickObject = js.native
  
  @JSImport("fastclick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fastclick", "FastClick")
  @js.native
  class FastClick protected () extends FastClickObject {
    def this(layer: js.Any) = this()
    def this(layer: js.Any, options: FastClickOptions) = this()
  }
  @JSImport("fastclick", "FastClick")
  @js.native
  def FastClick: FastClickStatic = js.native
  @scala.inline
  def FastClick_=(x: FastClickStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastClick")(x.asInstanceOf[js.Any])
}
