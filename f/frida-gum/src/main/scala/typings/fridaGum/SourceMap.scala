package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper used internally for source map parsing in order to provide helpful
  * JavaScript stack-traces.
  */
@js.native
trait SourceMap extends js.Object {
  /**
    * Attempts to map a generated source position back to the original.
    *
    * @param generatedPosition Position in generated code.
    */
  def resolve(generatedPosition: GeneratedSourcePosition): OriginalSourcePosition | Null = js.native
}

object SourceMap {
  @scala.inline
  def apply(resolve: GeneratedSourcePosition => OriginalSourcePosition | Null): SourceMap = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[SourceMap]
  }
  @scala.inline
  implicit class SourceMapOps[Self <: SourceMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResolve(value: GeneratedSourcePosition => OriginalSourcePosition | Null): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
  
}

