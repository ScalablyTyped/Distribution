package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdbShellCommandEvent extends StObject {
  
  /**
    * Shell command that was issued over ADB via "adb shell command". Redacted to empty string on organization-owned managed profile devices.
    */
  var shellCmd: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdbShellCommandEvent {
  
  inline def apply(): SchemaAdbShellCommandEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdbShellCommandEvent]
  }
  
  extension [Self <: SchemaAdbShellCommandEvent](x: Self) {
    
    inline def setShellCmd(value: String): Self = StObject.set(x, "shellCmd", value.asInstanceOf[js.Any])
    
    inline def setShellCmdNull: Self = StObject.set(x, "shellCmd", null)
    
    inline def setShellCmdUndefined: Self = StObject.set(x, "shellCmd", js.undefined)
  }
}
