package typings.devexpressUtils

import typings.devexpressUtils.offsetsMod.Offsets
import typings.devexpressUtils.typesMod.ICloneable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/paddings", JSImport.Namespace)
@js.native
object paddingsMod extends js.Object {
  
  @js.native
  class Paddings ()
    extends Offsets
       with ICloneable[Paddings]
  /* static members */
  @js.native
  object Paddings extends js.Object {
    
    def empty(): Paddings = js.native
  }
}
