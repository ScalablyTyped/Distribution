package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractObject")
@js.native
class AbstractObject protected () extends AbstractPersistable {
  def this(driver: js.Any, `object`: js.Any) = this()
  
  def get(key: String): js.Any = js.native
  
  def getDescription(): String = js.native
  
  def getId(): String = js.native
  
  def getProxiedUri(): String = js.native
  
  def getSystemMetadata(): SystemMetadata = js.native
  
  def getTitle(): String = js.native
  
  def getType(): String = js.native
  
  def getUri(): String = js.native
  
  def loadFrom(anotherObject: js.Any): Unit = js.native
  
  def ref(): String = js.native
  
  def replacePropertiesWith(`object`: js.Any): Unit = js.native
  
  def set(key: String, value: js.Any): Unit = js.native
  
  def stringify(pretty: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "AbstractObject")
@js.native
object AbstractObject extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
