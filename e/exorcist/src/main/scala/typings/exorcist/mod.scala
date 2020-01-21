package typings.exorcist

import typings.through.mod.ThroughStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exorcist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /** Externalizes the source map found inside a stream to an external .map file.
    * Works with both JavaScript and CSS input streams
    * @param file full path to the map file to which to write the extracted source map
    * @param [url] full URL to the map file, set as sourceMappingURL in the streaming output (default: file)
    * @param [root] root URL for loading relative source paths, set as sourceRoot in the source map (default: "")
    * @param [base] base path for calculating relative source paths (default: use absolute paths)
    * @param [errorOnMissing] when truthy, causes 'error' to be emitted instead of 'missing-map' if no map was found in the stream (default: falsey)
    */
  def apply(file: String): ThroughStream = js.native
  def apply(file: String, url: String): ThroughStream = js.native
  def apply(file: String, url: String, root: String): ThroughStream = js.native
  def apply(file: String, url: String, root: String, base: String): ThroughStream = js.native
  def apply(file: String, url: String, root: String, base: String, errorOnMissing: Boolean): ThroughStream = js.native
}

