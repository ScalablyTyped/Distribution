package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.error
import typings.fundamentalReact.fundamentalReactStrings.information
import typings.fundamentalReact.fundamentalReactStrings.success
import typings.fundamentalReact.fundamentalReactStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var state: js.UndefOr[error | warning | information | success] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object State {
  
  @scala.inline
  def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: error | warning | information | success): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
