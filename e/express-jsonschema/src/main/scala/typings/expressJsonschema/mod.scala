package typings.expressJsonschema

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressJsonschema.anon.Instance
import typings.expressJsonschema.anon.Messages
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.jsonSchema.mod.JSONSchema4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-jsonschema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-jsonschema", "JsonSchemaCustomPropertyError")
  @js.native
  class JsonSchemaCustomPropertyError protected () extends StObject {
    def this(propertyName: String) = this()
    
    var message: String = js.native
    
    var name: String = js.native
  }
  
  @JSImport("express-jsonschema", "JsonSchemaValidation")
  @js.native
  class JsonSchemaValidation protected () extends StObject {
    def this(validations: StringDictionary[Instance]) = this()
    
    var message: String = js.native
    
    var name: String = js.native
    
    var validations: StringDictionary[js.Array[Messages]] = js.native
  }
  
  inline def addSchemaProperties(
    newProperties: StringDictionary[
      js.Function4[
        /* instance */ js.Any, 
        /* schema */ JSONSchema4, 
        /* options */ js.Any, 
        /* ctx */ js.Any, 
        Unit | String
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSchemaProperties")(newProperties.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validate(schemas: StringDictionary[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schemas.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  inline def validate(schemas: StringDictionary[JSONSchema4], schemaDependencies: js.Array[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schemas.asInstanceOf[js.Any], schemaDependencies.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
}
