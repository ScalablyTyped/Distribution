package typings.gitana.global.Gitana

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Gitana.Http")
@js.native
open class Http protected ()
  extends typings.gitana.mod.Http {
  def this(args: Any*) = this()
}
object Http {
  
  @JSGlobal("Gitana.Http")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def Request(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Request")().asInstanceOf[Any]
  
  /* static member */
  inline def URLDecode(string: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("URLDecode")(string.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def URLEncode(string: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("URLEncode")(string.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toQueryString(params: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")(params.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
