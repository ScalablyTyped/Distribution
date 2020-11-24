package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/binaryauthorization/v1beta1", "binaryauthorization_v1beta1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var attestors: ResourceProjectsAttestors = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * binaryauthorization.projects.getPolicy
    * @desc Gets the policy for this project. Returns a default policy if the
    * project does not have one.
    * @alias binaryauthorization.projects.getPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the policy to retrieve, in the format `projects/x/policy`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(params: ParamsResourceProjectsGetpolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(params: ParamsResourceProjectsGetpolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getPolicy(
    params: ParamsResourceProjectsGetpolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getPolicy(params: ParamsResourceProjectsGetpolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getPolicy(
    params: ParamsResourceProjectsGetpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  var policy: ResourceProjectsPolicy = js.native
  
  /**
    * binaryauthorization.projects.updatePolicy
    * @desc Creates or updates a project's policy, and returns a copy of the
    * new policy. A policy is always updated as a whole, to avoid race
    * conditions with concurrent policy enforcement (or management!) requests.
    * Returns NOT_FOUND if the project does not exist, INVALID_ARGUMENT if the
    * request is malformed.
    * @alias binaryauthorization.projects.updatePolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The resource name, in the format `projects/x/policy`. There is at most one policy per project.
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatePolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def updatePolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def updatePolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def updatePolicy(params: ParamsResourceProjectsUpdatepolicy): GaxiosPromise[SchemaPolicy] = js.native
  def updatePolicy(params: ParamsResourceProjectsUpdatepolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def updatePolicy(
    params: ParamsResourceProjectsUpdatepolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def updatePolicy(params: ParamsResourceProjectsUpdatepolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def updatePolicy(
    params: ParamsResourceProjectsUpdatepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
}
