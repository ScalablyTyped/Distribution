package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractObject")
@js.native
open class AbstractObject protected () extends AbstractPersistable {
  def this(driver: Any, `object`: Any) = this()
  
  def get(key: String): Any = js.native
  
  def getDescription(): String = js.native
  
  def getId(): String = js.native
  
  def getProxiedUri(): String = js.native
  
  def getSystemMetadata(): SystemMetadata = js.native
  
  def getTitle(): String = js.native
  
  def getType(): String = js.native
  
  def getUri(): String = js.native
  
  def loadFrom(anotherObject: Any): Unit = js.native
  
  def ref(): String = js.native
  
  def replacePropertiesWith(`object`: Any): Unit = js.native
  
  def set(key: String, value: Any): Unit = js.native
  
  def stringify(pretty: Any): Any = js.native
}
object AbstractObject {
  
  @JSImport("gitana", "AbstractObject")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
