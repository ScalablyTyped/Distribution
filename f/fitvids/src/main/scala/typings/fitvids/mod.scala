package typings.fitvids

import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The module exports a single function.
    * Just call it, and it'll wrap video embeds from Youtube, Vimeo, and Kickstarter in a responsive container.
    * Other video players can be supported by passing a custom selector via the options.
    *
    * To wrap videos that have been added to the page dynamically, just call the function again.
    * Fitvids is smart enough to only wrap the new videos.
    */
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(options: Options): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(parentSelector: String): Unit = ^.asInstanceOf[js.Dynamic].apply(parentSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(parentSelector: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(parentSelector: Null, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(parentSelector: Unit, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(parentSelector: Element): Unit = ^.asInstanceOf[js.Dynamic].apply(parentSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(parentSelector: Element, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(parentSelector: NodeListOf[Element]): Unit = ^.asInstanceOf[js.Dynamic].apply(parentSelector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(parentSelector: NodeListOf[Element], options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(parentSelector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * If you'd like to ignore certain videos, you can pass a selector via the ignore option.
      * @default ""
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * By default, fitvids automatically wraps Youtube, Vimeo, and Kickstarter players,
      * but if you'd like it to wrap others too, you can pass them in as selectors via the players property.
      * @default ""
      */
    var players: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setPlayers(value: String | js.Array[String]): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      inline def setPlayersUndefined: Self = StObject.set(x, "players", js.undefined)
      
      inline def setPlayersVarargs(value: String*): Self = StObject.set(x, "players", js.Array(value*))
    }
  }
}
