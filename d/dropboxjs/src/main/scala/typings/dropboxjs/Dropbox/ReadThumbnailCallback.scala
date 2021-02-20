package typings.dropboxjs.Dropbox

import typings.dropboxjs.Dropbox.File.Stat
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadThumbnailCallback extends StObject {
  
  def apply(err: ApiError, imageData: String, stat: Stat): Unit = js.native
  def apply(err: ApiError, imageData: Blob, stat: Stat): Unit = js.native
}
