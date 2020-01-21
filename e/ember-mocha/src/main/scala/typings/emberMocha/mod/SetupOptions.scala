package typings.emberMocha.mod

import typings.ember.mod.default.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupOptions extends js.Object {
  var resolver: Resolver
}

object SetupOptions {
  @scala.inline
  def apply(resolver: Resolver): SetupOptions = {
    val __obj = js.Dynamic.literal(resolver = resolver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetupOptions]
  }
}

