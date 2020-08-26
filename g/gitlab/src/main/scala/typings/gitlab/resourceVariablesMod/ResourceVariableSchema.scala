package typings.gitlab.resourceVariablesMod

import typings.gitlab.gitlabStrings.env_var
import typings.gitlab.gitlabStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceVariableSchema extends js.Object {
  var key: String = js.native
  var value: String = js.native
  var variable_type: env_var | file = js.native
}

object ResourceVariableSchema {
  @scala.inline
  def apply(key: String, value: String, variable_type: env_var | file): ResourceVariableSchema = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable_type = variable_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceVariableSchema]
  }
  @scala.inline
  implicit class ResourceVariableSchemaOps[Self <: ResourceVariableSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariable_type(value: env_var | file): Self = this.set("variable_type", value.asInstanceOf[js.Any])
  }
  
}

