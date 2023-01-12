package typings.develarSchemaUtils

import typings.ajv.distTypesMod.ErrorObject
import typings.develarSchemaUtils.anon.Children
import typings.develarSchemaUtils.anon.ErrorObjectstringRecordst
import typings.jsonSchema.mod.JSONSchema4
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationsValidationErrorMod {
  
  @JSImport("@develar/schema-utils/declarations/ValidationError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ValidationError {
    /**
      * @param {Array<SchemaUtilErrorObject>} errors
      * @param {Schema} schema
      * @param {ValidationErrorConfiguration} configuration
      */
    def this(errors: js.Array[ErrorObjectstringRecordst], schema: JSONSchema4) = this()
    def this(errors: js.Array[ErrorObjectstringRecordst], schema: typings.jsonSchema.mod.JSONSchema6) = this()
    def this(errors: js.Array[ErrorObjectstringRecordst], schema: typings.jsonSchema.mod.JSONSchema7) = this()
    def this(
      errors: js.Array[ErrorObjectstringRecordst],
      schema: JSONSchema4,
      configuration: typings.develarSchemaUtils.declarationsValidateMod.ValidationErrorConfiguration
    ) = this()
    def this(
      errors: js.Array[ErrorObjectstringRecordst],
      schema: typings.jsonSchema.mod.JSONSchema6,
      configuration: typings.develarSchemaUtils.declarationsValidateMod.ValidationErrorConfiguration
    ) = this()
    def this(
      errors: js.Array[ErrorObjectstringRecordst],
      schema: typings.jsonSchema.mod.JSONSchema7,
      configuration: typings.develarSchemaUtils.declarationsValidateMod.ValidationErrorConfiguration
    ) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = js.Function2[/* formattedError */ String, /* error */ ErrorObjectstringRecordst, String]
  
  type SPECIFICITY = Double
  
  type Schema = JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7
  
  trait SchemaUtilErrorObject
    extends StObject
       with ErrorObject[String, Record[String, Any], Any] {
    
    var children: js.UndefOr[js.Array[ErrorObject[String, Record[String, Any], Any]]] = js.undefined
  }
  object SchemaUtilErrorObject {
    
    inline def apply(instancePath: String, keyword: String, params: Record[String, Any], schemaPath: String): SchemaUtilErrorObject = {
      val __obj = js.Dynamic.literal(instancePath = instancePath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaUtilErrorObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaUtilErrorObject] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[ErrorObject[String, Record[String, Any], Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (ErrorObject[String, Record[String, Any], Any])*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  @js.native
  trait ValidationError
    extends StObject
       with Error {
    
    /** @type {string} */
    var baseDataPath: String = js.native
    
    /** @type {Array<SchemaUtilErrorObject>} */
    var errors: js.Array[SchemaUtilErrorObject] = js.native
    
    /**
      * @param {Schema} schema
      * @param {Array<Object>} prevSchemas
      * @returns {string}
      */
    def formatSchema(schema: JSONSchema4): String = js.native
    def formatSchema(schema: JSONSchema4, prevSchemas: js.Array[js.Object]): String = js.native
    def formatSchema(schema: typings.jsonSchema.mod.JSONSchema6): String = js.native
    def formatSchema(schema: typings.jsonSchema.mod.JSONSchema6, prevSchemas: js.Array[js.Object]): String = js.native
    def formatSchema(schema: typings.jsonSchema.mod.JSONSchema7): String = js.native
    def formatSchema(schema: typings.jsonSchema.mod.JSONSchema7, prevSchemas: js.Array[js.Object]): String = js.native
    
    /**
      * @param {SchemaUtilErrorObject} error
      * @returns {string}
      */
    def formatValidationError(error: ErrorObjectstringRecordst): String = js.native
    
    /**
      * @param {Array<SchemaUtilErrorObject>} errors
      * @returns {string}
      */
    def formatValidationErrors(errors: js.Array[ErrorObjectstringRecordst]): String = js.native
    
    /**
      * @param {string} path
      * @returns {Schema}
      */
    def getSchemaPart(path: String): JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7 = js.native
    
    /**
      * @param {Schema=} schemaPart
      * @returns {string}
      */
    def getSchemaPartDescription(): String = js.native
    def getSchemaPartDescription(schemaPart: JSONSchema4): String = js.native
    def getSchemaPartDescription(schemaPart: typings.jsonSchema.mod.JSONSchema6): String = js.native
    def getSchemaPartDescription(schemaPart: typings.jsonSchema.mod.JSONSchema7): String = js.native
    
    /**
      * @param {Schema=} schemaPart
      * @param {(boolean | Array<string>)=} additionalPath
      * @param {boolean=} needDot
      * @returns {string}
      */
    def getSchemaPartText(): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: Unit, additionalPath: Unit, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: Unit, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: Unit, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: Unit, needDot: Boolean): String = js.native
    
    /** @type {string} */
    var headerName: String = js.native
    
    /** @type {PostFormatter | null} */
    var postFormatter: PostFormatter | Null = js.native
    
    /** @type {Schema} */
    var schema: Schema = js.native
  }
  
  trait ValidationErrorConfiguration extends StObject {
    
    var baseDataPath: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var postFormatter: js.UndefOr[typings.develarSchemaUtils.declarationsValidateMod.PostFormatter] = js.undefined
  }
  object ValidationErrorConfiguration {
    
    inline def apply(): ValidationErrorConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationErrorConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationErrorConfiguration] (val x: Self) extends AnyVal {
      
      inline def setBaseDataPath(value: String): Self = StObject.set(x, "baseDataPath", value.asInstanceOf[js.Any])
      
      inline def setBaseDataPathUndefined: Self = StObject.set(x, "baseDataPath", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPostFormatter(
        value: (/* formattedError */ String, /* error */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any) & Children) => String
      ): Self = StObject.set(x, "postFormatter", js.Any.fromFunction2(value))
      
      inline def setPostFormatterUndefined: Self = StObject.set(x, "postFormatter", js.undefined)
    }
  }
}
