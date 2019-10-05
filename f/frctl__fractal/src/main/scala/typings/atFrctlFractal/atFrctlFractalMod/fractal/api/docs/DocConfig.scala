package typings.atFrctlFractal.atFrctlFractalMod.fractal.api.docs

import org.scalablytyped.runtime.StringDictionary
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.StatusInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocConfig extends js.Object {
  var default: js.UndefOr[DocDefaultConfig] = js.undefined
  var `default.context`: js.UndefOr[js.Any] = js.undefined
  var `default.prefix`: js.UndefOr[String] = js.undefined
  var `default.status`: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[String] = js.undefined
  var indexLabel: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var markdown: js.UndefOr[Boolean | DocMarkdownConfig] = js.undefined
  var `markdown.breaks`: js.UndefOr[Boolean] = js.undefined
  var `markdown.gfm`: js.UndefOr[Boolean] = js.undefined
  var `markdown.pedantic`: js.UndefOr[Boolean] = js.undefined
  var `markdown.sanitize`: js.UndefOr[Boolean] = js.undefined
  var `markdown.smartLists`: js.UndefOr[Boolean] = js.undefined
  var `markdown.smartypants`: js.UndefOr[Boolean] = js.undefined
  var `markdown.tables`: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DocConfig {
  @scala.inline
  def apply(
    default: DocDefaultConfig = null,
    `default.context`: js.Any = null,
    `default.prefix`: String = null,
    `default.status`: String = null,
    ext: String = null,
    indexLabel: String = null,
    label: String = null,
    markdown: Boolean | DocMarkdownConfig = null,
    `markdown.breaks`: js.UndefOr[Boolean] = js.undefined,
    `markdown.gfm`: js.UndefOr[Boolean] = js.undefined,
    `markdown.pedantic`: js.UndefOr[Boolean] = js.undefined,
    `markdown.sanitize`: js.UndefOr[Boolean] = js.undefined,
    `markdown.smartLists`: js.UndefOr[Boolean] = js.undefined,
    `markdown.smartypants`: js.UndefOr[Boolean] = js.undefined,
    `markdown.tables`: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    statuses: StringDictionary[StatusInfo] = null,
    title: String = null
  ): DocConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (`default.context` != null) __obj.updateDynamic("default.context")(`default.context`)
    if (`default.prefix` != null) __obj.updateDynamic("default.prefix")(`default.prefix`)
    if (`default.status` != null) __obj.updateDynamic("default.status")(`default.status`)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (indexLabel != null) __obj.updateDynamic("indexLabel")(indexLabel)
    if (label != null) __obj.updateDynamic("label")(label)
    if (markdown != null) __obj.updateDynamic("markdown")(markdown.asInstanceOf[js.Any])
    if (!js.isUndefined(`markdown.breaks`)) __obj.updateDynamic("markdown.breaks")(`markdown.breaks`)
    if (!js.isUndefined(`markdown.gfm`)) __obj.updateDynamic("markdown.gfm")(`markdown.gfm`)
    if (!js.isUndefined(`markdown.pedantic`)) __obj.updateDynamic("markdown.pedantic")(`markdown.pedantic`)
    if (!js.isUndefined(`markdown.sanitize`)) __obj.updateDynamic("markdown.sanitize")(`markdown.sanitize`)
    if (!js.isUndefined(`markdown.smartLists`)) __obj.updateDynamic("markdown.smartLists")(`markdown.smartLists`)
    if (!js.isUndefined(`markdown.smartypants`)) __obj.updateDynamic("markdown.smartypants")(`markdown.smartypants`)
    if (!js.isUndefined(`markdown.tables`)) __obj.updateDynamic("markdown.tables")(`markdown.tables`)
    if (path != null) __obj.updateDynamic("path")(path)
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DocConfig]
  }
}

