package typings
package expressDashJsonschemaLib.expressDashJsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jsonschema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addSchemaProperties(
    newProperties: org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* instance */ js.Any, 
        /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4, 
        /* options */ js.Any, 
        /* ctx */ js.Any, 
        scala.Unit | java.lang.String
      ]
    ]
  ): scala.Unit = js.native
  def validate(
    schemas: org.scalablytyped.runtime.StringDictionary[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4]
  ): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ] = js.native
  def validate(
    schemas: org.scalablytyped.runtime.StringDictionary[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4],
    schemaDependencies: js.Array[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4]
  ): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ] = js.native
}

