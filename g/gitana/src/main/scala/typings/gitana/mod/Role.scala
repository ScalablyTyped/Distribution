package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Role")
@js.native
open class Role protected () extends StObject {
  def this(cluster: Any, roleContainer: Any, `object`: Any) = this()
  
  def base(): Unit = js.native
  
  def del(): Any = js.native
  
  def getPermissions(): Any = js.native
  
  def getRoleKey(): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def reload(): Any = js.native
  
  def update(): Any = js.native
}
object Role {
  
  @JSImport("gitana", "Role")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
