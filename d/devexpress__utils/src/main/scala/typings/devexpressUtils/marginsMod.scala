package typings.devexpressUtils

import typings.devexpressUtils.offsetsMod.Offsets
import typings.devexpressUtils.typesMod.ICloneable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/margins", JSImport.Namespace)
@js.native
object marginsMod extends js.Object {
  
  @js.native
  class Margins ()
    extends Offsets
       with ICloneable[Margins]
  /* static members */
  @js.native
  object Margins extends js.Object {
    
    def empty(): Margins = js.native
  }
}
