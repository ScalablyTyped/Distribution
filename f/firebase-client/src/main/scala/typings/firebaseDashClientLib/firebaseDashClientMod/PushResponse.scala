package typings
package firebaseDashClientLib.firebaseDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushResponse extends js.Object {
  /**
  	 * Name ref (key) of the child resource
  	 */
  var name: java.lang.String
}

object PushResponse {
  @scala.inline
  def apply(name: java.lang.String): PushResponse = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[PushResponse]
  }
}

