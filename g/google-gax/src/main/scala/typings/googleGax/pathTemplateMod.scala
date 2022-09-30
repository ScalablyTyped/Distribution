package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathTemplateMod {
  
  @JSImport("google-gax/build/src/pathTemplate", "PathTemplate")
  @js.native
  open class PathTemplate protected () extends StObject {
    /**
      * @param {String} data the of the template
      *
      * @constructor
      */
    def this(data: String) = this()
    
    /* private */ var bindings: Any = js.native
    
    /* private */ var data: Any = js.native
    
    /**
      * Renders the path template.
      *
      * @return {string} contains const names matched to binding values
      */
    def inspect(): String = js.native
    
    /**
      * Matches a fully-qualified path template string.
      *
      * @param {String} path a fully-qualified path template string
      * @return {Object} contains const names matched to binding values
      * @throws {TypeError} if path can't be matched to this template
      */
    def `match`(path: String): Bindings = js.native
    
    /**
      * Parse the path template.
      *
      * @return {string[]} return segments of the input path.
      * For example: 'buckets/{hello}'' will give back ['buckets', {hello=*}]
      */
    /* private */ var parsePathTemplate: Any = js.native
    
    /**
      * Renders a path template using the provided bindings.
      *
      * @param {Object} bindings a mapping of const names to binding strings
      * @return {String} a rendered representation of the path template
      * @throws {TypeError} if a key is missing, or if a sub-template cannot be
      *   parsed
      */
    def render(bindings: Bindings): String = js.native
    
    var segments: js.Array[String] = js.native
    
    var size: Double = js.native
  }
  
  type Bindings = StringDictionary[String | Double]
}
