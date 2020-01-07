package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Onboarding")
@js.native
class Resource$Onboarding protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.onboarding.listCategories
    * @desc List categories for onboarding experience.
    * @alias books.onboarding.listCategories
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Default is en-US if unset.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listCategories(): GaxiosPromise[Schema$Category] = js.native
  def listCategories(callback: BodyResponseCallback[Schema$Category]): Unit = js.native
  def listCategories(params: ParamsDollarResourceDollarOnboardingDollarListcategories): GaxiosPromise[Schema$Category] = js.native
  def listCategories(
    params: ParamsDollarResourceDollarOnboardingDollarListcategories,
    callback: BodyResponseCallback[Schema$Category]
  ): Unit = js.native
  def listCategories(
    params: ParamsDollarResourceDollarOnboardingDollarListcategories,
    options: BodyResponseCallback[Schema$Category],
    callback: BodyResponseCallback[Schema$Category]
  ): Unit = js.native
  def listCategories(params: ParamsDollarResourceDollarOnboardingDollarListcategories, options: MethodOptions): GaxiosPromise[Schema$Category] = js.native
  def listCategories(
    params: ParamsDollarResourceDollarOnboardingDollarListcategories,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Category]
  ): Unit = js.native
  /**
    * books.onboarding.listCategoryVolumes
    * @desc List available volumes under categories for onboarding experience.
    * @alias books.onboarding.listCategoryVolumes
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.categoryId List of category ids requested.
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Default is en-US if unset.
    * @param {string=} params.maxAllowedMaturityRating The maximum allowed maturity rating of returned volumes. Books with a higher maturity rating are filtered out.
    * @param {integer=} params.pageSize Number of maximum results per page to be included in the response.
    * @param {string=} params.pageToken The value of the nextToken from the previous page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listCategoryVolumes(): GaxiosPromise[Schema$Volume2] = js.native
  def listCategoryVolumes(callback: BodyResponseCallback[Schema$Volume2]): Unit = js.native
  def listCategoryVolumes(params: ParamsDollarResourceDollarOnboardingDollarListcategoryvolumes): GaxiosPromise[Schema$Volume2] = js.native
  def listCategoryVolumes(
    params: ParamsDollarResourceDollarOnboardingDollarListcategoryvolumes,
    callback: BodyResponseCallback[Schema$Volume2]
  ): Unit = js.native
  def listCategoryVolumes(
    params: ParamsDollarResourceDollarOnboardingDollarListcategoryvolumes,
    options: BodyResponseCallback[Schema$Volume2],
    callback: BodyResponseCallback[Schema$Volume2]
  ): Unit = js.native
  def listCategoryVolumes(params: ParamsDollarResourceDollarOnboardingDollarListcategoryvolumes, options: MethodOptions): GaxiosPromise[Schema$Volume2] = js.native
  def listCategoryVolumes(
    params: ParamsDollarResourceDollarOnboardingDollarListcategoryvolumes,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Volume2]
  ): Unit = js.native
}

