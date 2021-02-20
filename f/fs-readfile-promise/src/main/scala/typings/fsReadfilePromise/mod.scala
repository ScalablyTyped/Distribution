package typings.fsReadfilePromise

import typings.fsReadfilePromise.anon.Encoding
import typings.node.Buffer
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    */
  @JSImport("fs-readfile-promise", JSImport.Namespace)
  @js.native
  def apply(path: PathType): js.Promise[Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @JSImport("fs-readfile-promise", JSImport.Namespace)
  @js.native
  def apply(path: PathType, options: OptionsType): js.Promise[String] = js.native
  
  type OptionsType = Encoding | String
  
  type PathType = PathLike | Double
}
