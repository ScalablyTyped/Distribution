package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaModel extends js.Object {
  /**
    * Output only. The time when this model was created, in millisecs since the
    * epoch.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * [Optional] A user-friendly description of this model. @mutable
    * bigquery.models.patch
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. A hash of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * [Optional] The time when this model expires, in milliseconds since the
    * epoch. If not present, the model will persist indefinitely. Expired
    * models will be deleted and their storage reclaimed.  The
    * defaultTableExpirationMs property of the encapsulating dataset can be
    * used to set a default expirationTime on newly created models. @mutable
    * bigquery.models.patch
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * Output only. Input feature columns that were used to train this model.
    */
  var featureColumns: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.native
  /**
    * [Optional] A descriptive name for this model. @mutable
    * bigquery.models.patch
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * Output only. Label columns that were used to train this model. The output
    * of the model will have a “predicted_” prefix to these columns.
    */
  var labelColumns: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.native
  /**
    * [Optional] The labels associated with this model. You can use these to
    * organize and group your models. Label keys and values can be no longer
    * than 63 characters, can only contain lowercase letters, numeric
    * characters, underscores and dashes. International characters are allowed.
    * Label values are optional. Label keys must start with a letter and each
    * label in the list must have a different key. @mutable
    * bigquery.models.patch
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The time when this model was last modified, in millisecs
    * since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /**
    * Output only. The geographic location where the model resides. This value
    * is inherited from the dataset.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Required. Unique identifier for this model.
    */
  var modelReference: js.UndefOr[SchemaModelReference] = js.native
  /**
    * Output only. Type of the model resource.
    */
  var modelType: js.UndefOr[String] = js.native
  /**
    * Output only. Information for all training runs in increasing order of
    * start_time.
    */
  var trainingRuns: js.UndefOr[js.Array[SchemaTrainingRun]] = js.native
}

object SchemaModel {
  @scala.inline
  def apply(
    creationTime: String = null,
    description: String = null,
    etag: String = null,
    expirationTime: String = null,
    featureColumns: js.Array[SchemaStandardSqlField] = null,
    friendlyName: String = null,
    labelColumns: js.Array[SchemaStandardSqlField] = null,
    labels: StringDictionary[String] = null,
    lastModifiedTime: String = null,
    location: String = null,
    modelReference: SchemaModelReference = null,
    modelType: String = null,
    trainingRuns: js.Array[SchemaTrainingRun] = null
  ): SchemaModel = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (featureColumns != null) __obj.updateDynamic("featureColumns")(featureColumns.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (labelColumns != null) __obj.updateDynamic("labelColumns")(labelColumns.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (modelReference != null) __obj.updateDynamic("modelReference")(modelReference.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (trainingRuns != null) __obj.updateDynamic("trainingRuns")(trainingRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModel]
  }
}

