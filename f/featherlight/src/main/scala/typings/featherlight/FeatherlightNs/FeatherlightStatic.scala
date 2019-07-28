package typings.featherlight.FeatherlightNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.featherlight.JQuery
import typings.jquery.JQueryPromise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatherlightStatic
  extends Instantiable0[Featherlight]
     with Instantiable2[(/* $content */ JQuery) | (/* $content */ String), /* config */ Config, Featherlight]
     with Instantiable1[
      (/* config */ Config) | (/* $content */ JQuery) | (/* $content */ String), 
      Featherlight
    ] {
  var autoBind: Boolean | String = js.native
  var contentFilters: ContentFilters = js.native
  var defaults: Config = js.native
  var functionAttributes: js.Array[String] = js.native
  var id: Double = js.native
  def apply(): Featherlight = js.native
  def apply($content: String): Featherlight = js.native
  def apply($content: String, config: Config): Featherlight = js.native
  def apply($content: JQuery): Featherlight = js.native
  def apply($content: JQuery, config: Config): Featherlight = js.native
  def apply(config: Config): Featherlight = js.native
  def attach($source: JQuery): JQuery = js.native
  def attach($source: JQuery, $content: String): JQuery = js.native
  def attach($source: JQuery, $content: String, config: Config): JQuery = js.native
  def attach($source: JQuery, $content: JQuery): JQuery = js.native
  def attach($source: JQuery, $content: JQuery, config: Config): JQuery = js.native
  def attach($source: JQuery, config: Config): JQuery = js.native
  def close(): JQueryPromise[JQuery] = js.native
  def current(): Featherlight = js.native
  def extend(child: js.Any, defaults: js.Any): js.Any = js.native
  def opened(): js.Array[Featherlight] = js.native
  def readElementConfig(element: HTMLElement, namespace: String): js.Any = js.native
}

