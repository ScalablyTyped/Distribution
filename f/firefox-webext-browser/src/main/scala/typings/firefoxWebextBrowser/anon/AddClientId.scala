package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddClientId extends js.Object {
  /** True if the ping should contain the client id. */
  var addClientId: js.UndefOr[Boolean] = js.undefined
  /** True if the ping should contain the environment data. */
  var addEnvironment: js.UndefOr[Boolean] = js.undefined
  /** Set to override the environment data. */
  var overrideEnvironment: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** If true, send the ping using the PingSender. */
  var usePingSender: js.UndefOr[Boolean] = js.undefined
}

object AddClientId {
  @scala.inline
  def apply(
    addClientId: js.UndefOr[Boolean] = js.undefined,
    addEnvironment: js.UndefOr[Boolean] = js.undefined,
    overrideEnvironment: StringDictionary[js.Any] = null,
    usePingSender: js.UndefOr[Boolean] = js.undefined
  ): AddClientId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addClientId)) __obj.updateDynamic("addClientId")(addClientId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addEnvironment)) __obj.updateDynamic("addEnvironment")(addEnvironment.get.asInstanceOf[js.Any])
    if (overrideEnvironment != null) __obj.updateDynamic("overrideEnvironment")(overrideEnvironment.asInstanceOf[js.Any])
    if (!js.isUndefined(usePingSender)) __obj.updateDynamic("usePingSender")(usePingSender.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddClientId]
  }
}

