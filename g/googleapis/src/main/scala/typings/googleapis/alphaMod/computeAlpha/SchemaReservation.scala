package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reservation resource
  */
@js.native
trait SchemaReservation extends js.Object {
  /**
    * [OutputOnly] Full or partial url for parent commitment for reservations
    * which are tied to a commitment.
    */
  var commitment: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#reservations for
    * reservations.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the resource, provided by the client when initially creating
    * the resource. The resource name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * Reservation for instances with specific machine shapes.
    */
  var specificReservation: js.UndefOr[SchemaAllocationSpecificSKUReservation] = js.native
  /**
    * Indicates whether the reservation can be consumed by VMs with &quot;any
    * reservation&quot; defined. If the field is set, then only VMs that target
    * the reservation by name using --reservation-affinity can consume this
    * reservation.
    */
  var specificReservationRequired: js.UndefOr[Boolean] = js.native
  /**
    * Zone in which the reservation resides, must be provided if reservation is
    * created with commitment creation.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaReservation {
  @scala.inline
  def apply(
    commitment: String = null,
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    specificReservation: SchemaAllocationSpecificSKUReservation = null,
    specificReservationRequired: js.UndefOr[Boolean] = js.undefined,
    zone: String = null
  ): SchemaReservation = {
    val __obj = js.Dynamic.literal()
    if (commitment != null) __obj.updateDynamic("commitment")(commitment.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (specificReservation != null) __obj.updateDynamic("specificReservation")(specificReservation.asInstanceOf[js.Any])
    if (!js.isUndefined(specificReservationRequired)) __obj.updateDynamic("specificReservationRequired")(specificReservationRequired.get.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReservation]
  }
}

