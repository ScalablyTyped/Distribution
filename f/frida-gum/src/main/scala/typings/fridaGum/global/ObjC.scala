package typings.fridaGum.global

import org.scalablytyped.runtime.StringDictionary
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ObjC")
@js.native
object ObjC extends js.Object {
  
  // tslint:disable:no-unnecessary-qualifier
  /**
    * Whether the current process has an Objective-C runtime loaded. Do not invoke any other ObjC properties or
    * methods unless this is the case.
    */
  val available: Boolean = js.native
  
  def bind(obj: typings.fridaGum.NativePointer, data: InstanceData): Unit = js.native
  /**
    * Binds some JavaScript data to an Objective-C instance.
    *
    * @param obj Objective-C instance to bind data to.
    * @param data Data to bind.
    */
  def bind(obj: typings.fridaGum.ObjC.Object, data: InstanceData): Unit = js.native
  
  def choose(specifier: ChooseSpecifier, callbacks: EnumerateCallbacks[typings.fridaGum.ObjC.Object]): Unit = js.native
  
  /**
    * Synchronous version of `choose()`.
    *
    * @param specifier What kind of objects to look for.
    */
  def chooseSync(specifier: ChooseSpecifier): js.Array[typings.fridaGum.ObjC.Object] = js.native
  
  /**
    * Enumerates loaded classes.
    *
    * @param callbacks Object with callbacks.
    */
  def enumerateLoadedClasses(callbacks: EnumerateLoadedClassesCallbacks): Unit = js.native
  /**
    * Enumerates loaded classes.
    *
    * @param options Options customizing the enumeration.
    * @param callbacks Object with callbacks.
    */
  def enumerateLoadedClasses(options: EnumerateLoadedClassesOptions, callbacks: EnumerateLoadedClassesCallbacks): Unit = js.native
  
  /**
    * Synchronous version of `enumerateLoadedClasses()`.
    *
    * @param options Options customizing the enumeration.
    */
  def enumerateLoadedClassesSync(): EnumerateLoadedClassesResult = js.native
  def enumerateLoadedClassesSync(options: EnumerateLoadedClassesOptions): EnumerateLoadedClassesResult = js.native
  
  def getBoundData(obj: typings.fridaGum.NativePointer): js.Any = js.native
  /**
    * Looks up previously bound data from an Objective-C object.
    *
    * @param obj Objective-C instance to look up data for.
    */
  def getBoundData(obj: typings.fridaGum.ObjC.Object): js.Any = js.native
  
  /**
    * Creates a JavaScript implementation compatible with the signature of `method`, where `fn` is used as the
    * implementation. Returns a `NativeCallback` that you may assign to an ObjC method’s `implementation` property.
    *
    * @param method Method to implement.
    * @param fn Implementation.
    */
  def implement(method: ObjectMethod, fn: AnyFunction): typings.fridaGum.NativeCallback = js.native
  
  /**
    * GCD queue of the main thread.
    */
  val mainQueue: typings.fridaGum.NativePointer = js.native
  
  /**
    * Creates a new Objective-C class.
    *
    * @param spec Class specification.
    */
  def registerClass(spec: ClassSpec[InstanceData, typings.fridaGum.ObjC.Object, typings.fridaGum.ObjC.Object]): typings.fridaGum.ObjC.Object = js.native
  
  /**
    * Creates a new Objective-C protocol.
    *
    * @param spec Protocol specification.
    */
  def registerProtocol(spec: ProtocolSpec): typings.fridaGum.ObjC.Protocol = js.native
  
  /**
    * Creates a new class designed to act as a proxy for a target object.
    *
    * @param spec Proxy specification.
    */
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
  def schedule(queue: NativePointerValue, work: js.Function0[Unit]): Unit = js.native
  
  /**
    * Converts the JavaScript string `name` to a selector.
    *
    * @param name Name to turn into a selector.
    */
  def selector(name: String): typings.fridaGum.NativePointer = js.native
  
  /**
    * Converts the selector `sel` to a JavaScript string.
    *
    * @param sel Selector to turn into a string.
    */
  def selectorAsString(sel: NativePointerValue): String = js.native
  
  def unbind(obj: typings.fridaGum.NativePointer): Unit = js.native
  /**
    * Unbinds previously associated JavaScript data from an Objective-C instance.
    *
    * @param obj Objective-C instance to unbind data from.
    */
  def unbind(obj: typings.fridaGum.ObjC.Object): Unit = js.native
  
  /**
    * Dynamically generated language binding for any Objective-C block.
    *
    * Also supports implementing a block from scratch by passing in an
    * implementation.
    */
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
  @js.native
  class Object protected ()
    extends typings.fridaGum.ObjC.Object {
    def this(handle: typings.fridaGum.NativePointer) = this()
    def this(handle: typings.fridaGum.NativePointer, protocol: typings.fridaGum.ObjC.Protocol) = this()
  }
  
  /**
    * Dynamically generated language binding for any Objective-C protocol.
    */
  @js.native
  class Protocol protected ()
    extends typings.fridaGum.ObjC.Protocol {
    def this(handle: typings.fridaGum.NativePointer) = this()
  }
  
  /**
    * Direct access to a big portion of the Objective-C runtime API.
    */
  @js.native
  object api
    extends /* name */ StringDictionary[js.Any]
  
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
  @js.native
  object classes
    extends /* name */ StringDictionary[typings.fridaGum.ObjC.Object]
  
  /**
    * Dynamically generated bindings for each of the currently registered protocols.
    */
  @js.native
  object protocols
    extends /* name */ StringDictionary[typings.fridaGum.ObjC.Protocol]
}
