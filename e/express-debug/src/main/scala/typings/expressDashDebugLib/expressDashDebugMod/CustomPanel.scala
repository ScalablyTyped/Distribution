package typings
package expressDashDebugLib.expressDashDebugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomPanel extends js.Object {
  @JSName("finalize")
  var finalize_FCustomPanel: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit]] = js.undefined
  var initialize: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit]] = js.undefined
  var name: java.lang.String
  var options: js.UndefOr[js.Any] = js.undefined
  var post_render: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit]] = js.undefined
  var pre_render: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Unit]] = js.undefined
  var standalone: js.UndefOr[scala.Boolean] = js.undefined
  var template: java.lang.String
  def process(locals: js.Any): js.Any
}

