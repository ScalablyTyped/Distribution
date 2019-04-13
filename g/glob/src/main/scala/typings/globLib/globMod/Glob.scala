package typings
package globLib.globMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", "Glob")
@js.native
class Glob protected () extends IGlob {
  def this(pattern: java.lang.String) = this()
  def this(pattern: java.lang.String, cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* matches */ js.Array[java.lang.String], 
      scala.Unit
    ]) = this()
  def this(pattern: java.lang.String, options: IOptions) = this()
  def this(pattern: java.lang.String, options: IOptions, cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* matches */ js.Array[java.lang.String], 
      scala.Unit
    ]) = this()
  /* CompleteClass */
  override var aborted: scala.Boolean = js.native
  /* CompleteClass */
  override var cache: org.scalablytyped.runtime.StringDictionary[
    scala.Boolean | globLib.globLibStrings.DIR | globLib.globLibStrings.FILE | js.Array[java.lang.String]
  ] = js.native
  /* CompleteClass */
  override var found: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override var minimatch: minimatchLib.minimatchMod.IMinimatch = js.native
  /* CompleteClass */
  override var options: IOptions = js.native
  /* CompleteClass */
  override var realpathCache: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /* CompleteClass */
  override var statCache: org.scalablytyped.runtime.StringDictionary[js.UndefOr[globLib.globLibNumbers.`false` | globLib.Anon_IsDirectory]] = js.native
  /* CompleteClass */
  override var symlinks: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean]] = js.native
}

