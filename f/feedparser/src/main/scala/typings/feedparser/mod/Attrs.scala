package typings.feedparser.mod

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
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Attrs]
  }
}

