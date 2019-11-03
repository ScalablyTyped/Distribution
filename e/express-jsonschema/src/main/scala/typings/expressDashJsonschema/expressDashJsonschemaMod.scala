package typings.expressDashJsonschema

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jsonschema", JSImport.Namespace)
@js.native
object expressDashJsonschemaMod extends js.Object {
  @js.native
  class JsonSchemaCustomPropertyError protected () extends js.Object {
    def this(propertyName: String) = this()
    var message: String = js.native
    var name: String = js.native
  }
  
  @js.native
  class JsonSchemaValidation protected () extends js.Object {
    def this(validations: StringDictionary[Anon_Instance]) = this()
    var message: String = js.native
    var name: String = js.native
    var validations: StringDictionary[js.Array[Anon_Messages]] = js.native
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
  def validate(schemas: StringDictionary[JSONSchema4]): js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def validate(schemas: StringDictionary[JSONSchema4], schemaDependencies: js.Array[JSONSchema4]): js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

