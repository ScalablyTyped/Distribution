package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var addEventListener: downshiftLib.Anon_Abort
  var document: stdLib.Document
  var removeEventListener: downshiftLib.Anon_AbortAfterprint
}

object Environment {
  @scala.inline
  def apply(
    addEventListener: downshiftLib.Anon_Abort,
    document: stdLib.Document,
    removeEventListener: downshiftLib.Anon_AbortAfterprint
  ): Environment = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, document = document, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[Environment]
  }
}

