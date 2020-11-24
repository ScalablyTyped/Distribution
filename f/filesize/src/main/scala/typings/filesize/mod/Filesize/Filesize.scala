package typings.filesize.mod.Filesize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filesize extends js.Object {
  
  def apply(bytes: Double): String = js.native
  def apply(bytes: Double, options: Options): String = js.native
  
  def partial(options: Options): js.Function1[/* bytes */ Double, String] = js.native
}
