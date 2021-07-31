package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Role")
@js.native
class Role protected () extends StObject {
  def this(cluster: js.Any, roleContainer: js.Any, `object`: js.Any) = this()
  
  def base(): Unit = js.native
  
  def del(): js.Any = js.native
  
  def getPermissions(): js.Any = js.native
  
  def getRoleKey(): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def reload(): js.Any = js.native
  
  def update(): js.Any = js.native
}
object Role {
  
  @JSImport("gitana", "Role")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def implement(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def toString_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def valueOf_(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
