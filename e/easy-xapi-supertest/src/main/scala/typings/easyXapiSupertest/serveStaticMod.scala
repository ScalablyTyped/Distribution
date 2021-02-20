package typings.easyXapiSupertest

import typings.easyXapiSupertest.anon.Dotfiles
import typings.easyXapiSupertest.expressMod.Handler
import typings.easyXapiSupertest.mimeMod.Charsets_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serveStaticMod {
  
  /**
    * Create a new middleware function to serve files from within a given root directory. 
    * The file to serve will be determined by combining req.url with the provided root directory. 
    * When a file is not found, instead of sending a 404 response, this module will instead call next() to move on to the next middleware, allowing for stacking and fall-backs.
    */
  @JSImport("serve-static", JSImport.Namespace)
  @js.native
  def apply(root: String): Handler = js.native
  @JSImport("serve-static", JSImport.Namespace)
  @js.native
  def apply(root: String, options: Dotfiles): Handler = js.native
  
  object mime {
    
    @JSImport("serve-static", "mime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("serve-static", "mime.charsets")
    @js.native
    def charsets: Charsets_ = js.native
    @scala.inline
    def charsets_=(x: Charsets_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charsets")(x.asInstanceOf[js.Any])
    
    @JSImport("serve-static", "mime.define")
    @js.native
    def define(mimes: js.Object): Unit = js.native
    
    @JSImport("serve-static", "mime.extension")
    @js.native
    def extension(mime: String): String = js.native
    
    @JSImport("serve-static", "mime.load")
    @js.native
    def load(filepath: String): Unit = js.native
    
    @JSImport("serve-static", "mime.lookup")
    @js.native
    def lookup(path: String): String = js.native
  }
}
