package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOverRequest extends StObject {
  
  /**
    * The skipList specifies location ranges that should be skipped on step over.
    */
  var skipList: js.UndefOr[js.Array[LocationRange]] = js.undefined
}
object StepOverRequest {
  
  inline def apply(): StepOverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOverRequest]
  }
  
  extension [Self <: StepOverRequest](x: Self) {
    
    inline def setSkipList(value: js.Array[LocationRange]): Self = StObject.set(x, "skipList", value.asInstanceOf[js.Any])
    
    inline def setSkipListUndefined: Self = StObject.set(x, "skipList", js.undefined)
    
    inline def setSkipListVarargs(value: LocationRange*): Self = StObject.set(x, "skipList", js.Array(value :_*))
  }
}
