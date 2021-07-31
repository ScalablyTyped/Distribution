package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepIntoRequest extends StObject {
  
  /**
    * Debugger will pause on the execution of the first async task which was scheduled
    * before next pause.
    */
  var breakOnAsyncCall: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The skipList specifies location ranges that should be skipped on step into.
    */
  var skipList: js.UndefOr[js.Array[LocationRange]] = js.undefined
}
object StepIntoRequest {
  
  @scala.inline
  def apply(): StepIntoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepIntoRequest]
  }
  
  @scala.inline
  implicit class StepIntoRequestMutableBuilder[Self <: StepIntoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakOnAsyncCall(value: Boolean): Self = StObject.set(x, "breakOnAsyncCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakOnAsyncCallUndefined: Self = StObject.set(x, "breakOnAsyncCall", js.undefined)
    
    @scala.inline
    def setSkipList(value: js.Array[LocationRange]): Self = StObject.set(x, "skipList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipListUndefined: Self = StObject.set(x, "skipList", js.undefined)
    
    @scala.inline
    def setSkipListVarargs(value: LocationRange*): Self = StObject.set(x, "skipList", js.Array(value :_*))
  }
}
