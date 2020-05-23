package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper used internally for source map parsing in order to provide helpful
  * JavaScript stack-traces.
  */
trait SourceMap extends js.Object {
  /**
    * Attempts to map a generated source position back to the original.
    *
    * @param generatedPosition Position in generated code.
    */
  def resolve(generatedPosition: GeneratedSourcePosition): OriginalSourcePosition | Null
}

object SourceMap {
  @scala.inline
  def apply(resolve: GeneratedSourcePosition => OriginalSourcePosition | Null): SourceMap = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[SourceMap]
  }
}

