package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NODEADMIN extends js.Object {
  /**
    * @define {boolean} Whether this is the Admin Node.js SDK.
    */
  var NODE_ADMIN: scala.Boolean
  /**
    * @define {boolean} Whether this is the client Node.js SDK.
    */
  var NODE_CLIENT: scala.Boolean
  /**
    * Firebase SDK Version
    */
  var SDK_VERSION: java.lang.String
}

object Anon_NODEADMIN {
  @scala.inline
  def apply(NODE_ADMIN: scala.Boolean, NODE_CLIENT: scala.Boolean, SDK_VERSION: java.lang.String): Anon_NODEADMIN = {
    val __obj = js.Dynamic.literal(NODE_ADMIN = NODE_ADMIN, NODE_CLIENT = NODE_CLIENT, SDK_VERSION = SDK_VERSION)
  
    __obj.asInstanceOf[Anon_NODEADMIN]
  }
}

