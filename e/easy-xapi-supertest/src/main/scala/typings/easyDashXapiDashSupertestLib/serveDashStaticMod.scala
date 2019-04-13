package typings
package easyDashXapiDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-static", JSImport.Namespace)
@js.native
object serveDashStaticMod extends js.Object {
  /**
    * Create a new middleware function to serve files from within a given root directory. 
    * The file to serve will be determined by combining req.url with the provided root directory. 
    * When a file is not found, instead of sending a 404 response, this module will instead call next() to move on to the next middleware, allowing for stacking and fall-backs.
    */
  def apply(root: java.lang.String): easyDashXapiDashSupertestLib.expressMod.Handler = js.native
  def apply(root: java.lang.String, options: easyDashXapiDashSupertestLib.Anon_Dotfiles): easyDashXapiDashSupertestLib.expressMod.Handler = js.native
  @js.native
  object mime extends js.Object {
    var charsets: easyDashXapiDashSupertestLib.mimeMod.Charsets = js.native
    def define(mimes: js.Object): scala.Unit = js.native
    def extension(mime: java.lang.String): java.lang.String = js.native
    def load(filepath: java.lang.String): scala.Unit = js.native
    def lookup(path: java.lang.String): java.lang.String = js.native
  }
  
}

