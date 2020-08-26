package typings.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.anon.Category
import typings.eslint.eslintStrings.code
import typings.eslint.eslintStrings.layout
import typings.eslint.eslintStrings.problem
import typings.eslint.eslintStrings.suggestion
import typings.eslint.eslintStrings.whitespace
import typings.jsonSchema.mod.JSONSchema4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleMetaData extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.native
  var docs: js.UndefOr[Category] = js.native
  var fixable: js.UndefOr[code | whitespace] = js.native
  var messages: js.UndefOr[StringDictionary[String]] = js.native
  var schema: js.UndefOr[JSONSchema4 | js.Array[JSONSchema4]] = js.native
  var `type`: js.UndefOr[problem | suggestion | layout] = js.native
}

object RuleMetaData {
  @scala.inline
  def apply(): RuleMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleMetaData]
  }
  @scala.inline
  implicit class RuleMetaDataOps[Self <: RuleMetaData] (val x: Self) extends AnyVal {
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
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setDocs(value: Category): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocs: Self = this.set("docs", js.undefined)
    @scala.inline
    def setFixable(value: code | whitespace): Self = this.set("fixable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixable: Self = this.set("fixable", js.undefined)
    @scala.inline
    def setMessages(value: StringDictionary[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setSchemaVarargs(value: JSONSchema4*): Self = this.set("schema", js.Array(value :_*))
    @scala.inline
    def setSchema(value: JSONSchema4 | js.Array[JSONSchema4]): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setType(value: problem | suggestion | layout): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

