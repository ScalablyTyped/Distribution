package typings.gitlab.distTypesCoreServicesProjectsMod

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
    val __obj = js.Dynamic.literal(archived = archived, http_url_to_repo = http_url_to_repo, id = id, name = name, name_with_namespace = name_with_namespace, namespace = namespace, path = path, path_with_namespace = path_with_namespace, ssh_url_to_repo = ssh_url_to_repo)
  
    __obj.asInstanceOf[ProjectSchema]
  }
}

