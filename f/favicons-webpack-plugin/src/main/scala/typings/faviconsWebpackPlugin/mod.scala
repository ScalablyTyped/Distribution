package typings.faviconsWebpackPlugin

import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.light
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.webapp
import typings.faviconsWebpackPlugin.optionsMod.FaviconWebpackPlugionInternalOptions
import typings.faviconsWebpackPlugin.optionsMod.FaviconWebpackPlugionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("favicons-webpack-plugin/src", JSImport.Namespace)
  @js.native
  class ^ protected () extends FaviconsWebpackPlugin {
    /**
      * @param {import('./options').FaviconWebpackPlugionOptions | string} args
      */
    def this(args: String) = this()
    def this(args: FaviconWebpackPlugionOptions) = this()
  }
  
  @js.native
  trait FaviconsWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: js.Any): Unit = js.native
    
    /**
      * The light mode will only add a favicon
      * this is very fast but also very limited
      * it is the default mode for development
      */
    def generateFaviconsLight(compiler: js.Any, compilation: js.Any): js.Promise[_] = js.native
    
    /**
      *  The webapp mode will add a variety of icons
      * this is not as fast as the light mode but
      * supports all common browsers and devices
      */
    def generateFaviconsWebapp(compiler: js.Any, compilation: js.Any): js.Promise[_] = js.native
    
    /**
      * Returns wether the plugin should generate a light version or a full webapp
      */
    def getCurrentCompilationMode(compiler: js.Any): light | webapp = js.native
    
    /** @type {import('./options').FaviconWebpackPlugionInternalOptions} */
    var options: FaviconWebpackPlugionInternalOptions = js.native
  }
  object FaviconsWebpackPlugin {
    
    @scala.inline
    def apply(
      apply: js.Any => Unit,
      generateFaviconsLight: (js.Any, js.Any) => js.Promise[_],
      generateFaviconsWebapp: (js.Any, js.Any) => js.Promise[_],
      getCurrentCompilationMode: js.Any => light | webapp,
      options: FaviconWebpackPlugionInternalOptions
    ): FaviconsWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), generateFaviconsLight = js.Any.fromFunction2(generateFaviconsLight), generateFaviconsWebapp = js.Any.fromFunction2(generateFaviconsWebapp), getCurrentCompilationMode = js.Any.fromFunction1(getCurrentCompilationMode), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconsWebpackPlugin]
    }
    
    @scala.inline
    implicit class FaviconsWebpackPluginMutableBuilder[Self <: FaviconsWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: js.Any => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateFaviconsLight(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "generateFaviconsLight", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateFaviconsWebapp(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "generateFaviconsWebapp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetCurrentCompilationMode(value: js.Any => light | webapp): Self = StObject.set(x, "getCurrentCompilationMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: FaviconWebpackPlugionInternalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
