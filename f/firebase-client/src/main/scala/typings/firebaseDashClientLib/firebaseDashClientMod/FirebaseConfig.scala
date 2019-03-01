package typings
package firebaseDashClientLib.firebaseDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseConfig extends js.Object {
  /**
  	 * Token for authorisation
  	 */
  var auth: java.lang.String
  /**
  	 * path for the Firebase instance
  	 */
  var url: java.lang.String
}

object FirebaseConfig {
  @scala.inline
  def apply(auth: java.lang.String, url: java.lang.String): FirebaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[FirebaseConfig]
  }
}

