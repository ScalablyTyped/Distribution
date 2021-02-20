package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractPersistable")
@js.native
class AbstractPersistable protected () extends Chainable {
  def this(driver: js.Any, `object`: js.Any) = this()
  
  def handleResponse(response: js.Any): Unit = js.native
  
  def handleSystemProperties(response: js.Any): Unit = js.native
  
  def json(): js.Any = js.native
}
object AbstractPersistable {
  
  /* static member */
  @JSImport("gitana", "AbstractPersistable.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractPersistable.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractPersistable.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractPersistable.toString")
  @js.native
  def toString_(): String = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractPersistable.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
