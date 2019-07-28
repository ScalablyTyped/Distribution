package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStrategy extends js.Object {
  /** Account ID of this placement strategy.This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /** ID of this placement strategy. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementStrategy". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of this placement strategy. This is a required field. It must be less than 256 characters long and unique among placement strategies of the same
    * account.
    */
  var name: js.UndefOr[String] = js.undefined
}

object PlacementStrategy {
  @scala.inline
  def apply(accountId: String = null, id: String = null, kind: String = null, name: String = null): PlacementStrategy = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PlacementStrategy]
  }
}

