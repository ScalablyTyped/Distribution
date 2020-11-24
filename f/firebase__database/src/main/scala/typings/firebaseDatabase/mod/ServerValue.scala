package typings.firebaseDatabase.mod

import typings.firebaseDatabase.anon.Sv
import typings.firebaseDatabase.anon.SvIncrement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database", "ServerValue")
@js.native
object ServerValue extends js.Object {
  
  var TIMESTAMP: Sv = js.native
  
  def increment(delta: Double): SvIncrement = js.native
}
