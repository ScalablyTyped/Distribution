package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractRepositoryObject")
@js.native
class AbstractRepositoryObject protected () extends AbstractPlatformObject {
  def this(repository: js.Any, `object`: js.Any) = this()
  
  def trap(callback: gitanaCallback[this.type]): this.type = js.native
}
object AbstractRepositoryObject {
  
  /* static member */
  @JSImport("gitana", "AbstractRepositoryObject.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractRepositoryObject.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractRepositoryObject.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractRepositoryObject.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractRepositoryObject.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
