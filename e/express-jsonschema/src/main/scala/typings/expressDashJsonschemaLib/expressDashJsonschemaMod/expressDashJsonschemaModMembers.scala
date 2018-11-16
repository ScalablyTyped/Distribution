package typings
package expressDashJsonschemaLib.expressDashJsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jsonschema", JSImport.Namespace)
@js.native
object expressDashJsonschemaModMembers extends js.Object {
  def addSchemaProperties(
    newProperties: ScalablyTyped.runtime.StringDictionary[
      js.Function4[
        /* instance */ js.Any, 
        /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4, 
        /* options */ js.Any, 
        /* ctx */ js.Any, 
        scala.Unit | java.lang.String
      ]
    ]
  ): scala.Unit = js.native
  def validate(schemas: ScalablyTyped.runtime.StringDictionary[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4]): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ] = js.native
  def validate(
    schemas: ScalablyTyped.runtime.StringDictionary[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4],
    schemaDependencies: js.Array[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4]
  ): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ] = js.native
}

