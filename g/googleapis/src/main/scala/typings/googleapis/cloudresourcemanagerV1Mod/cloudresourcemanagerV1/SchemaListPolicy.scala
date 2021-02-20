package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used in `policy_type` to specify how `list_policy` behaves at this
  * resource.  `ListPolicy` can define specific values and subtrees of Cloud
  * Resource Manager resource hierarchy (`Organizations`, `Folders`,
  * `Projects`) that are allowed or denied by setting the `allowed_values` and
  * `denied_values` fields. This is achieved by using the `under:` and optional
  * `is:` prefixes. The `under:` prefix is used to denote resource subtree
  * values. The `is:` prefix is used to denote specific values, and is required
  * only if the value contains a &quot;:&quot;. Values prefixed with
  * &quot;is:&quot; are treated the same as values with no prefix. Ancestry
  * subtrees must be in one of the following formats:     -
  * “projects/&lt;project-id&gt;”, e.g. “projects/tokyo-rain-123”     -
  * “folders/&lt;folder-id&gt;”, e.g. “folders/1234”     -
  * “organizations/&lt;organization-id&gt;”, e.g. “organizations/1234” The
  * `supports_under` field of the associated `Constraint`  defines whether
  * ancestry prefixes can be used. You can set `allowed_values` and
  * `denied_values` in the same `Policy` if `all_values` is
  * `ALL_VALUES_UNSPECIFIED`. `ALLOW` or `DENY` are used to allow or deny all
  * values. If `all_values` is set to either `ALLOW` or `DENY`,
  * `allowed_values` and `denied_values` must be unset.
  */
@js.native
trait SchemaListPolicy extends StObject {
  
  /**
    * The policy all_values state.
    */
  var allValues: js.UndefOr[String] = js.native
  
  /**
    * List of values allowed  at this resource. Can only be set if `all_values`
    * is set to `ALL_VALUES_UNSPECIFIED`.
    */
  var allowedValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of values denied at this resource. Can only be set if `all_values`
    * is set to `ALL_VALUES_UNSPECIFIED`.
    */
  var deniedValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Determines the inheritance behavior for this `Policy`.  By default, a
    * `ListPolicy` set at a resource supercedes any `Policy` set anywhere up
    * the resource hierarchy. However, if `inherit_from_parent` is set to
    * `true`, then the values from the effective `Policy` of the parent
    * resource are inherited, meaning the values set in this `Policy` are added
    * to the values inherited up the hierarchy.  Setting `Policy` hierarchies
    * that inherit both allowed values and denied values isn&#39;t recommended
    * in most circumstances to keep the configuration simple and
    * understandable. However, it is possible to set a `Policy` with
    * `allowed_values` set that inherits a `Policy` with `denied_values` set.
    * In this case, the values that are allowed must be in `allowed_values` and
    * not present in `denied_values`.  For example, suppose you have a
    * `Constraint` `constraints/serviceuser.services`, which has a
    * `constraint_type` of `list_constraint`, and with `constraint_default` set
    * to `ALLOW`. Suppose that at the Organization level, a `Policy` is applied
    * that restricts the allowed API activations to {`E1`, `E2`}. Then, if a
    * `Policy` is applied to a project below the Organization that has
    * `inherit_from_parent` set to `false` and field all_values set to DENY,
    * then an attempt to activate any API will be denied.  The following
    * examples demonstrate different possible layerings for `projects/bar`
    * parented by `organizations/foo`:  Example 1 (no inherited values):
    * `organizations/foo` has a `Policy` with values:     {allowed_values: “E1”
    * allowed_values:”E2”}   `projects/bar` has `inherit_from_parent` `false`
    * and values:     {allowed_values: &quot;E3&quot; allowed_values:
    * &quot;E4&quot;} The accepted values at `organizations/foo` are `E1`,
    * `E2`. The accepted values at `projects/bar` are `E3`, and `E4`.  Example
    * 2 (inherited values):   `organizations/foo` has a `Policy` with values:
    * {allowed_values: “E1” allowed_values:”E2”}   `projects/bar` has a
    * `Policy` with values:     {value: “E3” value: ”E4” inherit_from_parent:
    * true} The accepted values at `organizations/foo` are `E1`, `E2`. The
    * accepted values at `projects/bar` are `E1`, `E2`, `E3`, and `E4`. Example
    * 3 (inheriting both allowed and denied values):   `organizations/foo` has
    * a `Policy` with values:     {allowed_values: &quot;E1&quot;
    * allowed_values: &quot;E2&quot;}   `projects/bar` has a `Policy` with:
    * {denied_values: &quot;E1&quot;} The accepted values at
    * `organizations/foo` are `E1`, `E2`. The value accepted at `projects/bar`
    * is `E2`.  Example 4 (RestoreDefault):   `organizations/foo` has a
    * `Policy` with values:     {allowed_values: “E1” allowed_values:”E2”}
    * `projects/bar` has a `Policy` with values:     {RestoreDefault: {}} The
    * accepted values at `organizations/foo` are `E1`, `E2`. The accepted
    * values at `projects/bar` are either all or none depending on the value of
    * `constraint_default` (if `ALLOW`, all; if `DENY`, none).  Example 5 (no
    * policy inherits parent policy):   `organizations/foo` has no `Policy`
    * set.   `projects/bar` has no `Policy` set. The accepted values at both
    * levels are either all or none depending on the value of
    * `constraint_default` (if `ALLOW`, all; if `DENY`, none).  Example 6
    * (ListConstraint allowing all):   `organizations/foo` has a `Policy` with
    * values:     {allowed_values: “E1” allowed_values: ”E2”}   `projects/bar`
    * has a `Policy` with:     {all: ALLOW} The accepted values at
    * `organizations/foo` are `E1`, E2`. Any value is accepted at
    * `projects/bar`.  Example 7 (ListConstraint allowing none):
    * `organizations/foo` has a `Policy` with values:     {allowed_values: “E1”
    * allowed_values: ”E2”}   `projects/bar` has a `Policy` with:     {all:
    * DENY} The accepted values at `organizations/foo` are `E1`, E2`. No value
    * is accepted at `projects/bar`.  Example 10 (allowed and denied subtrees
    * of Resource Manager hierarchy): Given the following resource hierarchy
    * O1-&gt;{F1, F2}; F1-&gt;{P1}; F2-&gt;{P2, P3},   `organizations/foo` has
    * a `Policy` with values:     {allowed_values:
    * &quot;under:organizations/O1&quot;}   `projects/bar` has a `Policy` with:
    * {allowed_values: &quot;under:projects/P3&quot;}     {denied_values:
    * &quot;under:folders/F2&quot;} The accepted values at `organizations/foo`
    * are `organizations/O1`,   `folders/F1`, `folders/F2`, `projects/P1`,
    * `projects/P2`,   `projects/P3`. The accepted values at `projects/bar` are
    * `organizations/O1`,   `folders/F1`, `projects/P1`.
    */
  var inheritFromParent: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The Google Cloud Console will try to default to a configuration
    * that matches the value specified in this `Policy`. If `suggested_value`
    * is not set, it will inherit the value specified higher in the hierarchy,
    * unless `inherit_from_parent` is `false`.
    */
  var suggestedValue: js.UndefOr[String] = js.native
}
object SchemaListPolicy {
  
  @scala.inline
  def apply(): SchemaListPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPolicy]
  }
  
  @scala.inline
  implicit class SchemaListPolicyMutableBuilder[Self <: SchemaListPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllValues(value: String): Self = StObject.set(x, "allValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllValuesUndefined: Self = StObject.set(x, "allValues", js.undefined)
    
    @scala.inline
    def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    @scala.inline
    def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setDeniedValues(value: js.Array[String]): Self = StObject.set(x, "deniedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeniedValuesUndefined: Self = StObject.set(x, "deniedValues", js.undefined)
    
    @scala.inline
    def setDeniedValuesVarargs(value: String*): Self = StObject.set(x, "deniedValues", js.Array(value :_*))
    
    @scala.inline
    def setInheritFromParent(value: Boolean): Self = StObject.set(x, "inheritFromParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritFromParentUndefined: Self = StObject.set(x, "inheritFromParent", js.undefined)
    
    @scala.inline
    def setSuggestedValue(value: String): Self = StObject.set(x, "suggestedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedValueUndefined: Self = StObject.set(x, "suggestedValue", js.undefined)
  }
}
