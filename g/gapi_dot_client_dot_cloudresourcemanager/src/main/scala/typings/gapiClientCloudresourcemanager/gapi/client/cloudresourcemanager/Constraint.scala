package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  /** Defines this constraint as being a BooleanConstraint. */
  var booleanConstraint: js.UndefOr[js.Any] = js.undefined
  /** The evaluation behavior of this constraint in the absense of 'Policy'. */
  var constraintDefault: js.UndefOr[String] = js.undefined
  /**
    * Detailed description of what this `Constraint` controls as well as how and
    * where it is enforced.
    *
    * Mutable.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The human readable name.
    *
    * Mutable.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /** Defines this constraint as being a ListConstraint. */
  var listConstraint: js.UndefOr[ListConstraint] = js.undefined
  /**
    * Immutable value, required to globally be unique. For example,
    * `constraints/serviceuser.services`
    */
  var name: js.UndefOr[String] = js.undefined
  /** Version of the `Constraint`. Default version is 0; */
  var version: js.UndefOr[Double] = js.undefined
}

object Constraint {
  @scala.inline
  def apply(
    booleanConstraint: js.Any = null,
    constraintDefault: String = null,
    description: String = null,
    displayName: String = null,
    listConstraint: ListConstraint = null,
    name: String = null,
    version: Int | Double = null
  ): Constraint = {
    val __obj = js.Dynamic.literal()
    if (booleanConstraint != null) __obj.updateDynamic("booleanConstraint")(booleanConstraint.asInstanceOf[js.Any])
    if (constraintDefault != null) __obj.updateDynamic("constraintDefault")(constraintDefault.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (listConstraint != null) __obj.updateDynamic("listConstraint")(listConstraint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
}

