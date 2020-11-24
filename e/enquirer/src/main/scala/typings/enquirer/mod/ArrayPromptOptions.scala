package typings.enquirer.mod

import typings.enquirer.enquirerStrings.autocomplete
import typings.enquirer.enquirerStrings.editable
import typings.enquirer.enquirerStrings.form
import typings.enquirer.enquirerStrings.left
import typings.enquirer.enquirerStrings.list
import typings.enquirer.enquirerStrings.multiselect
import typings.enquirer.enquirerStrings.right
import typings.enquirer.enquirerStrings.scale
import typings.enquirer.enquirerStrings.select
import typings.enquirer.enquirerStrings.survey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
trait ArrayPromptOptions extends BasePromptOptions {
  
  var align: js.UndefOr[left | right] = js.native
  
  var choices: js.Array[Choice | String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var edgeLength: js.UndefOr[Double] = js.native
  
  @JSName("initial")
  var initial_ArrayPromptOptions: js.UndefOr[Double] = js.native
  
  var linebreak: js.UndefOr[Boolean] = js.native
  
  var maxChoices: js.UndefOr[Double] = js.native
  
  var muliple: js.UndefOr[Boolean] = js.native
  
  var scroll: js.UndefOr[Boolean] = js.native
  
  var separator: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_ArrayPromptOptions: autocomplete | editable | form | multiselect | select | survey | list | scale = js.native
}
object ArrayPromptOptions {
  
  @scala.inline
  def apply(
    choices: js.Array[Choice | String],
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: autocomplete | editable | form | multiselect | select | survey | list | scale
  ): ArrayPromptOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPromptOptions]
  }
  
  @scala.inline
  implicit class ArrayPromptOptionsOps[Self <: ArrayPromptOptions] (val x: Self) extends AnyVal {
    
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
    def setChoicesVarargs(value: (Choice | String)*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[Choice | String]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: autocomplete | editable | form | multiselect | select | survey | list | scale): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setEdgeLength(value: Double): Self = this.set("edgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeLength: Self = this.set("edgeLength", js.undefined)
    
    @scala.inline
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    
    @scala.inline
    def setLinebreak(value: Boolean): Self = this.set("linebreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinebreak: Self = this.set("linebreak", js.undefined)
    
    @scala.inline
    def setMaxChoices(value: Double): Self = this.set("maxChoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxChoices: Self = this.set("maxChoices", js.undefined)
    
    @scala.inline
    def setMuliple(value: Boolean): Self = this.set("muliple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuliple: Self = this.set("muliple", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSeparator(value: Boolean): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
