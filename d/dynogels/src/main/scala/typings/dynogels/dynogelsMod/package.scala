package typings.dynogels

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynogelsMod {
  type Document = StringDictionary[js.Any]
  type DynogelsItemCallback = js.Function2[/* err */ Error, /* data */ Item, Unit]
  type QueryFilterChain = ExtendedChain[Query]
  type QueryWhereChain = BaseChain[Query]
  type tableResolve = js.Function0[String]
}
