package typings.fixedDataTable2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ElementOrFunc[P] = java.lang.String | typings.react.mod.ReactElement | (js.Function1[/* props */ P, java.lang.String | typings.react.mod.ReactElement])
  
  type TableRowEventHandler = js.Function2[
    /* event */ typings.react.mod.SyntheticEvent[typings.fixedDataTable2.mod.Table, typings.std.Event], 
    /* rowIndex */ scala.Double, 
    scala.Unit
  ]
}
