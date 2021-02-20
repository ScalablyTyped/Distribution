package typings.falcorJsonGraph

import typings.falcorJsonGraph.falcorJsonGraphStrings.atom
import typings.falcorJsonGraph.falcorJsonGraphStrings.error
import typings.falcorJsonGraph.falcorJsonGraphStrings.reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("falcor-json-graph", "atom")
  @js.native
  def atom(value: js.Any): Atom_ = js.native
  @JSImport("falcor-json-graph", "atom")
  @js.native
  def atom(value: js.Any, props: Sentinel): Atom_ = js.native
  
  @JSImport("falcor-json-graph", "error")
  @js.native
  def error(errorValue: js.Any): Error_ = js.native
  @JSImport("falcor-json-graph", "error")
  @js.native
  def error(errorValue: js.Any, props: Sentinel): Error_ = js.native
  
  @JSImport("falcor-json-graph", "pathInvalidation")
  @js.native
  def pathInvalidation(path: String): InvalidPath = js.native
  @JSImport("falcor-json-graph", "pathInvalidation")
  @js.native
  def pathInvalidation(path: PathSet): InvalidPath = js.native
  
  @JSImport("falcor-json-graph", "pathValue")
  @js.native
  def pathValue(path: String, value: js.Any): PathValue_ = js.native
  @JSImport("falcor-json-graph", "pathValue")
  @js.native
  def pathValue(path: PathSet, value: js.Any): PathValue_ = js.native
  
  @JSImport("falcor-json-graph", "ref")
  @js.native
  def ref(path: String): Reference = js.native
  @JSImport("falcor-json-graph", "ref")
  @js.native
  def ref(path: String, props: Sentinel): Reference = js.native
  @JSImport("falcor-json-graph", "ref")
  @js.native
  def ref(path: PathSet): Reference = js.native
  @JSImport("falcor-json-graph", "ref")
  @js.native
  def ref(path: PathSet, props: Sentinel): Reference = js.native
  
  // NOTE: The following types are described at https://github.com/Netflix/falcor/tree/master/lib/typedefs .
  /**
    * An atom allows you to treat a JSON value as atomic regardless of its type, ensuring that a JSON object or array is always returned in its entirety. The JSON value must be treated as immutable. Atoms can also be used to associate metadata with a JSON value. This metadata can be used to influence the way values are handled.
    **/
  @js.native
  trait Atom_ extends Sentinel {
    
    @JSName("$type")
    var $type: atom = js.native
    
    var value: js.Any = js.native
  }
  object Atom_ {
    
    @scala.inline
    def apply($type: atom, value: js.Any): Atom_ = {
      val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Atom_]
    }
    
    @scala.inline
    implicit class Atom_MutableBuilder[Self <: Atom_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$type(value: atom): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error_ extends Sentinel {
    
    @JSName("$type")
    var $type: error = js.native
    
    var value: js.Any = js.native
  }
  object Error_ {
    
    @scala.inline
    def apply($type: error, value: js.Any): Error_ = {
      val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error_]
    }
    
    @scala.inline
    implicit class Error_MutableBuilder[Self <: Error_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$type(value: error): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidPath extends StObject {
    
    var invalidate: Boolean = js.native
    
    var path: PathSet = js.native
  }
  object InvalidPath {
    
    @scala.inline
    def apply(invalidate: Boolean, path: PathSet): InvalidPath = {
      val __obj = js.Dynamic.literal(invalidate = invalidate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidPath]
    }
    
    @scala.inline
    implicit class InvalidPathMutableBuilder[Self <: InvalidPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalidate(value: Boolean): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: PathSet): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: KeySet*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  /**
    * An envelope that wraps a JSON object.
    **/
  @js.native
  trait JSONEnvelope[T] extends StObject {
    
    var json: T = js.native
  }
  object JSONEnvelope {
    
    @scala.inline
    def apply[T](json: T): JSONEnvelope[T] = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONEnvelope[T]]
    }
    
    @scala.inline
    implicit class JSONEnvelopeMutableBuilder[Self <: JSONEnvelope[_], T] (val x: Self with JSONEnvelope[T]) extends AnyVal {
      
      @scala.inline
      def setJson(value: T): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * JavaScript Object Notation Graph (JSONGraph) is a notation for expressing graphs in JSON. For more information, see the [JSONGraph Guide]{@link http://netflix.github.io/falcor/documentation/jsongraph.html}.
    **/
  type JSONGraph = js.Any
  
  /**
    * An envelope that wraps a {@link JSONGraph} fragment.
    **/
  @js.native
  trait JSONGraphEnvelope extends StObject {
    
    var invalidate: js.UndefOr[js.Array[PathSet]] = js.native
    
    var jsonGraph: JSONGraph = js.native
    
    var paths: js.UndefOr[js.Array[PathSet]] = js.native
  }
  object JSONGraphEnvelope {
    
    @scala.inline
    def apply(jsonGraph: JSONGraph): JSONGraphEnvelope = {
      val __obj = js.Dynamic.literal(jsonGraph = jsonGraph.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONGraphEnvelope]
    }
    
    @scala.inline
    implicit class JSONGraphEnvelopeMutableBuilder[Self <: JSONGraphEnvelope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalidate(value: js.Array[PathSet]): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      @scala.inline
      def setInvalidateVarargs(value: PathSet*): Self = StObject.set(x, "invalidate", js.Array(value :_*))
      
      @scala.inline
      def setJsonGraph(value: JSONGraph): Self = StObject.set(x, "jsonGraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaths(value: js.Array[PathSet]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: PathSet*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
  
  /**
    * A part of a {@link Path} that can be any JSON value type. All types are coerced to string, except null. This makes the number 1 and the string "1" equivalent.
    **/
  type Key = String | Double | Boolean
  
  /**
    * A part of a {@link PathSet} that can be either a {@link Key}, {@link Range}, or Array of either.
    **/
  type KeySet = Key | Range | (js.Array[Key | Range])
  
  /**
    * An ordered list of {@link Key}s that point to a value in a {@link JSONGraph}.
    **/
  type Path = js.Array[Key]
  
  /**
    * An ordered list of {@link KeySet}s that point to location(s) in the {@link JSONGraph}. It enables pointing to multiple locations in a more terse format than a set of {@link Path}s and is generally more efficient to evaluate.
    **/
  type PathSet = js.Array[KeySet]
  
  /**
    * A wrapper around a path and its value.
    **/
  @js.native
  trait PathValue_ extends StObject {
    
    var path: String | PathSet = js.native
    
    var value: js.Any = js.native
  }
  object PathValue_ {
    
    @scala.inline
    def apply(path: String | PathSet, value: js.Any): PathValue_ = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathValue_]
    }
    
    @scala.inline
    implicit class PathValue_MutableBuilder[Self <: PathValue_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String | PathSet): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: KeySet*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Describe a range of integers. Must contain either a "to" or "length" property.
    **/
  @js.native
  trait Range extends StObject {
    
    var from: js.UndefOr[Double] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var to: js.UndefOr[Double] = js.native
  }
  object Range {
    
    @scala.inline
    def apply(): Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait Reference extends Sentinel {
    
    @JSName("$type")
    var $type: reference = js.native
    
    var value: Path = js.native
  }
  object Reference {
    
    @scala.inline
    def apply($type: reference, value: Path): Reference = {
      val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$type(value: reference): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Path): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Key*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Sentinel extends StObject {
    
    @JSName("$expires")
    var $expires: js.UndefOr[Double] = js.native
  }
  object Sentinel {
    
    @scala.inline
    def apply(): Sentinel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sentinel]
    }
    
    @scala.inline
    implicit class SentinelMutableBuilder[Self <: Sentinel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$expires(value: Double): Self = StObject.set(x, "$expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$expiresUndefined: Self = StObject.set(x, "$expires", js.undefined)
    }
  }
}
