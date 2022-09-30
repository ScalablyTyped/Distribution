package typings.glaze.anon

import typings.glaze.glazeDoubles.`1.25`
import typings.glaze.glazeDoubles.`1.375`
import typings.glaze.glazeDoubles.`1.5`
import typings.glaze.glazeDoubles.`1.625`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  val `1`: typings.glaze.glazeInts.`1`
  
  val base: `1.5`
  
  val loose: typings.glaze.glazeInts.`2`
  
  val relaxed: `1.625`
  
  val snug: `1.375`
  
  val tight: `1.25`
}
object Base {
  
  inline def apply(): Base = {
    val __obj = js.Dynamic.literal(base = 1.5d, loose = 2, relaxed = 1.625d, snug = 1.375d, tight = 1.25d)
    __obj.updateDynamic("1")(1)
    __obj.asInstanceOf[Base]
  }
  
  extension [Self <: Base](x: Self) {
    
    inline def set1(value: typings.glaze.glazeInts.`1`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def setBase(value: `1.5`): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setLoose(value: typings.glaze.glazeInts.`2`): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    inline def setRelaxed(value: `1.625`): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
    
    inline def setSnug(value: `1.375`): Self = StObject.set(x, "snug", value.asInstanceOf[js.Any])
    
    inline def setTight(value: `1.25`): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
  }
}
