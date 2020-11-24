package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractPlatformObject")
@js.native
class AbstractPlatformObject protected () extends AbstractSelfableACLObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def copy(target: js.Any, asynchronous: js.Any, config: js.Any): js.Any = js.native
  
  def exportArchive(settings: js.Any): js.Any = js.native
  
  def getCluster(): Cluster = js.native
  
  def getRepository(): Repository = js.native
  
  def importArchive(settings: js.Any, reportFn: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "AbstractPlatformObject")
@js.native
object AbstractPlatformObject extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
