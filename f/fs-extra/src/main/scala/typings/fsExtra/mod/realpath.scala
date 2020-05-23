package typings.fsExtra.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "realpath")
@js.native
object realpath extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, cache: StringDictionary[String]): js.Promise[String] = js.native
  def apply(
    path: String,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
  def apply(path: Buffer): js.Promise[String] = js.native
  def apply(path: Buffer, cache: StringDictionary[String]): js.Promise[String] = js.native
  def apply(
    path: Buffer,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
}

