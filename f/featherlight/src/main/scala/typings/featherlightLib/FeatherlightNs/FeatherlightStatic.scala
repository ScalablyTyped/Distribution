package typings
package featherlightLib.FeatherlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatherlightStatic
  extends org.scalablytyped.runtime.Instantiable0[Featherlight]
     with org.scalablytyped.runtime.Instantiable2[
      (/* $content */ featherlightLib.JQuery) | (/* $content */ java.lang.String), 
      /* config */ Config, 
      Featherlight
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* $content */ featherlightLib.JQuery) | (/* $content */ java.lang.String) | (/* config */ Config), 
      Featherlight
    ] {
  var autoBind: scala.Boolean | java.lang.String = js.native
  var contentFilters: ContentFilters = js.native
  var defaults: Config = js.native
  var functionAttributes: js.Array[java.lang.String] = js.native
  var id: scala.Double = js.native
  def apply(): Featherlight = js.native
  def apply($content: featherlightLib.JQuery): Featherlight = js.native
  def apply($content: featherlightLib.JQuery, config: Config): Featherlight = js.native
  def apply($content: java.lang.String): Featherlight = js.native
  def apply($content: java.lang.String, config: Config): Featherlight = js.native
  def apply(config: Config): Featherlight = js.native
  def attach($source: featherlightLib.JQuery): featherlightLib.JQuery = js.native
  def attach($source: featherlightLib.JQuery, $content: featherlightLib.JQuery): featherlightLib.JQuery = js.native
  def attach($source: featherlightLib.JQuery, $content: featherlightLib.JQuery, config: Config): featherlightLib.JQuery = js.native
  def attach($source: featherlightLib.JQuery, $content: java.lang.String): featherlightLib.JQuery = js.native
  def attach($source: featherlightLib.JQuery, $content: java.lang.String, config: Config): featherlightLib.JQuery = js.native
  def attach($source: featherlightLib.JQuery, config: Config): featherlightLib.JQuery = js.native
  def close(): jqueryLib.JQueryPromise[featherlightLib.JQuery] = js.native
  def current(): Featherlight = js.native
  def extend(child: js.Any, defaults: js.Any): js.Any = js.native
  def opened(): js.Array[Featherlight] = js.native
  def readElementConfig(element: stdLib.HTMLElement, namespace: java.lang.String): js.Any = js.native
}

