package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoutine extends StObject {
  
  /**
    * Optional.
    */
  var arguments: js.UndefOr[js.Array[SchemaArgument]] = js.undefined
  
  /**
    * Output only. The time when this routine was created, in milliseconds since the epoch.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example, for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, "\n", y))` The definition_body is `concat(x, "\n", y)` (\n is not replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS 'return "\n";\n'` The definition_body is `return "\n";\n` Note that both \n are replaced with linebreaks.
    */
  var definitionBody: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The description of the routine, if defined.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The determinism level of the JavaScript UDF, if defined.
    */
  var determinismLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A hash of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If language = "JAVASCRIPT", this field stores the path of the imported JAVASCRIPT libraries.
    */
  var importedLibraries: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Defaults to "SQL".
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when this routine was last modified, in milliseconds since the epoch.
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Remote function specific options.
    */
  var remoteFunctionOptions: js.UndefOr[SchemaRemoteFunctionOptions] = js.undefined
  
  /**
    * Optional. Can be set only if routine_type = "TABLE_VALUED_FUNCTION". If absent, the return table type is inferred from definition_body at query time in each query that references this routine. If present, then the columns in the evaluated table result will be cast to match the column types specificed in return table type, at query time.
    */
  var returnTableType: js.UndefOr[SchemaStandardSqlTableType] = js.undefined
  
  /**
    * Optional if language = "SQL"; required otherwise. Cannot be set if routine_type = "TABLE_VALUED_FUNCTION". If absent, the return type is inferred from definition_body at query time in each query that references this routine. If present, then the evaluated result will be cast to the specified returned type at query time. For example, for the functions created with the following statements: * `CREATE FUNCTION Add(x FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);` * `CREATE FUNCTION Increment(x FLOAT64) AS (Add(x, 1));` * `CREATE FUNCTION Decrement(x FLOAT64) RETURNS FLOAT64 AS (Add(x, -1));` The return_type is `{type_kind: "FLOAT64"\}` for `Add` and `Decrement`, and is absent for `Increment` (inferred as FLOAT64 at query time). Suppose the function `Add` is replaced by `CREATE OR REPLACE FUNCTION Add(x INT64, y INT64) AS (x + y);` Then the inferred return type of `Increment` is automatically changed to INT64 at query time, while the return type of `Decrement` remains FLOAT64.
    */
  var returnType: js.UndefOr[SchemaStandardSqlDataType] = js.undefined
  
  /**
    * Required. Reference describing the ID of this routine.
    */
  var routineReference: js.UndefOr[SchemaRoutineReference] = js.undefined
  
  /**
    * Required. The type of routine.
    */
  var routineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Spark specific options.
    */
  var sparkOptions: js.UndefOr[SchemaSparkOptions] = js.undefined
  
  /**
    * Optional. Can be set for procedures only. If true (default), the definition body will be validated in the creation and the updates of the procedure. For procedures with an argument of ANY TYPE, the definition body validtion is not supported at creation/update time, and thus this field must be set to false explicitly.
    */
  var strictMode: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRoutine {
  
  inline def apply(): SchemaRoutine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutine]
  }
  
  extension [Self <: SchemaRoutine](x: Self) {
    
    inline def setArguments(value: js.Array[SchemaArgument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: SchemaArgument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDefinitionBody(value: String): Self = StObject.set(x, "definitionBody", value.asInstanceOf[js.Any])
    
    inline def setDefinitionBodyNull: Self = StObject.set(x, "definitionBody", null)
    
    inline def setDefinitionBodyUndefined: Self = StObject.set(x, "definitionBody", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeterminismLevel(value: String): Self = StObject.set(x, "determinismLevel", value.asInstanceOf[js.Any])
    
    inline def setDeterminismLevelNull: Self = StObject.set(x, "determinismLevel", null)
    
    inline def setDeterminismLevelUndefined: Self = StObject.set(x, "determinismLevel", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setImportedLibraries(value: js.Array[String]): Self = StObject.set(x, "importedLibraries", value.asInstanceOf[js.Any])
    
    inline def setImportedLibrariesNull: Self = StObject.set(x, "importedLibraries", null)
    
    inline def setImportedLibrariesUndefined: Self = StObject.set(x, "importedLibraries", js.undefined)
    
    inline def setImportedLibrariesVarargs(value: String*): Self = StObject.set(x, "importedLibraries", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setRemoteFunctionOptions(value: SchemaRemoteFunctionOptions): Self = StObject.set(x, "remoteFunctionOptions", value.asInstanceOf[js.Any])
    
    inline def setRemoteFunctionOptionsUndefined: Self = StObject.set(x, "remoteFunctionOptions", js.undefined)
    
    inline def setReturnTableType(value: SchemaStandardSqlTableType): Self = StObject.set(x, "returnTableType", value.asInstanceOf[js.Any])
    
    inline def setReturnTableTypeUndefined: Self = StObject.set(x, "returnTableType", js.undefined)
    
    inline def setReturnType(value: SchemaStandardSqlDataType): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setRoutineReference(value: SchemaRoutineReference): Self = StObject.set(x, "routineReference", value.asInstanceOf[js.Any])
    
    inline def setRoutineReferenceUndefined: Self = StObject.set(x, "routineReference", js.undefined)
    
    inline def setRoutineType(value: String): Self = StObject.set(x, "routineType", value.asInstanceOf[js.Any])
    
    inline def setRoutineTypeNull: Self = StObject.set(x, "routineType", null)
    
    inline def setRoutineTypeUndefined: Self = StObject.set(x, "routineType", js.undefined)
    
    inline def setSparkOptions(value: SchemaSparkOptions): Self = StObject.set(x, "sparkOptions", value.asInstanceOf[js.Any])
    
    inline def setSparkOptionsUndefined: Self = StObject.set(x, "sparkOptions", js.undefined)
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    inline def setStrictModeNull: Self = StObject.set(x, "strictMode", null)
    
    inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}
