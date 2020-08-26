package typings.enquirer.mod

import typings.enquirer.enquirerStrings.input
import typings.enquirer.enquirerStrings.invisible
import typings.enquirer.enquirerStrings.list
import typings.enquirer.enquirerStrings.password
import typings.enquirer.enquirerStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
trait StringPromptOptions extends BasePromptOptions {
  @JSName("initial")
  var initial_StringPromptOptions: js.UndefOr[String] = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  @JSName("type")
  var type_StringPromptOptions: input | invisible | list | password | text = js.native
}

object StringPromptOptions {
  @scala.inline
  def apply(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: input | invisible | list | password | text
  ): StringPromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringPromptOptions]
  }
  @scala.inline
  implicit class StringPromptOptionsOps[Self <: StringPromptOptions] (val x: Self) extends AnyVal {
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
    def setType(value: input | invisible | list | password | text): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: String): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
  }
  
}

