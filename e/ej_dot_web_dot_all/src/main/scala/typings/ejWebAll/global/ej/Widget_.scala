package typings.ejWebAll.global.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Widget")
@js.native
open class Widget_ protected ()
  extends StObject
     with typings.ejWebAll.ej.Widget_ {
  def this(pluginName: String, className: String, proto: Any) = this()
}
object Widget_ {
  
  @JSGlobal("ej.Widget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(widget: typings.ejWebAll.ej.Widget_): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(widget.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  @JSGlobal("ej.Widget.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Widget_ = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Widget_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
