package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the smallest syntactic building block of the text.
  */
@js.native
trait Schema$Token extends js.Object {
  /**
    * Dependency tree parse for this token.
    */
  var dependencyEdge: js.UndefOr[Schema$DependencyEdge] = js.native
  /**
    * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the
    * token.
    */
  var lemma: js.UndefOr[String] = js.native
  /**
    * Parts of speech tag for this token.
    */
  var partOfSpeech: js.UndefOr[Schema$PartOfSpeech] = js.native
  /**
    * The token text.
    */
  var text: js.UndefOr[Schema$TextSpan] = js.native
}

object Schema$Token {
  @scala.inline
  def apply(
    dependencyEdge: Schema$DependencyEdge = null,
    lemma: String = null,
    partOfSpeech: Schema$PartOfSpeech = null,
    text: Schema$TextSpan = null
  ): Schema$Token = {
    val __obj = js.Dynamic.literal()
    if (dependencyEdge != null) __obj.updateDynamic("dependencyEdge")(dependencyEdge.asInstanceOf[js.Any])
    if (lemma != null) __obj.updateDynamic("lemma")(lemma.asInstanceOf[js.Any])
    if (partOfSpeech != null) __obj.updateDynamic("partOfSpeech")(partOfSpeech.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Token]
  }
}

