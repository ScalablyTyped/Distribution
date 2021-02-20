package typings.electron.Electron

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrashReport extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/crash-report
  var date: Date = js.native
  
  var id: String = js.native
}
object CrashReport {
  
  @scala.inline
  def apply(date: Date, id: String): CrashReport = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashReport]
  }
  
  @scala.inline
  implicit class CrashReportMutableBuilder[Self <: CrashReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
