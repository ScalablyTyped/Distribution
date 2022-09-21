package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSparkOptions extends StObject {
  
  /**
    * Archive files to be extracted into the working directory of each executor. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
    */
  var archiveUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Fully qualified name of the user-provided Spark connection object. Format: ```"projects/{project_id\}/locations/{location_id\}/connections/{connection_id\}"```
    */
  var connection: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom container image for the runtime environment.
    */
  var containerImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Files to be placed in the working directory of each executor. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
    */
  var fileUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * JARs to include on the driver and executor CLASSPATH. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
    */
  var jarUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The main file URI of the Spark application. Exactly one of the definition_body field and the main_file_uri field must be set.
    */
  var mainFileUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration properties as a set of key/value pairs, which will be passed on to the Spark application. For more information, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
    */
  var properties: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Python files to be placed on the PYTHONPATH for PySpark application. Supported file types: `.py`, `.egg`, and `.zip`. For more information about Apache Spark, see [Apache Spark](https://spark.apache.org/docs/latest/index.html).
    */
  var pyFileUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Runtime version. If not specified, the default runtime version is used.
    */
  var runtimeVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaSparkOptions {
  
  inline def apply(): SchemaSparkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSparkOptions]
  }
  
  extension [Self <: SchemaSparkOptions](x: Self) {
    
    inline def setArchiveUris(value: js.Array[String]): Self = StObject.set(x, "archiveUris", value.asInstanceOf[js.Any])
    
    inline def setArchiveUrisNull: Self = StObject.set(x, "archiveUris", null)
    
    inline def setArchiveUrisUndefined: Self = StObject.set(x, "archiveUris", js.undefined)
    
    inline def setArchiveUrisVarargs(value: String*): Self = StObject.set(x, "archiveUris", js.Array(value*))
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageNull: Self = StObject.set(x, "containerImage", null)
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
    
    inline def setFileUrisNull: Self = StObject.set(x, "fileUris", null)
    
    inline def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
    
    inline def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value*))
    
    inline def setJarUris(value: js.Array[String]): Self = StObject.set(x, "jarUris", value.asInstanceOf[js.Any])
    
    inline def setJarUrisNull: Self = StObject.set(x, "jarUris", null)
    
    inline def setJarUrisUndefined: Self = StObject.set(x, "jarUris", js.undefined)
    
    inline def setJarUrisVarargs(value: String*): Self = StObject.set(x, "jarUris", js.Array(value*))
    
    inline def setMainFileUri(value: String): Self = StObject.set(x, "mainFileUri", value.asInstanceOf[js.Any])
    
    inline def setMainFileUriNull: Self = StObject.set(x, "mainFileUri", null)
    
    inline def setMainFileUriUndefined: Self = StObject.set(x, "mainFileUri", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPyFileUris(value: js.Array[String]): Self = StObject.set(x, "pyFileUris", value.asInstanceOf[js.Any])
    
    inline def setPyFileUrisNull: Self = StObject.set(x, "pyFileUris", null)
    
    inline def setPyFileUrisUndefined: Self = StObject.set(x, "pyFileUris", js.undefined)
    
    inline def setPyFileUrisVarargs(value: String*): Self = StObject.set(x, "pyFileUris", js.Array(value*))
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionNull: Self = StObject.set(x, "runtimeVersion", null)
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
  }
}
