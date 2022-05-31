package typings.fitvids

import typings.fitvids.mod.Options
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * The module exports a single function.
    * Just call it, and it'll wrap video embeds from Youtube, Vimeo, and Kickstarter in a responsive container.
    * Other video players can be supported by passing a custom selector via the options.
    *
    * To wrap videos that have been added to the page dynamically, just call the function again.
    * Fitvids is smart enough to only wrap the new videos.
    */
  inline def fitvids(): Unit = js.Dynamic.global.applyDynamic("fitvids")().asInstanceOf[Unit]
  inline def fitvids(options: Options): Unit = js.Dynamic.global.applyDynamic("fitvids")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fitvids(parentSelector: String): Unit = js.Dynamic.global.applyDynamic("fitvids")(parentSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fitvids(parentSelector: String, options: Options): Unit = (js.Dynamic.global.applyDynamic("fitvids")(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fitvids(parentSelector: Null, options: Options): Unit = (js.Dynamic.global.applyDynamic("fitvids")(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fitvids(parentSelector: Unit, options: Options): Unit = (js.Dynamic.global.applyDynamic("fitvids")(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fitvids(parentSelector: Element): Unit = js.Dynamic.global.applyDynamic("fitvids")(parentSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fitvids(parentSelector: Element, options: Options): Unit = (js.Dynamic.global.applyDynamic("fitvids")(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fitvids(parentSelector: NodeListOf[Element]): Unit = js.Dynamic.global.applyDynamic("fitvids")(parentSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fitvids(parentSelector: NodeListOf[Element], options: Options): Unit = (js.Dynamic.global.applyDynamic("fitvids")(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
