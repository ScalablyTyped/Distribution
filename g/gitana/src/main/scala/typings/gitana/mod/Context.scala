package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Context")
@js.native
class Context protected () extends js.Object {
  def this(configs: js.Any) = this()
  
  def base(): Unit = js.native
  
  def branch(branch: js.Any): js.Any = js.native
  
  def init(): js.Any = js.native
  
  def platform(platform: js.Any): js.Any = js.native
  
  def repository(repository: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Context")
@js.native
object Context extends js.Object {
  
  def create(config: js.Any): js.Any = js.native
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
