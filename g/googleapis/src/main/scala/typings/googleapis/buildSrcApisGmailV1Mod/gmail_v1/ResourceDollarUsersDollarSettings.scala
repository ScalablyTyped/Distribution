package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings")
@js.native
class ResourceDollarUsersDollarSettings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var delegates: ResourceDollarUsersDollarSettingsDollarDelegates = js.native
  var filters: ResourceDollarUsersDollarSettingsDollarFilters = js.native
  var forwardingAddresses: ResourceDollarUsersDollarSettingsDollarForwardingaddresses = js.native
  var sendAs: ResourceDollarUsersDollarSettingsDollarSendas = js.native
  /**
    * gmail.users.settings.getAutoForwarding
    * @desc Gets the auto-forwarding setting for the specified account.
    * @alias gmail.users.settings.getAutoForwarding
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAutoForwarding(): GaxiosPromise[Schema$AutoForwarding] = js.native
  def getAutoForwarding(callback: BodyResponseCallback[Schema$AutoForwarding]): Unit = js.native
  def getAutoForwarding(params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetautoforwarding): GaxiosPromise[Schema$AutoForwarding] = js.native
  def getAutoForwarding(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetautoforwarding,
    callback: BodyResponseCallback[Schema$AutoForwarding]
  ): Unit = js.native
  def getAutoForwarding(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetautoforwarding,
    options: BodyResponseCallback[Schema$AutoForwarding],
    callback: BodyResponseCallback[Schema$AutoForwarding]
  ): Unit = js.native
  def getAutoForwarding(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetautoforwarding,
    options: MethodOptions
  ): GaxiosPromise[Schema$AutoForwarding] = js.native
  def getAutoForwarding(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetautoforwarding,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AutoForwarding]
  ): Unit = js.native
  /**
    * gmail.users.settings.getImap
    * @desc Gets IMAP settings.
    * @alias gmail.users.settings.getImap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getImap(): GaxiosPromise[Schema$ImapSettings] = js.native
  def getImap(callback: BodyResponseCallback[Schema$ImapSettings]): Unit = js.native
  def getImap(params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetimap): GaxiosPromise[Schema$ImapSettings] = js.native
  def getImap(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetimap,
    callback: BodyResponseCallback[Schema$ImapSettings]
  ): Unit = js.native
  def getImap(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetimap,
    options: BodyResponseCallback[Schema$ImapSettings],
    callback: BodyResponseCallback[Schema$ImapSettings]
  ): Unit = js.native
  def getImap(params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetimap, options: MethodOptions): GaxiosPromise[Schema$ImapSettings] = js.native
  def getImap(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetimap,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ImapSettings]
  ): Unit = js.native
  /**
    * gmail.users.settings.getPop
    * @desc Gets POP settings.
    * @alias gmail.users.settings.getPop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getPop(): GaxiosPromise[Schema$PopSettings] = js.native
  def getPop(callback: BodyResponseCallback[Schema$PopSettings]): Unit = js.native
  def getPop(params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetpop): GaxiosPromise[Schema$PopSettings] = js.native
  def getPop(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetpop,
    callback: BodyResponseCallback[Schema$PopSettings]
  ): Unit = js.native
  def getPop(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetpop,
    options: BodyResponseCallback[Schema$PopSettings],
    callback: BodyResponseCallback[Schema$PopSettings]
  ): Unit = js.native
  def getPop(params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetpop, options: MethodOptions): GaxiosPromise[Schema$PopSettings] = js.native
  def getPop(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetpop,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PopSettings]
  ): Unit = js.native
  /**
    * gmail.users.settings.getVacation
    * @desc Gets vacation responder settings.
    * @alias gmail.users.settings.getVacation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getVacation(): GaxiosPromise[Schema$VacationSettings] = js.native
  def getVacation(callback: BodyResponseCallback[Schema$VacationSettings]): Unit = js.native
  def getVacation(params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetvacation): GaxiosPromise[Schema$VacationSettings] = js.native
  def getVacation(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetvacation,
    callback: BodyResponseCallback[Schema$VacationSettings]
  ): Unit = js.native
  def getVacation(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetvacation,
    options: BodyResponseCallback[Schema$VacationSettings],
    callback: BodyResponseCallback[Schema$VacationSettings]
  ): Unit = js.native
  def getVacation(params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetvacation, options: MethodOptions): GaxiosPromise[Schema$VacationSettings] = js.native
  def getVacation(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarGetvacation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VacationSettings]
  ): Unit = js.native
  /**
    * gmail.users.settings.updateAutoForwarding
    * @desc Updates the auto-forwarding setting for the specified account. A
    * verified forwarding address must be specified when auto-forwarding is
    * enabled.  This method is only available to service account clients that
    * have been delegated domain-wide authority.
    * @alias gmail.users.settings.updateAutoForwarding
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().AutoForwarding} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateAutoForwarding(): GaxiosPromise[Schema$AutoForwarding] = js.native
  def updateAutoForwarding(callback: BodyResponseCallback[Schema$AutoForwarding]): Unit = js.native
  def updateAutoForwarding(params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateautoforwarding): GaxiosPromise[Schema$AutoForwarding] = js.native
  def updateAutoForwarding(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateautoforwarding,
    callback: BodyResponseCallback[Schema$AutoForwarding]
  ): Unit = js.native
  def updateAutoForwarding(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateautoforwarding,
    options: BodyResponseCallback[Schema$AutoForwarding],
    callback: BodyResponseCallback[Schema$AutoForwarding]
  ): Unit = js.native
  def updateAutoForwarding(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateautoforwarding,
    options: MethodOptions
  ): GaxiosPromise[Schema$AutoForwarding] = js.native
  def updateAutoForwarding(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateautoforwarding,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AutoForwarding]
  ): Unit = js.native
  /**
    * gmail.users.settings.updateImap
    * @desc Updates IMAP settings.
    * @alias gmail.users.settings.updateImap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().ImapSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateImap(): GaxiosPromise[Schema$ImapSettings] = js.native
  def updateImap(callback: BodyResponseCallback[Schema$ImapSettings]): Unit = js.native
  def updateImap(params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateimap): GaxiosPromise[Schema$ImapSettings] = js.native
  def updateImap(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateimap,
    callback: BodyResponseCallback[Schema$ImapSettings]
  ): Unit = js.native
  def updateImap(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateimap,
    options: BodyResponseCallback[Schema$ImapSettings],
    callback: BodyResponseCallback[Schema$ImapSettings]
  ): Unit = js.native
  def updateImap(params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateimap, options: MethodOptions): GaxiosPromise[Schema$ImapSettings] = js.native
  def updateImap(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdateimap,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ImapSettings]
  ): Unit = js.native
  /**
    * gmail.users.settings.updatePop
    * @desc Updates POP settings.
    * @alias gmail.users.settings.updatePop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().PopSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatePop(): GaxiosPromise[Schema$PopSettings] = js.native
  def updatePop(callback: BodyResponseCallback[Schema$PopSettings]): Unit = js.native
  def updatePop(params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatepop): GaxiosPromise[Schema$PopSettings] = js.native
  def updatePop(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatepop,
    callback: BodyResponseCallback[Schema$PopSettings]
  ): Unit = js.native
  def updatePop(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatepop,
    options: BodyResponseCallback[Schema$PopSettings],
    callback: BodyResponseCallback[Schema$PopSettings]
  ): Unit = js.native
  def updatePop(params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatepop, options: MethodOptions): GaxiosPromise[Schema$PopSettings] = js.native
  def updatePop(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatepop,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PopSettings]
  ): Unit = js.native
  /**
    * gmail.users.settings.updateVacation
    * @desc Updates vacation responder settings.
    * @alias gmail.users.settings.updateVacation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().VacationSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateVacation(): GaxiosPromise[Schema$VacationSettings] = js.native
  def updateVacation(callback: BodyResponseCallback[Schema$VacationSettings]): Unit = js.native
  def updateVacation(params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatevacation): GaxiosPromise[Schema$VacationSettings] = js.native
  def updateVacation(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatevacation,
    callback: BodyResponseCallback[Schema$VacationSettings]
  ): Unit = js.native
  def updateVacation(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatevacation,
    options: BodyResponseCallback[Schema$VacationSettings],
    callback: BodyResponseCallback[Schema$VacationSettings]
  ): Unit = js.native
  def updateVacation(params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatevacation, options: MethodOptions): GaxiosPromise[Schema$VacationSettings] = js.native
  def updateVacation(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarUpdatevacation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VacationSettings]
  ): Unit = js.native
}

