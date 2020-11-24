package typings.fsExtra.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "mkdtemp")
@js.native
object mkdtemp extends js.Object {
  
  def apply(prefix: String): js.Promise[String] = js.native
  def apply(prefix: String, callback: js.Function2[/* err */ ErrnoException, /* folder */ String, Unit]): Unit = js.native
}
