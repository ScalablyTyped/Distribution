package typings.googleapis.buildSrcApisLanguageV1beta2Mod.language_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents dependency parse tree information for a token.
  */
@js.native
trait Schema$DependencyEdge extends js.Object {
  /**
    * Represents the head of this token in the dependency tree. This is the
    * index of the token which has an arc going to this token. The index is the
    * position of the token in the array of tokens returned by the API method.
    * If this token is a root token, then the `head_token_index` is its own
    * index.
    */
  var headTokenIndex: js.UndefOr[Double] = js.native
  /**
    * The parse label for the token.
    */
  var label: js.UndefOr[String] = js.native
}

object Schema$DependencyEdge {
  @scala.inline
  def apply(headTokenIndex: Int | Double = null, label: String = null): Schema$DependencyEdge = {
    val __obj = js.Dynamic.literal()
    if (headTokenIndex != null) __obj.updateDynamic("headTokenIndex")(headTokenIndex.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DependencyEdge]
  }
}

