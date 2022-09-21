package typings.googleAppsScript.anon

import typings.googleAppsScript.googleAppsScriptStrings.eventHangout
import typings.googleAppsScript.googleAppsScriptStrings.eventNamedHangout
import typings.googleAppsScript.googleAppsScriptStrings.hangoutsMeet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: eventHangout | eventNamedHangout | hangoutsMeet
}
object Type {
  
  inline def apply(`type`: eventHangout | eventNamedHangout | hangoutsMeet): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: eventHangout | eventNamedHangout | hangoutsMeet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
