package typings.ethersprojectAbstractProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlockTag = java.lang.String | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String | js.Array[java.lang.String]]
    - typings.ethersprojectAbstractProvider.mod.EventFilter
    - typings.ethersprojectAbstractProvider.mod.ForkEvent
  */
  type EventType = typings.ethersprojectAbstractProvider.mod._EventType | (js.Array[java.lang.String | js.Array[java.lang.String]]) | java.lang.String
  
  type Listener = js.Function1[/* repeated */ js.Any, scala.Unit]
}
