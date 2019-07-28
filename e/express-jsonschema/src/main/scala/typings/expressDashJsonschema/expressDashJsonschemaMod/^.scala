package typings.expressDashJsonschema.expressDashJsonschemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jsonschema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def validate(schemas: StringDictionary[JSONSchema4]): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def validate(schemas: StringDictionary[JSONSchema4], schemaDependencies: js.Array[JSONSchema4]): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

