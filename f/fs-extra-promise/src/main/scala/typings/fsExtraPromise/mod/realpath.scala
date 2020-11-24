package typings.fsExtraPromise.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "realpath")
@js.native
object realpath extends js.Object {
  
  def apply(path: PathLike): js.Promise[String] = js.native
  def apply(path: PathLike, cache: StringDictionary[String]): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
}
