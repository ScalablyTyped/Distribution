package typings.fridaDashGum.Java

import typings.fridaDashGum.fridaDashGumStrings.consult
import typings.fridaDashGum.fridaDashGumStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseOptions extends js.Object {
  /**
    * Whether to consult the class wrapper cache – which is the default
    * behavior – or skip it and create a brand new class wrapper.
    *
    * Skipping the cache is useful when dealing with multiple class-loaders
    * and colliding class names.
    */
  var cache: js.UndefOr[consult | skip] = js.undefined
}

object UseOptions {
  @scala.inline
  def apply(cache: consult | skip = null): UseOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseOptions]
  }
}

