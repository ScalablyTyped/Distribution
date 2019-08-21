package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMessageProperties extends js.Object {
  var sourceOrigin: String
}

object OnMessageProperties {
  @scala.inline
  def apply(sourceOrigin: String): OnMessageProperties = {
    val __obj = js.Dynamic.literal(sourceOrigin = sourceOrigin)
  
    __obj.asInstanceOf[OnMessageProperties]
  }
}

