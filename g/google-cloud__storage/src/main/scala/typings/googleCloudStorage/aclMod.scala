package typings.googleCloudStorage

import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.googleCloudCommon.utilMod.BodyResponseCallback
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aclMod {
  
  /**
    * Cloud Storage uses access control lists (ACLs) to manage object and
    * bucket access. ACLs are the mechanism you use to share objects with other
    * users and allow other users to access your buckets and objects.
    *
    * An ACL consists of one or more entries, where each entry grants permissions
    * to an entity. Permissions define the actions that can be performed against an
    * object or bucket (for example, `READ` or `WRITE`); the entity defines who the
    * permission applies to (for example, a specific user or group of users).
    *
    * Where an `entity` value is accepted, we follow the format the Cloud Storage
    * API expects.
    *
    * Refer to
    * https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls
    * for the most up-to-date values.
    *
    *   - `user-userId`
    *   - `user-email`
    *   - `group-groupId`
    *   - `group-email`
    *   - `domain-domain`
    *   - `project-team-projectId`
    *   - `allUsers`
    *   - `allAuthenticatedUsers`
    *
    * Examples:
    *
    *   - The user "liz@example.com" would be `user-liz@example.com`.
    *   - The group "example@googlegroups.com" would be
    *     `group-example@googlegroups.com`.
    *   - To refer to all members of the Google Apps for Business domain
    *     "example.com", the entity would be `domain-example.com`.
    *
    * For more detailed information, see
    * [About Access Control Lists](http://goo.gl/6qBBPO).
    *
    * @constructor Acl
    * @mixin
    * @param {object} options Configuration options.
    */
  @JSImport("@google-cloud/storage/build/src/acl", "Acl")
  @js.native
  class Acl protected () extends AclRoleAccessorMethods {
    def this(options: AclOptions) = this()
    
    var default: Acl = js.native
    
    def add(options: AddAclOptions): js.Promise[AddAclResponse] = js.native
    def add(options: AddAclOptions, callback: AddAclCallback): Unit = js.native
    
    def delete(options: RemoveAclOptions): js.Promise[RemoveAclResponse] = js.native
    def delete(options: RemoveAclOptions, callback: RemoveAclCallback): Unit = js.native
    
    def get(): js.Promise[GetAclResponse] = js.native
    def get(callback: GetAclCallback): Unit = js.native
    def get(options: GetAclOptions): js.Promise[GetAclResponse] = js.native
    def get(options: GetAclOptions, callback: GetAclCallback): Unit = js.native
    
    /**
      * Transform API responses to a consistent object format.
      *
      * @private
      */
    def makeAclObject_(accessControlObject: AccessControlObject): AccessControlObject = js.native
    
    var pathPrefix: String = js.native
    
    /**
      * Patch requests up to the bucket's request object.
      *
      * @private
      *
      * @param {string} method Action.
      * @param {string} path Request path.
      * @param {*} query Request query object.
      * @param {*} body Request body contents.
      * @param {function} callback Callback function.
      */
    def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
    
    def request_(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
    
    def update(options: UpdateAclOptions): js.Promise[UpdateAclResponse] = js.native
    def update(options: UpdateAclOptions, callback: UpdateAclCallback): Unit = js.native
  }
  
  /**
    * Attach functionality to a {@link Storage.acl} instance. This will add an
    * object for each role group (owners, readers, and writers), with each object
    * containing methods to add or delete a type of entity.
    *
    * As an example, here are a few methods that are created.
    *
    *   myBucket.acl.readers.deleteGroup('groupId', function(err) {});
    *
    *   myBucket.acl.owners.addUser('email@example.com', function(err, acl) {});
    *
    *   myBucket.acl.writers.addDomain('example.com', function(err, acl) {});
    *
    * @private
    */
  @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods")
  @js.native
  class AclRoleAccessorMethods () extends StObject {
    
    def _assignAccessMethods(role: String): Unit = js.native
  }
  object AclRoleAccessorMethods {
    
    @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods.accessMethods")
    @js.native
    def accessMethods: js.Any = js.native
    @scala.inline
    def accessMethods_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessMethods")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods.entities")
    @js.native
    def entities: js.Any = js.native
    @scala.inline
    def entities_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entities")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods.roles")
    @js.native
    def roles: js.Any = js.native
    @scala.inline
    def roles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roles")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AccessControlObject extends StObject {
    
    var entity: String = js.native
    
    var projectTeam: String = js.native
    
    var role: String = js.native
  }
  object AccessControlObject {
    
    @scala.inline
    def apply(entity: String, projectTeam: String, role: String): AccessControlObject = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], projectTeam = projectTeam.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessControlObject]
    }
    
    @scala.inline
    implicit class AccessControlObjectMutableBuilder[Self <: AccessControlObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectTeam(value: String): Self = StObject.set(x, "projectTeam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AclOptions extends StObject {
    
    var pathPrefix: String = js.native
    
    def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
  }
  object AclOptions {
    
    @scala.inline
    def apply(pathPrefix: String, request: (DecorateRequestOptions, BodyResponseCallback) => Unit): AclOptions = {
      val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any], request = js.Any.fromFunction2(request))
      __obj.asInstanceOf[AclOptions]
    }
    
    @scala.inline
    implicit class AclOptionsMutableBuilder[Self <: AclOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: (DecorateRequestOptions, BodyResponseCallback) => Unit): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    }
  }
  
  type AddAclCallback = js.Function3[
    /* err */ Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  @js.native
  trait AddAclOptions extends StObject {
    
    var entity: String = js.native
    
    var generation: js.UndefOr[Double] = js.native
    
    var role: String = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object AddAclOptions {
    
    @scala.inline
    def apply(entity: String, role: String): AddAclOptions = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddAclOptions]
    }
    
    @scala.inline
    implicit class AddAclOptionsMutableBuilder[Self <: AddAclOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type AddAclResponse = js.Tuple2[AccessControlObject, Metadata]
  
  type GetAclCallback = js.Function3[
    /* err */ Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | js.Array[AccessControlObject] | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  @js.native
  trait GetAclOptions extends StObject {
    
    var entity: String = js.native
    
    var generation: js.UndefOr[Double] = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object GetAclOptions {
    
    @scala.inline
    def apply(entity: String): GetAclOptions = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAclOptions]
    }
    
    @scala.inline
    implicit class GetAclOptionsMutableBuilder[Self <: GetAclOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetAclResponse = js.Tuple2[AccessControlObject | js.Array[AccessControlObject], Metadata]
  
  type RemoveAclCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
  
  @js.native
  trait RemoveAclOptions extends StObject {
    
    var entity: String = js.native
    
    var generation: js.UndefOr[Double] = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object RemoveAclOptions {
    
    @scala.inline
    def apply(entity: String): RemoveAclOptions = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAclOptions]
    }
    
    @scala.inline
    implicit class RemoveAclOptionsMutableBuilder[Self <: RemoveAclOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type RemoveAclResponse = js.Array[Metadata]
  
  type UpdateAclCallback = js.Function3[
    /* err */ Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  @js.native
  trait UpdateAclOptions extends StObject {
    
    var entity: String = js.native
    
    var generation: js.UndefOr[Double] = js.native
    
    var role: String = js.native
    
    var userProject: js.UndefOr[String] = js.native
  }
  object UpdateAclOptions {
    
    @scala.inline
    def apply(entity: String, role: String): UpdateAclOptions = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateAclOptions]
    }
    
    @scala.inline
    implicit class UpdateAclOptionsMutableBuilder[Self <: UpdateAclOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type UpdateAclResponse = js.Tuple2[AccessControlObject, Metadata]
}
