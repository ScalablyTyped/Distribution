package typings.eventemitter2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventAndListener = js.Function2[
    /* event */ java.lang.String | js.Array[java.lang.String], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  
  type ListenerFn = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type WaitForFilter = js.Function1[/* repeated */ js.Any, scala.Boolean]
  
  type event = js.Symbol | java.lang.String
  
  type eventNS = java.lang.String | js.Array[typings.eventemitter2.mod.event]
}
