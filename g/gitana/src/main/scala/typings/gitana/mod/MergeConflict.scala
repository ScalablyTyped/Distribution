package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "MergeConflict")
@js.native
class MergeConflict protected () extends AbstractRepositoryObject {
  def this(repository: js.Any, `object`: js.Any) = this()
  
  def commit(branchId: js.Any): js.Any = js.native
  
  def resolve(resolutionsArrayOrString: js.Any, callback: js.Any): js.Any = js.native
}
object MergeConflict {
  
  /* static member */
  @JSImport("gitana", "MergeConflict.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "MergeConflict.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "MergeConflict.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "MergeConflict.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "MergeConflict.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
