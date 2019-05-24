package typings
package eggDashMultipartLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * Files Object Array
    */
  var files: js.Array[eggDashMultipartLib.EggFile]
}

object Request {
  @scala.inline
  def apply(files: js.Array[eggDashMultipartLib.EggFile]): Request = {
    val __obj = js.Dynamic.literal(files = files)
  
    __obj.asInstanceOf[Request]
  }
}

