package typings.electron.Electron

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrashReport extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/crash-report
  var date: Date
  
  var id: String
}
object CrashReport {
  
  inline def apply(date: Date, id: String): CrashReport = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashReport]
  }
  
  extension [Self <: CrashReport](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
