package typings
package googleDashImagesLib.googleDashImagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleImages extends js.Object {
  def search(searchTerm: java.lang.String): js.Promise[js.Array[Image]] = js.native
  def search(searchTerm: java.lang.String, options: SearchOptions): js.Promise[js.Array[Image]] = js.native
}

