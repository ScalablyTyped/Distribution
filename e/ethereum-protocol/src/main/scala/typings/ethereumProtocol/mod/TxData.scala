package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxData
  extends StObject
     with CallTxDataBase {
  
  var from: String
}
object TxData {
  
  @scala.inline
  def apply(from: String): TxData = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxData]
  }
  
  @scala.inline
  implicit class TxDataMutableBuilder[Self <: TxData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
