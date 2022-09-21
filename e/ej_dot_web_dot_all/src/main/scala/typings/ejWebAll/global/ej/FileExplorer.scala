package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.FileExplorer")
@js.native
open class FileExplorer protected ()
  extends StObject
     with typings.ejWebAll.ej.FileExplorer {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object FileExplorer {
  
  @JSGlobal("ej.FileExplorer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.FileExplorer.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.FileExplorer.fn")
  @js.native
  def fn: typings.ejWebAll.ej.FileExplorer = js.native
  inline def fn_=(x: typings.ejWebAll.ej.FileExplorer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.FileExplorer.layoutType")
  @js.native
  object layoutType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.FileExplorer.layoutType & Double] = js.native
    
    /* 1 */ val Grid: typings.ejWebAll.ej.FileExplorer.layoutType.Grid & Double = js.native
    
    /* 2 */ val LargeIcons: typings.ejWebAll.ej.FileExplorer.layoutType.LargeIcons & Double = js.native
    
    /* 0 */ val Tile: typings.ejWebAll.ej.FileExplorer.layoutType.Tile & Double = js.native
  }
}
