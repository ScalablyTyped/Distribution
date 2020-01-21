package typings.eslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SourceCode {
  type CursorWithCountOptions = scala.Double | typings.eslint.mod.SourceCode.FilterPredicate | typings.eslint.AnonCount
  type CursorWithSkipOptions = scala.Double | typings.eslint.mod.SourceCode.FilterPredicate | typings.eslint.AnonFilter
  type FilterPredicate = js.Function1[
    /* tokenOrComment */ typings.eslint.mod.AST.Token | typings.estree.mod.Comment, 
    scala.Boolean
  ]
  type ParserServices = js.Any
  type VisitorKeys = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}
