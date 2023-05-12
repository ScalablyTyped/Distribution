package typings.ethers.anon

import typings.ethers.typesCryptoSignatureMod._SignatureLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V
  extends StObject
     with _SignatureLike {
  
  var r: String
  
  var s: String
  
  var v: js.UndefOr[BigNumberish] = js.undefined
  
  var yParity: typings.ethers.ethersInts.`0` | typings.ethers.ethersInts.`1`
  
  var yParityAndS: js.UndefOr[String] = js.undefined
}
object V {
  
  inline def apply(r: String, s: String, yParity: typings.ethers.ethersInts.`0` | typings.ethers.ethersInts.`1`): V = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], yParity = yParity.asInstanceOf[js.Any])
    __obj.asInstanceOf[V]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V] (val x: Self) extends AnyVal {
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setV(value: BigNumberish): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    
    inline def setYParity(value: typings.ethers.ethersInts.`0` | typings.ethers.ethersInts.`1`): Self = StObject.set(x, "yParity", value.asInstanceOf[js.Any])
    
    inline def setYParityAndS(value: String): Self = StObject.set(x, "yParityAndS", value.asInstanceOf[js.Any])
    
    inline def setYParityAndSUndefined: Self = StObject.set(x, "yParityAndS", js.undefined)
  }
}
