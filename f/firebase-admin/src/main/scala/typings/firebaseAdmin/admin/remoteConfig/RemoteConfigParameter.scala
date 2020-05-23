package typings.firebaseAdmin.admin.remoteConfig

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a Remote Config parameter.
  * At minimum, a `defaultValue` or a `conditionalValues` entry must be present for the 
  * parameter to have any effect.
  */
trait RemoteConfigParameter extends js.Object {
  /**
    * A `(condition name, value)` map. The condition name of the highest priority
    * (the one listed first in the Remote Config template's conditions list) determines the value of 
    * this parameter.
    */
  var conditionalValues: js.UndefOr[StringDictionary[RemoteConfigParameterValue]] = js.undefined
  /**
    * The value to set the parameter to, when none of the named conditions evaluate to `true`.
    */
  var defaultValue: js.UndefOr[RemoteConfigParameterValue] = js.undefined
  /**
    * A description for this parameter. Should not be over 100 characters and may contain any
    * Unicode characters.
    */
  var description: js.UndefOr[String] = js.undefined
}

object RemoteConfigParameter {
  @scala.inline
  def apply(
    conditionalValues: StringDictionary[RemoteConfigParameterValue] = null,
    defaultValue: RemoteConfigParameterValue = null,
    description: String = null
  ): RemoteConfigParameter = {
    val __obj = js.Dynamic.literal()
    if (conditionalValues != null) __obj.updateDynamic("conditionalValues")(conditionalValues.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigParameter]
  }
}

