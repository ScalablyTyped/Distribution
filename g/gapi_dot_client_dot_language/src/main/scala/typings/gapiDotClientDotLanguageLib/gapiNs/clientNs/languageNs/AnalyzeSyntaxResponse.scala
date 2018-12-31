package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzeSyntaxResponse extends js.Object {
  /**
    * The language of the text, which will be the same as the language specified
    * in the request or, if not specified, the automatically-detected language.
    * See Document.language field for more details.
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** Sentences in the input document. */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.undefined
  /** Tokens, along with their syntactic information, in the input document. */
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
}

