package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1PredictionInput extends js.Object {
  /**
    * Optional. Number of records per batch, defaults to 64.
    * The service will buffer batch_size number of records in memory before
    * invoking one Tensorflow prediction call internally. So take the record
    * size and memory available into consideration when setting this parameter.
    */
  var batchSize: js.UndefOr[String] = js.native
  /** Required. The format of the input data files. */
  var dataFormat: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud Storage location of the input data files.
    * May contain wildcards.
    */
  var inputPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The maximum number of workers to be used for parallel processing.
    * Defaults to 10 if not specified.
    */
  var maxWorkerCount: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to use the default version for the specified
    * model. The string must use the following format:
    *
    * `"projects/<var>[YOUR_PROJECT]</var>/models/<var>[YOUR_MODEL]</var>"`
    */
  var modelName: js.UndefOr[String] = js.native
  /** Required. The output Google Cloud Storage location. */
  var outputPath: js.UndefOr[String] = js.native
  /** Required. The Google Compute Engine region to run the prediction job in. */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. The Google Cloud ML runtime version to use for this batch
    * prediction. If not set, Google Cloud ML will pick the runtime version used
    * during the CreateVersion request for this model version, or choose the
    * latest stable version when model version information is not available
    * such as when the model is specified by uri.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to specify a Google Cloud Storage path for
    * the model to use.
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to specify a version of the model to use. The
    * string is formatted the same way as `model_version`, with the addition
    * of the version information:
    *
    * `"projects/<var>[YOUR_PROJECT]</var>/models/<var>YOUR_MODEL/versions/<var>[YOUR_VERSION]</var>"`
    */
  var versionName: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1PredictionInput {
  @scala.inline
  def apply(): GoogleCloudMlV1PredictionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1PredictionInput]
  }
  @scala.inline
  implicit class GoogleCloudMlV1PredictionInputOps[Self <: GoogleCloudMlV1PredictionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchSize(value: String): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setDataFormat(value: String): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    @scala.inline
    def setInputPathsVarargs(value: String*): Self = this.set("inputPaths", js.Array(value :_*))
    @scala.inline
    def setInputPaths(value: js.Array[String]): Self = this.set("inputPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPaths: Self = this.set("inputPaths", js.undefined)
    @scala.inline
    def setMaxWorkerCount(value: String): Self = this.set("maxWorkerCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWorkerCount: Self = this.set("maxWorkerCount", js.undefined)
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelName: Self = this.set("modelName", js.undefined)
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("runtimeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("runtimeVersion", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setVersionName(value: String): Self = this.set("versionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionName: Self = this.set("versionName", js.undefined)
  }
  
}

