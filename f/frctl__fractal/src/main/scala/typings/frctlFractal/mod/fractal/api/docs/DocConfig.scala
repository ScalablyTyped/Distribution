package typings.frctlFractal.mod.fractal.api.docs

import org.scalablytyped.runtime.StringDictionary
import typings.frctlFractal.mod.fractal.core.StatusInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocConfig extends js.Object {
  var default: js.UndefOr[DocDefaultConfig] = js.undefined
  @JSName("default.context")
  var defaultDotcontext: js.UndefOr[js.Any] = js.undefined
  @JSName("default.prefix")
  var defaultDotprefix: js.UndefOr[String] = js.undefined
  @JSName("default.status")
  var defaultDotstatus: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[String] = js.undefined
  var indexLabel: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var markdown: js.UndefOr[Boolean | DocMarkdownConfig] = js.undefined
  @JSName("markdown.breaks")
  var markdownDotbreaks: js.UndefOr[Boolean] = js.undefined
  @JSName("markdown.gfm")
  var markdownDotgfm: js.UndefOr[Boolean] = js.undefined
  @JSName("markdown.pedantic")
  var markdownDotpedantic: js.UndefOr[Boolean] = js.undefined
  @JSName("markdown.sanitize")
  var markdownDotsanitize: js.UndefOr[Boolean] = js.undefined
  @JSName("markdown.smartLists")
  var markdownDotsmartLists: js.UndefOr[Boolean] = js.undefined
  @JSName("markdown.smartypants")
  var markdownDotsmartypants: js.UndefOr[Boolean] = js.undefined
  @JSName("markdown.tables")
  var markdownDottables: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DocConfig {
  @scala.inline
  def apply(
    default: DocDefaultConfig = null,
    defaultDotcontext: js.Any = null,
    defaultDotprefix: String = null,
    defaultDotstatus: String = null,
    ext: String = null,
    indexLabel: String = null,
    label: String = null,
    markdown: Boolean | DocMarkdownConfig = null,
    markdownDotbreaks: js.UndefOr[Boolean] = js.undefined,
    markdownDotgfm: js.UndefOr[Boolean] = js.undefined,
    markdownDotpedantic: js.UndefOr[Boolean] = js.undefined,
    markdownDotsanitize: js.UndefOr[Boolean] = js.undefined,
    markdownDotsmartLists: js.UndefOr[Boolean] = js.undefined,
    markdownDotsmartypants: js.UndefOr[Boolean] = js.undefined,
    markdownDottables: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    statuses: StringDictionary[StatusInfo] = null,
    title: String = null
  ): DocConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (defaultDotcontext != null) __obj.updateDynamic("default.context")(defaultDotcontext.asInstanceOf[js.Any])
    if (defaultDotprefix != null) __obj.updateDynamic("default.prefix")(defaultDotprefix.asInstanceOf[js.Any])
    if (defaultDotstatus != null) __obj.updateDynamic("default.status")(defaultDotstatus.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (indexLabel != null) __obj.updateDynamic("indexLabel")(indexLabel.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (markdown != null) __obj.updateDynamic("markdown")(markdown.asInstanceOf[js.Any])
    if (!js.isUndefined(markdownDotbreaks)) __obj.updateDynamic("markdown.breaks")(markdownDotbreaks.asInstanceOf[js.Any])
    if (!js.isUndefined(markdownDotgfm)) __obj.updateDynamic("markdown.gfm")(markdownDotgfm.asInstanceOf[js.Any])
    if (!js.isUndefined(markdownDotpedantic)) __obj.updateDynamic("markdown.pedantic")(markdownDotpedantic.asInstanceOf[js.Any])
    if (!js.isUndefined(markdownDotsanitize)) __obj.updateDynamic("markdown.sanitize")(markdownDotsanitize.asInstanceOf[js.Any])
    if (!js.isUndefined(markdownDotsmartLists)) __obj.updateDynamic("markdown.smartLists")(markdownDotsmartLists.asInstanceOf[js.Any])
    if (!js.isUndefined(markdownDotsmartypants)) __obj.updateDynamic("markdown.smartypants")(markdownDotsmartypants.asInstanceOf[js.Any])
    if (!js.isUndefined(markdownDottables)) __obj.updateDynamic("markdown.tables")(markdownDottables.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocConfig]
  }
}

