package typings.dojo.dojox.sketch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Annotation {
  /**
    *
    * @param obj
    */
  type apply = js.Function1[/* obj */ js.Any, scala.Unit]
  /**
    *
    * @param type
    */
  type beginEdit = js.Function1[/* type */ js.Any, scala.Unit]
  /**
    *
    */
  type destroy = js.Function0[scala.Unit]
  /**
    *
    */
  type draw = js.Function0[scala.Unit]
  /**
    *
    */
  type drawBBox = js.Function0[scala.Unit]
  /**
    *
    */
  type endEdit = js.Function0[scala.Unit]
  /**
    *
    */
  type getBBox = js.Function0[scala.Unit]
  /**
    *
    * @param zoomfactor
    */
  type getTextBox = js.Function1[/* zoomfactor */ js.Any, scala.Unit]
  /**
    *
    */
  type getType = js.Function0[scala.Unit]
  /**
    *
    */
  type initialize = js.Function0[scala.Unit]
  /**
    *
    * @param name
    * @param value               Optional
    */
  type property = js.Function2[/* name */ js.Any, /* value */ js.Any, scala.Unit]
  /**
    *
    * @param obj
    */
  type readCommonAttrs = js.Function1[/* obj */ js.Any, scala.Unit]
  /**
    *
    * @param name
    * @param toolclass
    */
  type register = js.Function2[/* name */ js.Any, /* toolclass */ js.Any, scala.Unit]
  /**
    *
    */
  type serialize = js.Function0[scala.Unit]
  /**
    *
    * @param pt
    */
  type setBinding = js.Function1[/* pt */ js.Any, scala.Unit]
  /**
    *
    * @param m
    */
  type setMode = js.Function1[/* m */ js.Any, scala.Unit]
  /**
    *
    */
  type `type` = js.Function0[scala.Unit]
  /**
    *
    */
  type writeCommonAttrs = js.Function0[scala.Unit]
  /**
    *
    * @param pct
    */
  type zoom = js.Function1[/* pct */ js.Any, scala.Unit]
}
