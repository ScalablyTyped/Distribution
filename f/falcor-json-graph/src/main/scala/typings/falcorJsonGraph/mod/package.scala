package typings.falcorJsonGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * JavaScript Object Notation Graph (JSONGraph) is a notation for expressing graphs in JSON. For more information, see the [JSONGraph Guide]{@link http://netflix.github.io/falcor/documentation/jsongraph.html}.
    **/
  type JSONGraph = js.Any
  /**
    * A part of a {@link Path} that can be any JSON value type. All types are coerced to string, except null. This makes the number 1 and the string "1" equivalent.
    **/
  type Key = java.lang.String | scala.Double | scala.Boolean
  /**
    * A part of a {@link PathSet} that can be either a {@link Key}, {@link Range}, or Array of either.
    **/
  type KeySet = typings.falcorJsonGraph.mod.Key | typings.falcorJsonGraph.mod.Range | (js.Array[typings.falcorJsonGraph.mod.Key | typings.falcorJsonGraph.mod.Range])
  /**
    * An ordered list of {@link Key}s that point to a value in a {@link JSONGraph}.
    **/
  type Path = js.Array[typings.falcorJsonGraph.mod.Key]
  /**
    * An ordered list of {@link KeySet}s that point to location(s) in the {@link JSONGraph}. It enables pointing to multiple locations in a more terse format than a set of {@link Path}s and is generally more efficient to evaluate.
    **/
  type PathSet = js.Array[typings.falcorJsonGraph.mod.KeySet]
}
