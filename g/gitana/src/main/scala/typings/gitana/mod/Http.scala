package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Http")
@js.native
class Http protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def base(): Unit = js.native
  
  def request(options: js.Any): js.Any = js.native
}
object Http {
  
  @JSImport("gitana", "Http")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def Request(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Request")().asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def URLDecode(string: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("URLDecode")(string.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def URLEncode(string: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("URLEncode")(string.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
  def toQueryString(params: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")(params.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def toString_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def valueOf_(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
