package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ObjC")
@js.native
object ^ extends js.Object {
  // tslint:disable:no-unnecessary-qualifier
  /**
    * Whether the current process has an Objective-C runtime loaded. Do not invoke any other ObjC properties or
    * methods unless this is the case.
    */
  val available: scala.Boolean = js.native
  /**
    * GCD queue of the main thread.
    */
  val mainQueue: fridaDashGumLib.NativePointer = js.native
  def bind(obj: fridaDashGumLib.NativePointer, data: InstanceData): scala.Unit = js.native
  /**
    * Binds some JavaScript data to an Objective-C instance.
    *
    * @param obj Objective-C instance to bind data to.
    * @param data Data to bind.
    */
  def bind(obj: Object, data: InstanceData): scala.Unit = js.native
  def choose(specifier: ChooseSpecifier, callbacks: fridaDashGumLib.EnumerateCallbacks[Object]): scala.Unit = js.native
  /**
    * Synchronous version of `choose()`.
    *
    * @param specifier What kind of objects to look for.
    */
  def chooseSync(specifier: ChooseSpecifier): js.Array[Object] = js.native
  /**
    * Enumerates loaded classes.
    *
    * @param callbacks Object with callbacks.
    */
  def enumerateLoadedClasses(callbacks: EnumerateLoadedClassesCallbacks): scala.Unit = js.native
  /**
    * Enumerates loaded classes.
    *
    * @param options Options customizing the enumeration.
    * @param callbacks Object with callbacks.
    */
  def enumerateLoadedClasses(options: EnumerateLoadedClassesOptions, callbacks: EnumerateLoadedClassesCallbacks): scala.Unit = js.native
  /**
    * Synchronous version of `enumerateLoadedClasses()`.
    *
    * @param options Options customizing the enumeration.
    */
  def enumerateLoadedClassesSync(): EnumerateLoadedClassesResult = js.native
  def enumerateLoadedClassesSync(options: EnumerateLoadedClassesOptions): EnumerateLoadedClassesResult = js.native
  def getBoundData(obj: fridaDashGumLib.NativePointer): js.Any = js.native
  /**
    * Looks up previously bound data from an Objective-C object.
    *
    * @param obj Objective-C instance to look up data for.
    */
  def getBoundData(obj: Object): js.Any = js.native
  /**
    * Creates a JavaScript implementation compatible with the signature of `method`, where `fn` is used as the
    * implementation. Returns a `NativeCallback` that you may assign to an ObjC method’s `implementation` property.
    *
    * @param method Method to implement.
    * @param fn Implementation.
    */
  def implement(method: ObjectMethod, fn: fridaDashGumLib.AnyFunction): fridaDashGumLib.NativeCallback = js.native
  /**
    * Creates a new Objective-C class.
    *
    * @param spec Class specification.
    */
  def registerClass(spec: ClassSpec): Object = js.native
  /**
    * Creates a new Objective-C protocol.
    *
    * @param spec Protocol specification.
    */
  def registerProtocol(spec: ProtocolSpec): Protocol = js.native
  /**
    * Creates a new class designed to act as a proxy for a target object.
    *
    * @param spec Proxy specification.
    */
  def registerProxy(spec: ProxySpec): ProxyConstructor = js.native
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
  def schedule(queue: fridaDashGumLib.NativePointerValue, work: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Converts the JavaScript string `name` to a selector.
    *
    * @param name Name to turn into a selector.
    */
  def selector(name: java.lang.String): fridaDashGumLib.NativePointer = js.native
  /**
    * Converts the selector `sel` to a JavaScript string.
    *
    * @param sel Selector to turn into a string.
    */
  def selectorAsString(sel: fridaDashGumLib.NativePointerValue): java.lang.String = js.native
  def unbind(obj: fridaDashGumLib.NativePointer): scala.Unit = js.native
  /**
    * Unbinds previously associated JavaScript data from an Objective-C instance.
    *
    * @param obj Objective-C instance to unbind data from.
    */
  def unbind(obj: Object): scala.Unit = js.native
}

