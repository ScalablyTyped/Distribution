package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client resource represents a client buyer&amp;mdash;an agency, a brand,
  * or an advertiser customer of the sponsor buyer. Users associated with the
  * client buyer have restricted access to the Marketplace and certain other
  * sections of the Authorized Buyers UI based on the role granted to the
  * client buyer. All fields are required unless otherwise specified.
  */
@js.native
trait Schema$Client extends js.Object {
  /**
    * The globally-unique numerical ID of the client. The value of this field
    * is ignored in create and update operations.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * Name used to represent this client to publishers. You may have multiple
    * clients that map to the same entity, but for each client the combination
    * of `clientName` and entity must be unique. You can specify this field as
    * empty.
    */
  var clientName: js.UndefOr[String] = js.native
  /**
    * Numerical identifier of the client entity. The entity can be an
    * advertiser, a brand, or an agency. This identifier is unique among all
    * the entities with the same type.  A list of all known advertisers with
    * their identifiers is available in the
    * [advertisers.txt](https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt)
    * file.  A list of all known brands with their identifiers is available in
    * the
    * [brands.txt](https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt)
    * file.  A list of all known agencies with their identifiers is available
    * in the
    * [agencies.txt](https://storage.googleapis.com/adx-rtb-dictionaries/agencies.txt)
    * file.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * The name of the entity. This field is automatically fetched based on the
    * type and ID. The value of this field is ignored in create and update
    * operations.
    */
  var entityName: js.UndefOr[String] = js.native
  /**
    * The type of the client entity: `ADVERTISER`, `BRAND`, or `AGENCY`.
    */
  var entityType: js.UndefOr[String] = js.native
  /**
    * Optional arbitrary unique identifier of this client buyer from the
    * standpoint of its Ad Exchange sponsor buyer.  This field can be used to
    * associate a client buyer with the identifier in the namespace of its
    * sponsor buyer, lookup client buyers by that identifier and verify whether
    * an Ad Exchange counterpart of a given client buyer already exists.  If
    * present, must be unique among all the client buyers for its Ad Exchange
    * sponsor buyer.
    */
  var partnerClientId: js.UndefOr[String] = js.native
  /**
    * The role which is assigned to the client buyer. Each role implies a set
    * of permissions granted to the client. Must be one of
    * `CLIENT_DEAL_VIEWER`, `CLIENT_DEAL_NEGOTIATOR` or `CLIENT_DEAL_APPROVER`.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * The status of the client buyer.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Whether the client buyer will be visible to sellers.
    */
  var visibleToSeller: js.UndefOr[Boolean] = js.native
}

object Schema$Client {
  @scala.inline
  def apply(
    clientAccountId: String = null,
    clientName: String = null,
    entityId: String = null,
    entityName: String = null,
    entityType: String = null,
    partnerClientId: String = null,
    role: String = null,
    status: String = null,
    visibleToSeller: js.UndefOr[Boolean] = js.undefined
  ): Schema$Client = {
    val __obj = js.Dynamic.literal()
    if (clientAccountId != null) __obj.updateDynamic("clientAccountId")(clientAccountId.asInstanceOf[js.Any])
    if (clientName != null) __obj.updateDynamic("clientName")(clientName.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (entityName != null) __obj.updateDynamic("entityName")(entityName.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (partnerClientId != null) __obj.updateDynamic("partnerClientId")(partnerClientId.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleToSeller)) __obj.updateDynamic("visibleToSeller")(visibleToSeller.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Client]
  }
}

