package typings.fridaGum.global

import typings.fridaGum.Java.Backtrace
import typings.fridaGum.Java.BacktraceOptions
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Java {
  
  @JSGlobal("Java")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Java.ACC_ABSTRACT")
  @js.native
  val ACC_ABSTRACT: Double = js.native
  
  @JSGlobal("Java.ACC_BRIDGE")
  @js.native
  val ACC_BRIDGE: Double = js.native
  
  @JSGlobal("Java.ACC_FINAL")
  @js.native
  val ACC_FINAL: Double = js.native
  
  @JSGlobal("Java.ACC_NATIVE")
  @js.native
  val ACC_NATIVE: Double = js.native
  
  @JSGlobal("Java.ACC_PRIVATE")
  @js.native
  val ACC_PRIVATE: Double = js.native
  
  @JSGlobal("Java.ACC_PROTECTED")
  @js.native
  val ACC_PROTECTED: Double = js.native
  
  @JSGlobal("Java.ACC_PUBLIC")
  @js.native
  val ACC_PUBLIC: Double = js.native
  
  @JSGlobal("Java.ACC_STATIC")
  @js.native
  val ACC_STATIC: Double = js.native
  
  @JSGlobal("Java.ACC_STRICT")
  @js.native
  val ACC_STRICT: Double = js.native
  
  @JSGlobal("Java.ACC_SYNCHRONIZED")
  @js.native
  val ACC_SYNCHRONIZED: Double = js.native
  
  @JSGlobal("Java.ACC_SYNTHETIC")
  @js.native
  val ACC_SYNTHETIC: Double = js.native
  
  @JSGlobal("Java.ACC_VARARGS")
  @js.native
  val ACC_VARARGS: Double = js.native
  
  @JSGlobal("Java.ClassFactory")
  @js.native
  open class ClassFactory_ ()
    extends StObject
       with ClassFactory
  object ClassFactory_ {
    
    @JSGlobal("Java.ClassFactory")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def get(): ClassFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[ClassFactory]
    inline def get(classLoader: Wrapper): ClassFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(classLoader.asInstanceOf[js.Any]).asInstanceOf[ClassFactory]
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
  inline def array(`type`: String, elements: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(`type`.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  /**
    * Whether the current process has a Java runtime loaded. Do not invoke any other Java properties or
    * methods unless this is the case.
    */
  @JSGlobal("Java.available")
  @js.native
  val available: Boolean = js.native
  
  /**
    * Generates a backtrace for the current thread.
    *
    * @param options Options to customize the stack-walking.
    */
  inline def backtrace(): Backtrace = ^.asInstanceOf[js.Dynamic].applyDynamic("backtrace")().asInstanceOf[Backtrace]
  inline def backtrace(options: BacktraceOptions): Backtrace = ^.asInstanceOf[js.Dynamic].applyDynamic("backtrace")(options.asInstanceOf[js.Any]).asInstanceOf[Backtrace]
  
  /**
    * Creates a JavaScript wrapper given the existing instance at `handle` of
    * given class `klass` as returned from `Java.use()`.
    *
    * @param handle An existing wrapper or a JNI handle.
    * @param klass Class wrapper for type to cast to.
    */
  inline def cast[From /* <: Members[From] */, To /* <: Members[To] */](handle: typings.fridaGum.Java.Wrapper[From], klass: typings.fridaGum.Java.Wrapper[To]): typings.fridaGum.Java.Wrapper[To] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(handle.asInstanceOf[js.Any], klass.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.Java.Wrapper[To]]
  inline def cast[From /* <: Members[From] */, To /* <: Members[To] */](handle: NativePointerValue, klass: typings.fridaGum.Java.Wrapper[To]): typings.fridaGum.Java.Wrapper[To] = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(handle.asInstanceOf[js.Any], klass.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.Java.Wrapper[To]]
  
  /**
    * Enumerates live instances of the `className` class by scanning the Java
    * VM's heap.
    *
    * @param className Name of class to enumerate instances of.
    * @param callbacks Object with callbacks.
    */
  inline def choose[T /* <: Members[T] */](className: String, callbacks: ChooseCallbacks[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("choose")(className.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The default class factory used to implement e.g. `Java.use()`.
    * Uses the application's main class loader.
    */
  @JSGlobal("Java.classFactory")
  @js.native
  val classFactory: ClassFactory = js.native
  
  /**
    * Similar to deoptimizeEverything but only deoptimizes boot image code.
    * Use with `dalvik.vm.dex2oat-flags --inline-max-code-units=0` for best
    * results.
    */
  inline def deoptimizeBootImage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deoptimizeBootImage")().asInstanceOf[Unit]
  
  /**
    * Forces the VM to execute everything with its interpreter. Necessary to
    * prevent optimizations from bypassing method hooks in some cases, and
    * allows ART's Instrumentation APIs to be used for tracing the runtime.
    */
  inline def deoptimizeEverything(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deoptimizeEverything")().asInstanceOf[Unit]
  
  /**
    * Enumerates class loaders.
    *
    * You may pass such a loader to `Java.ClassFactory.get()` to be able to
    * `.use()` classes on the specified class loader.
    *
    * @param callbacks Object with callbacks.
    */
  inline def enumerateClassLoaders(callbacks: EnumerateClassLoadersCallbacks): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateClassLoaders")(callbacks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Synchronous version of `enumerateClassLoaders()`.
    */
  inline def enumerateClassLoadersSync(): js.Array[Wrapper] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateClassLoadersSync")().asInstanceOf[js.Array[Wrapper]]
  
  /**
    * Enumerates loaded classes.
    *
    * @param callbacks Object with callbacks.
    */
  inline def enumerateLoadedClasses(callbacks: EnumerateLoadedClassesCallbacks): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateLoadedClasses")(callbacks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Synchronous version of `enumerateLoadedClasses()`.
    */
  inline def enumerateLoadedClassesSync(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateLoadedClassesSync")().asInstanceOf[js.Array[String]]
  
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
  inline def enumerateMethods(query: String): js.Array[EnumerateMethodsMatchGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateMethods")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[EnumerateMethodsMatchGroup]]
  
  /**
    * Determines whether the caller is running on the main thread.
    */
  inline def isMainThread(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMainThread")().asInstanceOf[Boolean]
  
  /**
    * Opens the .dex file at `filePath`.
    *
    * @param filePath Path to .dex to open.
    */
  inline def openClassFile(filePath: String): DexFile = ^.asInstanceOf[js.Dynamic].applyDynamic("openClassFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[DexFile]
  
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * Will defer calling `fn` if the app's class loader is not available yet.
    * Use `Java.performNow()` if access to the app's classes is not needed.
    *
    * @param fn Function to run while attached to the VM.
    */
  inline def perform(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("perform")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Ensures that the current thread is attached to the VM and calls `fn`.
    * (This isn't necessary in callbacks from Java.)
    *
    * @param fn Function to run while attached to the VM.
    */
  inline def performNow(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("performNow")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a new Java class.
    *
    * @param spec Object describing the class to be created.
    */
  inline def registerClass(spec: ClassSpec): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("registerClass")(spec.asInstanceOf[js.Any]).asInstanceOf[Wrapper]
  
  /**
    * Duplicates a JavaScript wrapper for later use outside replacement method.
    *
    * @param obj An existing wrapper retrieved from `this` in replacement method.
    */
  inline def retain[T /* <: Members[T] */](obj: typings.fridaGum.Java.Wrapper[T]): typings.fridaGum.Java.Wrapper[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retain")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Java.Wrapper[T]]
  
  /**
    * Runs `fn` on the main thread of the VM.
    *
    * @param fn Function to run on the main thread of the VM.
    */
  inline def scheduleOnMainThread(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleOnMainThread")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Calls `func` with the `obj` lock held.
    *
    * @param obj Instance whose lock to hold.
    * @param fn Function to call with lock held.
    */
  inline def synchronized(obj: Wrapper, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronized")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def use[T /* <: Members[T] */](className: String): typings.fridaGum.Java.Wrapper[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(className.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.Java.Wrapper[T]]
  
  @JSGlobal("Java.vm")
  @js.native
  val vm: VM = js.native
}
