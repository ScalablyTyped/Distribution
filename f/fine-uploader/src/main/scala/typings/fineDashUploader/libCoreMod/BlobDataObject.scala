package typings.fineDashUploader.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobDataObject extends js.Object {
  /**
    * the name of the file
    */
  var name: String
  /**
    * the size of the file
    */
  var size: Double
}

object BlobDataObject {
  @scala.inline
  def apply(name: String, size: Double): BlobDataObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlobDataObject]
  }
}

