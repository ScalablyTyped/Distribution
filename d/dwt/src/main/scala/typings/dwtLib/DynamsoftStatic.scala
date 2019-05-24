package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamsoftStatic[TElement /* <: stdLib.Node */] extends js.Object {
  var Lib: DynamsoftLib
  var WebTwainEnv: dwtEnv
}

object DynamsoftStatic {
  @scala.inline
  def apply[TElement /* <: stdLib.Node */](Lib: DynamsoftLib, WebTwainEnv: dwtEnv): DynamsoftStatic[TElement] = {
    val __obj = js.Dynamic.literal(Lib = Lib, WebTwainEnv = WebTwainEnv)
  
    __obj.asInstanceOf[DynamsoftStatic[TElement]]
  }
}

