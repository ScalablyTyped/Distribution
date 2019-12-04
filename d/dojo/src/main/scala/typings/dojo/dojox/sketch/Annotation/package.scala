package typings.dojo.dojox.sketch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Annotation {
  /**
    *
    * @param obj
    */
  type apply = js.Function1[/* obj */ js.Any, Unit]
  /**
    *
    * @param type
    */
  type beginEdit = js.Function1[/* type */ js.Any, Unit]
  /**
    *
    */
  type destroy = js.Function0[Unit]
  /**
    *
    */
  type draw = js.Function0[Unit]
  /**
    *
    */
  type drawBBox = js.Function0[Unit]
  /**
    *
    */
  type endEdit = js.Function0[Unit]
  /**
    *
    */
  type getBBox = js.Function0[Unit]
  /**
    *
    * @param zoomfactor
    */
  type getTextBox = js.Function1[/* zoomfactor */ js.Any, Unit]
  /**
    *
    */
  type getType = js.Function0[Unit]
  /**
    *
    */
  type initialize = js.Function0[Unit]
  /**
    *
    * @param name
    * @param value               Optional
    */
  type property = js.Function2[/* name */ js.Any, /* value */ js.Any, Unit]
  /**
    *
    * @param obj
    */
  type readCommonAttrs = js.Function1[/* obj */ js.Any, Unit]
  /**
    *
    * @param name
    * @param toolclass
    */
  type register = js.Function2[/* name */ js.Any, /* toolclass */ js.Any, Unit]
  /**
    *
    */
  type serialize = js.Function0[Unit]
  /**
    *
    * @param pt
    */
  type setBinding = js.Function1[/* pt */ js.Any, Unit]
  /**
    *
    * @param m
    */
  type setMode = js.Function1[/* m */ js.Any, Unit]
  /**
    *
    */
  type `type` = js.Function0[Unit]
  /**
    *
    */
  type writeCommonAttrs = js.Function0[Unit]
  /**
    *
    * @param pct
    */
  type zoom = js.Function1[/* pct */ js.Any, Unit]
}
