package typings.digibyte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrevHash extends js.Object {
  var prevHash: String
  var time: Double
}

object Anon_PrevHash {
  @scala.inline
  def apply(prevHash: String, time: Double): Anon_PrevHash = {
    val __obj = js.Dynamic.literal(prevHash = prevHash, time = time)
  
    __obj.asInstanceOf[Anon_PrevHash]
  }
}

