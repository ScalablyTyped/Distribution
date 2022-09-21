package typings.exorcist

import typings.exorcist.exorcistStrings.`missing-map`
import typings.node.streamMod.Writable
import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Externalizes the source map of the file streamed in.
    *
    * The source map is written as JSON to `input`, and the original file is streamed out with its
    * `sourceMappingURL` set to the path of `input` (or to the value of `url`).
    *
    * @param input file path or writable stream where the source map will be written
    * @param url full URL to the map file, set as `sourceMappingURL` in the streaming output (default: `input`)
    * @param root root URL for loading relative source paths, set as `sourceRoot` in the source map (default: "")
    * @param base base path for calculating relative source paths (default: use absolute paths)
    * @param errorOnMissing when truthy, causes `"error"` to be emitted instead of `"missing-map"` if no map was found in the stream (default: falsy)
    * @returns transform stream into which to pipe the code containing the source map
    *
    * @example
    * import browserify = require("browserify");
    * import * as path from "path";
    * import * as fs from "fs";
    * import exorcist = require("exorcist");
    *
    * const mapfile = path.join(__dirname, "bundle.js.map");
    *
    * // from a file, to a file, and send source map to its own file
    * browserify({ debug: true })
    *     .require(require.resolve("./main"), { entry: true })
    *     .bundle()
    *     .pipe(exorcist(mapfile))
    *     .pipe(fs.createWriteStream(path.join(__dirname, "bundle.js"), "utf8"));
    *
    * // from a stream, to a stream, and send source map to a stream
    * browserify([readableSourceStream], browserifyOptions)
    *     .bundle()
    *     .pipe(exorcist(targetSourceMapStream, "/url/path/to/replace/source/comment/with/bundle.js"))
    *     .pipe(writableTargetStream);
    */
  inline def apply(
    input: String,
    url: js.UndefOr[String | Null],
    root: js.UndefOr[String | Null],
    base: js.UndefOr[String | Null],
    errorOnMissing: js.UndefOr[Boolean | Null]
  ): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: String): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: String, base: String): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: String, base: String, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: String, base: Null, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: String, base: Unit, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: Null, base: String): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: Null, base: String, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: Null, base: Null, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: Null, base: Unit, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: Unit, base: String): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: Unit, base: String, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: Unit, base: Null, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(input: Writable, url: String, root: Unit, base: Unit, errorOnMissing: Boolean): Stream = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], url.asInstanceOf[js.Any], root.asInstanceOf[js.Any], base.asInstanceOf[js.Any], errorOnMissing.asInstanceOf[js.Any])).asInstanceOf[Stream]
  
  @JSImport("exorcist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Stream extends ThroughStream {
    
    /**
      * `missing-map` emitted if no map was found in the stream and `errorOnMissing` is falsy
      * (the src is still piped through in this case, but no map file is written).
      */
    @JSName("addListener")
    def addListener_missingmap(event: `missing-map`, listener: js.Function1[/* missingMapMessage */ String, Unit]): Stream = js.native
    
    @JSName("emit")
    def emit_missingmap(event: `missing-map`, missingMapMessage: String): Boolean = js.native
    
    @JSName("listeners")
    def listeners_missingmap(event: `missing-map`): js.Array[js.Function1[/* missingMapMessage */ String, Unit]] = js.native
    
    @JSName("off")
    def off_missingmap(event: `missing-map`, listener: js.Function1[/* missingMapMessage */ String, Unit]): Stream = js.native
    
    /**
      * `missing-map` emitted if no map was found in the stream and `errorOnMissing` is falsy
      * (the src is still piped through in this case, but no map file is written).
      */
    @JSName("on")
    def on_missingmap(event: `missing-map`, listener: js.Function1[/* missingMapMessage */ String, Unit]): Stream = js.native
    
    /**
      * `missing-map` emitted if no map was found in the stream and `errorOnMissing` is falsy
      * (the src is still piped through in this case, but no map file is written).
      */
    @JSName("once")
    def once_missingmap(event: `missing-map`, listener: js.Function1[/* missingMapMessage */ String, Unit]): Stream = js.native
    
    @JSName("prependListener")
    def prependListener_missingmap(event: `missing-map`, listener: js.Function1[/* missingMapMessage */ String, Unit]): Stream = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_missingmap(event: `missing-map`, listener: js.Function1[/* missingMapMessage */ String, Unit]): Stream = js.native
    
    @JSName("rawListeners")
    def rawListeners_missingmap(event: `missing-map`): js.Array[js.Function1[/* missingMapMessage */ String, Unit]] = js.native
    
    @JSName("removeListener")
    def removeListener_missingmap(event: `missing-map`, listener: js.Function1[/* missingMapMessage */ String, Unit]): Stream = js.native
  }
}
