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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jsonschema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonSchemaCustomPropertyError protected () extends js.Object {
    def this(propertyName: String) = this()
    var message: String = js.native
    var name: String = js.native
  }
  
  @js.native
  class JsonSchemaValidation protected () extends js.Object {
    def this(validations: StringDictionary[Instance]) = this()
    var message: String = js.native
    var name: String = js.native
    var validations: StringDictionary[js.Array[Messages]] = js.native
  }
  
  def addSchemaProperties(
    newProperties: StringDictionary[
      js.Function4[
        /* instance */ js.Any, 
        /* schema */ JSONSchema4, 
        /* options */ js.Any, 
        /* ctx */ js.Any, 
        Unit | String
      ]
    ]
  ): Unit = js.native
  def validate(schemas: StringDictionary[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def validate(schemas: StringDictionary[JSONSchema4], schemaDependencies: js.Array[JSONSchema4]): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}

