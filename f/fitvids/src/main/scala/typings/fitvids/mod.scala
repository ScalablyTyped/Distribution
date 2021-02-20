package typings.fitvids

import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(options: Options): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(parentSelector: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(parentSelector: String): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(parentSelector: String, options: Options): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(parentSelector: Null, options: Options): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(parentSelector: Element): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(parentSelector: Element, options: Options): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(parentSelector: NodeListOf[Element]): Unit = js.native
  @JSImport("fitvids", JSImport.Namespace)
  @js.native
  def apply(parentSelector: NodeListOf[Element], options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * If you'd like to ignore certain videos, you can pass a selector via the ignore option.
      * @default ""
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * By default, fitvids automatically wraps Youtube, Vimeo, and Kickstarter players,
      * but if you'd like it to wrap others too, you can pass them in as selectors via the players property.
      * @default ""
      */
    var players: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setPlayers(value: String | js.Array[String]): Self = StObject.set(x, "players", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayersUndefined: Self = StObject.set(x, "players", js.undefined)
      
      @scala.inline
      def setPlayersVarargs(value: String*): Self = StObject.set(x, "players", js.Array(value :_*))
    }
  }
}
