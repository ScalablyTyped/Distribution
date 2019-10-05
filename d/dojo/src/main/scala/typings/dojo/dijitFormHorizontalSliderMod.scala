package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.dojo.dijit.form.HorizontalSlider
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/form/HorizontalSlider", JSImport.Namespace)
@js.native
object dijitFormHorizontalSliderMod
  extends TopLevel[
      TypeofHorizontalSlider with (Instantiable2[
        js.UndefOr[/* params */ js.Object], 
        js.UndefOr[/* srcNodeRef */ HTMLElement], 
        HorizontalSlider
      ])
    ] {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/HorizontalSlider._Mover.html
    *
    * 
    * @param node a node (or node's id) to be moved     
    * @param e a mouse event, which started the move;only pageX and pageY properties are used     
    * @param host       Optionalobject which implements the functionality of the move,and defines proper events (onMoveStart and onMoveStop)     
    */
  @js.native
  class _Mover protected ()
    extends typings.dojo.dijit.form.HorizontalSlider._Mover {
    def this(node: HTMLElement, e: Event) = this()
    def this(node: HTMLElement, e: Event, host: js.Object) = this()
  }
  
}

