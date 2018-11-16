package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Token extends js.Object {
  /** Dependency tree parse for this token. */
  var dependencyEdge: js.UndefOr[DependencyEdge] = js.undefined
  /** [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[java.lang.String] = js.undefined
  /** Parts of speech tag for this token. */
  var partOfSpeech: js.UndefOr[PartOfSpeech] = js.undefined
  /** The token text. */
  var text: js.UndefOr[TextSpan] = js.undefined
}

