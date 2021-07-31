package typings.exorcist

import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Externalizes the source map found inside a stream to an external .map file.
    * Works with both JavaScript and CSS input streams
    * @param file full path to the map file to which to write the extracted source map
    * @param [url] full URL to the map file, set as sourceMappingURL in the streaming output (default: file)
    * @param [root] root URL for loading relative source paths, set as sourceRoot in the source map (default: "")
    * @param [base] base path for calculating relative source paths (default: use absolute paths)
    * @param [errorOnMissing] when truthy, causes 'error' to be emitted instead of 'missing-map' if no map was found in the stream (default: falsey)
    */
  @scala.inline
  def apply(file: String): ThroughStream = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: String): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: String, root: String): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: String, root: String, base: String): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: String, root: String, base: String, errorOnMissing: Boolean): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: String, root: String, base: Unit, errorOnMissing: Boolean): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: String, root: Unit, base: String): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: String, root: Unit, base: String, errorOnMissing: Boolean): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: String, root: Unit, base: Unit, errorOnMissing: Boolean): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: Unit, root: String): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: Unit, root: String, base: String): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: Unit, root: String, base: String, errorOnMissing: Boolean): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: Unit, root: String, base: Unit, errorOnMissing: Boolean): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: Unit, root: Unit, base: String): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: Unit, root: Unit, base: String, errorOnMissing: Boolean): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  @scala.inline
  def apply(file: String, url: Unit, root: Unit, base: Unit, errorOnMissing: Boolean): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  
  @JSImport("exorcist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
