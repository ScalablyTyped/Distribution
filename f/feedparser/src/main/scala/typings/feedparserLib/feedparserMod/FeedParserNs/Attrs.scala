package typings
package feedparserLib.feedparserMod.FeedParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrs extends js.Object {
  var local: java.lang.String
  var name: java.lang.String
  var prefix: java.lang.String
  var uri: java.lang.String
  var value: js.Any
}

object Attrs {
  @scala.inline
  def apply(
    local: java.lang.String,
    name: java.lang.String,
    prefix: java.lang.String,
    uri: java.lang.String,
    value: js.Any
  ): Attrs = {
    val __obj = js.Dynamic.literal(local = local, name = name, prefix = prefix, uri = uri, value = value)
  
    __obj.asInstanceOf[Attrs]
  }
}

