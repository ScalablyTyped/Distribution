package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Changeset")
@js.native
class Changeset protected () extends AbstractRepositoryObject {
  def this(repository: js.Any, `object`: js.Any) = this()
  
  def listNodes(pagination: js.Any): NodeMap = js.native
}
object Changeset {
  
  /* static member */
  @JSImport("gitana", "Changeset.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Changeset.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Changeset.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Changeset.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Changeset.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
