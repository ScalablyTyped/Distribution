package typings.falcorJsonGraph

import typings.falcorJsonGraph.falcorJsonGraphStrings.atom
import typings.falcorJsonGraph.falcorJsonGraphStrings.error
import typings.falcorJsonGraph.falcorJsonGraphStrings.reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("falcor-json-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atom(value: Any): Atom_ = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(value.asInstanceOf[js.Any]).asInstanceOf[Atom_]
  inline def atom(value: Any, props: Sentinel): Atom_ = (^.asInstanceOf[js.Dynamic].applyDynamic("atom")(value.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Atom_]
  
  inline def error(errorValue: Any): Error_ = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(errorValue.asInstanceOf[js.Any]).asInstanceOf[Error_]
  inline def error(errorValue: Any, props: Sentinel): Error_ = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(errorValue.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Error_]
  
  inline def pathInvalidation(path: String): InvalidPath = ^.asInstanceOf[js.Dynamic].applyDynamic("pathInvalidation")(path.asInstanceOf[js.Any]).asInstanceOf[InvalidPath]
  inline def pathInvalidation(path: PathSet): InvalidPath = ^.asInstanceOf[js.Dynamic].applyDynamic("pathInvalidation")(path.asInstanceOf[js.Any]).asInstanceOf[InvalidPath]
  
  inline def pathValue(path: String, value: Any): PathValue_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pathValue")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[PathValue_]
  inline def pathValue(path: PathSet, value: Any): PathValue_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pathValue")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[PathValue_]
  
  inline def ref(path: String): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any]).asInstanceOf[Reference]
  inline def ref(path: String, props: Sentinel): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Reference]
  inline def ref(path: PathSet): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any]).asInstanceOf[Reference]
  inline def ref(path: PathSet, props: Sentinel): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Reference]
  
  // NOTE: The following types are described at https://github.com/Netflix/falcor/tree/master/lib/typedefs .
  /**
    * An atom allows you to treat a JSON value as atomic regardless of its type, ensuring that a JSON object or array is always returned in its entirety. The JSON value must be treated as immutable. Atoms can also be used to associate metadata with a JSON value. This metadata can be used to influence the way values are handled.
    **/
  trait Atom_
    extends StObject
       with Sentinel {
    
    @JSName("$type")
    var $type: atom
    
    var value: Any
  }
  object Atom_ {
    
    inline def apply(value: Any): Atom_ = {
      val __obj = js.Dynamic.literal($type = "atom", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Atom_]
    }
    
    extension [Self <: Atom_](x: Self) {
      
      inline def set$type(value: atom): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error_
    extends StObject
       with Sentinel {
    
    @JSName("$type")
    var $type: error
    
    var value: Any
  }
  object Error_ {
    
    inline def apply(value: Any): Error_ = {
      val __obj = js.Dynamic.literal($type = "error", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error_]
    }
    
    extension [Self <: Error_](x: Self) {
      
      inline def set$type(value: error): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidPath extends StObject {
    
    var invalidate: Boolean
    
    var path: PathSet
  }
  object InvalidPath {
    
    inline def apply(invalidate: Boolean, path: PathSet): InvalidPath = {
      val __obj = js.Dynamic.literal(invalidate = invalidate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidPath]
    }
    
    extension [Self <: InvalidPath](x: Self) {
      
      inline def setInvalidate(value: Boolean): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      inline def setPath(value: PathSet): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: KeySet*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  /**
    * An envelope that wraps a JSON object.
    **/
  trait JSONEnvelope[T] extends StObject {
    
    var json: T
  }
  object JSONEnvelope {
    
    inline def apply[T](json: T): JSONEnvelope[T] = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONEnvelope[T]]
    }
    
    extension [Self <: JSONEnvelope[?], T](x: Self & JSONEnvelope[T]) {
      
      inline def setJson(value: T): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * JavaScript Object Notation Graph (JSONGraph) is a notation for expressing graphs in JSON. For more information, see the [JSONGraph Guide]{@link http://netflix.github.io/falcor/documentation/jsongraph.html}.
    **/
  type JSONGraph = Any
  
  /**
    * An envelope that wraps a {@link JSONGraph} fragment.
    **/
  trait JSONGraphEnvelope extends StObject {
    
    var invalidate: js.UndefOr[js.Array[PathSet]] = js.undefined
    
    var jsonGraph: JSONGraph
    
    var paths: js.UndefOr[js.Array[PathSet]] = js.undefined
  }
  object JSONGraphEnvelope {
    
    inline def apply(jsonGraph: JSONGraph): JSONGraphEnvelope = {
      val __obj = js.Dynamic.literal(jsonGraph = jsonGraph.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONGraphEnvelope]
    }
    
    extension [Self <: JSONGraphEnvelope](x: Self) {
      
      inline def setInvalidate(value: js.Array[PathSet]): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      inline def setInvalidateVarargs(value: PathSet*): Self = StObject.set(x, "invalidate", js.Array(value*))
      
      inline def setJsonGraph(value: JSONGraph): Self = StObject.set(x, "jsonGraph", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[PathSet]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: PathSet*): Self = StObject.set(x, "paths", js.Array(value*))
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
  trait PathValue_ extends StObject {
    
    var path: String | PathSet
    
    var value: Any
  }
  object PathValue_ {
    
    inline def apply(path: String | PathSet, value: Any): PathValue_ = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathValue_]
    }
    
    extension [Self <: PathValue_](x: Self) {
      
      inline def setPath(value: String | PathSet): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: KeySet*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Describe a range of integers. Must contain either a "to" or "length" property.
    **/
  trait Range extends StObject {
    
    var from: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object Range {
    
    inline def apply(): Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait Reference
    extends StObject
       with Sentinel {
    
    @JSName("$type")
    var $type: reference
    
    var value: Path
  }
  object Reference {
    
    inline def apply(value: Path): Reference = {
      val __obj = js.Dynamic.literal($type = "reference", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    extension [Self <: Reference](x: Self) {
      
      inline def set$type(value: reference): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Path): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Key*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait Sentinel extends StObject {
    
    @JSName("$expires")
    var $expires: js.UndefOr[Double] = js.undefined
  }
  object Sentinel {
    
    inline def apply(): Sentinel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sentinel]
    }
    
    extension [Self <: Sentinel](x: Self) {
      
      inline def set$expires(value: Double): Self = StObject.set(x, "$expires", value.asInstanceOf[js.Any])
      
      inline def set$expiresUndefined: Self = StObject.set(x, "$expires", js.undefined)
    }
  }
}
