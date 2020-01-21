package typings.dojo.dojox.sketch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.sketch.Figure")
@js.native
object Figure extends js.Object {
  /**
    *
    */
  var gridSize: Double = js.native
  /**
    *
    * @param annotation
    */
  type add = js.Function1[/* annotation */ js.Any, Unit]
  /**
    *
    * @param ann
    * @param t
    */
  type convert = js.Function2[/* ann */ js.Any, /* t */ js.Any, Unit]
  /**
    *
    * @param isLoading
    */
  type destroy = js.Function1[/* isLoading */ js.Any, Unit]
  /**
    *
    */
  type draw = js.Function0[Unit]
  /**
    *
    * @param id
    */
  type getAnnotator = js.Function1[/* id */ js.Any, Unit]
  /**
    *
    */
  type getFit = js.Function0[Unit]
  /**
    *
    */
  type getValue = js.Function0[Unit]
  /**
    *
    */
  type initUndoStack = js.Function0[Unit]
  /**
    *
    * @param node
    */
  type initialize = js.Function1[/* node */ js.Any, Unit]
  /**
    *
    * @param obj
    * @param n
    */
  type load = js.Function2[/* obj */ js.Any, /* n */ js.Any, Unit]
  /**
    *
    */
  type nextKey = js.Function0[Unit]
  /**
    *
    */
  type redo = js.Function0[Unit]
  /**
    *
    * @param annotation
    */
  type remove = js.Function1[/* annotation */ js.Any, Unit]
  /**
    *
    */
  type serialize = js.Function0[Unit]
  /**
    *
    * @param t
    */
  type setTool = js.Function1[/* t */ Plugin, Unit]
  /**
    *
    * @param text
    */
  type setValue = js.Function1[/* text */ js.Any, Unit]
  /**
    *
    */
  type undo = js.Function0[Unit]
  /**
    *
    */
  type unzoom = js.Function0[Unit]
  /**
    *
    * @param pct
    */
  type zoom = js.Function1[/* pct */ js.Any, Unit]
}

