package typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoboDirective extends js.Object {
  /**
    * The type of action that Robo should perform on the specified element.
    * Required.
    */
  var actionType: js.UndefOr[String] = js.undefined
  /**
    * The text that Robo is directed to set. If left empty, the directive will be
    * treated as a CLICK on the element matching the resource_name.
    * Optional
    */
  var inputText: js.UndefOr[String] = js.undefined
  /**
    * The android resource name of the target UI element
    * For example,
    * in Java: R.string.foo
    * in xml: @string/foo
    * Only the “foo” part is needed.
    * Reference doc:
    * https://developer.android.com/guide/topics/resources/accessing-resources.html
    * Required
    */
  var resourceName: js.UndefOr[String] = js.undefined
}

object RoboDirective {
  @scala.inline
  def apply(actionType: String = null, inputText: String = null, resourceName: String = null): RoboDirective = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType)
    if (inputText != null) __obj.updateDynamic("inputText")(inputText)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[RoboDirective]
  }
}

