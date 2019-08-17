package typings.getpass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getpassMod {
  import typings.std.Error

  type Callback = js.Function2[/* error */ Error | Null, /* password */ String, Unit]
}
