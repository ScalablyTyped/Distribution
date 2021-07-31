package typings.devexpressUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumMod {
  
  @JSImport("@devexpress/utils/lib/utils/enum", "EnumUtils")
  @js.native
  class EnumUtils () extends StObject
  /* static members */
  object EnumUtils {
    
    @JSImport("@devexpress/utils/lib/utils/enum", "EnumUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def forEach(enumObject: Record[String, js.Any], callback: js.Function1[/* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(enumObject.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def isAnyOf(value: Double, params: Double*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAnyOf")(value.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
