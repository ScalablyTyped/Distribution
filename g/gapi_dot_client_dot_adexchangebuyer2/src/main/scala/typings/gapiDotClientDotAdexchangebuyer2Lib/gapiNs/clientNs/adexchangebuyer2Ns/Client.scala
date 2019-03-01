package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  /**
    * The globally-unique numerical ID of the client.
    * The value of this field is ignored in create and update operations.
    */
  var clientAccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name used to represent this client to publishers.
    * You may have multiple clients that map to the same entity,
    * but for each client the combination of `clientName` and entity
    * must be unique.
    * You can specify this field as empty.
    */
  var clientName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Numerical identifier of the client entity.
    * The entity can be an advertiser, a brand, or an agency.
    * This identifier is unique among all the entities with the same type.
    *
    * A list of all known advertisers with their identifiers is available in the
    * [advertisers.txt](https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt)
    * file.
    *
    * A list of all known brands with their identifiers is available in the
    * [brands.txt](https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt)
    * file.
    *
    * A list of all known agencies with their identifiers is available in the
    * [agencies.txt](https://storage.googleapis.com/adx-rtb-dictionaries/agencies.txt)
    * file.
    */
  var entityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the entity. This field is automatically fetched based on
    * the type and ID.
    * The value of this field is ignored in create and update operations.
    */
  var entityName: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the client entity: `ADVERTISER`, `BRAND`, or `AGENCY`. */
  var entityType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The role which is assigned to the client buyer. Each role implies a set of
    * permissions granted to the client. Must be one of `CLIENT_DEAL_VIEWER`,
    * `CLIENT_DEAL_NEGOTIATOR` or `CLIENT_DEAL_APPROVER`.
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** The status of the client buyer. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the client buyer will be visible to sellers. */
  var visibleToSeller: js.UndefOr[scala.Boolean] = js.undefined
}

object Client {
  @scala.inline
  def apply(
    clientAccountId: java.lang.String = null,
    clientName: java.lang.String = null,
    entityId: java.lang.String = null,
    entityName: java.lang.String = null,
    entityType: java.lang.String = null,
    role: java.lang.String = null,
    status: java.lang.String = null,
    visibleToSeller: js.UndefOr[scala.Boolean] = js.undefined
  ): Client = {
    val __obj = js.Dynamic.literal()
    if (clientAccountId != null) __obj.updateDynamic("clientAccountId")(clientAccountId)
    if (clientName != null) __obj.updateDynamic("clientName")(clientName)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (entityName != null) __obj.updateDynamic("entityName")(entityName)
    if (entityType != null) __obj.updateDynamic("entityType")(entityType)
    if (role != null) __obj.updateDynamic("role")(role)
    if (status != null) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(visibleToSeller)) __obj.updateDynamic("visibleToSeller")(visibleToSeller)
    __obj.asInstanceOf[Client]
  }
}

