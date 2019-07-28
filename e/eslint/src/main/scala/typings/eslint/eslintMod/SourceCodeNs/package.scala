package typings.eslint.eslintMod

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.Anon_Count
import typings.eslint.Anon_Filter
import typings.eslint.eslintMod.ASTNs.Token
import typings.estree.estreeMod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SourceCodeNs {
  type CursorWithCountOptions = Double | FilterPredicate | Anon_Count
  type CursorWithSkipOptions = Double | FilterPredicate | Anon_Filter
  type FilterPredicate = js.Function1[/* tokenOrComment */ Token | Comment, Boolean]
  type ParserServices = js.Any
  type VisitorKeys = StringDictionary[js.Array[String]]
}
