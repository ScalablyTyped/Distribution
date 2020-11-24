package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "BranchMap")
@js.native
class BranchMap protected () extends AbstractPlatformObjectMap {
  def this(repository: js.Any, `object`: js.Any) = this()
  
  def trap(cb: gitanaCallback[this.type]): this.type = js.native
}
/* static members */
@JSImport("gitana", "BranchMap")
@js.native
object BranchMap extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
