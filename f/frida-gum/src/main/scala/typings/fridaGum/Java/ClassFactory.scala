package typings.fridaGum.Java

import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassFactory extends StObject {
  
  /**
    * Creates a Java array with elements of the specified `type`, from a
    * JavaScript array `elements`. The resulting Java array behaves like
    * a JS array, but can be passed by reference to Java APIs in order to
    * allow them to modify its contents.
    *
    * @param type Type name of elements.
    * @param elements Array of JavaScript values to use for constructing the
    *                 Java array.
    */
  def array(`type`: String, elements: js.Array[Any]): js.Array[Any] = js.native
  
  /**
    * Path to cache directory currently being used. For the default class
    * factory this is updated by the first call to `Java.perform()`.
    */
  var cacheDir: String = js.native
  
  /**
    * Creates a JavaScript wrapper given the existing instance at `handle` of
    * given class `klass` as returned from `Java.use()`.
    *
    * @param handle An existing wrapper or a JNI handle.
    * @param klass Class wrapper for type to cast to.
    */
  def cast[From /* <: Members[From] */, To /* <: Members[To] */](handle: Wrapper[From], klass: Wrapper[To]): Wrapper[To] = js.native
  def cast[From /* <: Members[From] */, To /* <: Members[To] */](handle: NativePointerValue, klass: Wrapper[To]): Wrapper[To] = js.native
  
  /**
    * Enumerates live instances of the `className` class by scanning the Java
    * VM's heap.
    *
    * @param className Name of class to enumerate instances of.
    * @param callbacks Object with callbacks.
    */
  def choose[T /* <: Members[T] */](className: String, callbacks: ChooseCallbacks[T]): Unit = js.native
  
  /**
    * Class loader currently being used. For the default class factory this
    * is updated by the first call to `Java.perform()`.
    */
  val loader: typings.fridaGum.anon.Wrapper | Null = js.native
  
  /**
    * Opens the .dex file at `filePath`.
    *
    * @param filePath Path to .dex to open.
    */
  def openClassFile(filePath: String): DexFile = js.native
  
  /**
    * Creates a new Java class.
    *
    * @param spec Object describing the class to be created.
    */
  def registerClass(spec: ClassSpec): typings.fridaGum.anon.Wrapper = js.native
  
  /**
    * Duplicates a JavaScript wrapper for later use outside replacement method.
    *
    * @param obj An existing wrapper retrieved from `this` in replacement method.
    */
  def retain[T /* <: Members[T] */](obj: Wrapper[T]): Wrapper[T] = js.native
  
  /**
    * Naming convention to use for temporary files.
    *
    * Defaults to `{ prefix: "frida", suffix: "dat" }`.
    */
  var tempFileNaming: TempFileNaming = js.native
  
  /**
    * Dynamically generates a JavaScript wrapper for `className` that you can
    * instantiate objects from by calling `$new()` on to invoke a constructor.
    * Call `$dispose()` on an instance to clean it up explicitly, or wait for
    * the JavaScript object to get garbage-collected, or script to get
    * unloaded. Static and non-static methods are available, and you can even
    * replace method implementations.
    *
    * @param className Canonical class name to get a wrapper for.
    */
  def use[T /* <: Members[T] */](className: String): Wrapper[T] = js.native
}
