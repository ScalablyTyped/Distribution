package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

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
  var corpus: js.UndefOr[java.lang.String] = js.undefined
  /** The unique immutable ID of the hold. Assigned during creation. */
  var holdId: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the hold. */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

