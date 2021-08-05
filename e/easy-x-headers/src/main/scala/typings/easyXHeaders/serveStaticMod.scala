package typings.easyXHeaders

import typings.easyXHeaders.anon.Dotfiles
import typings.easyXHeaders.expressMod.Handler
import typings.easyXHeaders.mimeMod.Charsets_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serveStaticMod {
  
  /**
    * Create a new middleware function to serve files from within a given root directory. 
    * The file to serve will be determined by combining req.url with the provided root directory. 
    * When a file is not found, instead of sending a 404 response, this module will instead call next() to move on to the next middleware, allowing for stacking and fall-backs.
    */
  inline def apply(root: String): Handler = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def apply(root: String, options: Dotfiles): Handler = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  @JSImport("serve-static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object mime {
    
    @JSImport("serve-static", "mime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("serve-static", "mime.charsets")
    @js.native
    def charsets: Charsets_ = js.native
    inline def charsets_=(x: Charsets_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charsets")(x.asInstanceOf[js.Any])
    
    inline def define(mimes: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(mimes.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def `extension`(mime: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extension")(mime.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def load(filepath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filepath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def lookup(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
