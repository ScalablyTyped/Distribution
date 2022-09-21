package typings.faviconsWebpackPlugin

import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.light
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.webapp
import typings.faviconsWebpackPlugin.optionsMod.FaviconWebpackPlugionInternalOptions
import typings.faviconsWebpackPlugin.optionsMod.FaviconWebpackPlugionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("favicons-webpack-plugin/src", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FaviconsWebpackPlugin {
    /**
      * @param {import('./options').FaviconWebpackPlugionOptions | string} args
      */
    def this(args: String) = this()
    def this(args: FaviconWebpackPlugionOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Any): Unit = js.native
    
    /**
      * The light mode will only add a favicon
      * this is very fast but also very limited
      * it is the default mode for development
      */
    /* CompleteClass */
    override def generateFaviconsLight(compiler: Any, compilation: Any): js.Promise[Any] = js.native
    
    /**
      *  The webapp mode will add a variety of icons
      * this is not as fast as the light mode but
      * supports all common browsers and devices
      */
    /* CompleteClass */
    override def generateFaviconsWebapp(compiler: Any, compilation: Any): js.Promise[Any] = js.native
    
    /**
      * Returns wether the plugin should generate a light version or a full webapp
      */
    /* CompleteClass */
    override def getCurrentCompilationMode(compiler: Any): light | webapp = js.native
    
    /** @type {import('./options').FaviconWebpackPlugionInternalOptions} */
    /* CompleteClass */
    var options: FaviconWebpackPlugionInternalOptions = js.native
  }
  
  trait FaviconsWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Any): Unit
    
    /**
      * The light mode will only add a favicon
      * this is very fast but also very limited
      * it is the default mode for development
      */
    def generateFaviconsLight(compiler: Any, compilation: Any): js.Promise[Any]
    
    /**
      *  The webapp mode will add a variety of icons
      * this is not as fast as the light mode but
      * supports all common browsers and devices
      */
    def generateFaviconsWebapp(compiler: Any, compilation: Any): js.Promise[Any]
    
    /**
      * Returns wether the plugin should generate a light version or a full webapp
      */
    def getCurrentCompilationMode(compiler: Any): light | webapp
    
    /** @type {import('./options').FaviconWebpackPlugionInternalOptions} */
    var options: FaviconWebpackPlugionInternalOptions
  }
  object FaviconsWebpackPlugin {
    
    inline def apply(
      apply: Any => Unit,
      generateFaviconsLight: (Any, Any) => js.Promise[Any],
      generateFaviconsWebapp: (Any, Any) => js.Promise[Any],
      getCurrentCompilationMode: Any => light | webapp,
      options: FaviconWebpackPlugionInternalOptions
    ): FaviconsWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), generateFaviconsLight = js.Any.fromFunction2(generateFaviconsLight), generateFaviconsWebapp = js.Any.fromFunction2(generateFaviconsWebapp), getCurrentCompilationMode = js.Any.fromFunction1(getCurrentCompilationMode), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconsWebpackPlugin]
    }
    
    extension [Self <: FaviconsWebpackPlugin](x: Self) {
      
      inline def setApply(value: Any => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setGenerateFaviconsLight(value: (Any, Any) => js.Promise[Any]): Self = StObject.set(x, "generateFaviconsLight", js.Any.fromFunction2(value))
      
      inline def setGenerateFaviconsWebapp(value: (Any, Any) => js.Promise[Any]): Self = StObject.set(x, "generateFaviconsWebapp", js.Any.fromFunction2(value))
      
      inline def setGetCurrentCompilationMode(value: Any => light | webapp): Self = StObject.set(x, "getCurrentCompilationMode", js.Any.fromFunction1(value))
      
      inline def setOptions(value: FaviconWebpackPlugionInternalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
