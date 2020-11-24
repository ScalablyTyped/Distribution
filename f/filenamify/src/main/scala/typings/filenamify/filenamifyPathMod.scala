package typings.filenamify

import typings.filenamify.filenamifyMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("filenamify/filenamify-path", JSImport.Namespace)
@js.native
object filenamifyPathMod extends js.Object {
  
  /**
  Convert the filename in a path a valid filename and return the augmented path.
  */
  def apply(path: String): String = js.native
  def apply(path: String, options: Options): String = js.native
}
