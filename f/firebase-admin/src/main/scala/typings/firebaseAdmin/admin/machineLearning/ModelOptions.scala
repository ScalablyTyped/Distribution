package typings.firebaseAdmin.admin.machineLearning

import typings.firebaseAdmin.anon.GcsTfliteUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Firebase ML Model input object
  */
trait ModelOptions extends js.Object {
  /** A name for the model. This is the name you use from your app to load the model. */
  var displayName: js.UndefOr[String] = js.undefined
  /** Tags for easier model management. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An object containing the URI of the model in Cloud Storage.
    *
    * Example: `tfliteModel: { gcsTfliteUri: 'gs://your-bucket/your-model.tflite' }`
    */
  var tfliteModel: js.UndefOr[GcsTfliteUri] = js.undefined
}

object ModelOptions {
  @scala.inline
  def apply(displayName: String = null, tags: js.Array[String] = null, tfliteModel: GcsTfliteUri = null): ModelOptions = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tfliteModel != null) __obj.updateDynamic("tfliteModel")(tfliteModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelOptions]
  }
}

