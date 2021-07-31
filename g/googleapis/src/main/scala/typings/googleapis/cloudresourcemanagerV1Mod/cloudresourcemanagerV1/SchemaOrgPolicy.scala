package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a Cloud Organization `Policy` which is used to specify
  * `Constraints` for configurations of Cloud Platform resources.
  */
trait SchemaOrgPolicy extends StObject {
  
  /**
    * For boolean `Constraints`, whether to enforce the `Constraint` or not.
    */
  var booleanPolicy: js.UndefOr[SchemaBooleanPolicy] = js.undefined
  
  /**
    * The name of the `Constraint` the `Policy` is configuring, for example,
    * `constraints/serviceuser.services`.  Immutable after creation.
    */
  var constraint: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque tag indicating the current version of the `Policy`, used for
    * concurrency control.  When the `Policy` is returned from either a
    * `GetPolicy` or a `ListOrgPolicy` request, this `etag` indicates the
    * version of the current `Policy` to use when executing a read-modify-write
    * loop.  When the `Policy` is returned from a `GetEffectivePolicy` request,
    * the `etag` will be unset.  When the `Policy` is used in a `SetOrgPolicy`
    * method, use the `etag` value that was returned from a `GetOrgPolicy`
    * request as part of a read-modify-write loop for concurrency control. Not
    * setting the `etag`in a `SetOrgPolicy` request will result in an
    * unconditional write of the `Policy`.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * List of values either allowed or disallowed.
    */
  var listPolicy: js.UndefOr[SchemaListPolicy] = js.undefined
  
  /**
    * Restores the default behavior of the constraint; independent of
    * `Constraint` type.
    */
  var restoreDefault: js.UndefOr[SchemaRestoreDefault] = js.undefined
  
  /**
    * The time stamp the `Policy` was previously updated. This is set by the
    * server, not specified by the caller, and represents the last time a call
    * to `SetOrgPolicy` was made for that `Policy`. Any value set by the client
    * will be ignored.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the `Policy`. Default version is 0;
    */
  var version: js.UndefOr[Double] = js.undefined
}
object SchemaOrgPolicy {
  
  @scala.inline
  def apply(): SchemaOrgPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgPolicy]
  }
  
  @scala.inline
  implicit class SchemaOrgPolicyMutableBuilder[Self <: SchemaOrgPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanPolicy(value: SchemaBooleanPolicy): Self = StObject.set(x, "booleanPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanPolicyUndefined: Self = StObject.set(x, "booleanPolicy", js.undefined)
    
    @scala.inline
    def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setListPolicy(value: SchemaListPolicy): Self = StObject.set(x, "listPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPolicyUndefined: Self = StObject.set(x, "listPolicy", js.undefined)
    
    @scala.inline
    def setRestoreDefault(value: SchemaRestoreDefault): Self = StObject.set(x, "restoreDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreDefaultUndefined: Self = StObject.set(x, "restoreDefault", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
