package typings
package enquireDotJsLib.enquireDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnquireJs extends js.Object {
  def register(mediaQuery: java.lang.String, options: Callback): EnquireJs = js.native
  def register(mediaQuery: java.lang.String, options: Callback, shouldDegrade: scala.Boolean): EnquireJs = js.native
  def register(mediaQuery: java.lang.String, options: Options): EnquireJs = js.native
  def register(mediaQuery: java.lang.String, options: Options, shouldDegrade: scala.Boolean): EnquireJs = js.native
  def register(mediaQuery: java.lang.String, options: js.Array[Options]): EnquireJs = js.native
  def register(mediaQuery: java.lang.String, options: js.Array[Options], shouldDegrade: scala.Boolean): EnquireJs = js.native
  def unregister(mediaQuery: java.lang.String): scala.Unit = js.native
  def unregister(mediaQuery: java.lang.String, handler: Callback): scala.Unit = js.native
  def unregister(mediaQuery: java.lang.String, handler: Options): scala.Unit = js.native
}

