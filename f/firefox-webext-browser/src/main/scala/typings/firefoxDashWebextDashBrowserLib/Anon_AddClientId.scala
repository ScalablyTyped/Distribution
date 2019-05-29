package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddClientId extends js.Object {
  /** True if the ping should contain the client id. */
  var addClientId: js.UndefOr[scala.Boolean] = js.undefined
  /** True if the ping should contain the environment data. */
  var addEnvironment: js.UndefOr[scala.Boolean] = js.undefined
  /** Set to override the environment data. */
  var overrideEnvironment: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** If true, send the ping using the PingSender. */
  var usePingSender: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AddClientId {
  @scala.inline
  def apply(
    addClientId: js.UndefOr[scala.Boolean] = js.undefined,
    addEnvironment: js.UndefOr[scala.Boolean] = js.undefined,
    overrideEnvironment: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    usePingSender: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AddClientId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addClientId)) __obj.updateDynamic("addClientId")(addClientId)
    if (!js.isUndefined(addEnvironment)) __obj.updateDynamic("addEnvironment")(addEnvironment)
    if (overrideEnvironment != null) __obj.updateDynamic("overrideEnvironment")(overrideEnvironment)
    if (!js.isUndefined(usePingSender)) __obj.updateDynamic("usePingSender")(usePingSender)
    __obj.asInstanceOf[Anon_AddClientId]
  }
}

