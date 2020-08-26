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
  def apply(): SchemaConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConstraint]
  }
  @scala.inline
  implicit class SchemaConstraintOps[Self <: SchemaConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBooleanConstraint(value: SchemaBooleanConstraint): Self = this.set("booleanConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanConstraint: Self = this.set("booleanConstraint", js.undefined)
    @scala.inline
    def setConstraintDefault(value: String): Self = this.set("constraintDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraintDefault: Self = this.set("constraintDefault", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setListConstraint(value: SchemaListConstraint): Self = this.set("listConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListConstraint: Self = this.set("listConstraint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

