package typings.firstDashMate.firstDashMateMod

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
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes)
    if (!js.isUndefined(firstLineMatch)) __obj.updateDynamic("firstLineMatch")(firstLineMatch)
    if (foldingStopMarker != null) __obj.updateDynamic("foldingStopMarker")(foldingStopMarker)
    if (injectionSelector != null) __obj.updateDynamic("injectionSelector")(injectionSelector)
    if (injections != null) __obj.updateDynamic("injections")(injections)
    if (maxLineLength != null) __obj.updateDynamic("maxLineLength")(maxLineLength.asInstanceOf[js.Any])
    if (maxTokensPerLine != null) __obj.updateDynamic("maxTokensPerLine")(maxTokensPerLine.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (patterns != null) __obj.updateDynamic("patterns")(patterns)
    if (repository != null) __obj.updateDynamic("repository")(repository)
    if (scopeName != null) __obj.updateDynamic("scopeName")(scopeName)
    __obj.asInstanceOf[GrammarOptions]
  }
}

