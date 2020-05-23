package typings.firebaseAdmin.admin.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a Remote Config condition.
  * A condition targets a specific group of users. A list of these conditions make up
  * part of a Remote Config template.
  */
trait RemoteConfigCondition extends js.Object {
  /**
    * The logic of this condition.
    * See the documentation on
    * {@link https://firebase.google.com/docs/remote-config/condition-reference condition expressions}
    * for the expected syntax of this field.
    */
  var expression: String
  /**
    * A non-empty and unique name of this condition.
    */
  var name: String
  /**
    * The color associated with this condition for display purposes in the Firebase Console.
    * Not specifying this value results in the console picking an arbitrary color to associate
    * with the condition.
    */
  var tagColor: js.UndefOr[TagColor] = js.undefined
}

object RemoteConfigCondition {
  @scala.inline
  def apply(expression: String, name: String, tagColor: TagColor = null): RemoteConfigCondition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (tagColor != null) __obj.updateDynamic("tagColor")(tagColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigCondition]
  }
}

