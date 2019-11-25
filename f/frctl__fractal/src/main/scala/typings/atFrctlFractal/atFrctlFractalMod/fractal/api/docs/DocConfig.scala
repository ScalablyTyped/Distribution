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
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (`default.context` != null) __obj.updateDynamic("default.context")(`default.context`.asInstanceOf[js.Any])
    if (`default.prefix` != null) __obj.updateDynamic("default.prefix")(`default.prefix`.asInstanceOf[js.Any])
    if (`default.status` != null) __obj.updateDynamic("default.status")(`default.status`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (indexLabel != null) __obj.updateDynamic("indexLabel")(indexLabel.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (markdown != null) __obj.updateDynamic("markdown")(markdown.asInstanceOf[js.Any])
    if (!js.isUndefined(`markdown.breaks`)) __obj.updateDynamic("markdown.breaks")(`markdown.breaks`.asInstanceOf[js.Any])
    if (!js.isUndefined(`markdown.gfm`)) __obj.updateDynamic("markdown.gfm")(`markdown.gfm`.asInstanceOf[js.Any])
    if (!js.isUndefined(`markdown.pedantic`)) __obj.updateDynamic("markdown.pedantic")(`markdown.pedantic`.asInstanceOf[js.Any])
    if (!js.isUndefined(`markdown.sanitize`)) __obj.updateDynamic("markdown.sanitize")(`markdown.sanitize`.asInstanceOf[js.Any])
    if (!js.isUndefined(`markdown.smartLists`)) __obj.updateDynamic("markdown.smartLists")(`markdown.smartLists`.asInstanceOf[js.Any])
    if (!js.isUndefined(`markdown.smartypants`)) __obj.updateDynamic("markdown.smartypants")(`markdown.smartypants`.asInstanceOf[js.Any])
    if (!js.isUndefined(`markdown.tables`)) __obj.updateDynamic("markdown.tables")(`markdown.tables`.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocConfig]
  }
}

