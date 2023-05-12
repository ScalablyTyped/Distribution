package typings.ethers.anon

import typings.ethers.typesCryptoSignatureMod._SignatureLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R
  extends StObject
     with _SignatureLike {
  
  var r: String
  
  var s: String
  
  var v: BigNumberish
  
  var yParity: js.UndefOr[typings.ethers.ethersInts.`0` | typings.ethers.ethersInts.`1`] = js.undefined
  
  var yParityAndS: js.UndefOr[String] = js.undefined
}
object R {
  
  inline def apply(r: String, s: String, v: BigNumberish): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setV(value: BigNumberish): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setYParity(value: typings.ethers.ethersInts.`0` | typings.ethers.ethersInts.`1`): Self = StObject.set(x, "yParity", value.asInstanceOf[js.Any])
    
    inline def setYParityAndS(value: String): Self = StObject.set(x, "yParityAndS", value.asInstanceOf[js.Any])
    
    inline def setYParityAndSUndefined: Self = StObject.set(x, "yParityAndS", js.undefined)
    
    inline def setYParityUndefined: Self = StObject.set(x, "yParity", js.undefined)
  }
}
