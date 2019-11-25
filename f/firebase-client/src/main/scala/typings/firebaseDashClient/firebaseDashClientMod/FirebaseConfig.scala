package typings.firebaseDashClient.firebaseDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseConfig extends js.Object {
  /**
  	 * Token for authorisation
  	 */
  var auth: String
  /**
  	 * path for the Firebase instance
  	 */
  var url: String
}

object FirebaseConfig {
  @scala.inline
  def apply(auth: String, url: String): FirebaseConfig = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirebaseConfig]
  }
}

