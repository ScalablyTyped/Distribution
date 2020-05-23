package typings.firebaseAdmin.admin.machineLearning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TensorFlow Lite Model output object
  */
trait TFLiteModel extends js.Object {
  /** The URI from which the model was originally provided to Firebase. */
  val gcsTfliteUri: js.UndefOr[String] = js.undefined
  /** The size of the model. */
  val sizeBytes: Double
}

object TFLiteModel {
  @scala.inline
  def apply(sizeBytes: Double, gcsTfliteUri: String = null): TFLiteModel = {
    val __obj = js.Dynamic.literal(sizeBytes = sizeBytes.asInstanceOf[js.Any])
    if (gcsTfliteUri != null) __obj.updateDynamic("gcsTfliteUri")(gcsTfliteUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TFLiteModel]
  }
}

