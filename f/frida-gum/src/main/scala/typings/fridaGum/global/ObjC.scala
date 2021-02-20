package typings.fridaGum.global

import typings.fridaGum.AnyFunction
import typings.fridaGum.EnumerateCallbacks
import typings.fridaGum.NativeFunctionOptions
import typings.fridaGum.NativePointerValue
import typings.fridaGum.ObjC.BlockImplementation
import typings.fridaGum.ObjC.ChooseSpecifier
import typings.fridaGum.ObjC.ClassSpec
import typings.fridaGum.ObjC.EnumerateLoadedClassesCallbacks
import typings.fridaGum.ObjC.EnumerateLoadedClassesOptions
import typings.fridaGum.ObjC.EnumerateLoadedClassesResult
import typings.fridaGum.ObjC.InstanceData
import typings.fridaGum.ObjC.MethodSpec
import typings.fridaGum.ObjC.ObjectMethod
import typings.fridaGum.ObjC.ProtocolSpec
import typings.fridaGum.ObjC.ProxyConstructor
import typings.fridaGum.ObjC.ProxyData
import typings.fridaGum.ObjC.ProxySpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObjC {
  
  /**
    * Dynamically generated language binding for any Objective-C block.
    *
    * Also supports implementing a block from scratch by passing in an
    * implementation.
    */
  @JSGlobal("ObjC.Block")
  @js.native
  class Block protected ()
    extends typings.fridaGum.ObjC.Block {
    def this(target: typings.fridaGum.NativePointer) = this()
    def this(target: MethodSpec[BlockImplementation]) = this()
    def this(target: typings.fridaGum.NativePointer, options: NativeFunctionOptions) = this()
    def this(target: MethodSpec[BlockImplementation], options: NativeFunctionOptions) = this()
  }
  
  /**
    * Dynamically generated wrapper for any Objective-C instance, class, or meta-class.
    */
  @JSGlobal("ObjC.Object")
  @js.native
  class Object protected ()
    extends typings.fridaGum.ObjC.Object {
    def this(handle: typings.fridaGum.NativePointer) = this()
    def this(handle: typings.fridaGum.NativePointer, protocol: typings.fridaGum.ObjC.Protocol) = this()
  }
  
  /**
    * Dynamically generated language binding for any Objective-C protocol.
    */
  @JSGlobal("ObjC.Protocol")
  @js.native
  class Protocol protected ()
    extends typings.fridaGum.ObjC.Protocol {
    def this(handle: typings.fridaGum.NativePointer) = this()
  }
  
  // tslint:disable:no-unnecessary-qualifier
  /**
    * Whether the current process has an Objective-C runtime loaded. Do not invoke any other ObjC properties or
    * methods unless this is the case.
    */
  @JSGlobal("ObjC.available")
  @js.native
  val available: Boolean = js.native
  
  @JSGlobal("ObjC.bind")
  @js.native
  def bind(obj: typings.fridaGum.NativePointer, data: InstanceData): Unit = js.native
  /**
    * Binds some JavaScript data to an Objective-C instance.
    *
    * @param obj Objective-C instance to bind data to.
    * @param data Data to bind.
    */
  @JSGlobal("ObjC.bind")
  @js.native
  def bind(obj: typings.fridaGum.ObjC.Object, data: InstanceData): Unit = js.native
  
  @JSGlobal("ObjC.choose")
  @js.native
  def choose(specifier: ChooseSpecifier, callbacks: EnumerateCallbacks[typings.fridaGum.ObjC.Object]): Unit = js.native
  
  /**
    * Synchronous version of `choose()`.
    *
    * @param specifier What kind of objects to look for.
    */
  @JSGlobal("ObjC.chooseSync")
  @js.native
  def chooseSync(specifier: ChooseSpecifier): js.Array[typings.fridaGum.ObjC.Object] = js.native
  
  /**
    * Enumerates loaded classes.
    *
    * @param callbacks Object with callbacks.
    */
  @JSGlobal("ObjC.enumerateLoadedClasses")
  @js.native
  def enumerateLoadedClasses(callbacks: EnumerateLoadedClassesCallbacks): Unit = js.native
  /**
    * Enumerates loaded classes.
    *
    * @param options Options customizing the enumeration.
    * @param callbacks Object with callbacks.
    */
  @JSGlobal("ObjC.enumerateLoadedClasses")
  @js.native
  def enumerateLoadedClasses(options: EnumerateLoadedClassesOptions, callbacks: EnumerateLoadedClassesCallbacks): Unit = js.native
  
  /**
    * Synchronous version of `enumerateLoadedClasses()`.
    *
    * @param options Options customizing the enumeration.
    */
  @JSGlobal("ObjC.enumerateLoadedClassesSync")
  @js.native
  def enumerateLoadedClassesSync(): EnumerateLoadedClassesResult = js.native
  @JSGlobal("ObjC.enumerateLoadedClassesSync")
  @js.native
  def enumerateLoadedClassesSync(options: EnumerateLoadedClassesOptions): EnumerateLoadedClassesResult = js.native
  
  @JSGlobal("ObjC.getBoundData")
  @js.native
  def getBoundData(obj: typings.fridaGum.NativePointer): js.Any = js.native
  /**
    * Looks up previously bound data from an Objective-C object.
    *
    * @param obj Objective-C instance to look up data for.
    */
  @JSGlobal("ObjC.getBoundData")
  @js.native
  def getBoundData(obj: typings.fridaGum.ObjC.Object): js.Any = js.native
  
  /**
    * Creates a JavaScript implementation compatible with the signature of `method`, where `fn` is used as the
    * implementation. Returns a `NativeCallback` that you may assign to an ObjC method’s `implementation` property.
    *
    * @param method Method to implement.
    * @param fn Implementation.
    */
  @JSGlobal("ObjC.implement")
  @js.native
  def implement(method: ObjectMethod, fn: AnyFunction): typings.fridaGum.NativeCallback = js.native
  
  /**
    * GCD queue of the main thread.
    */
  @JSGlobal("ObjC.mainQueue")
  @js.native
  val mainQueue: typings.fridaGum.NativePointer = js.native
  
  /**
    * Creates a new Objective-C class.
    *
    * @param spec Class specification.
    */
  @JSGlobal("ObjC.registerClass")
  @js.native
  def registerClass(spec: ClassSpec[InstanceData, typings.fridaGum.ObjC.Object, typings.fridaGum.ObjC.Object]): typings.fridaGum.ObjC.Object = js.native
  
  /**
    * Creates a new Objective-C protocol.
    *
    * @param spec Protocol specification.
    */
  @JSGlobal("ObjC.registerProtocol")
  @js.native
  def registerProtocol(spec: ProtocolSpec): typings.fridaGum.ObjC.Protocol = js.native
  
  /**
    * Creates a new class designed to act as a proxy for a target object.
    *
    * @param spec Proxy specification.
    */
  @JSGlobal("ObjC.registerProxy")
  @js.native
  def registerProxy(spec: ProxySpec[ProxyData, typings.fridaGum.ObjC.Object, typings.fridaGum.ObjC.Object]): ProxyConstructor = js.native
  
  /**
    * Schedule the JavaScript function `work` on the GCD queue specified by `queue`. An NSAutoreleasePool is created
    * just before calling `work`, and cleaned up on return.
    *
    * E.g. on macOS:
    * ```
    *     const { NSSound } = ObjC.classes;
    *     ObjC.schedule(ObjC.mainQueue, () => {
    *         const sound = NSSound.alloc().initWithContentsOfFile_byReference_("/Users/oleavr/.Trash/test.mp3", true).autorelease();
    *         sound.play();
    *     });
    * ```
    *
    * @param queue GCD queue to schedule `work` on.
    * @param work Function to call on the specified `queue`.
    */
  @JSGlobal("ObjC.schedule")
  @js.native
  def schedule(queue: NativePointerValue, work: js.Function0[Unit]): Unit = js.native
  
  /**
    * Converts the JavaScript string `name` to a selector.
    *
    * @param name Name to turn into a selector.
    */
  @JSGlobal("ObjC.selector")
  @js.native
  def selector(name: String): typings.fridaGum.NativePointer = js.native
  
  /**
    * Converts the selector `sel` to a JavaScript string.
    *
    * @param sel Selector to turn into a string.
    */
  @JSGlobal("ObjC.selectorAsString")
  @js.native
  def selectorAsString(sel: NativePointerValue): String = js.native
  
  @JSGlobal("ObjC.unbind")
  @js.native
  def unbind(obj: typings.fridaGum.NativePointer): Unit = js.native
  /**
    * Unbinds previously associated JavaScript data from an Objective-C instance.
    *
    * @param obj Objective-C instance to unbind data from.
    */
  @JSGlobal("ObjC.unbind")
  @js.native
  def unbind(obj: typings.fridaGum.ObjC.Object): Unit = js.native
  
  /**
    * Direct access to a big portion of the Objective-C runtime API.
    */
  object api
  
  /**
    * Dynamically generated bindings for each of the currently registered classes.
    *
    * You can interact with objects by using dot notation and replacing colons with underscores, i.e.:
    *
    * ```
    *     [NSString stringWithString:@"Hello World"];
    * ```
    *
    * becomes:
    *
    * ```
    *     const NSString = ObjC.classes.NSString;
    *     NSString.stringWithString_("Hello World");
    * ```
    *
    * Note the underscore after the method name.
    */
  object classes
  
  /**
    * Dynamically generated bindings for each of the currently registered protocols.
    */
  object protocols
}
