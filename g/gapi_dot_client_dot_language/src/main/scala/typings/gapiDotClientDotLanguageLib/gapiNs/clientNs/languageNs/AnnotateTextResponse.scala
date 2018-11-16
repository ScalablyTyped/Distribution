package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnnotateTextResponse extends js.Object {
  /**
               * The overall sentiment for the document. Populated if the user enables
               * AnnotateTextRequest.Features.extract_document_sentiment.
               */
  var documentSentiment: js.UndefOr[Sentiment] = js.undefined
  /**
               * Entities, along with their semantic information, in the input document.
               * Populated if the user enables
               * AnnotateTextRequest.Features.extract_entities.
               */
  var entities: js.UndefOr[js.Array[Entity]] = js.undefined
  /**
               * The language of the text, which will be the same as the language specified
               * in the request or, if not specified, the automatically-detected language.
               * See Document.language field for more details.
               */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Sentences in the input document. Populated if the user enables
               * AnnotateTextRequest.Features.extract_syntax.
               */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.undefined
  /**
               * Tokens, along with their syntactic information, in the input document.
               * Populated if the user enables
               * AnnotateTextRequest.Features.extract_syntax.
               */
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
}

