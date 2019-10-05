package typings.dojo.dojo.dnd

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/move.html
  *
  * TODOC
  *
  */
trait move extends js.Object {
  /**
    *
    */
  def boxConstrainedMoveable(): Unit
  /**
    *
    */
  def constrainedMoveable(): Unit
  /**
    *
    */
  def parentConstrainedMoveable(): Unit
}

@JSGlobal("dojo.dnd.move")
@js.native
object move extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/move.boxConstrainedMoveable.html
    *
    *
    * @param node a node (or node's id) to be moved
    * @param params       Optionalan optional object with parameters
    */
  @js.native
  class boxConstrainedMoveable protected () extends Moveable {
    def this(node: HTMLElement) = this()
    def this(node: HTMLElement, params: js.Object) = this()
    /**
      * object attributes (for markup)
      *
      */
    var box: js.Object = js.native
    /**
      *
      */
    var within: Boolean = js.native
    /**
      *
      */
    def constraints(): Unit = js.native
    /**
      * called during the very first move notification;
      * can be used to initialize coordinates, can be overwritten.
      *
      * @param mover
      */
    def onFirstMove(mover: Mover): Unit = js.native
    /**
      * called during every move notification;
      * should actually move the node; can be overwritten.
      *
      * @param mover
      * @param leftTop
      */
    def onMove(mover: Mover, leftTop: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/move.constrainedMoveable.html
    *
    *
    * @param node a node (or node's id) to be moved
    * @param params       Optionalan optional object with additional parameters;the rest is passed to the base class
    */
  @js.native
  class constrainedMoveable protected () extends Moveable {
    def this(node: HTMLElement) = this()
    def this(node: HTMLElement, params: js.Object) = this()
    /**
      *
      */
    var within: Boolean = js.native
    /**
      *
      */
    def constraints(): Unit = js.native
    /**
      * called during the very first move notification;
      * can be used to initialize coordinates, can be overwritten.
      *
      * @param mover
      */
    def onFirstMove(mover: Mover): Unit = js.native
    /**
      * called during every move notification;
      * should actually move the node; can be overwritten.
      *
      * @param mover
      * @param leftTop
      */
    def onMove(mover: Mover, leftTop: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/move.parentConstrainedMoveable.html
    *
    *
    * @param node a node (or node's id) to be moved
    * @param params       Optionalan optional object with parameters
    */
  @js.native
  class parentConstrainedMoveable protected () extends Moveable {
    def this(node: HTMLElement) = this()
    def this(node: HTMLElement, params: js.Object) = this()
    /**
      * object attributes (for markup)
      *
      */
    var area: String = js.native
    /**
      *
      */
    var within: Boolean = js.native
    /**
      *
      */
    def constraints(): Unit = js.native
    /**
      * called during the very first move notification;
      * can be used to initialize coordinates, can be overwritten.
      *
      * @param mover
      */
    def onFirstMove(mover: Mover): Unit = js.native
    /**
      * called during every move notification;
      * should actually move the node; can be overwritten.
      *
      * @param mover
      * @param leftTop
      */
    def onMove(mover: Mover, leftTop: js.Object): Unit = js.native
  }
  
}

