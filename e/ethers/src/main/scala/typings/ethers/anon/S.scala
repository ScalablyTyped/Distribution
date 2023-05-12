package typings.ethers.anon

import typings.ethers.typesCryptoSignatureMod._SignatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S
  extends StObject
     with _SignatureLike {
  
  var r: String
  
  var s: js.UndefOr[String] = js.undefined
  
  var v: js.UndefOr[Double] = js.undefined
  
  var yParity: js.UndefOr[typings.ethers.ethersInts.`0` | typings.ethers.ethersInts.`1`] = js.undefined
  
  var yParityAndS: String
}
object S {
  
  inline def apply(r: String, yParityAndS: String): S = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], yParityAndS = yParityAndS.asInstanceOf[js.Any])
    __obj.asInstanceOf[S]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S] (val x: Self) extends AnyVal {
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    
    inline def setYParity(value: typings.ethers.ethersInts.`0` | typings.ethers.ethersInts.`1`): Self = StObject.set(x, "yParity", value.asInstanceOf[js.Any])
    
    inline def setYParityAndS(value: String): Self = StObject.set(x, "yParityAndS", value.asInstanceOf[js.Any])
    
    inline def setYParityUndefined: Self = StObject.set(x, "yParity", js.undefined)
  }
}
