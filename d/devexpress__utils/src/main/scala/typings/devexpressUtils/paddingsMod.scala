package typings.devexpressUtils

import typings.devexpressUtils.offsetsMod.Offsets
import typings.devexpressUtils.typesMod.ICloneable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paddingsMod {
  
  @JSImport("@devexpress/utils/lib/geometry/paddings", "Paddings")
  @js.native
  open class Paddings protected ()
    extends Offsets
       with ICloneable[Paddings] {
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  }
  /* static members */
  object Paddings {
    
    @JSImport("@devexpress/utils/lib/geometry/paddings", "Paddings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): Paddings = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Paddings]
  }
}
