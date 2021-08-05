package typings.googleCloudStorage

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.googleCloudStorage.bucketMod.Bucket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamMod {
  
  /**
    * Get and set IAM policies for your Cloud Storage bucket.
    *
    * @see [Cloud Storage IAM Management](https://cloud.google.com/storage/docs/access-control/iam#short_title_iam_management)
    * @see [Granting, Changing, and Revoking Access](https://cloud.google.com/iam/docs/granting-changing-revoking-access)
    * @see [IAM Roles](https://cloud.google.com/iam/docs/understanding-roles)
    *
    * @constructor Iam
    * @mixin
    *
    * @param {Bucket} bucket The parent instance.
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('my-bucket');
    * // bucket.iam
    */
  @JSImport("@google-cloud/storage/build/src/iam", "Iam")
  @js.native
  class Iam protected () extends StObject {
    def this(bucket: Bucket) = this()
    
    def getPolicy(): js.Promise[GetPolicyResponse] = js.native
    def getPolicy(callback: GetPolicyCallback): Unit = js.native
    def getPolicy(options: GetPolicyOptions): js.Promise[GetPolicyResponse] = js.native
    def getPolicy(options: GetPolicyOptions, callback: GetPolicyCallback): Unit = js.native
    
    /* private */ var request_ : js.Any = js.native
    
    /* private */ var resourceId_ : js.Any = js.native
    
    def setPolicy(policy: Policy): js.Promise[SetPolicyResponse] = js.native
    def setPolicy(policy: Policy, callback: SetPolicyCallback): Unit = js.native
    def setPolicy(policy: Policy, options: SetPolicyOptions): js.Promise[SetPolicyResponse] = js.native
    def setPolicy(policy: Policy, options: SetPolicyOptions, callback: SetPolicyCallback): Unit = js.native
    
    def testPermissions(permissions: String): js.Promise[TestIamPermissionsResponse] = js.native
    def testPermissions(permissions: String, callback: TestIamPermissionsCallback): Unit = js.native
    def testPermissions(permissions: String, options: TestIamPermissionsOptions): js.Promise[TestIamPermissionsResponse] = js.native
    def testPermissions(permissions: String, options: TestIamPermissionsOptions, callback: TestIamPermissionsCallback): Unit = js.native
    def testPermissions(permissions: js.Array[String]): js.Promise[TestIamPermissionsResponse] = js.native
    def testPermissions(permissions: js.Array[String], callback: TestIamPermissionsCallback): Unit = js.native
    def testPermissions(permissions: js.Array[String], options: TestIamPermissionsOptions): js.Promise[TestIamPermissionsResponse] = js.native
    def testPermissions(
      permissions: js.Array[String],
      options: TestIamPermissionsOptions,
      callback: TestIamPermissionsCallback
    ): Unit = js.native
  }
  
  trait Expr extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var expression: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Expr {
    
    inline def apply(expression: String): Expr = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expr]
    }
    
    extension [Self <: Expr](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type GetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* acl */ js.UndefOr[Policy], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  trait GetPolicyOptions extends StObject {
    
    var requestedPolicyVersion: js.UndefOr[Double] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object GetPolicyOptions {
    
    inline def apply(): GetPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPolicyOptions]
    }
    
    extension [Self <: GetPolicyOptions](x: Self) {
      
      inline def setRequestedPolicyVersion(value: Double): Self = StObject.set(x, "requestedPolicyVersion", value.asInstanceOf[js.Any])
      
      inline def setRequestedPolicyVersionUndefined: Self = StObject.set(x, "requestedPolicyVersion", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetPolicyResponse = js.Tuple2[Policy, Metadata]
  
  trait Policy extends StObject {
    
    var bindings: js.Array[PolicyBinding]
    
    var etag: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Policy {
    
    inline def apply(bindings: js.Array[PolicyBinding]): Policy = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Policy]
    }
    
    extension [Self <: Policy](x: Self) {
      
      inline def setBindings(value: js.Array[PolicyBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsVarargs(value: PolicyBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PolicyBinding extends StObject {
    
    var condition: js.UndefOr[Expr] = js.undefined
    
    var members: js.Array[String]
    
    var role: String
  }
  object PolicyBinding {
    
    inline def apply(members: js.Array[String], role: String): PolicyBinding = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyBinding]
    }
    
    extension [Self <: PolicyBinding](x: Self) {
      
      inline def setCondition(value: Expr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  type SetPolicyCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* acl */ js.UndefOr[Policy], 
    /* apiResponse */ js.UndefOr[js.Object], 
    Unit
  ]
  
  trait SetPolicyOptions extends StObject {
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object SetPolicyOptions {
    
    inline def apply(): SetPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetPolicyOptions]
    }
    
    extension [Self <: SetPolicyOptions](x: Self) {
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type SetPolicyResponse = js.Tuple2[Policy, Metadata]
  
  type TestIamPermissionsCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* acl */ js.UndefOr[StringDictionary[Boolean] | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  trait TestIamPermissionsOptions extends StObject {
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object TestIamPermissionsOptions {
    
    inline def apply(): TestIamPermissionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestIamPermissionsOptions]
    }
    
    extension [Self <: TestIamPermissionsOptions](x: Self) {
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type TestIamPermissionsResponse = js.Tuple2[StringDictionary[Boolean], Metadata]
}
