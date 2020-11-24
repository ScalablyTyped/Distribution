package typings.devexpressUtils

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/enum", JSImport.Namespace)
@js.native
object enumMod extends js.Object {
  
  @js.native
  class EnumUtils () extends js.Object
  /* static members */
  @js.native
  object EnumUtils extends js.Object {
    
    def forEach(enumObject: Record[String, _], callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
    
    def isAnyOf(value: Double, params: Double*): Boolean = js.native
  }
}
