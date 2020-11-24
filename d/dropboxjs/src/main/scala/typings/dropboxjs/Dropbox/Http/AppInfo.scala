package typings.dropboxjs.Dropbox.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInfo extends js.Object {
  
  var canUseDatastores: Boolean = js.native
  
  var canUseFiles: Boolean = js.native
  
  var canUseFullDropbox: Boolean = js.native
  
  var hasAppFolder: Boolean = js.native
  
  def icon(width: Double): Unit = js.native
  def icon(width: Double, height: Double): Unit = js.native
  
  var key: String = js.native
  
  var name: String = js.native
}
