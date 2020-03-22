package typings.gitlab.resourceVariablesMod

import typings.gitlab.gitlabStrings.env_var
import typings.gitlab.gitlabStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceVariableSchema extends js.Object {
  var key: String
  var value: String
  var variable_type: env_var | file
}

object ResourceVariableSchema {
  @scala.inline
  def apply(key: String, value: String, variable_type: env_var | file): ResourceVariableSchema = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable_type = variable_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceVariableSchema]
  }
}

