package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityAuthenticate
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityChangePassword
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityClearCachedRealms
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityClearCachedRoles
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityCreateApiKey
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityDeletePrivileges
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityDeleteRole
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityDeleteRoleMapping
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityDeleteUser
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityDisableUser
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityEnableUser
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityGetApiKey
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityGetBuiltinPrivileges
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityGetPrivileges
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityGetRole
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityGetRoleMapping
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityGetToken
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityGetUser
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityGetUserPrivileges
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityHasPrivileges
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityInvalidateApiKey
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityInvalidateToken
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityPutPrivileges
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityPutRole
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityPutRoleMapping
import typings.atElasticElasticsearch.apiRequestParamsMod.SecurityPutUser
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Authenticate extends js.Object {
  @JSName("authenticate")
  var authenticate_Original: ApiMethod[SecurityAuthenticate, _] = js.native
  @JSName("changePassword")
  var changePassword_Original: ApiMethod[SecurityChangePassword[_], _] = js.native
  @JSName("change_password")
  var change_password_Original: ApiMethod[SecurityChangePassword[_], _] = js.native
  @JSName("clearCachedRealms")
  var clearCachedRealms_Original: ApiMethod[SecurityClearCachedRealms, _] = js.native
  @JSName("clearCachedRoles")
  var clearCachedRoles_Original: ApiMethod[SecurityClearCachedRoles, _] = js.native
  @JSName("clear_cached_realms")
  var clear_cached_realms_Original: ApiMethod[SecurityClearCachedRealms, _] = js.native
  @JSName("clear_cached_roles")
  var clear_cached_roles_Original: ApiMethod[SecurityClearCachedRoles, _] = js.native
  @JSName("createApiKey")
  var createApiKey_Original: ApiMethod[SecurityCreateApiKey[_], _] = js.native
  @JSName("create_api_key")
  var create_api_key_Original: ApiMethod[SecurityCreateApiKey[_], _] = js.native
  @JSName("deletePrivileges")
  var deletePrivileges_Original: ApiMethod[SecurityDeletePrivileges, _] = js.native
  @JSName("deleteRoleMapping")
  var deleteRoleMapping_Original: ApiMethod[SecurityDeleteRoleMapping, _] = js.native
  @JSName("deleteRole")
  var deleteRole_Original: ApiMethod[SecurityDeleteRole, _] = js.native
  @JSName("deleteUser")
  var deleteUser_Original: ApiMethod[SecurityDeleteUser, _] = js.native
  @JSName("delete_privileges")
  var delete_privileges_Original: ApiMethod[SecurityDeletePrivileges, _] = js.native
  @JSName("delete_role")
  var delete_role_Original: ApiMethod[SecurityDeleteRole, _] = js.native
  @JSName("delete_role_mapping")
  var delete_role_mapping_Original: ApiMethod[SecurityDeleteRoleMapping, _] = js.native
  @JSName("delete_user")
  var delete_user_Original: ApiMethod[SecurityDeleteUser, _] = js.native
  @JSName("disableUser")
  var disableUser_Original: ApiMethod[SecurityDisableUser, _] = js.native
  @JSName("disable_user")
  var disable_user_Original: ApiMethod[SecurityDisableUser, _] = js.native
  @JSName("enableUser")
  var enableUser_Original: ApiMethod[SecurityEnableUser, _] = js.native
  @JSName("enable_user")
  var enable_user_Original: ApiMethod[SecurityEnableUser, _] = js.native
  @JSName("getApiKey")
  var getApiKey_Original: ApiMethod[SecurityGetApiKey, _] = js.native
  @JSName("getBuiltinPrivileges")
  var getBuiltinPrivileges_Original: ApiMethod[SecurityGetBuiltinPrivileges, _] = js.native
  @JSName("getPrivileges")
  var getPrivileges_Original: ApiMethod[SecurityGetPrivileges, _] = js.native
  @JSName("getRoleMapping")
  var getRoleMapping_Original: ApiMethod[SecurityGetRoleMapping, _] = js.native
  @JSName("getRole")
  var getRole_Original: ApiMethod[SecurityGetRole, _] = js.native
  @JSName("getToken")
  var getToken_Original: ApiMethod[SecurityGetToken[_], _] = js.native
  @JSName("getUserPrivileges")
  var getUserPrivileges_Original: ApiMethod[SecurityGetUserPrivileges, _] = js.native
  @JSName("getUser")
  var getUser_Original: ApiMethod[SecurityGetUser, _] = js.native
  @JSName("get_api_key")
  var get_api_key_Original: ApiMethod[SecurityGetApiKey, _] = js.native
  @JSName("get_builtin_privileges")
  var get_builtin_privileges_Original: ApiMethod[SecurityGetBuiltinPrivileges, _] = js.native
  @JSName("get_privileges")
  var get_privileges_Original: ApiMethod[SecurityGetPrivileges, _] = js.native
  @JSName("get_role")
  var get_role_Original: ApiMethod[SecurityGetRole, _] = js.native
  @JSName("get_role_mapping")
  var get_role_mapping_Original: ApiMethod[SecurityGetRoleMapping, _] = js.native
  @JSName("get_token")
  var get_token_Original: ApiMethod[SecurityGetToken[_], _] = js.native
  @JSName("get_user")
  var get_user_Original: ApiMethod[SecurityGetUser, _] = js.native
  @JSName("get_user_privileges")
  var get_user_privileges_Original: ApiMethod[SecurityGetUserPrivileges, _] = js.native
  @JSName("hasPrivileges")
  var hasPrivileges_Original: ApiMethod[SecurityHasPrivileges[_], _] = js.native
  @JSName("has_privileges")
  var has_privileges_Original: ApiMethod[SecurityHasPrivileges[_], _] = js.native
  @JSName("invalidateApiKey")
  var invalidateApiKey_Original: ApiMethod[SecurityInvalidateApiKey[_], _] = js.native
  @JSName("invalidateToken")
  var invalidateToken_Original: ApiMethod[SecurityInvalidateToken[_], _] = js.native
  @JSName("invalidate_api_key")
  var invalidate_api_key_Original: ApiMethod[SecurityInvalidateApiKey[_], _] = js.native
  @JSName("invalidate_token")
  var invalidate_token_Original: ApiMethod[SecurityInvalidateToken[_], _] = js.native
  @JSName("putPrivileges")
  var putPrivileges_Original: ApiMethod[SecurityPutPrivileges[_], _] = js.native
  @JSName("putRoleMapping")
  var putRoleMapping_Original: ApiMethod[SecurityPutRoleMapping[_], _] = js.native
  @JSName("putRole")
  var putRole_Original: ApiMethod[SecurityPutRole[_], _] = js.native
  @JSName("putUser")
  var putUser_Original: ApiMethod[SecurityPutUser[_], _] = js.native
  @JSName("put_privileges")
  var put_privileges_Original: ApiMethod[SecurityPutPrivileges[_], _] = js.native
  @JSName("put_role")
  var put_role_Original: ApiMethod[SecurityPutRole[_], _] = js.native
  @JSName("put_role_mapping")
  var put_role_mapping_Original: ApiMethod[SecurityPutRoleMapping[_], _] = js.native
  @JSName("put_user")
  var put_user_Original: ApiMethod[SecurityPutUser[_], _] = js.native
  // Promise API
  def authenticate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def authenticate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def authenticate(params: SecurityAuthenticate): js.Promise[ApiResponse[_, _]] = js.native
  def authenticate(params: SecurityAuthenticate, callback: callbackFn[_]): TransportRequestCallback = js.native
  def authenticate(params: SecurityAuthenticate, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def authenticate(params: SecurityAuthenticate, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def changePassword(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def changePassword(callback: callbackFn[_]): TransportRequestCallback = js.native
  def changePassword(params: SecurityChangePassword[_]): js.Promise[ApiResponse[_, _]] = js.native
  def changePassword(params: SecurityChangePassword[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def changePassword(params: SecurityChangePassword[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def changePassword(params: SecurityChangePassword[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def change_password(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def change_password(callback: callbackFn[_]): TransportRequestCallback = js.native
  def change_password(params: SecurityChangePassword[_]): js.Promise[ApiResponse[_, _]] = js.native
  def change_password(params: SecurityChangePassword[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def change_password(params: SecurityChangePassword[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def change_password(params: SecurityChangePassword[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def clearCachedRealms(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clearCachedRealms(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearCachedRealms(params: SecurityClearCachedRealms): js.Promise[ApiResponse[_, _]] = js.native
  def clearCachedRealms(params: SecurityClearCachedRealms, callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearCachedRealms(params: SecurityClearCachedRealms, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clearCachedRealms(params: SecurityClearCachedRealms, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def clearCachedRoles(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clearCachedRoles(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearCachedRoles(params: SecurityClearCachedRoles): js.Promise[ApiResponse[_, _]] = js.native
  def clearCachedRoles(params: SecurityClearCachedRoles, callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearCachedRoles(params: SecurityClearCachedRoles, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clearCachedRoles(params: SecurityClearCachedRoles, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def clear_cached_realms(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clear_cached_realms(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_cached_realms(params: SecurityClearCachedRealms): js.Promise[ApiResponse[_, _]] = js.native
  def clear_cached_realms(params: SecurityClearCachedRealms, callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_cached_realms(params: SecurityClearCachedRealms, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clear_cached_realms(params: SecurityClearCachedRealms, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def clear_cached_roles(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clear_cached_roles(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_cached_roles(params: SecurityClearCachedRoles): js.Promise[ApiResponse[_, _]] = js.native
  def clear_cached_roles(params: SecurityClearCachedRoles, callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_cached_roles(params: SecurityClearCachedRoles, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clear_cached_roles(params: SecurityClearCachedRoles, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def createApiKey(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def createApiKey(callback: callbackFn[_]): TransportRequestCallback = js.native
  def createApiKey(params: SecurityCreateApiKey[_]): js.Promise[ApiResponse[_, _]] = js.native
  def createApiKey(params: SecurityCreateApiKey[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def createApiKey(params: SecurityCreateApiKey[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def createApiKey(params: SecurityCreateApiKey[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def create_api_key(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def create_api_key(callback: callbackFn[_]): TransportRequestCallback = js.native
  def create_api_key(params: SecurityCreateApiKey[_]): js.Promise[ApiResponse[_, _]] = js.native
  def create_api_key(params: SecurityCreateApiKey[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def create_api_key(params: SecurityCreateApiKey[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def create_api_key(params: SecurityCreateApiKey[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deletePrivileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deletePrivileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deletePrivileges(params: SecurityDeletePrivileges): js.Promise[ApiResponse[_, _]] = js.native
  def deletePrivileges(params: SecurityDeletePrivileges, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deletePrivileges(params: SecurityDeletePrivileges, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deletePrivileges(params: SecurityDeletePrivileges, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteRole(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteRole(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteRole(params: SecurityDeleteRole): js.Promise[ApiResponse[_, _]] = js.native
  def deleteRole(params: SecurityDeleteRole, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteRole(params: SecurityDeleteRole, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteRole(params: SecurityDeleteRole, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteRoleMapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteRoleMapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteRoleMapping(params: SecurityDeleteRoleMapping): js.Promise[ApiResponse[_, _]] = js.native
  def deleteRoleMapping(params: SecurityDeleteRoleMapping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteRoleMapping(params: SecurityDeleteRoleMapping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteRoleMapping(params: SecurityDeleteRoleMapping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteUser(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteUser(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteUser(params: SecurityDeleteUser): js.Promise[ApiResponse[_, _]] = js.native
  def deleteUser(params: SecurityDeleteUser, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteUser(params: SecurityDeleteUser, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteUser(params: SecurityDeleteUser, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_privileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_privileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_privileges(params: SecurityDeletePrivileges): js.Promise[ApiResponse[_, _]] = js.native
  def delete_privileges(params: SecurityDeletePrivileges, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_privileges(params: SecurityDeletePrivileges, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_privileges(params: SecurityDeletePrivileges, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_role(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_role(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_role(params: SecurityDeleteRole): js.Promise[ApiResponse[_, _]] = js.native
  def delete_role(params: SecurityDeleteRole, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_role(params: SecurityDeleteRole, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_role(params: SecurityDeleteRole, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_role_mapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_role_mapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_role_mapping(params: SecurityDeleteRoleMapping): js.Promise[ApiResponse[_, _]] = js.native
  def delete_role_mapping(params: SecurityDeleteRoleMapping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_role_mapping(params: SecurityDeleteRoleMapping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_role_mapping(params: SecurityDeleteRoleMapping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_user(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_user(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_user(params: SecurityDeleteUser): js.Promise[ApiResponse[_, _]] = js.native
  def delete_user(params: SecurityDeleteUser, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_user(params: SecurityDeleteUser, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_user(params: SecurityDeleteUser, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def disableUser(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def disableUser(callback: callbackFn[_]): TransportRequestCallback = js.native
  def disableUser(params: SecurityDisableUser): js.Promise[ApiResponse[_, _]] = js.native
  def disableUser(params: SecurityDisableUser, callback: callbackFn[_]): TransportRequestCallback = js.native
  def disableUser(params: SecurityDisableUser, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def disableUser(params: SecurityDisableUser, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def disable_user(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def disable_user(callback: callbackFn[_]): TransportRequestCallback = js.native
  def disable_user(params: SecurityDisableUser): js.Promise[ApiResponse[_, _]] = js.native
  def disable_user(params: SecurityDisableUser, callback: callbackFn[_]): TransportRequestCallback = js.native
  def disable_user(params: SecurityDisableUser, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def disable_user(params: SecurityDisableUser, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def enableUser(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def enableUser(callback: callbackFn[_]): TransportRequestCallback = js.native
  def enableUser(params: SecurityEnableUser): js.Promise[ApiResponse[_, _]] = js.native
  def enableUser(params: SecurityEnableUser, callback: callbackFn[_]): TransportRequestCallback = js.native
  def enableUser(params: SecurityEnableUser, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def enableUser(params: SecurityEnableUser, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def enable_user(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def enable_user(callback: callbackFn[_]): TransportRequestCallback = js.native
  def enable_user(params: SecurityEnableUser): js.Promise[ApiResponse[_, _]] = js.native
  def enable_user(params: SecurityEnableUser, callback: callbackFn[_]): TransportRequestCallback = js.native
  def enable_user(params: SecurityEnableUser, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def enable_user(params: SecurityEnableUser, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getApiKey(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getApiKey(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getApiKey(params: SecurityGetApiKey): js.Promise[ApiResponse[_, _]] = js.native
  def getApiKey(params: SecurityGetApiKey, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getApiKey(params: SecurityGetApiKey, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getApiKey(params: SecurityGetApiKey, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getBuiltinPrivileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getBuiltinPrivileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getBuiltinPrivileges(params: SecurityGetBuiltinPrivileges): js.Promise[ApiResponse[_, _]] = js.native
  def getBuiltinPrivileges(params: SecurityGetBuiltinPrivileges, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getBuiltinPrivileges(params: SecurityGetBuiltinPrivileges, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getBuiltinPrivileges(params: SecurityGetBuiltinPrivileges, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getPrivileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getPrivileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getPrivileges(params: SecurityGetPrivileges): js.Promise[ApiResponse[_, _]] = js.native
  def getPrivileges(params: SecurityGetPrivileges, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getPrivileges(params: SecurityGetPrivileges, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getPrivileges(params: SecurityGetPrivileges, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getRole(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getRole(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRole(params: SecurityGetRole): js.Promise[ApiResponse[_, _]] = js.native
  def getRole(params: SecurityGetRole, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRole(params: SecurityGetRole, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getRole(params: SecurityGetRole, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getRoleMapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getRoleMapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRoleMapping(params: SecurityGetRoleMapping): js.Promise[ApiResponse[_, _]] = js.native
  def getRoleMapping(params: SecurityGetRoleMapping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRoleMapping(params: SecurityGetRoleMapping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getRoleMapping(params: SecurityGetRoleMapping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getToken(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getToken(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getToken(params: SecurityGetToken[_]): js.Promise[ApiResponse[_, _]] = js.native
  def getToken(params: SecurityGetToken[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def getToken(params: SecurityGetToken[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getToken(params: SecurityGetToken[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getUser(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getUser(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getUser(params: SecurityGetUser): js.Promise[ApiResponse[_, _]] = js.native
  def getUser(params: SecurityGetUser, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getUser(params: SecurityGetUser, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getUser(params: SecurityGetUser, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getUserPrivileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getUserPrivileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getUserPrivileges(params: SecurityGetUserPrivileges): js.Promise[ApiResponse[_, _]] = js.native
  def getUserPrivileges(params: SecurityGetUserPrivileges, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getUserPrivileges(params: SecurityGetUserPrivileges, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getUserPrivileges(params: SecurityGetUserPrivileges, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_api_key(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_api_key(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_api_key(params: SecurityGetApiKey): js.Promise[ApiResponse[_, _]] = js.native
  def get_api_key(params: SecurityGetApiKey, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_api_key(params: SecurityGetApiKey, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_api_key(params: SecurityGetApiKey, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_builtin_privileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_builtin_privileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_builtin_privileges(params: SecurityGetBuiltinPrivileges): js.Promise[ApiResponse[_, _]] = js.native
  def get_builtin_privileges(params: SecurityGetBuiltinPrivileges, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_builtin_privileges(params: SecurityGetBuiltinPrivileges, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_builtin_privileges(params: SecurityGetBuiltinPrivileges, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_privileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_privileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_privileges(params: SecurityGetPrivileges): js.Promise[ApiResponse[_, _]] = js.native
  def get_privileges(params: SecurityGetPrivileges, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_privileges(params: SecurityGetPrivileges, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_privileges(params: SecurityGetPrivileges, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_role(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_role(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_role(params: SecurityGetRole): js.Promise[ApiResponse[_, _]] = js.native
  def get_role(params: SecurityGetRole, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_role(params: SecurityGetRole, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_role(params: SecurityGetRole, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_role_mapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_role_mapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_role_mapping(params: SecurityGetRoleMapping): js.Promise[ApiResponse[_, _]] = js.native
  def get_role_mapping(params: SecurityGetRoleMapping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_role_mapping(params: SecurityGetRoleMapping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_role_mapping(params: SecurityGetRoleMapping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_token(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_token(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_token(params: SecurityGetToken[_]): js.Promise[ApiResponse[_, _]] = js.native
  def get_token(params: SecurityGetToken[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_token(params: SecurityGetToken[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_token(params: SecurityGetToken[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_user(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_user(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_user(params: SecurityGetUser): js.Promise[ApiResponse[_, _]] = js.native
  def get_user(params: SecurityGetUser, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_user(params: SecurityGetUser, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_user(params: SecurityGetUser, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_user_privileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_user_privileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_user_privileges(params: SecurityGetUserPrivileges): js.Promise[ApiResponse[_, _]] = js.native
  def get_user_privileges(params: SecurityGetUserPrivileges, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_user_privileges(params: SecurityGetUserPrivileges, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_user_privileges(params: SecurityGetUserPrivileges, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def hasPrivileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def hasPrivileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def hasPrivileges(params: SecurityHasPrivileges[_]): js.Promise[ApiResponse[_, _]] = js.native
  def hasPrivileges(params: SecurityHasPrivileges[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def hasPrivileges(params: SecurityHasPrivileges[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def hasPrivileges(params: SecurityHasPrivileges[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def has_privileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def has_privileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def has_privileges(params: SecurityHasPrivileges[_]): js.Promise[ApiResponse[_, _]] = js.native
  def has_privileges(params: SecurityHasPrivileges[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def has_privileges(params: SecurityHasPrivileges[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def has_privileges(params: SecurityHasPrivileges[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def invalidateApiKey(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def invalidateApiKey(callback: callbackFn[_]): TransportRequestCallback = js.native
  def invalidateApiKey(params: SecurityInvalidateApiKey[_]): js.Promise[ApiResponse[_, _]] = js.native
  def invalidateApiKey(params: SecurityInvalidateApiKey[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def invalidateApiKey(params: SecurityInvalidateApiKey[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def invalidateApiKey(params: SecurityInvalidateApiKey[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def invalidateToken(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def invalidateToken(callback: callbackFn[_]): TransportRequestCallback = js.native
  def invalidateToken(params: SecurityInvalidateToken[_]): js.Promise[ApiResponse[_, _]] = js.native
  def invalidateToken(params: SecurityInvalidateToken[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def invalidateToken(params: SecurityInvalidateToken[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def invalidateToken(params: SecurityInvalidateToken[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def invalidate_api_key(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def invalidate_api_key(callback: callbackFn[_]): TransportRequestCallback = js.native
  def invalidate_api_key(params: SecurityInvalidateApiKey[_]): js.Promise[ApiResponse[_, _]] = js.native
  def invalidate_api_key(params: SecurityInvalidateApiKey[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def invalidate_api_key(params: SecurityInvalidateApiKey[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def invalidate_api_key(params: SecurityInvalidateApiKey[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def invalidate_token(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def invalidate_token(callback: callbackFn[_]): TransportRequestCallback = js.native
  def invalidate_token(params: SecurityInvalidateToken[_]): js.Promise[ApiResponse[_, _]] = js.native
  def invalidate_token(params: SecurityInvalidateToken[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def invalidate_token(params: SecurityInvalidateToken[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def invalidate_token(params: SecurityInvalidateToken[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putPrivileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putPrivileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putPrivileges(params: SecurityPutPrivileges[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putPrivileges(params: SecurityPutPrivileges[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putPrivileges(params: SecurityPutPrivileges[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putPrivileges(params: SecurityPutPrivileges[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putRole(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putRole(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putRole(params: SecurityPutRole[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putRole(params: SecurityPutRole[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putRole(params: SecurityPutRole[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putRole(params: SecurityPutRole[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putRoleMapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putRoleMapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putRoleMapping(params: SecurityPutRoleMapping[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putRoleMapping(params: SecurityPutRoleMapping[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putRoleMapping(params: SecurityPutRoleMapping[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putRoleMapping(params: SecurityPutRoleMapping[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putUser(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putUser(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putUser(params: SecurityPutUser[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putUser(params: SecurityPutUser[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putUser(params: SecurityPutUser[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putUser(params: SecurityPutUser[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_privileges(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_privileges(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_privileges(params: SecurityPutPrivileges[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_privileges(params: SecurityPutPrivileges[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_privileges(params: SecurityPutPrivileges[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_privileges(params: SecurityPutPrivileges[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_role(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_role(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_role(params: SecurityPutRole[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_role(params: SecurityPutRole[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_role(params: SecurityPutRole[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_role(params: SecurityPutRole[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_role_mapping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_role_mapping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_role_mapping(params: SecurityPutRoleMapping[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_role_mapping(params: SecurityPutRoleMapping[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_role_mapping(params: SecurityPutRoleMapping[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_role_mapping(params: SecurityPutRoleMapping[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_user(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_user(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_user(params: SecurityPutUser[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_user(params: SecurityPutUser[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_user(params: SecurityPutUser[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_user(params: SecurityPutUser[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

