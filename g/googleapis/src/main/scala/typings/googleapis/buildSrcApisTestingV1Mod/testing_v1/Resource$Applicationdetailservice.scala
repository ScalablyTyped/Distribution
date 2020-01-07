package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Resource$Applicationdetailservice")
@js.native
class Resource$Applicationdetailservice protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * testing.applicationDetailService.getApkDetails
    * @desc Gets the details of an Android application APK.
    * @alias testing.applicationDetailService.getApkDetails
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().FileReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getApkDetails(): GaxiosPromise[Schema$GetApkDetailsResponse] = js.native
  def getApkDetails(callback: BodyResponseCallback[Schema$GetApkDetailsResponse]): Unit = js.native
  def getApkDetails(params: ParamsDollarResourceDollarApplicationdetailserviceDollarGetapkdetails): GaxiosPromise[Schema$GetApkDetailsResponse] = js.native
  def getApkDetails(
    params: ParamsDollarResourceDollarApplicationdetailserviceDollarGetapkdetails,
    callback: BodyResponseCallback[Schema$GetApkDetailsResponse]
  ): Unit = js.native
  def getApkDetails(
    params: ParamsDollarResourceDollarApplicationdetailserviceDollarGetapkdetails,
    options: BodyResponseCallback[Schema$GetApkDetailsResponse],
    callback: BodyResponseCallback[Schema$GetApkDetailsResponse]
  ): Unit = js.native
  def getApkDetails(
    params: ParamsDollarResourceDollarApplicationdetailserviceDollarGetapkdetails,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetApkDetailsResponse] = js.native
  def getApkDetails(
    params: ParamsDollarResourceDollarApplicationdetailserviceDollarGetapkdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetApkDetailsResponse]
  ): Unit = js.native
}

