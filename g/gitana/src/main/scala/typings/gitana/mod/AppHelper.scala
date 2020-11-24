package typings.gitana.mod

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
/* static members */
@JSImport("gitana", "AppHelper")
@js.native
object AppHelper extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
