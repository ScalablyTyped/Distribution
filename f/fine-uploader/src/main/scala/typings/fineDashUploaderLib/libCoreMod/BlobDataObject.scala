package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobDataObject extends js.Object {
  /**
    * the name of the file
    */
  var name: java.lang.String
  /**
    * the size of the file
    */
  var size: scala.Double
}

object BlobDataObject {
  @scala.inline
  def apply(name: java.lang.String, size: scala.Double): BlobDataObject = {
    val __obj = js.Dynamic.literal(name = name, size = size)
  
    __obj.asInstanceOf[BlobDataObject]
  }
}

