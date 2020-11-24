package typings.glob.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glob", "Glob")
@js.native
class Glob_ protected () extends IGlob {
  def this(pattern: String) = this()
  def this(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]) = this()
  def this(pattern: String, options: IOptions) = this()
  def this(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]
  ) = this()
}
@JSImport("glob", "Glob")
@js.native
object Glob_ extends TopLevel[IGlobStatic]
