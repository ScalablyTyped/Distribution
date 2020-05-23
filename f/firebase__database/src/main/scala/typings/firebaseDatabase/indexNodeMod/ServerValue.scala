package typings.firebaseDatabase.indexNodeMod

import typings.firebaseDatabase.anon.Sv
import typings.firebaseDatabase.anon.SvIncrement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/index.node", "ServerValue")
@js.native
object ServerValue extends js.Object {
  var TIMESTAMP: Sv = js.native
  def increment(delta: Double): SvIncrement = js.native
}

