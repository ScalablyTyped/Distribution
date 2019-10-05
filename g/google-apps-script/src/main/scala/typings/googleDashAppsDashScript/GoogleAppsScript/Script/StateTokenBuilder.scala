package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateTokenBuilder extends js.Object {
  def createToken(): String
  def withArgument(name: String, value: String): StateTokenBuilder
  def withMethod(method: String): StateTokenBuilder
  def withTimeout(seconds: Integer): StateTokenBuilder
}

object StateTokenBuilder {
  @scala.inline
  def apply(
    createToken: () => String,
    withArgument: (String, String) => StateTokenBuilder,
    withMethod: String => StateTokenBuilder,
    withTimeout: Integer => StateTokenBuilder
  ): StateTokenBuilder = {
    val __obj = js.Dynamic.literal(createToken = js.Any.fromFunction0(createToken), withArgument = js.Any.fromFunction2(withArgument), withMethod = js.Any.fromFunction1(withMethod), withTimeout = js.Any.fromFunction1(withTimeout))
  
    __obj.asInstanceOf[StateTokenBuilder]
  }
}

