package typings.dojo.dojox.sketch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/UndoStack.html
  *
  *
  * @param figure
  */
@JSGlobal("dojox.sketch.UndoStack")
@js.native
class UndoStack protected () extends js.Object {
  def this(figure: js.Any) = this()
  /**
    *
    * @param cmd
    * @param ann               Optional
    * @param before               Optional
    */
  def add(cmd: String, ann: Annotation, before: String): Unit = js.native
  /**
    *
    * @param state
    * @param from
    * @param to
    */
  @JSName("apply")
  def apply(state: js.Any, from: js.Any, to: js.Any): Unit = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    */
  def redo(): Unit = js.native
  /**
    *
    */
  def undo(): Unit = js.native
}

