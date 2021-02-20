package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaModel extends StObject {
  
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
  def apply(): SchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModel]
  }
  
  @scala.inline
  implicit class SchemaModelMutableBuilder[Self <: SchemaModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setFeatureColumns(value: js.Array[SchemaStandardSqlField]): Self = StObject.set(x, "featureColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureColumnsUndefined: Self = StObject.set(x, "featureColumns", js.undefined)
    
    @scala.inline
    def setFeatureColumnsVarargs(value: SchemaStandardSqlField*): Self = StObject.set(x, "featureColumns", js.Array(value :_*))
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setLabelColumns(value: js.Array[SchemaStandardSqlField]): Self = StObject.set(x, "labelColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColumnsUndefined: Self = StObject.set(x, "labelColumns", js.undefined)
    
    @scala.inline
    def setLabelColumnsVarargs(value: SchemaStandardSqlField*): Self = StObject.set(x, "labelColumns", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setModelReference(value: SchemaModelReference): Self = StObject.set(x, "modelReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelReferenceUndefined: Self = StObject.set(x, "modelReference", js.undefined)
    
    @scala.inline
    def setModelType(value: String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    @scala.inline
    def setTrainingRuns(value: js.Array[SchemaTrainingRun]): Self = StObject.set(x, "trainingRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingRunsUndefined: Self = StObject.set(x, "trainingRuns", js.undefined)
    
    @scala.inline
    def setTrainingRunsVarargs(value: SchemaTrainingRun*): Self = StObject.set(x, "trainingRuns", js.Array(value :_*))
  }
}
