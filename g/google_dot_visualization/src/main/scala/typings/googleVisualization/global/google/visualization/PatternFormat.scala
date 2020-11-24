package typings.googleVisualization.global.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.visualization.PatternFormat")
@js.native
class PatternFormat protected ()
  extends typings.googleVisualization.google.visualization.PatternFormat {
  /**
    * Constructor.
    * Does not take an options object. Instead, it takes a string pattern parameter.
    * This is a string that describes which column values to put into the destination column, along with any arbitrary text. Embed placeholders in your string to indicate a value from another column to embed. The placeholders are {#}, where # is a the index of a source column to use. The index is an index in the srcColumnIndices array from the format() method below. To include a literal { or } character, escape it like this: \{ or \}. To include a literal \ mark, escape it as \\.
    */
  def this(pattern: String) = this()
}
