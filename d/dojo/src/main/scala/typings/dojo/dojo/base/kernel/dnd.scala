package typings.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.dnd.html
  *
  *
  */
trait dnd extends js.Object {
  /**
    * Used by dojo/dnd/Manager to scroll document or internal node when the user
    * drags near the edge of the viewport or a scrollable node
    *
    */
  var autoscroll: js.Object
  /**
    *
    */
  var move: js.Object
  /**
    *
    */
  def AutoSource(): Unit
  /**
    *
    */
  def Avatar(): Unit
  /**
    *
    */
  def Container(): Unit
  /**
    *
    */
  def Manager(): Unit
  /**
    *
    */
  def Moveable(): Unit
  /**
    *
    */
  def Mover(): Unit
  /**
    *
    */
  def Selector(): Unit
  /**
    *
    */
  def Source(): Unit
  /**
    *
    */
  def Target(): Unit
  /**
    *
    */
  def TimedMoveable(): Unit
}

object dnd {
  @scala.inline
  def apply(
    AutoSource: () => Unit,
    Avatar: () => Unit,
    Container: () => Unit,
    Manager: () => Unit,
    Moveable: () => Unit,
    Mover: () => Unit,
    Selector: () => Unit,
    Source: () => Unit,
    Target: () => Unit,
    TimedMoveable: () => Unit,
    autoscroll: js.Object,
    move: js.Object
  ): dnd = {
    val __obj = js.Dynamic.literal(AutoSource = js.Any.fromFunction0(AutoSource), Avatar = js.Any.fromFunction0(Avatar), Container = js.Any.fromFunction0(Container), Manager = js.Any.fromFunction0(Manager), Moveable = js.Any.fromFunction0(Moveable), Mover = js.Any.fromFunction0(Mover), Selector = js.Any.fromFunction0(Selector), Source = js.Any.fromFunction0(Source), Target = js.Any.fromFunction0(Target), TimedMoveable = js.Any.fromFunction0(TimedMoveable), autoscroll = autoscroll.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[dnd]
  }
}

