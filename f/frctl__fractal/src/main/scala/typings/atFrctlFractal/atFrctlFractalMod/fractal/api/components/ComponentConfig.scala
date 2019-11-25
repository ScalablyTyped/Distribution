package typings.atFrctlFractal.atFrctlFractalMod.fractal.api.components

import org.scalablytyped.runtime.StringDictionary
import typings.atFrctlFractal.Anon_Handle
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.StatusInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfig extends js.Object {
  var default: js.UndefOr[ComponentDefaultConfig] = js.undefined
  var `default.collated`: js.UndefOr[Boolean] = js.undefined
  var `default.collator`: js.UndefOr[Collator] = js.undefined
  var `default.context`: js.UndefOr[js.Any] = js.undefined
  var `default.display`: js.UndefOr[js.Any] = js.undefined
  var `default.prefix`: js.UndefOr[String] = js.undefined
  var `default.preview`: js.UndefOr[String] = js.undefined
  var `default.status`: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `yield`: js.UndefOr[String] = js.undefined
}

object ComponentConfig {
  @scala.inline
  def apply(
    default: ComponentDefaultConfig = null,
    `default.collated`: js.UndefOr[Boolean] = js.undefined,
    `default.collator`: (/* markup */ String, /* item */ Anon_Handle) => String = null,
    `default.context`: js.Any = null,
    `default.display`: js.Any = null,
    `default.prefix`: String = null,
    `default.preview`: String = null,
    `default.status`: String = null,
    ext: String = null,
    label: String = null,
    path: String = null,
    statuses: StringDictionary[StatusInfo] = null,
    title: String = null,
    `yield`: String = null
  ): ComponentConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(`default.collated`)) __obj.updateDynamic("default.collated")(`default.collated`.asInstanceOf[js.Any])
    if (`default.collator` != null) __obj.updateDynamic("default.collator")(js.Any.fromFunction2(`default.collator`))
    if (`default.context` != null) __obj.updateDynamic("default.context")(`default.context`.asInstanceOf[js.Any])
    if (`default.display` != null) __obj.updateDynamic("default.display")(`default.display`.asInstanceOf[js.Any])
    if (`default.prefix` != null) __obj.updateDynamic("default.prefix")(`default.prefix`.asInstanceOf[js.Any])
    if (`default.preview` != null) __obj.updateDynamic("default.preview")(`default.preview`.asInstanceOf[js.Any])
    if (`default.status` != null) __obj.updateDynamic("default.status")(`default.status`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`yield` != null) __obj.updateDynamic("yield")(`yield`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
}

