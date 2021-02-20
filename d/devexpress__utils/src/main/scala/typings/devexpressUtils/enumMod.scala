package typings.devexpressUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumMod {
  
  @JSImport("@devexpress/utils/lib/utils/enum", "EnumUtils")
  @js.native
  class EnumUtils () extends StObject
  /* static members */
  object EnumUtils {
    
    @JSImport("@devexpress/utils/lib/utils/enum", "EnumUtils.forEach")
    @js.native
    def forEach(enumObject: Record[String, _], callback: js.Function1[/* value */ Double, Unit]): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/enum", "EnumUtils.isAnyOf")
    @js.native
    def isAnyOf(value: Double, params: Double*): Boolean = js.native
  }
}
