package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fireo", "BaseField")
@js.native
open class BaseField () extends StObject {
  def this(options: BaseFieldOptions) = this()
  
  def configure(): Unit = js.native
  def configure(options: BaseFieldConfig): Unit = js.native
  
  def getDBValue(): js.Promise[Any] = js.native
  
  def getValue: Any = js.native
  
  def name: String = js.native
  
  def setDbValue(value: Any): Unit = js.native
  
  def setValue(value: Any): Unit = js.native
}
