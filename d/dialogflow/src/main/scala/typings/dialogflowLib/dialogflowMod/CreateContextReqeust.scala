package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContextReqeust extends js.Object {
  var context: Context[java.lang.String, _]
  var parent: java.lang.String
}

object CreateContextReqeust {
  @scala.inline
  def apply(context: Context[java.lang.String, _], parent: java.lang.String): CreateContextReqeust = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[CreateContextReqeust]
  }
}

