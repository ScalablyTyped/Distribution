package typings.gitlab.distTypesCoreServicesProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceInfoSchema extends js.Object {
  var full_path: String
  var id: Double
  var kind: String
  var name: String
  var path: String
}

object NamespaceInfoSchema {
  @scala.inline
  def apply(full_path: String, id: Double, kind: String, name: String, path: String): NamespaceInfoSchema = {
    val __obj = js.Dynamic.literal(full_path = full_path, id = id, kind = kind, name = name, path = path)
  
    __obj.asInstanceOf[NamespaceInfoSchema]
  }
}

