package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directs Robo to interact with a specific UI element if it is encountered
  * during the crawl. Currently, Robo can perform text entry or element click.
  */
@js.native
trait Schema$RoboDirective extends js.Object {
  /**
    * Required. The type of action that Robo should perform on the specified
    * element.
    */
  var actionType: js.UndefOr[String] = js.native
  /**
    * The text that Robo is directed to set. If left empty, the directive will
    * be treated as a CLICK on the element matching the resource_name.
    */
  var inputText: js.UndefOr[String] = js.native
  /**
    * Required. The android resource name of the target UI element. For
    * example,    in Java: R.string.foo    in xml: @string/foo Only the
    * &quot;foo&quot; part is needed. Reference doc:
    * https://developer.android.com/guide/topics/resources/accessing-resources.html
    */
  var resourceName: js.UndefOr[String] = js.native
}

object Schema$RoboDirective {
  @scala.inline
  def apply(actionType: String = null, inputText: String = null, resourceName: String = null): Schema$RoboDirective = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (inputText != null) __obj.updateDynamic("inputText")(inputText.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoboDirective]
  }
}

