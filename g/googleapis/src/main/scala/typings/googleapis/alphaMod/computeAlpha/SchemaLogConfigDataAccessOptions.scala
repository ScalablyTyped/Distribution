package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Write a Data Access (Gin) log
  */
trait SchemaLogConfigDataAccessOptions extends StObject {
  
  /**
    * Whether Gin logging should happen in a fail-closed manner at the caller.
    * This is relevant only in the LocalIAM implementation, for now.  NOTE:
    * Logging to Gin in a fail-closed manner is currently unsupported while
    * work is being done to satisfy the requirements of go/345. Currently,
    * setting LOG_FAIL_CLOSED mode will have no effect, but still exists
    * because there is active work being done to support it (b/115874152).
    */
  var logMode: js.UndefOr[String] = js.undefined
}
object SchemaLogConfigDataAccessOptions {
  
  @scala.inline
  def apply(): SchemaLogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigDataAccessOptions]
  }
  
  @scala.inline
  implicit class SchemaLogConfigDataAccessOptionsMutableBuilder[Self <: SchemaLogConfigDataAccessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogMode(value: String): Self = StObject.set(x, "logMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogModeUndefined: Self = StObject.set(x, "logMode", js.undefined)
  }
}
