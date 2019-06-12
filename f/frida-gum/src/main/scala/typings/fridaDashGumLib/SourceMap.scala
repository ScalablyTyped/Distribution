package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper used internally for source map parsing in order to provide helpful
  * JavaScript stack-traces.
  */
@JSGlobal("SourceMap")
@js.native
class SourceMap protected () extends js.Object {
  /**
    * Constructs a source map from JSON.
    *
    * @param json String containing the source map encoded as JSON.
    */
  def this(json: java.lang.String) = this()
  /**
    * Attempts to map a generated source position back to the original.
    *
    * @param generatedPosition Position in generated code.
    */
  def resolve(generatedPosition: GeneratedSourcePosition): OriginalSourcePosition | scala.Null = js.native
}

