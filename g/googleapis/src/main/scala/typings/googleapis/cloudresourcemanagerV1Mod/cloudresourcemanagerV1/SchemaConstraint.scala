package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaConstraint extends StObject {
  
  /**
    * Defines this constraint as being a BooleanConstraint.
    */
  var booleanConstraint: js.UndefOr[SchemaBooleanConstraint] = js.undefined
  
  /**
    * The evaluation behavior of this constraint in the absense of
    * &#39;Policy&#39;.
    */
  var constraintDefault: js.UndefOr[String] = js.undefined
  
  /**
    * Detailed description of what this `Constraint` controls as well as how
    * and where it is enforced.  Mutable.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The human readable name.  Mutable.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Defines this constraint as being a ListConstraint.
    */
  var listConstraint: js.UndefOr[SchemaListConstraint] = js.undefined
  
  /**
    * Immutable value, required to globally be unique. For example,
    * `constraints/serviceuser.services`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the `Constraint`. Default version is 0;
    */
  var version: js.UndefOr[Double] = js.undefined
}
object SchemaConstraint {
  
  @scala.inline
  def apply(): SchemaConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConstraint]
  }
  
  @scala.inline
  implicit class SchemaConstraintMutableBuilder[Self <: SchemaConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanConstraint(value: SchemaBooleanConstraint): Self = StObject.set(x, "booleanConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanConstraintUndefined: Self = StObject.set(x, "booleanConstraint", js.undefined)
    
    @scala.inline
    def setConstraintDefault(value: String): Self = StObject.set(x, "constraintDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintDefaultUndefined: Self = StObject.set(x, "constraintDefault", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setListConstraint(value: SchemaListConstraint): Self = StObject.set(x, "listConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListConstraintUndefined: Self = StObject.set(x, "listConstraint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
