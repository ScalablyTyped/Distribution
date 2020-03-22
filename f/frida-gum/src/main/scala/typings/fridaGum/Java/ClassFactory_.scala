package typings.fridaGum.Java

import typings.fridaGum.NativePointerValue
import typings.fridaGum.WrapperAlloc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java.ClassFactory")
@js.native
class ClassFactory_ () extends js.Object {
  /**
    * Path to cache directory currently being used. For the default class
    * factory this is updated by the first call to `Java.perform()`.
    */
  var cacheDir: String = js.native
  /**
    * Class loader currently being used. For the default class factory this
    * is updated by the first call to `Java.perform()`.
    */
  val loader: WrapperAlloc | Null = js.native
  /**
    * Naming convention to use for temporary files.
    *
    * Defaults to `{ prefix: "frida", suffix: "dat" }`.
    */
  var tempFileNaming: TempFileNaming = js.native
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
  def array(`type`: String, elements: js.Array[_]): js.Array[_] = js.native
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
  def choose(className: String, callbacks: ChooseCallbacks): Unit = js.native
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
  def registerClass(spec: ClassSpec): WrapperAlloc = js.native
  /**
    * Duplicates a JavaScript wrapper for later use outside replacement method.
    *
    * @param obj An existing wrapper retrieved from `this` in replacement method.
    */
  def retain[T /* <: Members[T] */](obj: Wrapper[T]): Wrapper[T] = js.native
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

/* static members */
@JSGlobal("Java.ClassFactory")
@js.native
object ClassFactory_ extends js.Object {
  /**
    * Gets the class factory instance for a given class loader.
    *
    * The default class factory used behind the scenes only interacts
    * with the application's main class loader. Other class loaders
    * can be discovered through `Java.enumerateClassLoaders()` and
    * interacted with through this API.
    */
  def get(classLoader: WrapperAlloc): ClassFactory_ = js.native
}

