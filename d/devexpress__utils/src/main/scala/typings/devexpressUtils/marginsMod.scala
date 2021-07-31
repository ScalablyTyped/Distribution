package typings.devexpressUtils

import typings.devexpressUtils.offsetsMod.Offsets
import typings.devexpressUtils.typesMod.ICloneable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marginsMod {
  
  @JSImport("@devexpress/utils/lib/geometry/margins", "Margins")
  @js.native
  class Margins protected ()
    extends Offsets
       with ICloneable[Margins] {
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  }
  /* static members */
  object Margins {
    
    @JSImport("@devexpress/utils/lib/geometry/margins", "Margins")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def empty(): Margins = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Margins]
  }
}
