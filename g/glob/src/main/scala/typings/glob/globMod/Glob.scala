package typings.glob.globMod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.Anon_IsDirectory
import typings.glob.globNumbers.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import typings.minimatch.minimatchMod.IMinimatch
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", "Glob")
@js.native
class Glob protected () extends IGlob {
  def this(pattern: String) = this()
  def this(pattern: String, cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]) = this()
  def this(pattern: String, options: IOptions) = this()
  def this(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ Error | Null, /* matches */ js.Array[String], Unit]
  ) = this()
  /* CompleteClass */
  override var aborted: Boolean = js.native
  /* CompleteClass */
  override var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
  /* CompleteClass */
  override var found: js.Array[String] = js.native
  /* CompleteClass */
  override var minimatch: IMinimatch = js.native
  /* CompleteClass */
  override var options: IOptions = js.native
  /* CompleteClass */
  override var realpathCache: StringDictionary[String] = js.native
  /* CompleteClass */
  override var statCache: StringDictionary[js.UndefOr[`false` | Anon_IsDirectory]] = js.native
  /* CompleteClass */
  override var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
}

