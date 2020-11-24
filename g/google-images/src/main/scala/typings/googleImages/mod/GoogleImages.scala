package typings.googleImages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleImages extends js.Object {
  
  def search(searchTerm: String): js.Promise[js.Array[Image]] = js.native
  def search(searchTerm: String, options: SearchOptions): js.Promise[js.Array[Image]] = js.native
}
