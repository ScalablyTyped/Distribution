package typings.atFrctlFractal.atFrctlFractalMod.fractal.api.components

import org.scalablytyped.runtime.StringDictionary
import typings.atFrctlFractal.Anon_Handle
import typings.atFrctlFractal.atFrctlFractalMod.fractal.core.StatusInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentConfig extends js.Object {
  var default: js.UndefOr[ComponentDefaultConfig] = js.undefined
  @JSName("default.collated")
  var defaultDotcollated: js.UndefOr[Boolean] = js.undefined
  @JSName("default.collator")
  var defaultDotcollator: js.UndefOr[Collator] = js.undefined
  @JSName("default.context")
  var defaultDotcontext: js.UndefOr[js.Any] = js.undefined
  @JSName("default.display")
  var defaultDotdisplay: js.UndefOr[js.Any] = js.undefined
  @JSName("default.prefix")
  var defaultDotprefix: js.UndefOr[String] = js.undefined
  @JSName("default.preview")
  var defaultDotpreview: js.UndefOr[String] = js.undefined
  @JSName("default.status")
  var defaultDotstatus: js.UndefOr[String] = js.undefined
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
    defaultDotcollated: js.UndefOr[Boolean] = js.undefined,
    defaultDotcollator: (/* markup */ String, /* item */ Anon_Handle) => String = null,
    defaultDotcontext: js.Any = null,
    defaultDotdisplay: js.Any = null,
    defaultDotprefix: String = null,
    defaultDotpreview: String = null,
    defaultDotstatus: String = null,
    ext: String = null,
    label: String = null,
    path: String = null,
    statuses: StringDictionary[StatusInfo] = null,
    title: String = null,
    `yield`: String = null
  ): ComponentConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultDotcollated)) __obj.updateDynamic("default.collated")(defaultDotcollated.asInstanceOf[js.Any])
    if (defaultDotcollator != null) __obj.updateDynamic("default.collator")(js.Any.fromFunction2(defaultDotcollator))
    if (defaultDotcontext != null) __obj.updateDynamic("default.context")(defaultDotcontext.asInstanceOf[js.Any])
    if (defaultDotdisplay != null) __obj.updateDynamic("default.display")(defaultDotdisplay.asInstanceOf[js.Any])
    if (defaultDotprefix != null) __obj.updateDynamic("default.prefix")(defaultDotprefix.asInstanceOf[js.Any])
    if (defaultDotpreview != null) __obj.updateDynamic("default.preview")(defaultDotpreview.asInstanceOf[js.Any])
    if (defaultDotstatus != null) __obj.updateDynamic("default.status")(defaultDotstatus.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`yield` != null) __obj.updateDynamic("yield")(`yield`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
}

