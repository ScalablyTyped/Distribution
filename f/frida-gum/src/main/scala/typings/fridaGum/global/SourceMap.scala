package typings.fridaGum.global

import typings.fridaGum.GeneratedSourcePosition
import typings.fridaGum.OriginalSourcePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper used internally for source map parsing in order to provide helpful
  * JavaScript stack-traces.
  */
@JSGlobal("SourceMap")
@js.native
class SourceMap protected ()
  extends StObject
     with typings.fridaGum.SourceMap {
  /**
    * Constructs a source map from JSON.
    *
    * @param json String containing the source map encoded as JSON.
    */
  def this(json: String) = this()
  
  /**
    * Attempts to map a generated source position back to the original.
    *
    * @param generatedPosition Position in generated code.
    */
  /* CompleteClass */
  override def resolve(generatedPosition: GeneratedSourcePosition): OriginalSourcePosition | Null = js.native
}
