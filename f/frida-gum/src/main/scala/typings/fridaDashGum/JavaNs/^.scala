package typings.fridaDashGum.JavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Java")
@js.native
object ^ extends js.Object {
  /**
    * Which version of Android we're running on.
    */
  val androidVersion: String = js.native
  /**
    * Whether the current process has a Java runtime loaded. Do not invoke any other Java properties or
    * methods unless this is the case.
    */
  val available: Boolean = js.native
  val classFactory: ClassFactory = js.native
  val vm: VM = js.native
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
  def cast(handle: js.Any, klass: Wrapper): Wrapper = js.native
  /**
    * Enumerates live instances of the `className` class by scanning the Java
    * VM's heap.
    *
    * @param className Name of class to enumerate instances of.
    * @param callbacks Object with callbacks.
    */
  def choose(className: String, callbacks: ChooseCallbacks): Unit = js.native
  /**
    * Forces the VM to execute everything with its interpreter. Necessary to
    * prevent optimizations from bypassing method hooks in some cases, and
    * allows ART's Instrumentation APIs to be used for tracing the runtime.
    */
  def deoptimizeEverything(): Unit = js.native
  /**
    * Enumerates class loaders.
    *
    * You may assign such a loader to `Java.classFactory.loader` to make
    * `Java.use()` look for classes on a specific loader instead of the default
    * loader used by the app.
    *
    * @param callbacks Object with callbacks.
    */
  def enumerateClassLoaders(callbacks: EnumerateClassLoadersCallbacks): Unit = js.native
  /**
    * Synchronous version of `enumerateClassLoaders()`.
    */
  def enumerateClassLoadersSync(): js.Array[Wrapper] = js.native
  /**
    * Enumerates loaded classes.
    *
    * @param callbacks Object with callbacks.
    */
  def enumerateLoadedClasses(callbacks: EnumerateLoadedClassesCallbacks): Unit = js.native
  /**
    * Synchronous version of `enumerateLoadedClasses()`.
    */
  def enumerateLoadedClassesSync(): js.Array[String] = js.native
  /**
    * Determines whether the caller is running on the main thread.
    */
  def isMainThread(): Boolean = js.native
  /**
    * Opens the .dex file at `filePath`.
    *
    * @param filePath Path to .dex to open.
    */
  def openClassFile(filePath: String): DexFile = js.native
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * Will defer calling `fn` if the app's class loader is not available yet.
    * Use `Java.performNow()` if access to the app's classes is not needed.
    *
    * @param fn Function to run while attached to the VM.
    */
  def perform(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  def performNow(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Creates a new Java class.
    *
    * @param spec Object describing the class to be created.
    */
  def registerClass(spec: ClassSpec): Wrapper = js.native
  /**
    * Runs `fn` on the main thread of the VM.
    *
    * @param fn Function to run on the main thread of the VM.
    */
  def scheduleOnMainThread(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Calls `func` with the `obj` lock held.
    *
    * @param obj Instance whose lock to hold.
    * @param fn Function to call with lock held.
    */
  def synchronized(obj: Wrapper, fn: js.Function0[Unit]): Unit = js.native
  /**
    * Dynamically generates a JavaScript wrapper for `className` that you can
    * instantiate objects from by calling `$new()` on to invoke a constructor.
    * Call `$dispose()` on an instance to clean it up explicitly, or wait for
    * the JavaScript object to get garbage-collected, or script to get
    * unloaded. Static and non-static methods are available, and you can even
    * replace method implementations.
    *
    * Uses the app's class loader by default, but you may customize this by
    * assigning a different loader instance to `Java.classFactory.loader`.
    *
    * @param className Canonical class name to get a wrapper for.
    */
  def use(className: String): Wrapper = js.native
}

