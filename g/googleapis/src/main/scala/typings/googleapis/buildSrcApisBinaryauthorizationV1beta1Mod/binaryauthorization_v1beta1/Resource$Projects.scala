package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/binaryauthorization/v1beta1", "binaryauthorization_v1beta1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var attestors: ResourceDollarProjectsDollarAttestors = js.native
  var context: APIRequestContext = js.native
  var policy: ResourceDollarProjectsDollarPolicy = js.native
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
  def getPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getPolicy(params: ParamsDollarResourceDollarProjectsDollarGetpolicy): GaxiosPromise[Schema$Policy] = js.native
  def getPolicy(
    params: ParamsDollarResourceDollarProjectsDollarGetpolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getPolicy(
    params: ParamsDollarResourceDollarProjectsDollarGetpolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getPolicy(params: ParamsDollarResourceDollarProjectsDollarGetpolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getPolicy(
    params: ParamsDollarResourceDollarProjectsDollarGetpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
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
  def updatePolicy(): GaxiosPromise[Schema$Policy] = js.native
  def updatePolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def updatePolicy(params: ParamsDollarResourceDollarProjectsDollarUpdatepolicy): GaxiosPromise[Schema$Policy] = js.native
  def updatePolicy(
    params: ParamsDollarResourceDollarProjectsDollarUpdatepolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def updatePolicy(
    params: ParamsDollarResourceDollarProjectsDollarUpdatepolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def updatePolicy(params: ParamsDollarResourceDollarProjectsDollarUpdatepolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def updatePolicy(
    params: ParamsDollarResourceDollarProjectsDollarUpdatepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
}

