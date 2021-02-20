package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CounterLabel extends StObject {
  
  var counterLabel: js.UndefOr[String] = js.native
}
object CounterLabel {
  
  @scala.inline
  def apply(): CounterLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterLabel]
  }
  
  @scala.inline
  implicit class CounterLabelMutableBuilder[Self <: CounterLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounterLabel(value: String): Self = StObject.set(x, "counterLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterLabelUndefined: Self = StObject.set(x, "counterLabel", js.undefined)
  }
}
