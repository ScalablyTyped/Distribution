package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1BigQueryDestination extends StObject {
  
  /**
    * Required. The BigQuery dataset in format "projects/projectId/datasets/datasetId", to which the analysis results should be exported. If this dataset does not exist, the export call will return an INVALID_ARGUMENT error.
    */
  var dataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The partition key for BigQuery partitioned table.
    */
  var partitionKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The prefix of the BigQuery tables to which the analysis results will be written. Tables will be created based on this table_prefix if not exist: * _analysis table will contain export operation's metadata. * _analysis_result will contain all the IamPolicyAnalysisResult. When [partition_key] is specified, both tables will be partitioned based on the [partition_key].
    */
  var tablePrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the action that occurs if the destination table or partition already exists. The following values are supported: * WRITE_TRUNCATE: If the table or partition already exists, BigQuery overwrites the entire table or all the partitions data. * WRITE_APPEND: If the table or partition already exists, BigQuery appends the data to the table or the latest partition. * WRITE_EMPTY: If the table already exists and contains data, an error is returned. The default value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Details are at https://cloud.google.com/bigquery/docs/loading-data-local#appending_to_or_overwriting_a_table_using_a_local_file.
    */
  var writeDisposition: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudAssetV1BigQueryDestination {
  
  inline def apply(): SchemaGoogleCloudAssetV1BigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1BigQueryDestination]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1BigQueryDestination](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetNull: Self = StObject.set(x, "dataset", null)
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyNull: Self = StObject.set(x, "partitionKey", null)
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    inline def setTablePrefix(value: String): Self = StObject.set(x, "tablePrefix", value.asInstanceOf[js.Any])
    
    inline def setTablePrefixNull: Self = StObject.set(x, "tablePrefix", null)
    
    inline def setTablePrefixUndefined: Self = StObject.set(x, "tablePrefix", js.undefined)
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionNull: Self = StObject.set(x, "writeDisposition", null)
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
