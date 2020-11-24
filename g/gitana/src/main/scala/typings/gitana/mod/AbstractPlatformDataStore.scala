package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractPlatformDataStore")
@js.native
class AbstractPlatformDataStore protected () extends DataStore {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def findStack(): js.Any = js.native
  
  def loadInfo(callback: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "AbstractPlatformDataStore")
@js.native
object AbstractPlatformDataStore extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
