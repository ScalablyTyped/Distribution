package typings.editJsonFile

import typings.node.fsMod.NoParamCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Create a JSON file editor. */
  inline def apply(path: String): JsonEditor = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[JsonEditor]
  inline def apply(path: String, options: Options): JsonEditor = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JsonEditor]
  
  @JSImport("edit-json-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** JSON file editor. */
  @js.native
  trait JsonEditor extends StObject {
    
    /** Appends a value/object to a specific path. */
    def append(path: String, value: Any): JsonEditor = js.native
    
    /** Empty the JSON file. */
    def empty(): JsonEditor = js.native
    def empty(cb: NoParamCallback): JsonEditor = js.native
    
    /** Get value at path. */
    def get(): Any = js.native
    def get(path: String): Any = js.native
    
    /** Pop an array from a specific path. */
    def pop(path: String): JsonEditor = js.native
    
    /** Read the JSON file. */
    def read(): js.Object = js.native
    def read(cb: NoParamCallback): js.Object = js.native
    
    /** Save the JSON file back to disk. */
    def save(): JsonEditor = js.native
    def save(cb: NoParamCallback): JsonEditor = js.native
    
    /** Set value at path. */
    def set(path: String, value: Any): JsonEditor = js.native
    def set(path: String, value: Any, options: typings.setValue.mod.Options): JsonEditor = js.native
    
    /** Get full object. */
    def toObject(): js.Object = js.native
    
    /** Unset value at path. */
    def unset(path: String): JsonEditor = js.native
    
    /** Overwrite the JSON file. */
    def write(content: String): JsonEditor = js.native
    def write(content: String, cb: NoParamCallback): JsonEditor = js.native
  }
  
  /** JSON file editor options. */
  trait Options extends StObject {
    
    var autosave: js.UndefOr[Boolean] = js.undefined
    
    var ignore_dots: js.UndefOr[Boolean] = js.undefined
    
    var stringify_eol: js.UndefOr[Boolean] = js.undefined
    
    var stringify_fn: js.UndefOr[js.Function1[/* data */ js.Object, String]] = js.undefined
    
    var stringify_width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutosave(value: Boolean): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
      
      inline def setIgnore_dots(value: Boolean): Self = StObject.set(x, "ignore_dots", value.asInstanceOf[js.Any])
      
      inline def setIgnore_dotsUndefined: Self = StObject.set(x, "ignore_dots", js.undefined)
      
      inline def setStringify_eol(value: Boolean): Self = StObject.set(x, "stringify_eol", value.asInstanceOf[js.Any])
      
      inline def setStringify_eolUndefined: Self = StObject.set(x, "stringify_eol", js.undefined)
      
      inline def setStringify_fn(value: /* data */ js.Object => String): Self = StObject.set(x, "stringify_fn", js.Any.fromFunction1(value))
      
      inline def setStringify_fnUndefined: Self = StObject.set(x, "stringify_fn", js.undefined)
      
      inline def setStringify_width(value: Double): Self = StObject.set(x, "stringify_width", value.asInstanceOf[js.Any])
      
      inline def setStringify_widthUndefined: Self = StObject.set(x, "stringify_width", js.undefined)
    }
  }
}
