package typings
package globLib.globMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Glob: IGlobStatic = js.native
  var GlobSync: IGlobSyncStatic = js.native
  def apply(
    pattern: java.lang.String,
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* matches */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    pattern: java.lang.String,
    options: IOptions,
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* matches */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def __promisify__(pattern: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def __promisify__(pattern: java.lang.String, options: IOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def hasMagic(pattern: java.lang.String): scala.Boolean = js.native
  def hasMagic(pattern: java.lang.String, options: IOptions): scala.Boolean = js.native
  def sync(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(pattern: java.lang.String, options: IOptions): js.Array[java.lang.String] = js.native
}

