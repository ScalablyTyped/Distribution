package typings.feedme.feedmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrs extends js.Object {
  var local: String
  var name: String
  var prefix: String
  var uri: String
  var value: js.Any
}

object Attrs {
  @scala.inline
  def apply(local: String, name: String, prefix: String, uri: String, value: js.Any): Attrs = {
    val __obj = js.Dynamic.literal(local = local, name = name, prefix = prefix, uri = uri, value = value)
  
    __obj.asInstanceOf[Attrs]
  }
}

