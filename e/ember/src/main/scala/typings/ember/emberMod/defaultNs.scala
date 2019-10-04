package typings.ember.emberMod

import org.scalablytyped.runtime.Instantiable0
import typings.atEmberApplication.deprecationsMod.DeprecationOptions
import typings.atEmberDebug.Anon_Id
import typings.atEmberDebug.Anon_IdString
import typings.atEmberDebug.Anon_IdStringOptional
import typings.atEmberObject.Anon_IdUntil
import typings.atEmberObject.dashPrivateTypesMod.ComputedPropertyCallback
import typings.atEmberObject.dashPrivateTypesMod.ObserverMethod
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetter
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertyGetters
import typings.atEmberObject.dashPrivateTypesMod.UnwrapComputedPropertySetters
import typings.atEmberObject.mixinMod.default
import typings.atEmberPolyfills.typesMod.Mix
import typings.atEmberPolyfills.typesMod.Mix3
import typings.atEmberPolyfills.typesMod.Mix4
import typings.atEmberRunloop.atEmberRunloopMod.RunNamespace
import typings.atEmberTemplate.dashPrivateHandlebarsMod.SafeString
import typings.atEmberUtils.dashPrivateTypesMod.FunctionArgs
import typings.atEmberUtils.dashPrivateTypesMod.TypeLookup
import typings.atEmberUtils.dashPrivateTypesMod.TypeOf
import typings.ember.TypeofClassEventTarget
import typings.ember.TypeofClassPromise
import typings.ember.emberNumbers.`false`
import typings.ember.emberNumbers.`true`
import typings.ember.emberStrings.undefined
import typings.jquery.JQueryStatic
import typings.rsvp.Anon_1
import typings.rsvp.Anon_10
import typings.rsvp.Anon_2
import typings.rsvp.Anon_3
import typings.rsvp.Anon_4
import typings.rsvp.Anon_5
import typings.rsvp.Anon_6
import typings.rsvp.Anon_7
import typings.rsvp.Anon_8
import typings.rsvp.Anon_9
import typings.rsvp.rsvpMod.RSVPNs.Arg
import typings.rsvp.rsvpMod.RSVPNs.Deferred
import typings.rsvp.rsvpMod.RSVPNs.Promise
import typings.rsvp.rsvpMod.RSVPNs.PromiseState
import typings.std.Event
import typings.std.Iterable
import typings.std.MethodDecorator
import typings.std.Pick
import typings.std.PropertyDescriptor
import typings.std.RegExp
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class Application ()
    extends typings.ember.emberMod.EmberNs.Application
  
  @js.native
  class ApplicationInstance ()
    extends typings.ember.emberMod.EmberNs.ApplicationInstance
  
  @js.native
  class ArrayProxy[T] ()
    extends typings.ember.emberMod.EmberNs.ArrayProxy[T]
  
  @js.native
  class Checkbox ()
    extends typings.ember.emberMod.EmberNs.Checkbox
  
  @js.native
  class Component ()
    extends typings.ember.emberMod.EmberNs.Component
  
  @js.native
  class ComputedProperty[Get, Set] ()
    extends typings.ember.emberMod.EmberNs.ComputedProperty[Get, Set]
  
  /**
    * A container used to instantiate and cache objects.
    */
  @js.native
  class Container ()
    extends typings.ember.emberMod.EmberNs.Container
  
  @js.native
  class ContainerDebugAdapter ()
    extends typings.ember.emberMod.EmberNs.ContainerDebugAdapter
  
  @js.native
  class Controller ()
    extends typings.ember.emberMod.EmberNs.Controller
  
  @js.native
  class CoreObject ()
    extends typings.ember.emberMod.EmberNs.CoreObject
  
  @js.native
  class DataAdapter ()
    extends typings.ember.emberMod.EmberNs.DataAdapter
  
  @js.native
  class DefaultResolver ()
    extends typings.ember.emberMod.EmberNs.DefaultResolver
  
  @js.native
  class Engine ()
    extends typings.ember.emberMod.EmberNs.Engine
  
  @js.native
  class EngineInstance ()
    extends typings.ember.emberMod.EmberNs.EngineInstance
  
  @js.native
  class EventDispatcher ()
    extends typings.ember.emberMod.EmberNs.EventDispatcher
  
  @js.native
  class HashLocation ()
    extends typings.ember.emberMod.EmberNs.HashLocation
  
  @js.native
  class Helper ()
    extends typings.ember.emberMod.EmberNs.Helper
  
  @js.native
  class HistoryLocation ()
    extends typings.ember.emberMod.EmberNs.HistoryLocation
  
  @js.native
  class LinkComponent ()
    extends typings.ember.emberMod.EmberNs.LinkComponent
  
  /**
    * A Map stores values indexed by keys. Unlike JavaScript's
    * default Objects, the keys of a Map can be any JavaScript
    * object.
    * @deprecated
    */
  @js.native
  class Map ()
    extends typings.ember.emberMod.EmberNs.Map
  
  /**
    * @deprecated
    */
  @js.native
  class MapWithDefault ()
    extends typings.ember.emberMod.EmberNs.MapWithDefault
  
  @js.native
  class Mixin[T, Base] ()
    extends typings.ember.emberMod.EmberNs.Mixin[T, Base]
  
  /**
    * A Namespace is an object usually used to contain other objects or methods
    * such as an application or framework. Create a namespace anytime you want
    * to define one of these new containers.
    */
  @js.native
  class Namespace ()
    extends typings.ember.emberMod.EmberNs.Namespace
  
  @js.native
  class NoneLocation ()
    extends typings.ember.emberMod.EmberNs.NoneLocation
  
  // TODO: replace with a proper ES6 reexport once we remove declare module 'ember' {}
  @js.native
  class Object ()
    extends typings.ember.emberMod.EmberNs.Object
  
  @js.native
  class ObjectProxy ()
    extends typings.ember.emberMod.EmberNs.ObjectProxy
  
  /**
    * This class is used internally by Ember and Ember Data.
    * Please do not use it at this time. We plan to clean it up
    * and add many tests soon.
    * @deprecated
    */
  @js.native
  class OrderedSet ()
    extends typings.ember.emberMod.EmberNs.OrderedSet
  
  @js.native
  class Registry ()
    extends typings.ember.emberMod.EmberNs.Registry
  
  @js.native
  class Resolver ()
    extends typings.ember.emberMod.EmberNs.Resolver
  
  @js.native
  class Route ()
    extends typings.ember.emberMod.EmberNs.Route
  
  @js.native
  class Router ()
    extends typings.ember.emberMod.EmberNs.Router
  
  @js.native
  class Service ()
    extends typings.ember.emberMod.EmberNs.Service
  
  @js.native
  class TextArea ()
    extends typings.ember.emberMod.EmberNs.TextArea
  
  @js.native
  class TextField ()
    extends typings.ember.emberMod.EmberNs.TextField
  
  /**
    * Alias for jQuery
    */
  @JSName("$")
  val $: JQueryStatic = js.native
  val ActionHandler: default[
    typings.atEmberObject.dashPrivateActionDashHandlerMod.ActionHandler, 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  val Array: default[
    typings.atEmberArray.atEmberArrayMod.Array[js.Any], 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  val Comparable: default[
    typings.ember.emberMod.EmberNs.Comparable, 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  val Enumerable: default[
    typings.atEmberArray.dashPrivateEnumerableMod.Enumerable[js.Any], 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  /**
    * A subclass of the JavaScript Error object for use in Ember.
    */
  val Error: Instantiable0[typings.atEmberError.atEmberErrorMod.default] = js.native
  val Evented: default[
    typings.atEmberObject.eventedMod.Evented, 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  val MutableArray: default[
    typings.atEmberArray.mutableMod.MutableArray[js.Any], 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  val MutableEnumerable: default[
    typings.atEmberArray.dashPrivateMutableDashEnumerableMod.MutableEnumerable[js.Any], 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  val NativeArray: default[
    typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray[js.Any], 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  val Observable: default[
    typings.atEmberObject.observableMod.Observable, 
    typings.atEmberObject.coreMod.default
  ] = js.native
  val PromiseProxyMixin: default[
    typings.atEmberObject.promiseDashProxyDashMixinMod.PromiseProxyMixin[js.Any], 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  /**
    * The semantic version
    */
  val VERSION: String = js.native
  val ViewTargetActionSupport: typings.ember.emberMod.EmberNs.Mixin[
    typings.ember.emberMod.EmberNs.ViewTargetActionSupport, 
    typings.atEmberObject.atEmberObjectMod.default
  ] = js.native
  val aliasMethod: js.Function1[
    /* methodName */ String, 
    typings.atEmberObject.computedMod.ComputedProperty[js.Any, js.Any]
  ] = js.native
  val compare: js.Function2[/* v */ js.Any, /* w */ js.Any, Double] = js.native
  val debug: js.Function1[/* message */ String, Unit] = js.native
  val deprecate: js.Function3[/* message */ String, /* test */ Boolean, /* options */ DeprecationOptions, js.Any] = js.native
  val expandProperties: js.Function2[/* pattern */ String, /* callback */ js.Function1[/* expanded */ String, Unit], Unit] = js.native
  val getOwner: js.Function1[/* object */ js.Any, js.Any] = js.native
  val guidFor: js.Function1[/* obj */ js.Any, String] = js.native
  val inspect: js.Function1[/* obj */ js.Any, String] = js.native
  val isArray: js.Function1[/* obj */ js.Any, /* is std.ArrayLike<any> */ Boolean] = js.native
  val isEqual: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  val notifyPropertyChange: js.Function2[/* obj */ js.Object, /* keyName */ String, Unit] = js.native
  val on: js.Function2[
    /* eventNames */ String, 
    /* func */ js.Function1[/* repeated */ js.Any, Unit], 
    js.Function1[/* repeated */ js.Any, Unit]
  ] = js.native
  val run: RunNamespace = js.native
  val runInDebug: js.Function1[/* func */ js.Function0[js.Any], Unit] = js.native
  val setOwner: js.Function2[/* object */ js.Any, /* owner */ js.Any, Unit] = js.native
  /**
    * This property indicates whether or not this application is currently in
    * testing mode. This is set when `setupForTesting` is called on the current
    * application.
    */
  val testing: Boolean = js.native
  val trySet: js.Function3[/* root */ js.Object, /* path */ String, /* value */ js.Any, js.Any] = js.native
  /**
    * `getEngineParent` retrieves an engine instance's parent instance.
    */
  def getEngineParent(engine: typings.ember.emberMod.EmberNs.EngineInstance): typings.ember.emberMod.EmberNs.EngineInstance = js.native
  /**
    * Polyfill for Object.keys
    * @deprecated Use Object.keys
    */
  def keys(o: js.Any): typings.ember.emberMod.EmberNs.Array[String] = js.native
  /**
    * A function may be assigned to `Ember.onerror` to be called when Ember
    * internals encounter an error. This is useful for specialized error handling
    * and reporting code.
    */
  def onerror(error: typings.std.Error): Unit = js.native
  @js.native
  object A extends js.Object {
    def apply[T](): typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray[T] = js.native
    def apply[T](arr: typings.atEmberArray.atEmberArrayMod.Array[T]): typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray[T] = js.native
  }
  
  @js.native
  object Debug extends js.Object {
    @JSName("registerDeprecationHandler")
    var registerDeprecationHandler_Original: js.Function1[
        /* handler */ js.Function3[/* message */ String, /* options */ Anon_Id, /* next */ js.Function0[Unit], Unit], 
        Unit
      ] = js.native
    @JSName("registerWarnHandler")
    var registerWarnHandler_Original: js.Function1[
        /* handler */ js.Function3[/* message */ String, /* options */ Anon_IdString, /* next */ js.Function0[Unit], Unit], 
        Unit
      ] = js.native
    def registerDeprecationHandler(
      handler: js.Function3[/* message */ String, /* options */ Anon_Id, /* next */ js.Function0[Unit], Unit]
    ): Unit = js.native
    def registerWarnHandler(
      handler: js.Function3[/* message */ String, /* options */ Anon_IdString, /* next */ js.Function0[Unit], Unit]
    ): Unit = js.native
  }
  
  @JSName("ENV")
  @js.native
  object ENVNs extends js.Object {
    val LOG_BINDINGS: Boolean = js.native
    val LOG_STACKTRACE_ON_DEPRECATION: Boolean = js.native
    val LOG_VERSION: Boolean = js.native
    val MODEL_FACTORY_INJECTIONS: Boolean = js.native
    val RAISE_ON_DEPRECATION: Boolean = js.native
    @js.native
    object EXTEND_PROTOTYPES extends js.Object {
      var Array: Boolean = js.native
      var Function: Boolean = js.native
      var String: Boolean = js.native
    }
    
  }
  
  @JSName("Handlebars")
  @js.native
  object HandlebarsNs extends js.Object {
    @js.native
    class Compiler ()
      extends typings.ember.emberMod.EmberNs.HandlebarsNs.Compiler
    
    @js.native
    class JavaScriptCompiler ()
      extends typings.ember.emberMod.EmberNs.HandlebarsNs.JavaScriptCompiler
    
    @js.native
    class SafeString ()
      extends typings.ember.emberMod.EmberNs.HandlebarsNs.SafeString
    
    def Exception(message: String): Unit = js.native
    def K(): js.Any = js.native
    def compile(environment: js.Any): js.Any = js.native
    def compile(environment: js.Any, options: js.Any): js.Any = js.native
    def compile(environment: js.Any, options: js.Any, context: js.Any): js.Any = js.native
    def compile(environment: js.Any, options: js.Any, context: js.Any, asObject: js.Any): js.Any = js.native
    def compile(string: String): js.Function1[/* repeated */ js.Any, _] = js.native
    def createFrame(objec: js.Any): js.Any = js.native
    def log(level: String, str: String): Unit = js.native
    def parse(string: String): js.Any = js.native
    def precompile(string: String, options: js.Any): Unit = js.native
    def print(ast: js.Any): Unit = js.native
    def registerHelper(name: String, helper: js.Any): Unit = js.native
    def registerPartial(name: String, str: js.Any): Unit = js.native
    @js.native
    object logger extends js.Object {
      /**
        * If the value passed into `Ember.Logger.assert` is not truthy it will throw an error with a stack trace.
        */
      def assert(test: Boolean): Unit = js.native
      def assert(test: Boolean, message: String): Unit = js.native
      /**
        * Logs the arguments to the console in blue text.
        */
      def debug(args: js.Any*): Unit = js.native
      /**
        * Prints the arguments to the console with an error icon, red text and a stack trace.
        */
      def error(args: js.Any*): Unit = js.native
      /**
        * Logs the arguments to the console.
        */
      def info(args: js.Any*): Unit = js.native
      /**
        * Logs the arguments to the console.
        */
      def log(args: js.Any*): Unit = js.native
      /**
        * Prints the arguments to the console with a warning icon.
        */
      def warn(args: js.Any*): Unit = js.native
    }
    
  }
  
  /**
    * Inside Ember-Metal, simply uses the methods from `imports.console`.
    * Override this to provide more robust logging functionality.
    */
  @js.native
  object Logger extends js.Object {
    /**
      * If the value passed into `Ember.Logger.assert` is not truthy it will throw an error with a stack trace.
      */
    def assert(test: Boolean): Unit = js.native
    def assert(test: Boolean, message: String): Unit = js.native
    /**
      * Logs the arguments to the console in blue text.
      */
    def debug(args: js.Any*): Unit = js.native
    /**
      * Prints the arguments to the console with an error icon, red text and a stack trace.
      */
    def error(args: js.Any*): Unit = js.native
    /**
      * Logs the arguments to the console.
      */
    def info(args: js.Any*): Unit = js.native
    /**
      * Logs the arguments to the console.
      */
    def log(args: js.Any*): Unit = js.native
    /**
      * Prints the arguments to the console with a warning icon.
      */
    def warn(args: js.Any*): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Map extends js.Object {
    def create(): typings.ember.emberMod.EmberNs.Map = js.native
  }
  
  /* static members */
  @js.native
  object MapWithDefault extends js.Object {
    def create(): typings.ember.emberMod.EmberNs.MapWithDefault = js.native
  }
  
  /* static members */
  @js.native
  object OrderedSet extends js.Object {
    def create(): typings.ember.emberMod.EmberNs.OrderedSet = js.native
  }
  
  // FYI - RSVP source comes from https://github.com/tildeio/rsvp.js/blob/master/lib/rsvp/promise.js
  @js.native
  object RSVP extends js.Object {
    var EventTarget: TypeofClassEventTarget = js.native
    var Promise: TypeofClassPromise = js.native
    val cast: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Promise.cast */ js.Any = js.native
    val off: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.off */ js.Any = js.native
    val on: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventTarget.on */ js.Any = js.native
    def all[T](values: js.Array[T | js.Thenable[T]]): js.Promise[js.Array[T]] = js.native
    def all[TAll](values: Iterable[TAll | js.Thenable[TAll]]): js.Promise[js.Array[TAll]] = js.native
    def all[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): js.Promise[js.Tuple2[T1, T2]] = js.native
    def all[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): js.Promise[js.Tuple3[T1, T2, T3]] = js.native
    def all[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
    ): js.Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def all[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5]
        ]
    ): js.Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def all[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6]
        ]
    ): js.Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7]
        ]
    ): js.Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8]
        ]
    ): js.Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9]
        ]
    ): js.Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9], 
          T10 | js.Thenable[T10]
        ]
    ): js.Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    def allSettled[T](entries: js.Array[Arg[T]]): Promise[js.Array[PromiseState[T]]] = js.native
    def allSettled[T](entries: js.Array[Arg[T]], label: String): Promise[js.Array[PromiseState[T]]] = js.native
    def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]]): Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
    def allSettled[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], label: String): Promise[js.Tuple2[PromiseState[T1], PromiseState[T2]]] = js.native
    def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]]): Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
    def allSettled[T1, T2, T3](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], label: String): Promise[js.Tuple3[PromiseState[T1], PromiseState[T2], PromiseState[T3]]] = js.native
    def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]]): Promise[
        js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
      ] = js.native
    def allSettled[T1, T2, T3, T4](entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]], label: String): Promise[
        js.Tuple4[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4]]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]]): Promise[
        js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5](entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]], label: String): Promise[
        js.Tuple5[PromiseState[T1], PromiseState[T2], PromiseState[T3], PromiseState[T4], PromiseState[T5]]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]]): Promise[
        js.Tuple6[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6](entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]], label: String): Promise[
        js.Tuple6[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]]): Promise[
        js.Tuple7[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7](entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]], label: String): Promise[
        js.Tuple7[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]]): Promise[
        js.Tuple8[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      label: String
    ): Promise[
        js.Tuple8[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]]
    ): Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      label: String
    ): Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]]
    ): Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ] = js.native
    def allSettled[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      label: String
    ): Promise[
        js.Tuple9[
          PromiseState[T1], 
          PromiseState[T2], 
          PromiseState[T3], 
          PromiseState[T4], 
          PromiseState[T5], 
          PromiseState[T6], 
          PromiseState[T7], 
          PromiseState[T8], 
          PromiseState[T9]
        ]
      ] = js.native
    def asap[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
    def async[T, U](callback: js.Function1[/* callbackArg */ T, U], arg: T): Unit = js.native
    def configure[T](name: String): T = js.native
    def configure[T](name: String, value: T): Unit = js.native
    def defer[T](): Deferred[T] = js.native
    def defer[T](label: String): Deferred[T] = js.native
    def denodeify[T, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A, Promise[T]] = js.native
    def denodeify[T, A, K1 /* <: String */](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
          Unit
        ],
      options: js.Array[K1]
    ): js.Function1[
        /* arg1 */ A, 
        Promise[
          /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ K in K1 ]: T}
      */ typings.ember.emberStrings.RSVP with js.Any
        ]
      ] = js.native
    def denodeify[T1, T2, A, K1 /* <: String */, K2 /* <: String */](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: js.Tuple2[K1, K2]
    ): js.Function1[/* arg1 */ A, Promise[typings.ember.emberStrings.RSVP with js.Any]] = js.native
    def denodeify[T1, T2, T3, A, K1 /* <: String */, K2 /* <: String */, K3 /* <: String */](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: js.Tuple3[K1, K2, K3]
    ): js.Function1[/* arg1 */ A, Promise[typings.ember.emberStrings.RSVP with js.Any]] = js.native
    @JSName("denodeify")
    def denodeify_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A, Promise[T1]] = js.native
    // ----- denodeify ----- //
    // Here be absurd things because we don't have variadic types. All of
    // this will go away if we can ever write this:
    //
    //     denodeify<...T, ...A>(
    //         nodeFunc: (...args: ...A, callback: (err: any, ...cbArgs: ...T) => any) => void,
    //         options?: false
    //     ): (...args: ...A) => RSVP.Promise<...T>
    // That day, however, may never come. So, in the meantime, we do this.
    @JSName("denodeify")
    def denodeify_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A, Promise[T1]] = js.native
    @JSName("denodeify")
    def denodeify_false[T, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
          Unit
        ],
      options: `false`
    ): js.Function1[/* arg1 */ A, Promise[T]] = js.native
    @JSName("denodeify")
    def denodeify_false_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: `false`
    ): js.Function1[/* arg1 */ A, Promise[T1]] = js.native
    @JSName("denodeify")
    def denodeify_false_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: `false`
    ): js.Function1[/* arg1 */ A, Promise[T1]] = js.native
    @JSName("denodeify")
    def denodeify_true[T, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function2[/* err */ js.Any, /* data */ T, Unit], 
          Unit
        ],
      options: `true`
    ): js.Function1[/* arg1 */ A, Promise[js.Array[T]]] = js.native
    @JSName("denodeify")
    def denodeify_true_T1T2A[T1, T2, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function3[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, Unit], 
          Unit
        ],
      options: `true`
    ): js.Function1[/* arg1 */ A, Promise[js.Tuple2[T1, T2]]] = js.native
    @JSName("denodeify")
    def denodeify_true_T1T2T3A[T1, T2, T3, A](
      nodeFunc: js.Function2[
          /* arg1 */ A, 
          /* callback */ js.Function4[/* err */ js.Any, /* data1 */ T1, /* data2 */ T2, /* data3 */ T3, Unit], 
          Unit
        ],
      options: `true`
    ): js.Function1[/* arg1 */ A, Promise[js.Tuple3[T1, T2, T3]]] = js.native
    def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean]): Promise[js.Array[T]] = js.native
    def filter[T](entries: js.Array[Arg[T]], filterFn: js.Function1[/* item */ T, Boolean], label: String): Promise[js.Array[T]] = js.native
    def filter[T1, T2](entries: js.Tuple2[Arg[T1], Arg[T2]], filterFn: js.Function1[/* item */ T1 | T2, Boolean]): Promise[js.Array[T1 | T2]] = js.native
    def filter[T1, T2](
      entries: js.Tuple2[Arg[T1], Arg[T2]],
      filterFn: js.Function1[/* item */ T1 | T2, Boolean],
      label: String
    ): Promise[js.Array[T1 | T2]] = js.native
    def filter[T1, T2, T3](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean]
    ): Promise[js.Array[T1 | T2 | T3]] = js.native
    def filter[T1, T2, T3](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3, Boolean],
      label: String
    ): Promise[js.Array[T1 | T2 | T3]] = js.native
    def filter[T1, T2, T3, T4](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean]
    ): Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
    def filter[T1, T2, T3, T4](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4, Boolean],
      label: String
    ): Promise[js.Array[T1 | T2 | T3 | T4]] = js.native
    def filter[T1, T2, T3, T4, T5](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean]
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
    def filter[T1, T2, T3, T4, T5](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, Boolean],
      label: String
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5]] = js.native
    def filter[T1, T2, T3, T4, T5, T6](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean]
    ): Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with Anon_6] = js.native
    def filter[T1, T2, T3, T4, T5, T6](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, Boolean],
      label: String
    ): Promise[(js.Array[T1 | T2 | T3 | T4 | T5 | T6]) with Anon_6] = js.native
    def filter[T1, T2, T3, T4, T5, T6, T7](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean]
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
    def filter[T1, T2, T3, T4, T5, T6, T7](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, Boolean],
      label: String
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7]] = js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean]
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, Boolean],
      label: String
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8]] = js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean]
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, Boolean],
      label: String
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9]] = js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean]
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
    def filter[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      filterFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, Boolean],
      label: String
    ): Promise[js.Array[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10]] = js.native
    // ----- hash and hashSettled ----- //
    def hash[T](
      `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
      */ typings.ember.emberStrings.RSVP with T
    ): Promise[T] = js.native
    def hash[T](
      `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
      */ typings.ember.emberStrings.RSVP with T,
      label: String
    ): Promise[T] = js.native
    def hashSettled[T](
      `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
      */ typings.ember.emberStrings.RSVP with T
    ): Promise[
        /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
      */ typings.ember.emberStrings.RSVP with T
      ] = js.native
    def hashSettled[T](
      `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
      */ typings.ember.emberStrings.RSVP with T,
      label: String
    ): Promise[
        /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof T ]: rsvp.rsvp.RSVP.PromiseState<T[P]>}
      */ typings.ember.emberStrings.RSVP with T
      ] = js.native
    def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U]): Promise[js.Array[U] with Anon_1] = js.native
    def map[T, U](entries: js.Array[Arg[T]], mapFn: js.Function1[/* item */ T, U], label: String): Promise[js.Array[U] with Anon_1] = js.native
    def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U]): Promise[js.Array[U] with Anon_2] = js.native
    def map[T1, T2, U](entries: js.Tuple2[Arg[T1], Arg[T2]], mapFn: js.Function1[/* item */ T1 | T2, U], label: String): Promise[js.Array[U] with Anon_2] = js.native
    def map[T1, T2, T3, U](entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]], mapFn: js.Function1[/* item */ T1 | T2 | T3, U]): Promise[js.Array[U] with Anon_3] = js.native
    def map[T1, T2, T3, U](
      entries: js.Tuple3[Arg[T1], Arg[T2], Arg[T3]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3, U],
      label: String
    ): Promise[js.Array[U] with Anon_3] = js.native
    def map[T1, T2, T3, T4, U](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U]
    ): Promise[js.Array[U] with Anon_4] = js.native
    def map[T1, T2, T3, T4, U](
      entries: js.Tuple4[Arg[T1], Arg[T2], Arg[T3], Arg[T4]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4, U],
      label: String
    ): Promise[js.Array[U] with Anon_4] = js.native
    def map[T1, T2, T3, T4, T5, U](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U]
    ): Promise[js.Array[U] with Anon_5] = js.native
    def map[T1, T2, T3, T4, T5, U](
      entries: js.Tuple5[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5, U],
      label: String
    ): Promise[js.Array[U] with Anon_5] = js.native
    def map[T1, T2, T3, T4, T5, T6, U](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U]
    ): Promise[js.Array[U] with Anon_6] = js.native
    def map[T1, T2, T3, T4, T5, T6, U](
      entries: js.Tuple6[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6, U],
      label: String
    ): Promise[js.Array[U] with Anon_6] = js.native
    def map[T1, T2, T3, T4, T5, T6, T7, U](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U]
    ): Promise[js.Array[U] with Anon_7] = js.native
    def map[T1, T2, T3, T4, T5, T6, T7, U](
      entries: js.Tuple7[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7, U],
      label: String
    ): Promise[js.Array[U] with Anon_7] = js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U]
    ): Promise[js.Array[U] with Anon_8] = js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, U](
      entries: js.Tuple8[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8, U],
      label: String
    ): Promise[js.Array[U] with Anon_8] = js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U]
    ): Promise[js.Array[U] with Anon_9] = js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, U](
      entries: js.Tuple9[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9, U],
      label: String
    ): Promise[js.Array[U] with Anon_9] = js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U]
    ): Promise[js.Array[U] with Anon_10] = js.native
    def map[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U](
      entries: js.Tuple10[Arg[T1], Arg[T2], Arg[T3], Arg[T4], Arg[T5], Arg[T6], Arg[T7], Arg[T8], Arg[T9], Arg[T10]],
      mapFn: js.Function1[/* item */ T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10, U],
      label: String
    ): Promise[js.Array[U] with Anon_10] = js.native
    def race[T](values: js.Array[T]): js.Promise[T] = js.native
    def race[T](values: Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
    def reject[T](): js.Promise[T] = js.native
    def reject[T](reason: js.Any): js.Promise[T] = js.native
    def resolve(): js.Promise[Unit] = js.native
    def resolve[T](value: T): js.Promise[T] = js.native
    def resolve[T](value: js.Thenable[T]): js.Promise[T] = js.native
    def rethrow(reason: js.Any): Unit = js.native
  }
  
  @JSName("String")
  @js.native
  object StringNs extends js.Object {
    val camelize: js.Function1[/* str */ String, String] = js.native
    val capitalize: js.Function1[/* str */ String, String] = js.native
    val classify: js.Function1[/* str */ String, String] = js.native
    val dasherize: js.Function1[/* str */ String, String] = js.native
    val decamelize: js.Function1[/* str */ String, String] = js.native
    val htmlSafe: js.Function1[/* str */ String, SafeString] = js.native
    val isHTMLSafe: js.Function1[
        /* str */ js.Any, 
        /* is @ember/template.@ember/template/-private/handlebars.SafeString */ Boolean
      ] = js.native
    val underscore: js.Function1[/* str */ String, String] = js.native
    val w: js.Function1[/* str */ String, js.Array[String]] = js.native
    def fmt(args: String*): String = js.native
    @js.native
    object loc extends js.Object {
      def apply(template: String): String = js.native
      def apply(template: String, args: js.Array[String]): String = js.native
    }
    
  }
  
  /**
    * This is a container for an assortment of testing related functionality
    */
  @JSName("Test")
  @js.native
  object TestNs extends js.Object {
    @js.native
    class Adapter ()
      extends typings.ember.emberMod.EmberNs.TestNs.Adapter
    
    @js.native
    class Promise[T] protected ()
      extends typings.ember.emberMod.EmberNs.TestNs.Promise[T] {
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    
    /**
      * This class implements the methods defined by Ember.Test.Adapter for the
      * QUnit testing framework.
      */
    @js.native
    class QUnitAdapter ()
      extends typings.ember.emberMod.EmberNs.TestNs.QUnitAdapter
    
    /**
      * Used to allow ember-testing to communicate with a specific testing
      * framework.
      */
    val adapter: typings.atEmberTest.adapterMod.default = js.native
    val registerAsyncHelper: js.Function2[
        /* name */ String, 
        /* helperMethod */ js.Function2[
          /* app */ typings.atEmberApplication.atEmberApplicationMod.default, 
          /* repeated */ js.Any, 
          js.Any
        ], 
        Unit
      ] = js.native
    val unregisterHelper: js.Function1[/* name */ String, Unit] = js.native
    /**
      * Iterates through each registered test waiter, and invokes
      * its callback. If any waiter returns false, this method will return
      * true indicating that the waiters have not settled yet.
      */
    def checkWaiters(): Boolean = js.native
    /**
      * Used to register callbacks to be fired whenever `App.injectTestHelpers`
      * is called.
      */
    def onInjectHelpers(callback: js.Function1[/* app */ typings.ember.emberMod.EmberNs.Application, Unit]): Unit = js.native
    /**
      * This returns a thenable tailored for testing.  It catches failed
      * `onSuccess` callbacks and invokes the `Ember.Test.adapter.exception`
      * callback in the last chained then.
      */
    def promise[T](
      resolver: js.Function2[
          /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): typings.ember.emberMod.EmberNs.TestNs.Promise[T] = js.native
    def promise[T](
      resolver: js.Function2[
          /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
          Unit
        ],
      label: String
    ): typings.ember.emberMod.EmberNs.TestNs.Promise[T] = js.native
    /**
      * Replacement for `Ember.RSVP.resolve`
      * The only difference is this uses
      * an instance of `Ember.Test.Promise`
      */
    def resolve[T](): typings.ember.emberMod.EmberNs.TestNs.Promise[T] = js.native
    def resolve[T](value: T): typings.ember.emberMod.EmberNs.TestNs.Promise[T] = js.native
    def resolve[T](value: T, label: String): typings.ember.emberMod.EmberNs.TestNs.Promise[T] = js.native
    def resolve[T](value: js.Thenable[T]): typings.ember.emberMod.EmberNs.TestNs.Promise[T] = js.native
    def resolve[T](value: js.Thenable[T], label: String): typings.ember.emberMod.EmberNs.TestNs.Promise[T] = js.native
    @js.native
    object registerHelper extends js.Object {
      def apply(
        name: String,
        helperMethod: js.Function2[
              /* app */ typings.atEmberApplication.atEmberApplicationMod.default, 
              /* repeated */ js.Any, 
              _
            ]
      ): js.Any = js.native
      def apply(
        name: String,
        helperMethod: js.Function2[
              /* app */ typings.atEmberApplication.atEmberApplicationMod.default, 
              /* repeated */ js.Any, 
              _
            ],
        options: js.Object
      ): js.Any = js.native
    }
    
    @js.native
    object registerWaiter extends js.Object {
      def apply(callback: js.Function0[Boolean]): js.Any = js.native
      def apply[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
    }
    
    @js.native
    object unregisterWaiter extends js.Object {
      def apply(callback: js.Function0[Boolean]): js.Any = js.native
      def apply[Context](context: Context, callback: js.ThisFunction0[/* this */ Context, Boolean]): js.Any = js.native
    }
    
  }
  
  @js.native
  object ViewUtils extends js.Object {
    def isSimpleClick(event: Event): Boolean = js.native
  }
  
  @js.native
  object addListener extends js.Object {
    def apply[Context](obj: Context, key: String, method: ObserverMethod[Context, Context]): Unit = js.native
    def apply[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context]): Unit = js.native
    def apply[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context], once: Boolean): Unit = js.native
  }
  
  @js.native
  object addObserver extends js.Object {
    def apply[Context](obj: Context, key: String, method: ObserverMethod[Context, Context]): Unit = js.native
    def apply[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context]): Unit = js.native
  }
  
  @js.native
  object assert extends js.Object {
    def apply(desc: String): Unit | scala.Nothing = js.native
    def apply(desc: String, test: Boolean): Unit | scala.Nothing = js.native
  }
  
  // TODO: replace with an es6 reexport when declare module 'ember' is removed
  /**
    * Copy properties from a source object to a target object.
    */
  @js.native
  object assign extends js.Object {
    def apply(target: js.Object): scala.Nothing = js.native
    def apply(target: js.Object, sources: js.Object*): js.Any = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): Mix[T, U] = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): Mix3[T, U, V] = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): Mix4[T, U, V, W] = js.native
  }
  
  @js.native
  object cacheFor extends js.Object {
    def apply[T, K /* <: String */](obj: T, key: K): js.UndefOr[
        UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
      ] = js.native
  }
  
  @js.native
  object computed extends js.Object {
    def apply(deps: String*): MethodDecorator = js.native
    def apply(k1: String, k2: String, k3: String, k4: String, k5: String, k6: String, k7: String, rest: js.Any*): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
    def apply[T](cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
    def apply[T](k1: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
    def apply[T](k1: String, k2: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
    def apply[T](k1: String, k2: String, k3: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
    def apply[T](k1: String, k2: String, k3: String, k4: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
    def apply[T](k1: String, k2: String, k3: String, k4: String, k5: String, cb: ComputedPropertyCallback[T]): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
    def apply[T](
      k1: String,
      k2: String,
      k3: String,
      k4: String,
      k5: String,
      k6: String,
      cb: ComputedPropertyCallback[T]
    ): typings.atEmberObject.computedMod.ComputedProperty[T, T] = js.native
    def alias(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
    def and(dependentKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def bool(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def collect(dependentKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def deprecatingAlias(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
    def deprecatingAlias(dependentKey: String, options: typings.atEmberObject.Anon_Id): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
    def deprecatingAlias(dependentKey: String, options: Anon_IdUntil): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
    def empty(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def equal(dependentKey: String, value: js.Any): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def filter(
      dependentKey: String,
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], Boolean]
    ): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def filterBy(dependentKey: String, propertyKey: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def filterBy(dependentKey: String, propertyKey: String, value: js.Any): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def gt(dependentKey: String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def gte(dependentKey: String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def intersect(propertyKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def lt(dependentKey: String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def lte(dependentKey: String, value: Double): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def map[U](
      dependentKey: String,
      callback: js.Function3[/* value */ js.Any, /* index */ Double, /* array */ js.Array[_], U]
    ): typings.atEmberObject.computedMod.ComputedProperty[js.Array[U], js.Array[U]] = js.native
    def mapBy(dependentKey: String, propertyKey: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def `match`(dependentKey: String, regexp: RegExp): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def max(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
    def min(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
    def none(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def not(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def notEmpty(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def oneWay(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
    def or(dependentKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[Boolean, Boolean] = js.native
    def readOnly(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
    def reads(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[_, _] = js.native
    def setDiff(setAProperty: String, setBProperty: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def sort(itemsKey: String, sortDefinition: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def sort(itemsKey: String, sortDefinition: js.Function2[/* itemA */ js.Any, /* itemB */ js.Any, Double]): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def sum(dependentKey: String): typings.atEmberObject.computedMod.ComputedProperty[Double, Double] = js.native
    def union(propertyKeys: String*): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def uniq(propertyKey: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
    def uniqBy(dependentKey: String, propertyKey: String): typings.atEmberObject.computedMod.ComputedProperty[js.Array[_], js.Array[_]] = js.native
  }
  
  /**
    * Creates a shallow copy of the passed object. A deep copy of the object is
    * returned if the optional `deep` argument is `true`.
    */
  @js.native
  object copy extends js.Object {
    def apply(obj: js.Any): js.Any = js.native
    def apply(obj: js.Any, deep: Boolean): js.Any = js.native
    def apply[T](obj: T, deep: `true`): T = js.native
  }
  
  @js.native
  object defineProperty extends js.Object {
    def apply(obj: js.Object, keyName: String): Unit = js.native
    def apply(obj: js.Object, keyName: String, desc: typings.atEmberObject.computedMod.ComputedProperty[_, _]): Unit = js.native
    def apply(
      obj: js.Object,
      keyName: String,
      desc: typings.atEmberObject.computedMod.ComputedProperty[_, _],
      data: js.Any
    ): Unit = js.native
    def apply(
      obj: js.Object,
      keyName: String,
      desc: typings.atEmberObject.computedMod.ComputedProperty[_, _],
      data: js.Any,
      meta: js.Any
    ): Unit = js.native
    def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor): Unit = js.native
    def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any): Unit = js.native
    def apply(obj: js.Object, keyName: String, desc: PropertyDescriptor, data: js.Any, meta: js.Any): Unit = js.native
  }
  
  @js.native
  object deprecateFunc extends js.Object {
    def apply[Func /* <: js.Function1[/* repeated */ js.Any, _] */](message: String, options: DeprecationOptions, func: Func): Func = js.native
  }
  
  @js.native
  object get extends js.Object {
    def apply[T, K /* <: String */](obj: T, key: K): UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  }
  
  @js.native
  object getProperties extends js.Object {
    def apply[T, K /* <: String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
    def apply[T, K /* <: String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  }
  
  @js.native
  object getWithDefault extends js.Object {
    def apply[T, K /* <: String */](
      obj: T,
      key: K,
      defaultValue: UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
    ): UnwrapComputedPropertyGetter[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  }
  
  /**
    * Namespace for injection helper methods.
    */
  @JSName("inject")
  @js.native
  object injectNs extends js.Object {
    /**
      * Creates a property that lazily looks up another controller in the container.
      * Can only be used when defining another controller.
      */
    def controller(): typings.ember.emberMod.EmberNs.ComputedProperty[
        typings.ember.emberMod.EmberNs.Controller, 
        typings.ember.emberMod.EmberNs.Controller
      ] = js.native
    def controller[K /* <: String */](name: K): typings.ember.emberMod.EmberNs.ComputedProperty[
        /* import warning: ImportType.apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any, 
        /* import warning: ImportType.apply Failed type conversion: @ember/controller.@ember/controller.Registry[K] */ js.Any
      ] = js.native
    @js.native
    object service extends js.Object {
      def apply(): typings.atEmberObject.computedMod.ComputedProperty[
            typings.atEmberService.atEmberServiceMod.Service, 
            typings.atEmberService.atEmberServiceMod.Service
          ] = js.native
      def apply(target: js.Object, propertyKey: String): Unit = js.native
      def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
      def apply[K /* <: String */](name: K): typings.atEmberObject.computedMod.ComputedProperty[
            /* import warning: ImportType.apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any, 
            /* import warning: ImportType.apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any
          ] = js.native
    }
    
  }
  
  @js.native
  object isBlank extends js.Object {
    def apply(): Boolean = js.native
    def apply(obj: js.Any): Boolean = js.native
  }
  
  @js.native
  object isEmpty extends js.Object {
    def apply(): Boolean = js.native
    def apply(obj: js.Any): Boolean = js.native
  }
  
  @js.native
  object isNone extends js.Object {
    def apply(): Boolean = js.native
    def apply(obj: js.Any): Boolean = js.native
  }
  
  @js.native
  object isPresent extends js.Object {
    def apply(): Boolean = js.native
    def apply(obj: js.Any): Boolean = js.native
  }
  
  @js.native
  object merge extends js.Object {
    def apply[T /* <: js.Object */, U /* <: js.Object */](original: T, updates: U): Mix[T, U] = js.native
  }
  
  @js.native
  object observer extends js.Object {
    def apply[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, func: Fn): Fn = js.native
    def apply[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, func: Fn): Fn = js.native
    def apply[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, func: Fn): Fn = js.native
    def apply[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, key4: String, func: Fn): Fn = js.native
    def apply[Fn /* <: js.Function2[/* target */ js.Any, /* key */ String, Unit] */](key1: String, key2: String, key3: String, key4: String, key5: String, func: Fn): Fn = js.native
  }
  
  @js.native
  object platform extends js.Object {
    var defineProperty: Boolean = js.native
    var hasPropertyAccessors: Boolean = js.native
  }
  
  @js.native
  object removeListener extends js.Object {
    def apply[Context](obj: Context, key: String, method: ObserverMethod[Context, Context]): js.Any = js.native
    def apply[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context]): js.Any = js.native
  }
  
  @js.native
  object removeObserver extends js.Object {
    def apply[Context](obj: Context, key: String, method: ObserverMethod[Context, Context]): js.Any = js.native
    def apply[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context]): js.Any = js.native
  }
  
  @js.native
  object sendEvent extends js.Object {
    def apply(obj: js.Any, eventName: String): Boolean = js.native
    def apply(obj: js.Any, eventName: String, params: js.Array[_]): Boolean = js.native
    def apply(obj: js.Any, eventName: String, params: js.Array[_], actions: js.Array[_]): Boolean = js.native
  }
  
  @js.native
  object set extends js.Object {
    def apply[T, K /* <: String */](obj: T, key: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
  }
  
  @js.native
  object setProperties extends js.Object {
    def apply[T, K /* <: String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[T, K] = js.native
  }
  
  @js.native
  object tryInvoke extends js.Object {
    def apply(obj: js.Object, methodName: String): js.UndefOr[scala.Nothing] = js.native
    def apply(obj: js.Object, methodName: String, args: js.Array[_]): js.UndefOr[scala.Nothing] = js.native
    def apply[FNAME /* <: String */, T /* <: js.Object */](obj: T, methodName: FNAME): js.UndefOr[
        ReturnType[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
      ] = js.native
    def apply[FNAME /* <: String */, T /* <: js.Object */](
      obj: T,
      methodName: FNAME,
      args: FunctionArgs[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
    ): js.UndefOr[
        ReturnType[/* import warning: ImportType.apply Failed type conversion: T[FNAME] */ js.Any]
      ] = js.native
  }
  
  @js.native
  object typeOf extends js.Object {
    def apply(): undefined = js.native
    def apply(item: js.Any): String = js.native
    def apply[T](value: T): TypeOf[TypeLookup, T] = js.native
  }
  
  @js.native
  object warn extends js.Object {
    def apply(message: String): Unit = js.native
    def apply(message: String, options: Anon_IdString): Unit = js.native
    def apply(message: String, options: Anon_IdStringOptional): Unit = js.native
    def apply(message: String, test: Boolean): Unit = js.native
    def apply(message: String, test: Boolean, options: Anon_IdString): Unit = js.native
    def apply(message: String, test: Boolean, options: Anon_IdStringOptional): Unit = js.native
  }
  
}

