package typings.glob.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glob", "GlobSync")
@js.native
class GlobSync protected () extends IGlobBase {
  def this(pattern: String) = this()
  def this(pattern: String, options: IOptions) = this()
}
@JSImport("glob", "GlobSync")
@js.native
object GlobSync extends TopLevel[IGlobSyncStatic]
