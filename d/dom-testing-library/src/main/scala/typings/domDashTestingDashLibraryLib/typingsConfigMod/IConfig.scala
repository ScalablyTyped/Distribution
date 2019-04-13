package typings
package domDashTestingDashLibraryLib.typingsConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var testIdAttribute: java.lang.String
  def asyncWrapper[T](cb: js.Function): js.Promise[T]
}

object IConfig {
  @scala.inline
  def apply(asyncWrapper: js.Function => js.Promise[js.Any], testIdAttribute: java.lang.String): IConfig = {
    val __obj = js.Dynamic.literal(asyncWrapper = js.Any.fromFunction1(asyncWrapper), testIdAttribute = testIdAttribute)
  
    __obj.asInstanceOf[IConfig]
  }
}

