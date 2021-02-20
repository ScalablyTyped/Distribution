package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AppHelper")
@js.native
class AppHelper protected () extends AbstractObject {
  def this(platform: js.Any, config: js.Any) = this()
  
  def application(): Application = js.native
  
  def datastore(key: String): DataStore = js.native
  
  def init(callback: js.Any): Unit = js.native
  
  def platform(): Platform = js.native
  
  def project(): Project = js.native
  
  def stack(): Stack = js.native
}
object AppHelper {
  
  /* static member */
  @JSImport("gitana", "AppHelper.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AppHelper.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "AppHelper.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AppHelper.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AppHelper.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
