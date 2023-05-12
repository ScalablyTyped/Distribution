package typings.forgeApis.anon

import typings.forgeApis.forgeApisInts.`200`
import typings.forgeApis.forgeApisStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: `200`
  
  var statusText: OK
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal(status = 200, statusText = "OK")
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: `200`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: OK): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
