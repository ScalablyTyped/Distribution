package typings.gapiDotClientDotLanguage.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /** Dependency tree parse for this token. */
  var dependencyEdge: js.UndefOr[DependencyEdge] = js.undefined
  /** [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[String] = js.undefined
  /** Parts of speech tag for this token. */
  var partOfSpeech: js.UndefOr[PartOfSpeech] = js.undefined
  /** The token text. */
  var text: js.UndefOr[TextSpan] = js.undefined
}

object Token {
  @scala.inline
  def apply(
    dependencyEdge: DependencyEdge = null,
    lemma: String = null,
    partOfSpeech: PartOfSpeech = null,
    text: TextSpan = null
  ): Token = {
    val __obj = js.Dynamic.literal()
    if (dependencyEdge != null) __obj.updateDynamic("dependencyEdge")(dependencyEdge)
    if (lemma != null) __obj.updateDynamic("lemma")(lemma)
    if (partOfSpeech != null) __obj.updateDynamic("partOfSpeech")(partOfSpeech)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Token]
  }
}

