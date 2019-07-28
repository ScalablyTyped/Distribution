package typings.enquireDotJs.enquireDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnquireJs extends js.Object {
  def register(mediaQuery: String, options: js.Array[Options]): EnquireJs = js.native
  def register(mediaQuery: String, options: js.Array[Options], shouldDegrade: Boolean): EnquireJs = js.native
  def register(mediaQuery: String, options: Callback): EnquireJs = js.native
  def register(mediaQuery: String, options: Callback, shouldDegrade: Boolean): EnquireJs = js.native
  def register(mediaQuery: String, options: Options): EnquireJs = js.native
  def register(mediaQuery: String, options: Options, shouldDegrade: Boolean): EnquireJs = js.native
  def unregister(mediaQuery: String): Unit = js.native
  def unregister(mediaQuery: String, handler: Callback): Unit = js.native
  def unregister(mediaQuery: String, handler: Options): Unit = js.native
}

