package typings.googleCloudStorage

import typings.googleCloudStorage.serviceObjectMod.Metadata
import typings.googleCloudStorage.utilMod.BodyResponseCallback
import typings.googleCloudStorage.utilMod.DecorateRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    * {@link http://goo.gl/6qBBPO| About Access Control Lists}.
    *
    * @constructor Acl
    * @mixin
    * @param {object} options Configuration options.
    */
  @JSImport("@google-cloud/storage/build/src/acl", "Acl")
  @js.native
  open class Acl protected () extends AclRoleAccessorMethods {
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
  open class AclRoleAccessorMethods () extends StObject {
    
    def _assignAccessMethods(role: String): Unit = js.native
  }
  object AclRoleAccessorMethods {
    
    @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods.accessMethods")
    @js.native
    def accessMethods: Any = js.native
    inline def accessMethods_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessMethods")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods.entities")
    @js.native
    def entities: Any = js.native
    inline def entities_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entities")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods.roles")
    @js.native
    def roles: Any = js.native
    inline def roles_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roles")(x.asInstanceOf[js.Any])
  }
  
  trait AccessControlObject extends StObject {
    
    var entity: String
    
    var projectTeam: String
    
    var role: String
  }
  object AccessControlObject {
    
    inline def apply(entity: String, projectTeam: String, role: String): AccessControlObject = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], projectTeam = projectTeam.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessControlObject]
    }
    
    extension [Self <: AccessControlObject](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setProjectTeam(value: String): Self = StObject.set(x, "projectTeam", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait AclOptions extends StObject {
    
    var pathPrefix: String
    
    def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit
  }
  object AclOptions {
    
    inline def apply(pathPrefix: String, request: (DecorateRequestOptions, BodyResponseCallback) => Unit): AclOptions = {
      val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any], request = js.Any.fromFunction2(request))
      __obj.asInstanceOf[AclOptions]
    }
    
    extension [Self <: AclOptions](x: Self) {
      
      inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: (DecorateRequestOptions, BodyResponseCallback) => Unit): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    }
  }
  
  type AddAclCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  trait AddAclOptions extends StObject {
    
    var entity: String
    
    var generation: js.UndefOr[Double] = js.undefined
    
    var role: String
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object AddAclOptions {
    
    inline def apply(entity: String, role: String): AddAclOptions = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddAclOptions]
    }
    
    extension [Self <: AddAclOptions](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type AddAclResponse = js.Tuple2[AccessControlObject, Metadata]
  
  type GetAclCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | js.Array[AccessControlObject] | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  trait GetAclOptions extends StObject {
    
    var entity: String
    
    var generation: js.UndefOr[Double] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object GetAclOptions {
    
    inline def apply(entity: String): GetAclOptions = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAclOptions]
    }
    
    extension [Self <: GetAclOptions](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type GetAclResponse = js.Tuple2[AccessControlObject | js.Array[AccessControlObject], Metadata]
  
  type RemoveAclCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
  
  trait RemoveAclOptions extends StObject {
    
    var entity: String
    
    var generation: js.UndefOr[Double] = js.undefined
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object RemoveAclOptions {
    
    inline def apply(entity: String): RemoveAclOptions = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAclOptions]
    }
    
    extension [Self <: RemoveAclOptions](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type RemoveAclResponse = js.Array[Metadata]
  
  type UpdateAclCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* acl */ js.UndefOr[AccessControlObject | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  
  trait UpdateAclOptions extends StObject {
    
    var entity: String
    
    var generation: js.UndefOr[Double] = js.undefined
    
    var role: String
    
    var userProject: js.UndefOr[String] = js.undefined
  }
  object UpdateAclOptions {
    
    inline def apply(entity: String, role: String): UpdateAclOptions = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateAclOptions]
    }
    
    extension [Self <: UpdateAclOptions](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
      
      inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    }
  }
  
  type UpdateAclResponse = js.Tuple2[AccessControlObject, Metadata]
}
