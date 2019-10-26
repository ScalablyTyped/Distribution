package typings.googleapisDashCommon.buildSrcSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schemas extends js.Object {
  var discoveryVersion: String
  var items: js.Array[Schema]
  var kind: String
}

object Schemas {
  @scala.inline
  def apply(discoveryVersion: String, items: js.Array[Schema], kind: String): Schemas = {
    val __obj = js.Dynamic.literal(discoveryVersion = discoveryVersion, items = items, kind = kind)
  
    __obj.asInstanceOf[Schemas]
  }
}

