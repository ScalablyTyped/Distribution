package typings.ethereumProtocol.mod

import typings.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxDataPayable
  extends StObject
     with TxData {
  
  @JSName("value")
  var value_TxDataPayable: js.UndefOr[default] = js.undefined
}
object TxDataPayable {
  
  inline def apply(from: String): TxDataPayable = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxDataPayable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TxDataPayable] (val x: Self) extends AnyVal {
    
    inline def setValue(value: default): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
