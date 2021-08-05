package typings.glaze.anon

import typings.glaze.glazeStrings.Dot15s
import typings.glaze.glazeStrings.Dot1s
import typings.glaze.glazeStrings.Dot2s
import typings.glaze.glazeStrings.Dot3s
import typings.glaze.glazeStrings.Dot5s
import typings.glaze.glazeStrings.Dot7s
import typings.glaze.glazeStrings.`1s`
import typings.glaze.glazeStrings.`75ms`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1000ms` extends StObject {
  
  val `1000ms`: `1s`
  
  val `100ms`: Dot1s
  
  val `150ms`: Dot15s
  
  val `200ms`: Dot2s
  
  val `300ms`: Dot3s
  
  val `500ms`: Dot5s
  
  val `700ms`: Dot7s
  
  val `75ms`: typings.glaze.glazeStrings.`75ms`
}
object `1000ms` {
  
  inline def apply(): `1000ms` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1000ms")("1s")
    __obj.updateDynamic("100ms")(".1s")
    __obj.updateDynamic("150ms")(".15s")
    __obj.updateDynamic("200ms")(".2s")
    __obj.updateDynamic("300ms")(".3s")
    __obj.updateDynamic("500ms")(".5s")
    __obj.updateDynamic("700ms")(".7s")
    __obj.updateDynamic("75ms")("75ms")
    __obj.asInstanceOf[`1000ms`]
  }
  
  extension [Self <: `1000ms`](x: Self) {
    
    inline def set1000ms(value: `1s`): Self = StObject.set(x, "1000ms", value.asInstanceOf[js.Any])
    
    inline def set100ms(value: Dot1s): Self = StObject.set(x, "100ms", value.asInstanceOf[js.Any])
    
    inline def set150ms(value: Dot15s): Self = StObject.set(x, "150ms", value.asInstanceOf[js.Any])
    
    inline def set200ms(value: Dot2s): Self = StObject.set(x, "200ms", value.asInstanceOf[js.Any])
    
    inline def set300ms(value: Dot3s): Self = StObject.set(x, "300ms", value.asInstanceOf[js.Any])
    
    inline def set500ms(value: Dot5s): Self = StObject.set(x, "500ms", value.asInstanceOf[js.Any])
    
    inline def set700ms(value: Dot7s): Self = StObject.set(x, "700ms", value.asInstanceOf[js.Any])
    
    inline def set75ms(value: `75ms`): Self = StObject.set(x, "75ms", value.asInstanceOf[js.Any])
  }
}
