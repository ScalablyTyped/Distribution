package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterLabel extends StObject {
  
  var counterLabel: js.UndefOr[String] = js.undefined
}
object CounterLabel {
  
  inline def apply(): CounterLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CounterLabel] (val x: Self) extends AnyVal {
    
    inline def setCounterLabel(value: String): Self = StObject.set(x, "counterLabel", value.asInstanceOf[js.Any])
    
    inline def setCounterLabelUndefined: Self = StObject.set(x, "counterLabel", js.undefined)
  }
}
