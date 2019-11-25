package typings.gestalt.gestaltMod

import typings.gestalt.Anon_EventValue
import typings.gestalt.Anon_EventValueElement
import typings.gestalt.gestaltStrings.`current-password`
import typings.gestalt.gestaltStrings.date
import typings.gestalt.gestaltStrings.down
import typings.gestalt.gestaltStrings.email
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.number
import typings.gestalt.gestaltStrings.off
import typings.gestalt.gestaltStrings.on
import typings.gestalt.gestaltStrings.password
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.text
import typings.gestalt.gestaltStrings.up
import typings.gestalt.gestaltStrings.url
import typings.gestalt.gestaltStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps extends js.Object {
  var autoComplete: js.UndefOr[`current-password` | on | off | username] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var id: String
  var idealErrorDirection: js.UndefOr[up | right | down | left] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* args */ Anon_EventValueElement, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* args */ Anon_EventValueElement, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[date | email | number | password | text | url] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def onChange(args: Anon_EventValue): Unit
}

object TextFieldProps {
  @scala.inline
  def apply(
    id: String,
    onChange: Anon_EventValue => Unit,
    autoComplete: `current-password` | on | off | username = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    idealErrorDirection: up | right | down | left = null,
    name: String = null,
    onBlur: /* args */ Anon_EventValueElement => Unit = null,
    onFocus: /* args */ Anon_EventValueElement => Unit = null,
    placeholder: String = null,
    `type`: date | email | number | password | text | url = null,
    value: String = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

