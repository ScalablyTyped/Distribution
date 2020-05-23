package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.FileExplorer")
@js.native
class FileExplorer protected ()
  extends typings.ejWebAll.ej.FileExplorer {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.FileExplorer.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.FileExplorer.Model) = this()
}

/* static members */
@JSGlobal("ej.FileExplorer")
@js.native
object FileExplorer extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.FileExplorer = js.native
  @js.native
  object layoutType extends js.Object {
    /* 1 */ val Grid: typings.ejWebAll.ej.FileExplorer.layoutType.Grid with Double = js.native
    /* 2 */ val LargeIcons: typings.ejWebAll.ej.FileExplorer.layoutType.LargeIcons with Double = js.native
    /* 0 */ val Tile: typings.ejWebAll.ej.FileExplorer.layoutType.Tile with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.FileExplorer.layoutType with Double] = js.native
  }
  
}

