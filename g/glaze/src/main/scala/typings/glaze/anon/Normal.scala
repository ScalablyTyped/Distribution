package typings.glaze.anon

import typings.glaze.glazeStrings.Dot025em
import typings.glaze.glazeStrings.Dot05em
import typings.glaze.glazeStrings.Dot1em
import typings.glaze.glazeStrings.`-0Dot025em`
import typings.glaze.glazeStrings.`-0Dot05em`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Normal extends StObject {
  
  val normal: typings.glaze.glazeInts.`0`
  
  val tight: `-0Dot025em`
  
  val tighter: `-0Dot05em`
  
  val wide: Dot025em
  
  val wider: Dot05em
  
  val widest: Dot1em
}
object Normal {
  
  inline def apply(): Normal = {
    val __obj = js.Dynamic.literal(normal = 0, tight = "-0.025em", tighter = "-0.05em", wide = ".025em", wider = ".05em", widest = ".1em")
    __obj.asInstanceOf[Normal]
  }
  
  extension [Self <: Normal](x: Self) {
    
    inline def setNormal(value: typings.glaze.glazeInts.`0`): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setTight(value: `-0Dot025em`): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
    
    inline def setTighter(value: `-0Dot05em`): Self = StObject.set(x, "tighter", value.asInstanceOf[js.Any])
    
    inline def setWide(value: Dot025em): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
    
    inline def setWider(value: Dot05em): Self = StObject.set(x, "wider", value.asInstanceOf[js.Any])
    
    inline def setWidest(value: Dot1em): Self = StObject.set(x, "widest", value.asInstanceOf[js.Any])
  }
}
