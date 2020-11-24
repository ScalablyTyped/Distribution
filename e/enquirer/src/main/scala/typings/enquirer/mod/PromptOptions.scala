package typings.enquirer.mod

import typings.enquirer.enquirerStrings.autocomplete
import typings.enquirer.enquirerStrings.confirm
import typings.enquirer.enquirerStrings.editable
import typings.enquirer.enquirerStrings.form
import typings.enquirer.enquirerStrings.input
import typings.enquirer.enquirerStrings.invisible
import typings.enquirer.enquirerStrings.list
import typings.enquirer.enquirerStrings.multiselect
import typings.enquirer.enquirerStrings.numeral
import typings.enquirer.enquirerStrings.password
import typings.enquirer.enquirerStrings.scale
import typings.enquirer.enquirerStrings.select
import typings.enquirer.enquirerStrings.snippet
import typings.enquirer.enquirerStrings.sort
import typings.enquirer.enquirerStrings.survey
import typings.enquirer.enquirerStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.enquirer.mod.BasePromptOptions
  - typings.enquirer.mod.ArrayPromptOptions
  - typings.enquirer.mod.BooleanPromptOptions
  - typings.enquirer.mod.StringPromptOptions
  - typings.enquirer.mod.NumberPromptOptions
  - typings.enquirer.mod.SnippetPromptOptions
  - typings.enquirer.mod.SortPromptOptions
*/
trait PromptOptions extends js.Object
object PromptOptions {
  
  @scala.inline
  def BasePromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: String | js.Function0[String]
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def BooleanPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: confirm
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def ArrayPromptOptions(
    choices: js.Array[Choice | String],
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: autocomplete | editable | form | multiselect | select | survey | list | scale
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def StringPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: input | invisible | list | password | text
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def NumberPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: numeral
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def SnippetPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: snippet
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  def SortPromptOptions(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: sort
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}
