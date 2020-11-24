package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gm", "compare")
@js.native
object compare extends js.Object {
  
  def apply(filename1: String, filename2: String, callback: CompareCallback): Unit = js.native
  def apply(filename1: String, filename2: String, options: Double, callback: CompareCallback): Unit = js.native
  def apply(filename1: String, filename2: String, options: CompareOptions, callback: CompareCallback): Unit = js.native
}
