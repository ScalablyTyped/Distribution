package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Onboarding")
@js.native
class ResourceOnboarding protected () extends js.Object {
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
  def listCategories(): GaxiosPromise[SchemaCategory] = js.native
  def listCategories(callback: BodyResponseCallback[SchemaCategory]): Unit = js.native
  def listCategories(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCategory] = js.native
  def listCategories(params: ParamsResourceOnboardingListcategories): GaxiosPromise[SchemaCategory] = js.native
  def listCategories(params: ParamsResourceOnboardingListcategories, callback: BodyResponseCallback[SchemaCategory]): Unit = js.native
  def listCategories(
    params: ParamsResourceOnboardingListcategories,
    options: BodyResponseCallback[SchemaCategory],
    callback: BodyResponseCallback[SchemaCategory]
  ): Unit = js.native
  def listCategories(params: ParamsResourceOnboardingListcategories, options: MethodOptions): GaxiosPromise[SchemaCategory] = js.native
  def listCategories(
    params: ParamsResourceOnboardingListcategories,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCategory]
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
  def listCategoryVolumes(): GaxiosPromise[SchemaVolume2] = js.native
  def listCategoryVolumes(callback: BodyResponseCallback[SchemaVolume2]): Unit = js.native
  def listCategoryVolumes(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVolume2] = js.native
  def listCategoryVolumes(params: ParamsResourceOnboardingListcategoryvolumes): GaxiosPromise[SchemaVolume2] = js.native
  def listCategoryVolumes(params: ParamsResourceOnboardingListcategoryvolumes, callback: BodyResponseCallback[SchemaVolume2]): Unit = js.native
  def listCategoryVolumes(
    params: ParamsResourceOnboardingListcategoryvolumes,
    options: BodyResponseCallback[SchemaVolume2],
    callback: BodyResponseCallback[SchemaVolume2]
  ): Unit = js.native
  def listCategoryVolumes(params: ParamsResourceOnboardingListcategoryvolumes, options: MethodOptions): GaxiosPromise[SchemaVolume2] = js.native
  def listCategoryVolumes(
    params: ParamsResourceOnboardingListcategoryvolumes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolume2]
  ): Unit = js.native
}

