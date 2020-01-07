package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Provisioning")
@js.native
class Resource$Provisioning protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.provisioning.createAccountTicket
    * @desc Creates an account ticket.
    * @alias analytics.provisioning.createAccountTicket
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccountTicket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createAccountTicket(): GaxiosPromise[Schema$AccountTicket] = js.native
  def createAccountTicket(callback: BodyResponseCallback[Schema$AccountTicket]): Unit = js.native
  def createAccountTicket(params: ParamsDollarResourceDollarProvisioningDollarCreateaccountticket): GaxiosPromise[Schema$AccountTicket] = js.native
  def createAccountTicket(
    params: ParamsDollarResourceDollarProvisioningDollarCreateaccountticket,
    callback: BodyResponseCallback[Schema$AccountTicket]
  ): Unit = js.native
  def createAccountTicket(
    params: ParamsDollarResourceDollarProvisioningDollarCreateaccountticket,
    options: BodyResponseCallback[Schema$AccountTicket],
    callback: BodyResponseCallback[Schema$AccountTicket]
  ): Unit = js.native
  def createAccountTicket(params: ParamsDollarResourceDollarProvisioningDollarCreateaccountticket, options: MethodOptions): GaxiosPromise[Schema$AccountTicket] = js.native
  def createAccountTicket(
    params: ParamsDollarResourceDollarProvisioningDollarCreateaccountticket,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountTicket]
  ): Unit = js.native
  /**
    * analytics.provisioning.createAccountTree
    * @desc Provision account.
    * @alias analytics.provisioning.createAccountTree
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccountTreeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createAccountTree(): GaxiosPromise[Schema$AccountTreeResponse] = js.native
  def createAccountTree(callback: BodyResponseCallback[Schema$AccountTreeResponse]): Unit = js.native
  def createAccountTree(params: ParamsDollarResourceDollarProvisioningDollarCreateaccounttree): GaxiosPromise[Schema$AccountTreeResponse] = js.native
  def createAccountTree(
    params: ParamsDollarResourceDollarProvisioningDollarCreateaccounttree,
    callback: BodyResponseCallback[Schema$AccountTreeResponse]
  ): Unit = js.native
  def createAccountTree(
    params: ParamsDollarResourceDollarProvisioningDollarCreateaccounttree,
    options: BodyResponseCallback[Schema$AccountTreeResponse],
    callback: BodyResponseCallback[Schema$AccountTreeResponse]
  ): Unit = js.native
  def createAccountTree(params: ParamsDollarResourceDollarProvisioningDollarCreateaccounttree, options: MethodOptions): GaxiosPromise[Schema$AccountTreeResponse] = js.native
  def createAccountTree(
    params: ParamsDollarResourceDollarProvisioningDollarCreateaccounttree,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountTreeResponse]
  ): Unit = js.native
}

