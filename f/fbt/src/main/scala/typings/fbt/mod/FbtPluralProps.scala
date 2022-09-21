package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtPluralProps
  extends StObject
     with PluralOptions {
  
  var count: Double
}
object FbtPluralProps {
  
  inline def apply(count: Double): FbtPluralProps = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtPluralProps]
  }
  
  extension [Self <: FbtPluralProps](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
