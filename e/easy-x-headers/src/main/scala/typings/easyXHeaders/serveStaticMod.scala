package typings.easyXHeaders

import typings.easyXHeaders.anon.Dotfiles
import typings.easyXHeaders.expressMod.Handler
import typings.easyXHeaders.mimeMod.Charsets_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("serve-static", JSImport.Namespace)
@js.native
object serveStaticMod extends js.Object {
  
  /**
    * Create a new middleware function to serve files from within a given root directory. 
    * The file to serve will be determined by combining req.url with the provided root directory. 
    * When a file is not found, instead of sending a 404 response, this module will instead call next() to move on to the next middleware, allowing for stacking and fall-backs.
    */
  def apply(root: String): Handler = js.native
  def apply(root: String, options: Dotfiles): Handler = js.native
  
  @js.native
  object mime extends js.Object {
    
    var charsets: Charsets_ = js.native
    
    def define(mimes: js.Object): Unit = js.native
    
    def extension(mime: String): String = js.native
    
    def load(filepath: String): Unit = js.native
    
    def lookup(path: String): String = js.native
  }
}
