package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnalyzeEntitySentimentResponse extends js.Object {
  /** The recognized entities in the input document with associated sentiments. */
  var entities: js.UndefOr[js.Array[Entity]] = js.undefined
  /**
               * The language of the text, which will be the same as the language specified
               * in the request or, if not specified, the automatically-detected language.
               * See Document.language field for more details.
               */
  var language: js.UndefOr[java.lang.String] = js.undefined
}

