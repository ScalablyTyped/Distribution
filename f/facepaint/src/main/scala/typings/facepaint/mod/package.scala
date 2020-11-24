package typings.facepaint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Arg = typings.facepaint.mod.BaseArg | js.Array[typings.facepaint.mod.BaseArg]
  
  type BaseArg = js.Object | js.Array[js.Object]
  
  type DynamicStyle = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]]
  
  type DynamicStyleFunction = js.Function1[
    /* repeated */ typings.facepaint.mod.Arg, 
    js.Array[typings.facepaint.mod.DynamicStyle]
  ]
  
  type Selector = java.lang.String
}
