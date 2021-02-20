package typings.fridaGum.global

import typings.fridaGum.Java.ChooseCallbacks
import typings.fridaGum.Java.ClassFactory
import typings.fridaGum.Java.ClassSpec
import typings.fridaGum.Java.DexFile
import typings.fridaGum.Java.EnumerateClassLoadersCallbacks
import typings.fridaGum.Java.EnumerateLoadedClassesCallbacks
import typings.fridaGum.Java.EnumerateMethodsMatchGroup
import typings.fridaGum.Java.Members
import typings.fridaGum.Java.VM
import typings.fridaGum.NativePointerValue
import typings.fridaGum.anon.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Java {
  
  @JSGlobal("Java.ClassFactory")
  @js.native
  class ClassFactory_ () extends ClassFactory
  object ClassFactory_ {
    
    /**
      * Gets the class factory instance for a given class loader, or the
      * default factory when passing `null`.
      *
      * The default class factory used behind the scenes only interacts
      * with the application's main class loader. Other class loaders
      * can be discovered through APIs such as `Java.enumerateMethods()` and
      * `Java.enumerateClassLoaders()`, and subsequently interacted with
      * through this API.
      */
    /* static member */
    @JSGlobal("Java.ClassFactory.get")
    @js.native
    def get(): ClassFactory = js.native
    @JSGlobal("Java.ClassFactory.get")
    @js.native
    def get(classLoader: Wrapper): ClassFactory = js.native
  }
  
  /**
    * Which version of Android we're running on.
    */
  @JSGlobal("Java.androidVersion")
  @js.native
  val androidVersion: String = js.native
  
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
  @JSGlobal("Java.array")
  @js.native
  def array(`type`: String, elements: js.Array[_]): js.Array[_] = js.native
  
  /**
    * Whether the current process has a Java runtime loaded. Do not invoke any other Java properties or
    * methods unless this is the case.
    */
  @JSGlobal("Java.available")
  @js.native
  val available: Boolean = js.native
  
  /**
    * Creates a JavaScript wrapper given the existing instance at `handle` of
    * given class `klass` as returned from `Java.use()`.
    *
    * @param handle An existing wrapper or a JNI handle.
    * @param klass Class wrapper for type to cast to.
    */
  @JSGlobal("Java.cast")
  @js.native
  def cast[From /* <: Members[From] */, To /* <: Members[To] */](handle: typings.fridaGum.Java.Wrapper[From], klass: typings.fridaGum.Java.Wrapper[To]): typings.fridaGum.Java.Wrapper[To] = js.native
  @JSGlobal("Java.cast")
  @js.native
  def cast[From /* <: Members[From] */, To /* <: Members[To] */](handle: NativePointerValue, klass: typings.fridaGum.Java.Wrapper[To]): typings.fridaGum.Java.Wrapper[To] = js.native
  
  /**
    * Enumerates live instances of the `className` class by scanning the Java
    * VM's heap.
    *
    * @param className Name of class to enumerate instances of.
    * @param callbacks Object with callbacks.
    */
  @JSGlobal("Java.choose")
  @js.native
  def choose(className: String, callbacks: ChooseCallbacks): Unit = js.native
  
  /**
    * The default class factory used to implement e.g. `Java.use()`.
    * Uses the application's main class loader.
    */
  @JSGlobal("Java.classFactory")
  @js.native
  val classFactory: ClassFactory = js.native
  
  /**
    * Forces the VM to execute everything with its interpreter. Necessary to
    * prevent optimizations from bypassing method hooks in some cases, and
    * allows ART's Instrumentation APIs to be used for tracing the runtime.
    */
  @JSGlobal("Java.deoptimizeEverything")
  @js.native
  def deoptimizeEverything(): Unit = js.native
  
  /**
    * Enumerates class loaders.
    *
    * You may pass such a loader to `Java.ClassFactory.get()` to be able to
    * `.use()` classes on the specified class loader.
    *
    * @param callbacks Object with callbacks.
    */
  @JSGlobal("Java.enumerateClassLoaders")
  @js.native
  def enumerateClassLoaders(callbacks: EnumerateClassLoadersCallbacks): Unit = js.native
  
  /**
    * Synchronous version of `enumerateClassLoaders()`.
    */
  @JSGlobal("Java.enumerateClassLoadersSync")
  @js.native
  def enumerateClassLoadersSync(): js.Array[Wrapper] = js.native
  
  /**
    * Enumerates loaded classes.
    *
    * @param callbacks Object with callbacks.
    */
  @JSGlobal("Java.enumerateLoadedClasses")
  @js.native
  def enumerateLoadedClasses(callbacks: EnumerateLoadedClassesCallbacks): Unit = js.native
  
  /**
    * Synchronous version of `enumerateLoadedClasses()`.
    */
  @JSGlobal("Java.enumerateLoadedClassesSync")
  @js.native
  def enumerateLoadedClassesSync(): js.Array[String] = js.native
  
  /**
    * Enumerates methods matching `query`.
    *
    * @param query Query specified as `class!method`, with globs permitted. May
    *              also be suffixed with `/` and one or more modifiers:
    *              - `i`: Case-insensitive matching.
    *              - `s`: Include method signatures, so e.g. `"putInt"` becomes
    *                `"putInt(java.lang.String, int): void"`.
    *              - `u`: User-defined classes only, ignoring system classes.
    */
  @JSGlobal("Java.enumerateMethods")
  @js.native
  def enumerateMethods(query: String): js.Array[EnumerateMethodsMatchGroup] = js.native
  
  /**
    * Determines whether the caller is running on the main thread.
    */
  @JSGlobal("Java.isMainThread")
  @js.native
  def isMainThread(): Boolean = js.native
  
  /**
    * Opens the .dex file at `filePath`.
    *
    * @param filePath Path to .dex to open.
    */
  @JSGlobal("Java.openClassFile")
  @js.native
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
  @JSGlobal("Java.perform")
  @js.native
  def perform(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  @JSGlobal("Java.performNow")
  @js.native
  def performNow(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Creates a new Java class.
    *
    * @param spec Object describing the class to be created.
    */
  @JSGlobal("Java.registerClass")
  @js.native
  def registerClass(spec: ClassSpec): Wrapper = js.native
  
  /**
    * Duplicates a JavaScript wrapper for later use outside replacement method.
    *
    * @param obj An existing wrapper retrieved from `this` in replacement method.
    */
  @JSGlobal("Java.retain")
  @js.native
  def retain[T /* <: Members[T] */](obj: typings.fridaGum.Java.Wrapper[T]): typings.fridaGum.Java.Wrapper[T] = js.native
  
  /**
    * Runs `fn` on the main thread of the VM.
    *
    * @param fn Function to run on the main thread of the VM.
    */
  @JSGlobal("Java.scheduleOnMainThread")
  @js.native
  def scheduleOnMainThread(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Calls `func` with the `obj` lock held.
    *
    * @param obj Instance whose lock to hold.
    * @param fn Function to call with lock held.
    */
  @JSGlobal("Java.synchronized")
  @js.native
  def synchronized(obj: Wrapper, fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Dynamically generates a JavaScript wrapper for `className` that you can
    * instantiate objects from by calling `$new()` on to invoke a constructor.
    * Call `$dispose()` on an instance to clean it up explicitly, or wait for
    * the JavaScript object to get garbage-collected, or script to get
    * unloaded. Static and non-static methods are available, and you can even
    * replace method implementations.
    *
    * Uses the app's class loader, but you may access classes on other loaders
    * by calling `Java.ClassFactory.get()`.
    *
    * @param className Canonical class name to get a wrapper for.
    */
  @JSGlobal("Java.use")
  @js.native
  def use[T /* <: Members[T] */](className: String): typings.fridaGum.Java.Wrapper[T] = js.native
  
  @JSGlobal("Java.vm")
  @js.native
  val vm: VM = js.native
}
