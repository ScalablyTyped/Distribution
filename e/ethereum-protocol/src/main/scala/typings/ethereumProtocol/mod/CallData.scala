package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallData extends CallTxDataBase {
  
  var from: js.UndefOr[String] = js.native
}
object CallData {
  
  @scala.inline
  def apply(): CallData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallData]
  }
  
  @scala.inline
  implicit class CallDataMutableBuilder[Self <: CallData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
  }
}
