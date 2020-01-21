package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Constraint` describes a way in which a resource&#39;s configuration can
  * be restricted. For example, it controls which cloud services can be
  * activated across an organization, or whether a Compute Engine instance can
  * have serial port connections established. `Constraints` can be configured
  * by the organization&#39;s policy adminstrator to fit the needs of the
  * organzation by setting Policies for `Constraints` at different locations in
  * the organization&#39;s resource hierarchy. Policies are inherited down the
  * resource hierarchy from higher levels, but can also be overridden. For
  * details about the inheritance rules please read about Policies.
  * `Constraints` have a default behavior determined by the
  * `constraint_default` field, which is the enforcement behavior that is used
  * in the absence of a `Policy` being defined or inherited for the resource in
  * question.
  */
@js.native
trait SchemaConstraint extends js.Object {
  /**
    * Defines this constraint as being a BooleanConstraint.
    */
  var booleanConstraint: js.UndefOr[SchemaBooleanConstraint] = js.native
  /**
    * The evaluation behavior of this constraint in the absense of
    * &#39;Policy&#39;.
    */
  var constraintDefault: js.UndefOr[String] = js.native
  /**
    * Detailed description of what this `Constraint` controls as well as how
    * and where it is enforced.  Mutable.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The human readable name.  Mutable.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Defines this constraint as being a ListConstraint.
    */
  var listConstraint: js.UndefOr[SchemaListConstraint] = js.native
  /**
    * Immutable value, required to globally be unique. For example,
    * `constraints/serviceuser.services`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Version of the `Constraint`. Default version is 0;
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaConstraint {
  @scala.inline
  def apply(
    booleanConstraint: SchemaBooleanConstraint = null,
    constraintDefault: String = null,
    description: String = null,
    displayName: String = null,
    listConstraint: SchemaListConstraint = null,
    name: String = null,
    version: Int | Double = null
  ): SchemaConstraint = {
    val __obj = js.Dynamic.literal()
    if (booleanConstraint != null) __obj.updateDynamic("booleanConstraint")(booleanConstraint.asInstanceOf[js.Any])
    if (constraintDefault != null) __obj.updateDynamic("constraintDefault")(constraintDefault.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (listConstraint != null) __obj.updateDynamic("listConstraint")(listConstraint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConstraint]
  }
}

