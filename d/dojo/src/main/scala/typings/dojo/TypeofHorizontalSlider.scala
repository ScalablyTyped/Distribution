package typings.dojo

import org.scalablytyped.runtime.Instantiable3
import typings.dojo.dijit.form.HorizontalSlider.Mover
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofHorizontalSlider extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/HorizontalSlider._Mover.html
    *
    * 
    * @param node a node (or node's id) to be moved     
    * @param e a mouse event, which started the move;only pageX and pageY properties are used     
    * @param host       Optionalobject which implements the functionality of the move,and defines proper events (onMoveStart and onMoveStop)     
    */
  var _Mover: Instantiable3[/* node */ HTMLElement, /* e */ Event_, js.UndefOr[/* host */ js.Object], Mover]
}

object TypeofHorizontalSlider {
  @scala.inline
  def apply(
    _Mover: Instantiable3[/* node */ HTMLElement, /* e */ Event_, js.UndefOr[/* host */ js.Object], Mover]
  ): TypeofHorizontalSlider = {
    val __obj = js.Dynamic.literal(_Mover = _Mover.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHorizontalSlider]
  }
}

