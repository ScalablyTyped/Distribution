package typings.firebaseAdmin.admin.machineLearning

import typings.firebaseAdmin.admin.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Firebase `MachineLearning` service interface.
  *
  * Do not call this constructor directly. Instead, use
  * [`admin.machineLearning()`](admin.machineLearning#machineLearning).
  */
@js.native
trait MachineLearning extends js.Object {
  /**
    *  The {@link admin.app.App} associated with the current `MachineLearning`
    *  service instance.
    */
  var app: App = js.native
  /**
    * Creates a model in Firebase ML.
    *
    * @param {ModelOptions} model The model to create.
    *
    * @return {Promise<Model>} A Promise fulfilled with the created model.
    */
  def createModel(model: ModelOptions): js.Promise[Model] = js.native
  /**
    * Deletes a model from Firebase ML.
    *
    * @param {string} modelId The ID of the model to delete.
    */
  def deleteModel(modelId: String): js.Promise[Unit] = js.native
  /**
    * Gets a model from Firebase ML.
    *
    * @param {string} modelId The ID of the model to get.
    *
    * @return {Promise<Model>} A Promise fulfilled with the model object.
    */
  def getModel(modelId: String): js.Promise[Model] = js.native
  /**
    * Lists models from Firebase ML.
    *
    * @param {ListModelsOptions} options The listing options.
    *
    * @return {Promise<ListModelsResult>} A promise that
    *     resolves with the current (filtered) list of models and the next page
    *     token. For the last page, an empty list of models and no page token
    *     are returned.
    */
  def listModels(): js.Promise[ListModelsResult] = js.native
  def listModels(options: ListModelsOptions): js.Promise[ListModelsResult] = js.native
  /**
    * Publishes a model in Firebase ML.
    *
    * @param {string} modelId The ID of the model to publish.
    *
    * @return {Promise<Model>} A Promise fulfilled with the published model.
    */
  def publishModel(modelId: String): js.Promise[Model] = js.native
  /**
    * Unpublishes a model in Firebase ML.
    *
    * @param {string} modelId The ID of the model to unpublish.
    *
    * @return {Promise<Model>} A Promise fulfilled with the unpublished model.
    */
  def unpublishModel(modelId: String): js.Promise[Model] = js.native
  /**
    * Updates a model in Firebase ML.
    *
    * @param {string} modelId The ID of the model to update.
    * @param {ModelOptions} model The model fields to update.
    *
    * @return {Promise<Model>} A Promise fulfilled with the updated model.
    */
  def updateModel(modelId: String, model: ModelOptions): js.Promise[Model] = js.native
}

