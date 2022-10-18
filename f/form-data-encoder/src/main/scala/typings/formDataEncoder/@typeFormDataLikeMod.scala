package typings.formDataEncoder

import typings.formDataEncoder.`@typeFileLikeMod`.FileLike
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@typeFormDataLikeMod` {
  
  type FormDataEntryValue = String | FileLike
  
  @js.native
  trait FormDataLike extends StObject {
    
    /**
      * Appends a new value onto an existing key inside a FormData object,
      * or adds the key if it does not already exist.
      *
      * The difference between `set()` and `append()` is that if the specified key already exists, `set()` will overwrite all existing values with the new one, whereas `append()` will append the new value onto the end of the existing set of values.
      *
      * @param name The name of the field whose data is contained in `value`.
      * @param value The field's value. This can be [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob)
      or [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File). If none of these are specified the value is converted to a string.
      * @param fileName The filename reported to the server, when a Blob or File is passed as the second parameter. The default filename for Blob objects is "blob". The default filename for File objects is the file's filename.
      */
    def append(name: String, value: Any): Unit = js.native
    def append(name: String, value: Any, fileName: String): Unit = js.native
    
    /**
      * Returns an [`iterator`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols) allowing to go through the `FormData` key/value pairs.
      * The key of each pair is a string; the value is a [`FormDataValue`](https://developer.mozilla.org/en-US/docs/Web/API/FormDataEntryValue).
      */
    def entries(): Generator[js.Tuple2[String, FormDataEntryValue], Any, Any] = js.native
    
    /**
      * Returns all the values associated with a given key from within a `FormData` object.
      *
      * @param {string} name A name of the value you want to retrieve.
      *
      * @returns An array of `FormDataEntryValue` whose key matches the value passed in the `name` parameter. If the key doesn't exist, the method returns an empty list.
      */
    def getAll(name: String): js.Array[FormDataEntryValue] = js.native
    
    /**
      * An alias for FormDataLike#entries()
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[js.Tuple2[String, FormDataEntryValue], Any, Any]] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
}
