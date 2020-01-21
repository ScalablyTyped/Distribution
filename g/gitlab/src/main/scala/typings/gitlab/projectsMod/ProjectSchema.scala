package typings.gitlab.projectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSchema extends js.Object {
  var archived: Boolean
  var http_url_to_repo: String
  var id: Double
  var name: String
  var name_with_namespace: String
  var namespace: NamespaceInfoSchema
  var path: String
  var path_with_namespace: String
  var ssh_url_to_repo: String
}

object ProjectSchema {
  @scala.inline
  def apply(
    archived: Boolean,
    http_url_to_repo: String,
    id: Double,
    name: String,
    name_with_namespace: String,
    namespace: NamespaceInfoSchema,
    path: String,
    path_with_namespace: String,
    ssh_url_to_repo: String
  ): ProjectSchema = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], http_url_to_repo = http_url_to_repo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_with_namespace = name_with_namespace.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], path_with_namespace = path_with_namespace.asInstanceOf[js.Any], ssh_url_to_repo = ssh_url_to_repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectSchema]
  }
}

