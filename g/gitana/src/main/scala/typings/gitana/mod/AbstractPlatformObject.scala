package typings.gitana.mod

import org.scalablytyped.runtime.StObject
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
object AbstractPlatformObject {
  
  /* static member */
  @JSImport("gitana", "AbstractPlatformObject.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractPlatformObject.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractPlatformObject.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractPlatformObject.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractPlatformObject.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
