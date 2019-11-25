package typings.framesync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delta extends js.Object {
  var delta: Double
  var timestamp: Double
}

object Anon_Delta {
  @scala.inline
  def apply(delta: Double, timestamp: Double): Anon_Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Delta]
  }
}

