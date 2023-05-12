package typings.ethers.anon

import typings.ethers.ethersStrings.`drop-block`
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number
  extends StObject
     with OrphanFilter {
  
  var hash: String
  
  var number: Double
  
  var orphan: `drop-block`
}
object Number {
  
  inline def apply(hash: String, number: Double): Number = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], orphan = "drop-block")
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrphan(value: `drop-block`): Self = StObject.set(x, "orphan", value.asInstanceOf[js.Any])
  }
}
