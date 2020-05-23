package typings.firebaseAdmin.admin.machineLearning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing options for listing Models.
  */
trait ListModelsOptions extends js.Object {
  /**
    * An expression that specifies how to filter the results.
    *
    * Examples:
    *
    * ```
    * display_name = your_model
    * display_name : experimental_*
    * tags: face_detector AND tags: experimental
    * state.published = true
    * ```
    *
    * See https://firebase.google.com/docs/ml-kit/manage-hosted-models#list_your_projects_models
    */
  var filter: js.UndefOr[String] = js.undefined
  /** The number of results to return in each page. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** A token that specifies the result page to return. */
  var pageToken: js.UndefOr[String] = js.undefined
}

object ListModelsOptions {
  @scala.inline
  def apply(filter: String = null, pageSize: js.UndefOr[Double] = js.undefined, pageToken: String = null): ListModelsOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsOptions]
  }
}

