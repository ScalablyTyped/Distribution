package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata available primarily for filtering jobs. Will be included in the
  * ListJob response and Job SUMMARY view.
  */
@js.native
trait Schema$JobMetadata extends js.Object {
  /**
    * Identification of a BigTable source used in the Dataflow job.
    */
  var bigTableDetails: js.UndefOr[js.Array[Schema$BigTableIODetails]] = js.native
  /**
    * Identification of a BigQuery source used in the Dataflow job.
    */
  var bigqueryDetails: js.UndefOr[js.Array[Schema$BigQueryIODetails]] = js.native
  /**
    * Identification of a Datastore source used in the Dataflow job.
    */
  var datastoreDetails: js.UndefOr[js.Array[Schema$DatastoreIODetails]] = js.native
  /**
    * Identification of a File source used in the Dataflow job.
    */
  var fileDetails: js.UndefOr[js.Array[Schema$FileIODetails]] = js.native
  /**
    * Identification of a PubSub source used in the Dataflow job.
    */
  var pubsubDetails: js.UndefOr[js.Array[Schema$PubSubIODetails]] = js.native
  /**
    * The SDK version used to run the job.
    */
  var sdkVersion: js.UndefOr[Schema$SdkVersion] = js.native
  /**
    * Identification of a Spanner source used in the Dataflow job.
    */
  var spannerDetails: js.UndefOr[js.Array[Schema$SpannerIODetails]] = js.native
}

object Schema$JobMetadata {
  @scala.inline
  def apply(
    bigTableDetails: js.Array[Schema$BigTableIODetails] = null,
    bigqueryDetails: js.Array[Schema$BigQueryIODetails] = null,
    datastoreDetails: js.Array[Schema$DatastoreIODetails] = null,
    fileDetails: js.Array[Schema$FileIODetails] = null,
    pubsubDetails: js.Array[Schema$PubSubIODetails] = null,
    sdkVersion: Schema$SdkVersion = null,
    spannerDetails: js.Array[Schema$SpannerIODetails] = null
  ): Schema$JobMetadata = {
    val __obj = js.Dynamic.literal()
    if (bigTableDetails != null) __obj.updateDynamic("bigTableDetails")(bigTableDetails.asInstanceOf[js.Any])
    if (bigqueryDetails != null) __obj.updateDynamic("bigqueryDetails")(bigqueryDetails.asInstanceOf[js.Any])
    if (datastoreDetails != null) __obj.updateDynamic("datastoreDetails")(datastoreDetails.asInstanceOf[js.Any])
    if (fileDetails != null) __obj.updateDynamic("fileDetails")(fileDetails.asInstanceOf[js.Any])
    if (pubsubDetails != null) __obj.updateDynamic("pubsubDetails")(pubsubDetails.asInstanceOf[js.Any])
    if (sdkVersion != null) __obj.updateDynamic("sdkVersion")(sdkVersion.asInstanceOf[js.Any])
    if (spannerDetails != null) __obj.updateDynamic("spannerDetails")(spannerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobMetadata]
  }
}

