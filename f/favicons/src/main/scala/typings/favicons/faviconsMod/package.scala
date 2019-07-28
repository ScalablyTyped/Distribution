package typings.favicons

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faviconsMod {
  type Callback = js.Function2[/* error */ Error | Null, /* response */ FavIconResponse, Unit]
}
