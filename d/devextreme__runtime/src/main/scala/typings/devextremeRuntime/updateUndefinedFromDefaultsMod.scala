package typings.devextremeRuntime

import typings.devextremeRuntime.anon.CurrentValue
import typings.devextremeRuntime.anon.Key
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateUndefinedFromDefaultsMod {
  
  @JSImport("@devextreme/runtime/cjs/angular/update-undefined-from-defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateUndefinedFromDefaults(
    componentInstance: Record[String, Any],
    changes: Record[String, CurrentValue],
    defaultEntries: DefaultEntries
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateUndefinedFromDefaults")(componentInstance.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], defaultEntries.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DefaultEntries = js.Array[Key]
}
