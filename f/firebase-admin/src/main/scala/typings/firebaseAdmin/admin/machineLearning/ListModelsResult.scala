package typings.firebaseAdmin.admin.machineLearning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Response object for a listModels operation. */
trait ListModelsResult extends js.Object {
  /** A list of models in your project. */
  val models: js.Array[Model]
  /**
    * A token you can use to retrieve the next page of results. If null, the
    * current page is the final page.
    */
  val pageToken: js.UndefOr[String] = js.undefined
}

object ListModelsResult {
  @scala.inline
  def apply(models: js.Array[Model], pageToken: String = null): ListModelsResult = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsResult]
  }
}

