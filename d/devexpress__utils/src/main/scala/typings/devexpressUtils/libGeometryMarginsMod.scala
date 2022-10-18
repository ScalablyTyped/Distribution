package typings.devexpressUtils

import typings.devexpressUtils.libGeometryOffsetsMod.Offsets
import typings.devexpressUtils.libTypesMod.ICloneable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryMarginsMod {
  
  @JSImport("@devexpress/utils/lib/geometry/margins", "Margins")
  @js.native
  open class Margins protected ()
    extends Offsets
       with ICloneable[Margins] {
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  }
  /* static members */
  object Margins {
    
    @JSImport("@devexpress/utils/lib/geometry/margins", "Margins")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): Margins = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Margins]
  }
}
