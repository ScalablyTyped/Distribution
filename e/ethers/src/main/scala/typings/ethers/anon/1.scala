package typings.ethers.anon

import typings.ethers.ethersStrings.getBlockNumber
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with PerformActionRequest {
  
  var method: getBlockNumber
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(method = "getBlockNumber")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: getBlockNumber): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
