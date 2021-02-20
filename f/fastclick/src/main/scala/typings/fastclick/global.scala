package typings.fastclick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("FastClick")
  @js.native
  class FastClick protected () extends FastClickObject {
    def this(layer: js.Any) = this()
    def this(layer: js.Any, options: FastClickOptions) = this()
  }
  @JSGlobal("FastClick")
  @js.native
  def FastClick: FastClickStatic = js.native
  @scala.inline
  def FastClick_=(x: FastClickStatic): Unit = js.Dynamic.global.updateDynamic("FastClick")(x.asInstanceOf[js.Any])
}
