package typings.firstMate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarOptions extends js.Object {
  var fileTypes: js.UndefOr[js.Array[String]] = js.undefined
  var firstLineMatch: js.UndefOr[Boolean] = js.undefined
  var foldingStopMarker: js.UndefOr[String] = js.undefined
  var injectionSelector: js.UndefOr[ScopeSelector] = js.undefined
  var injections: js.UndefOr[js.Object] = js.undefined
  var maxLineLength: js.UndefOr[Double] = js.undefined
  var maxTokensPerLine: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var patterns: js.UndefOr[js.Array[js.Object]] = js.undefined
  var repository: js.UndefOr[js.Object] = js.undefined
  var scopeName: js.UndefOr[String] = js.undefined
}

object GrammarOptions {
  @scala.inline
  def apply(
    fileTypes: js.Array[String] = null,
    firstLineMatch: js.UndefOr[Boolean] = js.undefined,
    foldingStopMarker: String = null,
    injectionSelector: ScopeSelector = null,
    injections: js.Object = null,
    maxLineLength: Int | Double = null,
    maxTokensPerLine: Int | Double = null,
    name: String = null,
    patterns: js.Array[js.Object] = null,
    repository: js.Object = null,
    scopeName: String = null
  ): GrammarOptions = {
    val __obj = js.Dynamic.literal()
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(firstLineMatch)) __obj.updateDynamic("firstLineMatch")(firstLineMatch.asInstanceOf[js.Any])
    if (foldingStopMarker != null) __obj.updateDynamic("foldingStopMarker")(foldingStopMarker.asInstanceOf[js.Any])
    if (injectionSelector != null) __obj.updateDynamic("injectionSelector")(injectionSelector.asInstanceOf[js.Any])
    if (injections != null) __obj.updateDynamic("injections")(injections.asInstanceOf[js.Any])
    if (maxLineLength != null) __obj.updateDynamic("maxLineLength")(maxLineLength.asInstanceOf[js.Any])
    if (maxTokensPerLine != null) __obj.updateDynamic("maxTokensPerLine")(maxTokensPerLine.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (patterns != null) __obj.updateDynamic("patterns")(patterns.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (scopeName != null) __obj.updateDynamic("scopeName")(scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarOptions]
  }
}

