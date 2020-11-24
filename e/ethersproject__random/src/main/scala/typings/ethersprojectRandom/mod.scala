package typings.ethersprojectRandom

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/random", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def randomBytes(length: Double): Uint8Array = js.native
  
  def shuffled(array: js.Array[_]): js.Array[_] = js.native
}
