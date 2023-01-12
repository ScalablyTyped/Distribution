package typings.develarSchemaUtils

import typings.develarSchemaUtils.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationsValidateMod {
  
  object default {
    
    /**
      * @param {Schema} schema
      * @param {Array<object> | object} options
      * @param {ValidationErrorConfiguration=} configuration
      * @returns {void}
      */
    inline def apply(schema: typings.jsonSchema.mod.JSONSchema4, options: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(
      schema: typings.jsonSchema.mod.JSONSchema4,
      options: Any,
      configuration: ValidationErrorConfiguration
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(schema: typings.jsonSchema.mod.JSONSchema6, options: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(
      schema: typings.jsonSchema.mod.JSONSchema6,
      options: Any,
      configuration: ValidationErrorConfiguration
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(schema: typings.jsonSchema.mod.JSONSchema7, options: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(
      schema: typings.jsonSchema.mod.JSONSchema7,
      options: Any,
      configuration: ValidationErrorConfiguration
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@develar/schema-utils/declarations/validate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  type ErrorObject = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any
  
  type JSONSchema4 = typings.jsonSchema.mod.JSONSchema4
  
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  
  type PostFormatter = js.Function2[
    /* formattedError */ String, 
    /* error */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any) & Children, 
    String
  ]
  
  type Schema = typings.jsonSchema.mod.JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject * / any */ trait SchemaUtilErrorObject extends StObject {
    
    var children: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any
        ]
      ] = js.undefined
  }
  object SchemaUtilErrorObject {
    
    inline def apply(): SchemaUtilErrorObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaUtilErrorObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaUtilErrorObject] (val x: Self) extends AnyVal {
      
      inline def setChildren(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any)*
      ): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait ValidationErrorConfiguration extends StObject {
    
    var baseDataPath: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var postFormatter: js.UndefOr[PostFormatter] = js.undefined
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
