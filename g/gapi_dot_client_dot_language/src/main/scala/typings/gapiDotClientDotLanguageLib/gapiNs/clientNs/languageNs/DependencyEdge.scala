package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyEdge extends js.Object {
  /**
    * Represents the head of this token in the dependency tree.
    * This is the index of the token which has an arc going to this token.
    * The index is the position of the token in the array of tokens returned
    * by the API method. If this token is a root token, then the
    * `head_token_index` is its own index.
    */
  var headTokenIndex: js.UndefOr[scala.Double] = js.undefined
  /** The parse label for the token. */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object DependencyEdge {
  @scala.inline
  def apply(headTokenIndex: scala.Int | scala.Double = null, label: java.lang.String = null): DependencyEdge = {
    val __obj = js.Dynamic.literal()
    if (headTokenIndex != null) __obj.updateDynamic("headTokenIndex")(headTokenIndex.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[DependencyEdge]
  }
}

