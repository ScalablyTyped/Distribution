package typings.fabric.fabricImplMod

import typings.fabric.anon.Method
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilDomRequest extends js.Object {
  
  /**
    * Cross-browser abstraction for sending XMLHttpRequest
    * @param url URL to send XMLHttpRequest to
    */
  def request(url: String): XMLHttpRequest = js.native
  def request(url: String, options: Method): XMLHttpRequest = js.native
}
