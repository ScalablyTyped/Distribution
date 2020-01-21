package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hold extends js.Object {
  /**
    * If set, the hold applies to the enumerated accounts and org_unit must be
    * empty.
    */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.undefined
  /** The corpus to be searched. */
  var corpus: js.UndefOr[String] = js.undefined
  /** The unique immutable ID of the hold. Assigned during creation. */
  var holdId: js.UndefOr[String] = js.undefined
  /** The name of the hold. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * If set, the hold applies to all members of the organizational unit and
    * accounts must be empty. This property is mutable. For groups holds,
    * set the accounts field.
    */
  var orgUnit: js.UndefOr[HeldOrgUnit] = js.undefined
  /**
    * The corpus-specific query. If set, the corpusQuery must match corpus
    * type.
    */
  var query: js.UndefOr[CorpusQuery] = js.undefined
  /** The last time this hold was modified. */
  var updateTime: js.UndefOr[String] = js.undefined
}

object Hold {
  @scala.inline
  def apply(
    accounts: js.Array[HeldAccount] = null,
    corpus: String = null,
    holdId: String = null,
    name: String = null,
    orgUnit: HeldOrgUnit = null,
    query: CorpusQuery = null,
    updateTime: String = null
  ): Hold = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (corpus != null) __obj.updateDynamic("corpus")(corpus.asInstanceOf[js.Any])
    if (holdId != null) __obj.updateDynamic("holdId")(holdId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orgUnit != null) __obj.updateDynamic("orgUnit")(orgUnit.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hold]
  }
}

