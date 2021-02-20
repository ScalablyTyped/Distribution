package typings.editJsonFile

import typings.node.fsMod.NoParamCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Create a JSON file editor. */
  @JSImport("edit-json-file", JSImport.Namespace)
  @js.native
  def apply(path: String): JsonEditor = js.native
  @JSImport("edit-json-file", JSImport.Namespace)
  @js.native
  def apply(path: String, options: Options): JsonEditor = js.native
  
  /** JSON file editor. */
  @js.native
  trait JsonEditor extends StObject {
    
    /** Empty the JSON file. */
    def empty(): JsonEditor = js.native
    def empty(cb: NoParamCallback): JsonEditor = js.native
    
    /** Get value at path. */
    def get(): js.Any = js.native
    def get(path: String): js.Any = js.native
    
    /** Read the JSON file. */
    def read(): js.Object = js.native
    def read(cb: NoParamCallback): js.Object = js.native
    
    /** Save the JSON file back to disk. */
    def save(): JsonEditor = js.native
    def save(cb: NoParamCallback): JsonEditor = js.native
    
    /** Set value at path. */
    def set(path: String, value: js.Any): JsonEditor = js.native
    
    /** Get full object. */
    def toObject(): js.Object = js.native
    
    /** Unset value at path. */
    def unset(path: String): JsonEditor = js.native
    
    /** Overwrite the JSON file. */
    def write(content: String): JsonEditor = js.native
    def write(content: String, cb: NoParamCallback): JsonEditor = js.native
  }
  
  /** JSON file editor options. */
  @js.native
  trait Options extends StObject {
    
    var autosave: js.UndefOr[Boolean] = js.native
    
    var stringify_eol: js.UndefOr[Boolean] = js.native
    
    var stringify_fn: js.UndefOr[js.Function1[/* data */ js.Object, String]] = js.native
    
    var stringify_width: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutosave(value: Boolean): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
      
      @scala.inline
      def setStringify_eol(value: Boolean): Self = StObject.set(x, "stringify_eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringify_eolUndefined: Self = StObject.set(x, "stringify_eol", js.undefined)
      
      @scala.inline
      def setStringify_fn(value: /* data */ js.Object => String): Self = StObject.set(x, "stringify_fn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringify_fnUndefined: Self = StObject.set(x, "stringify_fn", js.undefined)
      
      @scala.inline
      def setStringify_width(value: Double): Self = StObject.set(x, "stringify_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringify_widthUndefined: Self = StObject.set(x, "stringify_width", js.undefined)
    }
  }
}
