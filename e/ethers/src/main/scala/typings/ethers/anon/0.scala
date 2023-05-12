package typings.ethers.anon

import typings.ethers.ethersStrings.chainId
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with PerformActionRequest {
  
  var method: chainId
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(method = "chainId")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: chainId): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
