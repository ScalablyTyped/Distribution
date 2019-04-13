package typings
package dynogelsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynogelsMod {
  type Document = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DynogelsItemCallback = js.Function2[/* err */ stdLib.Error, /* data */ Item, scala.Unit]
  type QueryFilterChain = ExtendedChain[Query]
  type QueryWhereChain = BaseChain[Query]
  type tableResolve = js.Function0[java.lang.String]
}
