package typings.develarSchemaUtils

import typings.ajv.mod.ErrorParameters
import typings.develarSchemaUtils.anon.ErrorObjectchildrenArrayE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  object default {
    
    /**
      * @param {Schema} schema
      * @param {Array<object> | object} options
      * @param {ValidationErrorConfiguration=} configuration
      * @returns {void}
      */
    @scala.inline
    def apply(schema: typings.jsonSchema.mod.JSONSchema4, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(
      schema: typings.jsonSchema.mod.JSONSchema4,
      options: js.Any,
      configuration: ValidationErrorConfiguration
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(schema: typings.jsonSchema.mod.JSONSchema6, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(
      schema: typings.jsonSchema.mod.JSONSchema6,
      options: js.Any,
      configuration: ValidationErrorConfiguration
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(schema: typings.jsonSchema.mod.JSONSchema7, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(
      schema: typings.jsonSchema.mod.JSONSchema7,
      options: js.Any,
      configuration: ValidationErrorConfiguration
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@develar/schema-utils/declarations/validate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  type ErrorObject = typings.ajv.mod.ErrorObject
  
  type JSONSchema4 = typings.jsonSchema.mod.JSONSchema4
  
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = js.Function2[/* formattedError */ String, /* error */ ErrorObjectchildrenArrayE, String]
  
  type Schema = typings.jsonSchema.mod.JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7
  
  trait SchemaUtilErrorObject
    extends StObject
       with typings.ajv.mod.ErrorObject {
    
    var children: js.UndefOr[js.Array[typings.ajv.mod.ErrorObject]] = js.undefined
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
      def setChildren(value: js.Array[typings.ajv.mod.ErrorObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: typings.ajv.mod.ErrorObject*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  trait ValidationErrorConfiguration extends StObject {
    
    var baseDataPath: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var postFormatter: js.UndefOr[PostFormatter] = js.undefined
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
