package typings.firebaseAdmin.admin.machineLearning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Firebase ML Model output object
  */
@js.native
trait Model extends js.Object {
  /** The timestamp of the model's creation. */
  val createTime: String = js.native
  /** The model's name. This is the name you use from your app to load the model. */
  val displayName: String = js.native
  /**
    * The ETag identifier of the current version of the model. This value
    * changes whenever you update any of the model's properties.
    */
  val etag: String = js.native
  /**
    * True if the model is locked by a server-side operation. You can't make
    * changes to a locked model. See {@link waitForUnlocked `waitForUnlocked()`}.
    */
  val locked: Boolean = js.native
  /**
    * The hash of the model's `tflite` file. This value changes only when
    * you upload a new TensorFlow Lite model.
    */
  val modelHash: js.UndefOr[String] = js.native
  /** The ID of the model. */
  val modelId: String = js.native
  /** True if the model is published. */
  val published: Boolean = js.native
  /** The model's tags. */
  val tags: js.UndefOr[js.Array[String]] = js.native
  /** Metadata about the model's TensorFlow Lite model file. */
  val tfliteModel: js.UndefOr[TFLiteModel] = js.native
  /** The timestamp of the model's most recent update. */
  val updateTime: String = js.native
  /** Error message when model validation fails. */
  val validationError: js.UndefOr[String] = js.native
  /**
    * Wait for the model to be unlocked.
    *
    * @param {number} maxTimeSeconds The maximum time in seconds to wait.
    *
    * @return {Promise<void>} A promise that resolves when the model is unlocked
    *   or the maximum wait time has passed.
    */
  def waitForUnlocked(): js.Promise[Unit] = js.native
  def waitForUnlocked(maxTimeSeconds: Double): js.Promise[Unit] = js.native
}

