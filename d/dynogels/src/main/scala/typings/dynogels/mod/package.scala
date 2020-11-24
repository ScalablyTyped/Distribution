package typings.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Document = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type DynogelsItemCallback = js.Function2[/* err */ typings.std.Error, /* data */ typings.dynogels.mod.Item, scala.Unit]
  
  type QueryFilterChain = typings.dynogels.mod.ExtendedChain[typings.dynogels.mod.Query]
  
  type QueryWhereChain = typings.dynogels.mod.BaseChain[typings.dynogels.mod.Query]
  
  type tableResolve = js.Function0[java.lang.String]
}
