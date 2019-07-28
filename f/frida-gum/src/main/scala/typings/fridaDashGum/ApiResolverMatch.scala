package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiResolverMatch extends js.Object {
  /**
    * Memory address that the given function is loaded at.
    */
  var address: NativePointer
  /**
    * Canonical name of the function that was found.
    */
  var name: String
}

object ApiResolverMatch {
  @scala.inline
  def apply(address: NativePointer, name: String): ApiResolverMatch = {
    val __obj = js.Dynamic.literal(address = address, name = name)
  
    __obj.asInstanceOf[ApiResolverMatch]
  }
}

