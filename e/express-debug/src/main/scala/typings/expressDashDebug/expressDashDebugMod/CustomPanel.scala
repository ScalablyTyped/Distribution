package typings.expressDashDebug.expressDashDebugMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPanel extends js.Object {
  @JSName("finalize")
  var finalize_FCustomPanel: js.UndefOr[js.Function1[/* req */ Request, Unit]] = js.undefined
  var initialize: js.UndefOr[js.Function1[/* req */ Request, Unit]] = js.undefined
  var name: String
  var options: js.UndefOr[js.Any] = js.undefined
  var post_render: js.UndefOr[js.Function1[/* req */ Request, Unit]] = js.undefined
  var pre_render: js.UndefOr[js.Function1[/* req */ Request, Unit]] = js.undefined
  var standalone: js.UndefOr[Boolean] = js.undefined
  var template: String
  def process(locals: js.Any): js.Any
}

object CustomPanel {
  @scala.inline
  def apply(
    name: String,
    process: js.Any => js.Any,
    template: String,
    finalize: /* req */ Request => Unit = null,
    initialize: /* req */ Request => Unit = null,
    options: js.Any = null,
    post_render: /* req */ Request => Unit = null,
    pre_render: /* req */ Request => Unit = null,
    standalone: js.UndefOr[Boolean] = js.undefined
  ): CustomPanel = {
    val __obj = js.Dynamic.literal(name = name, process = js.Any.fromFunction1(process), template = template)
    if (finalize != null) __obj.updateDynamic("finalize")(js.Any.fromFunction1(finalize))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (options != null) __obj.updateDynamic("options")(options)
    if (post_render != null) __obj.updateDynamic("post_render")(js.Any.fromFunction1(post_render))
    if (pre_render != null) __obj.updateDynamic("pre_render")(js.Any.fromFunction1(pre_render))
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    __obj.asInstanceOf[CustomPanel]
  }
}

