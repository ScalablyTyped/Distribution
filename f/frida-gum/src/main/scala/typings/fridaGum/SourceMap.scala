package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper used internally for source map parsing in order to provide helpful
  * JavaScript stack-traces.
  */
@js.native
trait SourceMap extends StObject {
  
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
  implicit class SourceMapMutableBuilder[Self <: SourceMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolve(value: GeneratedSourcePosition => OriginalSourcePosition | Null): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
