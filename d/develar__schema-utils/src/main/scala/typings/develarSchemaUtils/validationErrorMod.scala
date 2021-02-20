package typings.develarSchemaUtils

import typings.ajv.mod.ErrorObject
import typings.ajv.mod.ErrorParameters
import typings.develarSchemaUtils.anon.ErrorObjectchildrenArrayE
import typings.jsonSchema.mod.JSONSchema4
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationErrorMod {
  
  @JSImport("@develar/schema-utils/declarations/ValidationError", JSImport.Default)
  @js.native
  class default protected () extends ValidationError {
    /**
      * @param {Array<SchemaUtilErrorObject>} errors
      * @param {Schema} schema
      * @param {ValidationErrorConfiguration} configuration
      */
    def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: JSONSchema4) = this()
    def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: typings.jsonSchema.mod.JSONSchema6) = this()
    def this(errors: js.Array[ErrorObjectchildrenArrayE], schema: typings.jsonSchema.mod.JSONSchema7) = this()
    def this(
      errors: js.Array[ErrorObjectchildrenArrayE],
      schema: JSONSchema4,
      configuration: typings.develarSchemaUtils.validateMod.ValidationErrorConfiguration
    ) = this()
    def this(
      errors: js.Array[ErrorObjectchildrenArrayE],
      schema: typings.jsonSchema.mod.JSONSchema6,
      configuration: typings.develarSchemaUtils.validateMod.ValidationErrorConfiguration
    ) = this()
    def this(
      errors: js.Array[ErrorObjectchildrenArrayE],
      schema: typings.jsonSchema.mod.JSONSchema7,
      configuration: typings.develarSchemaUtils.validateMod.ValidationErrorConfiguration
    ) = this()
  }
  
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = js.Function2[/* formattedError */ String, /* error */ ErrorObjectchildrenArrayE, String]
  
  type SPECIFICITY = Double
  
  type Schema = JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7
  
  /* Inlined ajv.ajv.ErrorObject & {  children :std.Array<ajv.ajv.ErrorObject> | undefined} */
  @js.native
  trait SchemaUtilErrorObject extends StObject {
    
    var children: js.UndefOr[js.Array[ErrorObject]] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var dataPath: String = js.native
    
    var keyword: String = js.native
    
    // Excluded if messages set to false.
    var message: js.UndefOr[String] = js.native
    
    var params: ErrorParameters = js.native
    
    var parentSchema: js.UndefOr[js.Object] = js.native
    
    // Added to validation errors of propertyNames keyword schema
    var propertyName: js.UndefOr[String] = js.native
    
    // These are added with the `verbose` option.
    var schema: js.UndefOr[js.Any] = js.native
    
    var schemaPath: String = js.native
  }
  object SchemaUtilErrorObject {
    
    @scala.inline
    def apply(dataPath: String, keyword: String, params: ErrorParameters, schemaPath: String): SchemaUtilErrorObject = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaUtilErrorObject]
    }
    
    @scala.inline
    implicit class SchemaUtilErrorObjectMutableBuilder[Self <: SchemaUtilErrorObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ErrorObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ErrorObject*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setParams(value: ErrorParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSchema(value: js.Object): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      @scala.inline
      def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  @js.native
  trait ValidationError extends Error {
    
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
    def formatValidationError(error: ErrorObjectchildrenArrayE): String = js.native
    
    /**
      * @param {Array<SchemaUtilErrorObject>} errors
      * @returns {string}
      */
    def formatValidationErrors(errors: js.Array[ErrorObjectchildrenArrayE]): String = js.native
    
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
    def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: js.UndefOr[scala.Nothing], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: js.UndefOr[scala.Nothing], additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: js.UndefOr[scala.Nothing], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: JSONSchema4, additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6): String = js.native
    def getSchemaPartText(
      schemaPart: typings.jsonSchema.mod.JSONSchema6,
      additionalPath: js.UndefOr[scala.Nothing],
      needDot: Boolean
    ): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema6, additionalPath: Boolean, needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7): String = js.native
    def getSchemaPartText(
      schemaPart: typings.jsonSchema.mod.JSONSchema7,
      additionalPath: js.UndefOr[scala.Nothing],
      needDot: Boolean
    ): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: js.Array[String]): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: js.Array[String], needDot: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: Boolean): String = js.native
    def getSchemaPartText(schemaPart: typings.jsonSchema.mod.JSONSchema7, additionalPath: Boolean, needDot: Boolean): String = js.native
    
    /** @type {string} */
    var headerName: String = js.native
    
    /** @type {PostFormatter | null} */
    var postFormatter: PostFormatter | Null = js.native
    
    /** @type {Schema} */
    var schema: Schema = js.native
  }
  
  @js.native
  trait ValidationErrorConfiguration extends StObject {
    
    var baseDataPath: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var postFormatter: js.UndefOr[typings.develarSchemaUtils.validateMod.PostFormatter] = js.native
  }
  object ValidationErrorConfiguration {
    
    @scala.inline
    def apply(): ValidationErrorConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationErrorConfiguration]
    }
    
    @scala.inline
    implicit class ValidationErrorConfigurationMutableBuilder[Self <: ValidationErrorConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDataPath(value: String): Self = StObject.set(x, "baseDataPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDataPathUndefined: Self = StObject.set(x, "baseDataPath", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPostFormatter(value: (/* formattedError */ String, /* error */ ErrorObjectchildrenArrayE) => String): Self = StObject.set(x, "postFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostFormatterUndefined: Self = StObject.set(x, "postFormatter", js.undefined)
    }
  }
}
