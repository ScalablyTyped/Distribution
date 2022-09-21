package typings.firebaseAuth

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAuth.anon.Typeofgapi
import typings.firebaseAuth.firebaseAuthStrings.DOMContentLoaded
import typings.firebaseAuth.nodeEsmSrcPlatformBrowserRecaptchaRecaptchaMod.Recaptcha
import typings.std.AnimationEvent
import typings.std.BarProp
import typings.std.BeforeUnloadEvent
import typings.std.CSSStyleDeclaration
import typings.std.CacheStorage
import typings.std.Crypto
import typings.std.CustomElementRegistry
import typings.std.DeviceMotionEvent
import typings.std.DeviceOrientationEvent
import typings.std.Document
import typings.std.DragEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.External
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.FrameRequestCallback
import typings.std.GamepadEvent
import typings.std.HashChangeEvent
import typings.std.History
import typings.std.IDBFactory
import typings.std.IdleRequestCallback
import typings.std.ImageBitmap
import typings.std.ImageBitmapSource
import typings.std.KeyboardEvent
import typings.std.Location
import typings.std.MediaQueryList
import typings.std.MessageEvent
import typings.std.MouseEvent
import typings.std.Navigator
import typings.std.OnErrorEventHandler
import typings.std.PageTransitionEvent
import typings.std.Performance
import typings.std.PointerEvent
import typings.std.PopStateEvent
import typings.std.ProgressEvent
import typings.std.PromiseRejectionEvent
import typings.std.Record
import typings.std.RequestInfo
import typings.std.Response
import typings.std.Screen
import typings.std.SecurityPolicyViolationEvent
import typings.std.Selection
import typings.std.SpeechSynthesis
import typings.std.Storage
import typings.std.StorageEvent
import typings.std.SubmitEvent
import typings.std.TimerHandler
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.VisualViewport
import typings.std.VoidFunction
import typings.std.WheelEvent
import typings.std.Window
import typings.std.WindowProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEsmSrcPlatformBrowserAuthWindowMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/auth_window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setWindowLocation(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setWindowLocation")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def window(): AuthWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("_window")().asInstanceOf[AuthWindow]
  
  /* Inlined {  grecaptcha :@firebase/auth.@firebase/auth/dist/node-esm/src/platform_browser/recaptcha/recaptcha.Recaptcha | undefined,   ___jsl :std.Record<string, any> | undefined,   gapi :{readonly load (features : 'gapi.iframes', options : @firebase/auth.gapi.LoadOptions | @firebase/auth.gapi.LoadCallback | undefined): void,  readonly iframes :{  Context :new (): @firebase/auth.gapi.iframes.Context,   Iframe :new (): @firebase/auth.gapi.iframes.Iframe,  readonly CROSS_ORIGIN_IFRAMES_FILTER :@firebase/auth.gapi.iframes.IframesFilter, readonly getContext (): @firebase/auth.gapi.iframes.Context}} | undefined, [callback: string] : (args : ...unknown): void} & {[ T in keyof std.Window ]: std.Window[T]} */
  trait AuthWindow
    extends StObject
       with /* callback */ StringDictionary[js.Function1[/* repeated */ Any, Unit]] {
    
    var ___jsl: js.UndefOr[Record[String, Any]] = js.undefined
    
    @JSName("addEventListener")
    def addEventListener_DOMContentLoaded(`type`: DOMContentLoaded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
    @JSName("addEventListener")
    var addEventListener_Original: js.Function2[
        DOMContentLoaded, 
        /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
        Unit
      ]
    
    def alert(): Unit
    @JSName("alert")
    var alert_Original: js.Function0[Unit]
    
    def atob(data: String): String
    @JSName("atob")
    var atob_Original: js.Function1[/* data */ String, String]
    
    def blur(): Unit
    @JSName("blur")
    var blur_Original: js.Function0[Unit]
    
    def btoa(data: String): String
    @JSName("btoa")
    var btoa_Original: js.Function1[/* data */ String, String]
    
    var caches: CacheStorage
    
    def cancelAnimationFrame(handle: Double): Unit
    @JSName("cancelAnimationFrame")
    var cancelAnimationFrame_Original: js.Function1[/* handle */ Double, Unit]
    
    def cancelIdleCallback(handle: Double): Unit
    @JSName("cancelIdleCallback")
    var cancelIdleCallback_Original: js.Function1[/* handle */ Double, Unit]
    
    def captureEvents(): Unit
    @JSName("captureEvents")
    var captureEvents_Original: js.Function0[Unit]
    
    def clearInterval(): Unit
    @JSName("clearInterval")
    var clearInterval_Original: js.Function0[Unit]
    
    def clearTimeout(): Unit
    @JSName("clearTimeout")
    var clearTimeout_Original: js.Function0[Unit]
    
    var clientInformation: Navigator
    
    def close(): Unit
    @JSName("close")
    var close_Original: js.Function0[Unit]
    
    var closed: Boolean
    
    def confirm(): Boolean
    @JSName("confirm")
    var confirm_Original: js.Function0[Boolean]
    
    def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap]
    @JSName("createImageBitmap")
    var createImageBitmap_Original: js.Function1[/* image */ ImageBitmapSource, js.Promise[ImageBitmap]]
    
    var crossOriginIsolated: Boolean
    
    var crypto: Crypto
    
    var customElements: CustomElementRegistry
    
    var devicePixelRatio: Double
    
    def dispatchEvent(event: Event): Boolean
    @JSName("dispatchEvent")
    var dispatchEvent_Original: js.Function1[/* event */ Event, Boolean]
    
    var document: Document
    
    var event: js.UndefOr[Event] = js.undefined
    
    var external: External
    
    def fetch(input: RequestInfo): js.Promise[Response]
    @JSName("fetch")
    var fetch_Original: js.Function1[/* input */ RequestInfo, js.Promise[Response]]
    
    def focus(): Unit
    @JSName("focus")
    var focus_Original: js.Function0[Unit]
    
    var frameElement: js.UndefOr[Element | Null] = js.undefined
    
    var frames: WindowProxy
    
    var gapi: js.UndefOr[Typeofgapi] = js.undefined
    
    def getComputedStyle(elt: Element): CSSStyleDeclaration
    @JSName("getComputedStyle")
    var getComputedStyle_Original: js.Function1[/* elt */ Element, CSSStyleDeclaration]
    
    def getSelection(): Selection | Null
    @JSName("getSelection")
    var getSelection_Original: js.Function0[Selection | Null]
    
    var grecaptcha: js.UndefOr[Recaptcha] = js.undefined
    
    var history: History
    
    var indexedDB: IDBFactory
    
    var innerHeight: Double
    
    var innerWidth: Double
    
    var isSecureContext: Boolean
    
    var length: Double
    
    var localStorage: Storage
    
    def location(): Location
    @JSName("location")
    var location_Original: js.Function0[Location]
    
    var locationbar: BarProp
    
    def matchMedia(query: String): MediaQueryList
    @JSName("matchMedia")
    var matchMedia_Original: js.Function1[/* query */ String, MediaQueryList]
    
    var menubar: BarProp
    
    def moveBy(x: Double, y: Double): Unit
    @JSName("moveBy")
    var moveBy_Original: js.Function2[/* x */ Double, /* y */ Double, Unit]
    
    def moveTo(x: Double, y: Double): Unit
    @JSName("moveTo")
    var moveTo_Original: js.Function2[/* x */ Double, /* y */ Double, Unit]
    
    var name: String
    
    var navigator: Navigator
    
    var onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]) | Null] = js.undefined
    
    var onafterprint: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]) | Null] = js.undefined
    
    var onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onbeforeprint: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onbeforeunload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, Any]) | Null] = js.undefined
    
    var onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]) | Null] = js.undefined
    
    var oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var ondevicemotion: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, Any]) | Null] = js.undefined
    
    var ondeviceorientation: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, Any]) | Null
      ] = js.undefined
    
    var ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]) | Null] = js.undefined
    
    var ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onerror: OnErrorEventHandler
    
    var onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]) | Null] = js.undefined
    
    var onformdata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]) | Null] = js.undefined
    
    var ongamepadconnected: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, Any]) | Null] = js.undefined
    
    var ongamepaddisconnected: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, Any]) | Null] = js.undefined
    
    var ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onhashchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, Any]) | Null] = js.undefined
    
    var oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]) | Null] = js.undefined
    
    var onlanguagechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onmessage: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null] = js.undefined
    
    var onmessageerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null] = js.undefined
    
    var onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]) | Null] = js.undefined
    
    var onoffline: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ononline: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onorientationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onpagehide: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, Any]) | Null
      ] = js.undefined
    
    var onpageshow: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, Any]) | Null
      ] = js.undefined
    
    var onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]) | Null] = js.undefined
    
    var onpopstate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, Any]) | Null] = js.undefined
    
    var onprogress: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]) | Null
      ] = js.undefined
    
    var onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onrejectionhandled: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, Any]) | Null
      ] = js.undefined
    
    var onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]) | Null] = js.undefined
    
    var onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onsecuritypolicyviolation: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]) | Null
      ] = js.undefined
    
    var onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onslotchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onstorage: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, Any]) | Null] = js.undefined
    
    var onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]) | Null] = js.undefined
    
    var onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]) | Null] = js.undefined
    
    var ontransitioncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionrun: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var ontransitionstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]) | Null] = js.undefined
    
    var onunhandledrejection: js.UndefOr[
        (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, Any]) | Null
      ] = js.undefined
    
    var onunload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkitanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwebkittransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null] = js.undefined
    
    var onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]) | Null] = js.undefined
    
    def open(): WindowProxy | Null
    @JSName("open")
    var open_Original: js.Function0[WindowProxy | Null]
    
    var opener: Any
    
    var orientation: Double
    
    var origin: String
    
    var outerHeight: Double
    
    var outerWidth: Double
    
    var pageXOffset: Double
    
    var pageYOffset: Double
    
    var parent: WindowProxy
    
    var performance: Performance
    
    var personalbar: BarProp
    
    def postMessage(message: Any, targetOrigin: String): Unit
    @JSName("postMessage")
    var postMessage_Original: js.Function2[/* message */ Any, /* targetOrigin */ String, Unit]
    
    def print(): Unit
    @JSName("print")
    var print_Original: js.Function0[Unit]
    
    def prompt(): String | Null
    @JSName("prompt")
    var prompt_Original: js.Function0[String | Null]
    
    def queueMicrotask(callback: VoidFunction): Unit
    @JSName("queueMicrotask")
    var queueMicrotask_Original: js.Function1[/* callback */ VoidFunction, Unit]
    
    def releaseEvents(): Unit
    @JSName("releaseEvents")
    var releaseEvents_Original: js.Function0[Unit]
    
    @JSName("removeEventListener")
    def removeEventListener_DOMContentLoaded(`type`: DOMContentLoaded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit
    @JSName("removeEventListener")
    var removeEventListener_Original: js.Function2[
        DOMContentLoaded, 
        /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any], 
        Unit
      ]
    
    def reportError(e: Any): Unit
    @JSName("reportError")
    var reportError_Original: js.Function1[/* e */ Any, Unit]
    
    def requestAnimationFrame(callback: FrameRequestCallback): Double
    @JSName("requestAnimationFrame")
    var requestAnimationFrame_Original: js.Function1[/* callback */ FrameRequestCallback, Double]
    
    def requestIdleCallback(callback: IdleRequestCallback): Double
    @JSName("requestIdleCallback")
    var requestIdleCallback_Original: js.Function1[/* callback */ IdleRequestCallback, Double]
    
    def resizeBy(x: Double, y: Double): Unit
    @JSName("resizeBy")
    var resizeBy_Original: js.Function2[/* x */ Double, /* y */ Double, Unit]
    
    def resizeTo(width: Double, height: Double): Unit
    @JSName("resizeTo")
    var resizeTo_Original: js.Function2[/* width */ Double, /* height */ Double, Unit]
    
    var screen: Screen
    
    var screenLeft: Double
    
    var screenTop: Double
    
    var screenX: Double
    
    var screenY: Double
    
    def scroll(): Unit
    
    def scrollBy(): Unit
    @JSName("scrollBy")
    var scrollBy_Original: js.Function0[Unit]
    
    def scrollTo(): Unit
    @JSName("scrollTo")
    var scrollTo_Original: js.Function0[Unit]
    
    var scrollX: Double
    
    var scrollY: Double
    
    @JSName("scroll")
    var scroll_Original: js.Function0[Unit]
    
    var scrollbars: BarProp
    
    var self: Window & (/* globalThis */ Any)
    
    var sessionStorage: Storage
    
    def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double
    @JSName("setInterval")
    var setInterval_Original: js.Function3[/* handler */ TimerHandler, /* timeout */ Double, /* repeated */ Any, Double]
    
    def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double
    @JSName("setTimeout")
    var setTimeout_Original: js.Function3[/* handler */ TimerHandler, /* timeout */ Double, /* repeated */ Any, Double]
    
    var speechSynthesis: SpeechSynthesis
    
    var status: String
    
    var statusbar: BarProp
    
    def stop(): Unit
    @JSName("stop")
    var stop_Original: js.Function0[Unit]
    
    def structuredClone(value: Any): Any
    @JSName("structuredClone")
    var structuredClone_Original: js.Function1[/* value */ Any, Any]
    
    var toolbar: BarProp
    
    var top: js.UndefOr[WindowProxy | Null] = js.undefined
    
    var visualViewport: js.UndefOr[VisualViewport | Null] = js.undefined
    
    var window: Window & (/* globalThis */ Any)
  }
  object AuthWindow {
    
    inline def apply(
      addEventListener: (DOMContentLoaded, /* listener */ js.ThisFunction1[AuthWindow, /* ev */ Event, Any]) => Unit,
      alert: () => Unit,
      atob: /* data */ String => String,
      blur: () => Unit,
      btoa: /* data */ String => String,
      caches: CacheStorage,
      cancelAnimationFrame: /* handle */ Double => Unit,
      cancelIdleCallback: /* handle */ Double => Unit,
      captureEvents: () => Unit,
      clearInterval: () => Unit,
      clearTimeout: () => Unit,
      clientInformation: Navigator,
      close: () => Unit,
      closed: Boolean,
      confirm: () => Boolean,
      createImageBitmap: /* image */ ImageBitmapSource => js.Promise[ImageBitmap],
      crossOriginIsolated: Boolean,
      crypto: Crypto,
      customElements: CustomElementRegistry,
      devicePixelRatio: Double,
      dispatchEvent: /* event */ Event => Boolean,
      document: Document,
      external: External,
      fetch: /* input */ RequestInfo => js.Promise[Response],
      focus: () => Unit,
      frames: WindowProxy,
      getComputedStyle: /* elt */ Element => CSSStyleDeclaration,
      getSelection: () => Selection | Null,
      history: History,
      indexedDB: IDBFactory,
      innerHeight: Double,
      innerWidth: Double,
      isSecureContext: Boolean,
      length: Double,
      localStorage: Storage,
      location: () => Location,
      locationbar: BarProp,
      matchMedia: /* query */ String => MediaQueryList,
      menubar: BarProp,
      moveBy: (/* x */ Double, /* y */ Double) => Unit,
      moveTo: (/* x */ Double, /* y */ Double) => Unit,
      name: String,
      navigator: Navigator,
      open: () => WindowProxy | Null,
      opener: Any,
      orientation: Double,
      origin: String,
      outerHeight: Double,
      outerWidth: Double,
      pageXOffset: Double,
      pageYOffset: Double,
      parent: WindowProxy,
      performance: Performance,
      personalbar: BarProp,
      postMessage: (/* message */ Any, /* targetOrigin */ String) => Unit,
      print: () => Unit,
      prompt: () => String | Null,
      queueMicrotask: /* callback */ VoidFunction => Unit,
      releaseEvents: () => Unit,
      removeEventListener: (DOMContentLoaded, /* listener */ js.ThisFunction1[AuthWindow, /* ev */ Event, Any]) => Unit,
      reportError: /* e */ Any => Unit,
      requestAnimationFrame: /* callback */ FrameRequestCallback => Double,
      requestIdleCallback: /* callback */ IdleRequestCallback => Double,
      resizeBy: (/* x */ Double, /* y */ Double) => Unit,
      resizeTo: (/* width */ Double, /* height */ Double) => Unit,
      screen: Screen,
      screenLeft: Double,
      screenTop: Double,
      screenX: Double,
      screenY: Double,
      scroll: () => Unit,
      scrollBy: () => Unit,
      scrollTo: () => Unit,
      scrollX: Double,
      scrollY: Double,
      scrollbars: BarProp,
      self: Window & (/* globalThis */ Any),
      sessionStorage: Storage,
      setInterval: (/* handler */ TimerHandler, /* timeout */ Double, /* repeated */ Any) => Double,
      setTimeout: (/* handler */ TimerHandler, /* timeout */ Double, /* repeated */ Any) => Double,
      speechSynthesis: SpeechSynthesis,
      status: String,
      statusbar: BarProp,
      stop: () => Unit,
      structuredClone: /* value */ Any => Any,
      toolbar: BarProp,
      window: Window & (/* globalThis */ Any)
    ): AuthWindow = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), alert = js.Any.fromFunction0(alert), atob = js.Any.fromFunction1(atob), blur = js.Any.fromFunction0(blur), btoa = js.Any.fromFunction1(btoa), caches = caches.asInstanceOf[js.Any], cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), cancelIdleCallback = js.Any.fromFunction1(cancelIdleCallback), captureEvents = js.Any.fromFunction0(captureEvents), clearInterval = js.Any.fromFunction0(clearInterval), clearTimeout = js.Any.fromFunction0(clearTimeout), clientInformation = clientInformation.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any], confirm = js.Any.fromFunction0(confirm), createImageBitmap = js.Any.fromFunction1(createImageBitmap), crossOriginIsolated = crossOriginIsolated.asInstanceOf[js.Any], crypto = crypto.asInstanceOf[js.Any], customElements = customElements.asInstanceOf[js.Any], devicePixelRatio = devicePixelRatio.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), document = document.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], fetch = js.Any.fromFunction1(fetch), focus = js.Any.fromFunction0(focus), frames = frames.asInstanceOf[js.Any], getComputedStyle = js.Any.fromFunction1(getComputedStyle), getSelection = js.Any.fromFunction0(getSelection), history = history.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any], innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], isSecureContext = isSecureContext.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localStorage = localStorage.asInstanceOf[js.Any], location = js.Any.fromFunction0(location), locationbar = locationbar.asInstanceOf[js.Any], matchMedia = js.Any.fromFunction1(matchMedia), menubar = menubar.asInstanceOf[js.Any], moveBy = js.Any.fromFunction2(moveBy), moveTo = js.Any.fromFunction2(moveTo), name = name.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), opener = opener.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], outerHeight = outerHeight.asInstanceOf[js.Any], outerWidth = outerWidth.asInstanceOf[js.Any], pageXOffset = pageXOffset.asInstanceOf[js.Any], pageYOffset = pageYOffset.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], personalbar = personalbar.asInstanceOf[js.Any], postMessage = js.Any.fromFunction2(postMessage), print = js.Any.fromFunction0(print), prompt = js.Any.fromFunction0(prompt), queueMicrotask = js.Any.fromFunction1(queueMicrotask), releaseEvents = js.Any.fromFunction0(releaseEvents), removeEventListener = js.Any.fromFunction2(removeEventListener), reportError = js.Any.fromFunction1(reportError), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame), requestIdleCallback = js.Any.fromFunction1(requestIdleCallback), resizeBy = js.Any.fromFunction2(resizeBy), resizeTo = js.Any.fromFunction2(resizeTo), screen = screen.asInstanceOf[js.Any], screenLeft = screenLeft.asInstanceOf[js.Any], screenTop = screenTop.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], scroll = js.Any.fromFunction0(scroll), scrollBy = js.Any.fromFunction0(scrollBy), scrollTo = js.Any.fromFunction0(scrollTo), scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], scrollbars = scrollbars.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any], setInterval = js.Any.fromFunction3(setInterval), setTimeout = js.Any.fromFunction3(setTimeout), speechSynthesis = speechSynthesis.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusbar = statusbar.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), structuredClone = js.Any.fromFunction1(structuredClone), toolbar = toolbar.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any], onerror = null)
      __obj.asInstanceOf[AuthWindow]
    }
    
    extension [Self <: AuthWindow](x: Self) {
      
      inline def setAddEventListener(
        value: (DOMContentLoaded, /* listener */ js.ThisFunction1[AuthWindow, /* ev */ Event, Any]) => Unit
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setAlert(value: () => Unit): Self = StObject.set(x, "alert", js.Any.fromFunction0(value))
      
      inline def setAtob(value: /* data */ String => String): Self = StObject.set(x, "atob", js.Any.fromFunction1(value))
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setBtoa(value: /* data */ String => String): Self = StObject.set(x, "btoa", js.Any.fromFunction1(value))
      
      inline def setCaches(value: CacheStorage): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      inline def setCancelAnimationFrame(value: /* handle */ Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
      
      inline def setCancelIdleCallback(value: /* handle */ Double => Unit): Self = StObject.set(x, "cancelIdleCallback", js.Any.fromFunction1(value))
      
      inline def setCaptureEvents(value: () => Unit): Self = StObject.set(x, "captureEvents", js.Any.fromFunction0(value))
      
      inline def setClearInterval(value: () => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction0(value))
      
      inline def setClearTimeout(value: () => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction0(value))
      
      inline def setClientInformation(value: Navigator): Self = StObject.set(x, "clientInformation", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setConfirm(value: () => Boolean): Self = StObject.set(x, "confirm", js.Any.fromFunction0(value))
      
      inline def setCreateImageBitmap(value: /* image */ ImageBitmapSource => js.Promise[ImageBitmap]): Self = StObject.set(x, "createImageBitmap", js.Any.fromFunction1(value))
      
      inline def setCrossOriginIsolated(value: Boolean): Self = StObject.set(x, "crossOriginIsolated", value.asInstanceOf[js.Any])
      
      inline def setCrypto(value: Crypto): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      inline def setCustomElements(value: CustomElementRegistry): Self = StObject.set(x, "customElements", value.asInstanceOf[js.Any])
      
      inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setExternal(value: External): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setFetch(value: /* input */ RequestInfo => js.Promise[Response]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setFrameElement(value: Element): Self = StObject.set(x, "frameElement", value.asInstanceOf[js.Any])
      
      inline def setFrameElementNull: Self = StObject.set(x, "frameElement", null)
      
      inline def setFrameElementUndefined: Self = StObject.set(x, "frameElement", js.undefined)
      
      inline def setFrames(value: WindowProxy): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setGapi(value: Typeofgapi): Self = StObject.set(x, "gapi", value.asInstanceOf[js.Any])
      
      inline def setGapiUndefined: Self = StObject.set(x, "gapi", js.undefined)
      
      inline def setGetComputedStyle(value: /* elt */ Element => CSSStyleDeclaration): Self = StObject.set(x, "getComputedStyle", js.Any.fromFunction1(value))
      
      inline def setGetSelection(value: () => Selection | Null): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
      
      inline def setGrecaptcha(value: Recaptcha): Self = StObject.set(x, "grecaptcha", value.asInstanceOf[js.Any])
      
      inline def setGrecaptchaUndefined: Self = StObject.set(x, "grecaptcha", js.undefined)
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setIndexedDB(value: IDBFactory): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
      
      inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
      
      inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
      
      inline def setIsSecureContext(value: Boolean): Self = StObject.set(x, "isSecureContext", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLocalStorage(value: Storage): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: () => Location): Self = StObject.set(x, "location", js.Any.fromFunction0(value))
      
      inline def setLocationbar(value: BarProp): Self = StObject.set(x, "locationbar", value.asInstanceOf[js.Any])
      
      inline def setMatchMedia(value: /* query */ String => MediaQueryList): Self = StObject.set(x, "matchMedia", js.Any.fromFunction1(value))
      
      inline def setMenubar(value: BarProp): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
      
      inline def setMoveBy(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "moveBy", js.Any.fromFunction2(value))
      
      inline def setMoveTo(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNavigator(value: Navigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
      
      inline def setOnabort(value: js.ThisFunction1[AuthWindow, /* ev */ UIEvent, Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      inline def setOnabortNull: Self = StObject.set(x, "onabort", null)
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setOnafterprint(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onafterprint", value.asInstanceOf[js.Any])
      
      inline def setOnafterprintNull: Self = StObject.set(x, "onafterprint", null)
      
      inline def setOnafterprintUndefined: Self = StObject.set(x, "onafterprint", js.undefined)
      
      inline def setOnanimationcancel(value: js.ThisFunction1[AuthWindow, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationcancel", value.asInstanceOf[js.Any])
      
      inline def setOnanimationcancelNull: Self = StObject.set(x, "onanimationcancel", null)
      
      inline def setOnanimationcancelUndefined: Self = StObject.set(x, "onanimationcancel", js.undefined)
      
      inline def setOnanimationend(value: js.ThisFunction1[AuthWindow, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationend", value.asInstanceOf[js.Any])
      
      inline def setOnanimationendNull: Self = StObject.set(x, "onanimationend", null)
      
      inline def setOnanimationendUndefined: Self = StObject.set(x, "onanimationend", js.undefined)
      
      inline def setOnanimationiteration(value: js.ThisFunction1[AuthWindow, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setOnanimationiterationNull: Self = StObject.set(x, "onanimationiteration", null)
      
      inline def setOnanimationiterationUndefined: Self = StObject.set(x, "onanimationiteration", js.undefined)
      
      inline def setOnanimationstart(value: js.ThisFunction1[AuthWindow, /* ev */ AnimationEvent, Any]): Self = StObject.set(x, "onanimationstart", value.asInstanceOf[js.Any])
      
      inline def setOnanimationstartNull: Self = StObject.set(x, "onanimationstart", null)
      
      inline def setOnanimationstartUndefined: Self = StObject.set(x, "onanimationstart", js.undefined)
      
      inline def setOnauxclick(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      inline def setOnauxclickNull: Self = StObject.set(x, "onauxclick", null)
      
      inline def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
      
      inline def setOnbeforeprint(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onbeforeprint", value.asInstanceOf[js.Any])
      
      inline def setOnbeforeprintNull: Self = StObject.set(x, "onbeforeprint", null)
      
      inline def setOnbeforeprintUndefined: Self = StObject.set(x, "onbeforeprint", js.undefined)
      
      inline def setOnbeforeunload(value: js.ThisFunction1[AuthWindow, /* ev */ BeforeUnloadEvent, Any]): Self = StObject.set(x, "onbeforeunload", value.asInstanceOf[js.Any])
      
      inline def setOnbeforeunloadNull: Self = StObject.set(x, "onbeforeunload", null)
      
      inline def setOnbeforeunloadUndefined: Self = StObject.set(x, "onbeforeunload", js.undefined)
      
      inline def setOnblur(value: js.ThisFunction1[AuthWindow, /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      inline def setOnblurNull: Self = StObject.set(x, "onblur", null)
      
      inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      inline def setOncanplay(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      inline def setOncanplayNull: Self = StObject.set(x, "oncanplay", null)
      
      inline def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
      
      inline def setOncanplaythrough(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      inline def setOncanplaythroughNull: Self = StObject.set(x, "oncanplaythrough", null)
      
      inline def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
      
      inline def setOnchange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      inline def setOnchangeNull: Self = StObject.set(x, "onchange", null)
      
      inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      inline def setOnclick(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      inline def setOnclickNull: Self = StObject.set(x, "onclick", null)
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setOnclose(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
      
      inline def setOncloseNull: Self = StObject.set(x, "onclose", null)
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOncontextmenu(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      inline def setOncontextmenuNull: Self = StObject.set(x, "oncontextmenu", null)
      
      inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
      
      inline def setOncuechange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      inline def setOncuechangeNull: Self = StObject.set(x, "oncuechange", null)
      
      inline def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
      
      inline def setOndblclick(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      inline def setOndblclickNull: Self = StObject.set(x, "ondblclick", null)
      
      inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      inline def setOndevicemotion(value: js.ThisFunction1[AuthWindow, /* ev */ DeviceMotionEvent, Any]): Self = StObject.set(x, "ondevicemotion", value.asInstanceOf[js.Any])
      
      inline def setOndevicemotionNull: Self = StObject.set(x, "ondevicemotion", null)
      
      inline def setOndevicemotionUndefined: Self = StObject.set(x, "ondevicemotion", js.undefined)
      
      inline def setOndeviceorientation(value: js.ThisFunction1[AuthWindow, /* ev */ DeviceOrientationEvent, Any]): Self = StObject.set(x, "ondeviceorientation", value.asInstanceOf[js.Any])
      
      inline def setOndeviceorientationNull: Self = StObject.set(x, "ondeviceorientation", null)
      
      inline def setOndeviceorientationUndefined: Self = StObject.set(x, "ondeviceorientation", js.undefined)
      
      inline def setOndrag(value: js.ThisFunction1[AuthWindow, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      inline def setOndragNull: Self = StObject.set(x, "ondrag", null)
      
      inline def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      inline def setOndragend(value: js.ThisFunction1[AuthWindow, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      inline def setOndragendNull: Self = StObject.set(x, "ondragend", null)
      
      inline def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      inline def setOndragenter(value: js.ThisFunction1[AuthWindow, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      inline def setOndragenterNull: Self = StObject.set(x, "ondragenter", null)
      
      inline def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      inline def setOndragleave(value: js.ThisFunction1[AuthWindow, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      inline def setOndragleaveNull: Self = StObject.set(x, "ondragleave", null)
      
      inline def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      inline def setOndragover(value: js.ThisFunction1[AuthWindow, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      inline def setOndragoverNull: Self = StObject.set(x, "ondragover", null)
      
      inline def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      inline def setOndragstart(value: js.ThisFunction1[AuthWindow, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      inline def setOndragstartNull: Self = StObject.set(x, "ondragstart", null)
      
      inline def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      inline def setOndrop(value: js.ThisFunction1[AuthWindow, /* ev */ DragEvent, Any]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      inline def setOndropNull: Self = StObject.set(x, "ondrop", null)
      
      inline def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      inline def setOndurationchange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      inline def setOndurationchangeNull: Self = StObject.set(x, "ondurationchange", null)
      
      inline def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
      
      inline def setOnemptied(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      inline def setOnemptiedNull: Self = StObject.set(x, "onemptied", null)
      
      inline def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
      
      inline def setOnended(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      inline def setOnendedNull: Self = StObject.set(x, "onended", null)
      
      inline def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
      
      inline def setOnerror(
        value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[js.Error]) => Any
      ): Self = StObject.set(x, "onerror", js.Any.fromFunction5(value))
      
      inline def setOnerrorNull: Self = StObject.set(x, "onerror", null)
      
      inline def setOnfocus(value: js.ThisFunction1[AuthWindow, /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      inline def setOnfocusNull: Self = StObject.set(x, "onfocus", null)
      
      inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      inline def setOnformdata(value: js.ThisFunction1[AuthWindow, /* ev */ FormDataEvent, Any]): Self = StObject.set(x, "onformdata", value.asInstanceOf[js.Any])
      
      inline def setOnformdataNull: Self = StObject.set(x, "onformdata", null)
      
      inline def setOnformdataUndefined: Self = StObject.set(x, "onformdata", js.undefined)
      
      inline def setOngamepadconnected(value: js.ThisFunction1[AuthWindow, /* ev */ GamepadEvent, Any]): Self = StObject.set(x, "ongamepadconnected", value.asInstanceOf[js.Any])
      
      inline def setOngamepadconnectedNull: Self = StObject.set(x, "ongamepadconnected", null)
      
      inline def setOngamepadconnectedUndefined: Self = StObject.set(x, "ongamepadconnected", js.undefined)
      
      inline def setOngamepaddisconnected(value: js.ThisFunction1[AuthWindow, /* ev */ GamepadEvent, Any]): Self = StObject.set(x, "ongamepaddisconnected", value.asInstanceOf[js.Any])
      
      inline def setOngamepaddisconnectedNull: Self = StObject.set(x, "ongamepaddisconnected", null)
      
      inline def setOngamepaddisconnectedUndefined: Self = StObject.set(x, "ongamepaddisconnected", js.undefined)
      
      inline def setOngotpointercapture(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "ongotpointercapture", value.asInstanceOf[js.Any])
      
      inline def setOngotpointercaptureNull: Self = StObject.set(x, "ongotpointercapture", null)
      
      inline def setOngotpointercaptureUndefined: Self = StObject.set(x, "ongotpointercapture", js.undefined)
      
      inline def setOnhashchange(value: js.ThisFunction1[AuthWindow, /* ev */ HashChangeEvent, Any]): Self = StObject.set(x, "onhashchange", value.asInstanceOf[js.Any])
      
      inline def setOnhashchangeNull: Self = StObject.set(x, "onhashchange", null)
      
      inline def setOnhashchangeUndefined: Self = StObject.set(x, "onhashchange", js.undefined)
      
      inline def setOninput(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      inline def setOninputNull: Self = StObject.set(x, "oninput", null)
      
      inline def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      inline def setOninvalid(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setOninvalidNull: Self = StObject.set(x, "oninvalid", null)
      
      inline def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
      
      inline def setOnkeydown(value: js.ThisFunction1[AuthWindow, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      inline def setOnkeydownNull: Self = StObject.set(x, "onkeydown", null)
      
      inline def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      inline def setOnkeypress(value: js.ThisFunction1[AuthWindow, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      inline def setOnkeypressNull: Self = StObject.set(x, "onkeypress", null)
      
      inline def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      inline def setOnkeyup(value: js.ThisFunction1[AuthWindow, /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      inline def setOnkeyupNull: Self = StObject.set(x, "onkeyup", null)
      
      inline def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      inline def setOnlanguagechange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onlanguagechange", value.asInstanceOf[js.Any])
      
      inline def setOnlanguagechangeNull: Self = StObject.set(x, "onlanguagechange", null)
      
      inline def setOnlanguagechangeUndefined: Self = StObject.set(x, "onlanguagechange", js.undefined)
      
      inline def setOnload(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      inline def setOnloadNull: Self = StObject.set(x, "onload", null)
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOnloadeddata(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      inline def setOnloadeddataNull: Self = StObject.set(x, "onloadeddata", null)
      
      inline def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
      
      inline def setOnloadedmetadata(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setOnloadedmetadataNull: Self = StObject.set(x, "onloadedmetadata", null)
      
      inline def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
      
      inline def setOnloadstart(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      inline def setOnloadstartNull: Self = StObject.set(x, "onloadstart", null)
      
      inline def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
      
      inline def setOnlostpointercapture(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onlostpointercapture", value.asInstanceOf[js.Any])
      
      inline def setOnlostpointercaptureNull: Self = StObject.set(x, "onlostpointercapture", null)
      
      inline def setOnlostpointercaptureUndefined: Self = StObject.set(x, "onlostpointercapture", js.undefined)
      
      inline def setOnmessage(value: js.ThisFunction1[AuthWindow, /* ev */ MessageEvent[Any], Any]): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
      
      inline def setOnmessageNull: Self = StObject.set(x, "onmessage", null)
      
      inline def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
      
      inline def setOnmessageerror(value: js.ThisFunction1[AuthWindow, /* ev */ MessageEvent[Any], Any]): Self = StObject.set(x, "onmessageerror", value.asInstanceOf[js.Any])
      
      inline def setOnmessageerrorNull: Self = StObject.set(x, "onmessageerror", null)
      
      inline def setOnmessageerrorUndefined: Self = StObject.set(x, "onmessageerror", js.undefined)
      
      inline def setOnmousedown(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      inline def setOnmousedownNull: Self = StObject.set(x, "onmousedown", null)
      
      inline def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      inline def setOnmouseenter(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      inline def setOnmouseenterNull: Self = StObject.set(x, "onmouseenter", null)
      
      inline def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      inline def setOnmouseleave(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      inline def setOnmouseleaveNull: Self = StObject.set(x, "onmouseleave", null)
      
      inline def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      inline def setOnmousemove(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      inline def setOnmousemoveNull: Self = StObject.set(x, "onmousemove", null)
      
      inline def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      inline def setOnmouseout(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoutNull: Self = StObject.set(x, "onmouseout", null)
      
      inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      inline def setOnmouseover(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoverNull: Self = StObject.set(x, "onmouseover", null)
      
      inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      inline def setOnmouseup(value: js.ThisFunction1[AuthWindow, /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      inline def setOnmouseupNull: Self = StObject.set(x, "onmouseup", null)
      
      inline def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      inline def setOnoffline(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onoffline", value.asInstanceOf[js.Any])
      
      inline def setOnofflineNull: Self = StObject.set(x, "onoffline", null)
      
      inline def setOnofflineUndefined: Self = StObject.set(x, "onoffline", js.undefined)
      
      inline def setOnonline(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "ononline", value.asInstanceOf[js.Any])
      
      inline def setOnonlineNull: Self = StObject.set(x, "ononline", null)
      
      inline def setOnonlineUndefined: Self = StObject.set(x, "ononline", js.undefined)
      
      inline def setOnorientationchange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onorientationchange", value.asInstanceOf[js.Any])
      
      inline def setOnorientationchangeNull: Self = StObject.set(x, "onorientationchange", null)
      
      inline def setOnorientationchangeUndefined: Self = StObject.set(x, "onorientationchange", js.undefined)
      
      inline def setOnpagehide(value: js.ThisFunction1[AuthWindow, /* ev */ PageTransitionEvent, Any]): Self = StObject.set(x, "onpagehide", value.asInstanceOf[js.Any])
      
      inline def setOnpagehideNull: Self = StObject.set(x, "onpagehide", null)
      
      inline def setOnpagehideUndefined: Self = StObject.set(x, "onpagehide", js.undefined)
      
      inline def setOnpageshow(value: js.ThisFunction1[AuthWindow, /* ev */ PageTransitionEvent, Any]): Self = StObject.set(x, "onpageshow", value.asInstanceOf[js.Any])
      
      inline def setOnpageshowNull: Self = StObject.set(x, "onpageshow", null)
      
      inline def setOnpageshowUndefined: Self = StObject.set(x, "onpageshow", js.undefined)
      
      inline def setOnpause(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      inline def setOnpauseNull: Self = StObject.set(x, "onpause", null)
      
      inline def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      inline def setOnplay(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      inline def setOnplayNull: Self = StObject.set(x, "onplay", null)
      
      inline def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      inline def setOnplaying(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      inline def setOnplayingNull: Self = StObject.set(x, "onplaying", null)
      
      inline def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
      
      inline def setOnpointercancel(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      inline def setOnpointercancelNull: Self = StObject.set(x, "onpointercancel", null)
      
      inline def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
      
      inline def setOnpointerdown(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      inline def setOnpointerdownNull: Self = StObject.set(x, "onpointerdown", null)
      
      inline def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
      
      inline def setOnpointerenter(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      inline def setOnpointerenterNull: Self = StObject.set(x, "onpointerenter", null)
      
      inline def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
      
      inline def setOnpointerleave(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      inline def setOnpointerleaveNull: Self = StObject.set(x, "onpointerleave", null)
      
      inline def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
      
      inline def setOnpointermove(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      inline def setOnpointermoveNull: Self = StObject.set(x, "onpointermove", null)
      
      inline def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
      
      inline def setOnpointerout(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroutNull: Self = StObject.set(x, "onpointerout", null)
      
      inline def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
      
      inline def setOnpointerover(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroverNull: Self = StObject.set(x, "onpointerover", null)
      
      inline def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
      
      inline def setOnpointerup(value: js.ThisFunction1[AuthWindow, /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      inline def setOnpointerupNull: Self = StObject.set(x, "onpointerup", null)
      
      inline def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
      
      inline def setOnpopstate(value: js.ThisFunction1[AuthWindow, /* ev */ PopStateEvent, Any]): Self = StObject.set(x, "onpopstate", value.asInstanceOf[js.Any])
      
      inline def setOnpopstateNull: Self = StObject.set(x, "onpopstate", null)
      
      inline def setOnpopstateUndefined: Self = StObject.set(x, "onpopstate", js.undefined)
      
      inline def setOnprogress(value: js.ThisFunction1[AuthWindow, /* ev */ ProgressEvent[EventTarget], Any]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      inline def setOnprogressNull: Self = StObject.set(x, "onprogress", null)
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      inline def setOnratechange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      inline def setOnratechangeNull: Self = StObject.set(x, "onratechange", null)
      
      inline def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
      
      inline def setOnrejectionhandled(value: js.ThisFunction1[AuthWindow, /* ev */ PromiseRejectionEvent, Any]): Self = StObject.set(x, "onrejectionhandled", value.asInstanceOf[js.Any])
      
      inline def setOnrejectionhandledNull: Self = StObject.set(x, "onrejectionhandled", null)
      
      inline def setOnrejectionhandledUndefined: Self = StObject.set(x, "onrejectionhandled", js.undefined)
      
      inline def setOnreset(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      inline def setOnresetNull: Self = StObject.set(x, "onreset", null)
      
      inline def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      inline def setOnresize(value: js.ThisFunction1[AuthWindow, /* ev */ UIEvent, Any]): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
      
      inline def setOnresizeNull: Self = StObject.set(x, "onresize", null)
      
      inline def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
      
      inline def setOnscroll(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      inline def setOnscrollNull: Self = StObject.set(x, "onscroll", null)
      
      inline def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      inline def setOnsecuritypolicyviolation(value: js.ThisFunction1[AuthWindow, /* ev */ SecurityPolicyViolationEvent, Any]): Self = StObject.set(x, "onsecuritypolicyviolation", value.asInstanceOf[js.Any])
      
      inline def setOnsecuritypolicyviolationNull: Self = StObject.set(x, "onsecuritypolicyviolation", null)
      
      inline def setOnsecuritypolicyviolationUndefined: Self = StObject.set(x, "onsecuritypolicyviolation", js.undefined)
      
      inline def setOnseeked(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      inline def setOnseekedNull: Self = StObject.set(x, "onseeked", null)
      
      inline def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
      
      inline def setOnseeking(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      inline def setOnseekingNull: Self = StObject.set(x, "onseeking", null)
      
      inline def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
      
      inline def setOnselect(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      inline def setOnselectNull: Self = StObject.set(x, "onselect", null)
      
      inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
      
      inline def setOnselectionchange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onselectionchange", value.asInstanceOf[js.Any])
      
      inline def setOnselectionchangeNull: Self = StObject.set(x, "onselectionchange", null)
      
      inline def setOnselectionchangeUndefined: Self = StObject.set(x, "onselectionchange", js.undefined)
      
      inline def setOnselectstart(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      inline def setOnselectstartNull: Self = StObject.set(x, "onselectstart", null)
      
      inline def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
      
      inline def setOnslotchange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onslotchange", value.asInstanceOf[js.Any])
      
      inline def setOnslotchangeNull: Self = StObject.set(x, "onslotchange", null)
      
      inline def setOnslotchangeUndefined: Self = StObject.set(x, "onslotchange", js.undefined)
      
      inline def setOnstalled(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      inline def setOnstalledNull: Self = StObject.set(x, "onstalled", null)
      
      inline def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
      
      inline def setOnstorage(value: js.ThisFunction1[AuthWindow, /* ev */ StorageEvent, Any]): Self = StObject.set(x, "onstorage", value.asInstanceOf[js.Any])
      
      inline def setOnstorageNull: Self = StObject.set(x, "onstorage", null)
      
      inline def setOnstorageUndefined: Self = StObject.set(x, "onstorage", js.undefined)
      
      inline def setOnsubmit(value: js.ThisFunction1[AuthWindow, /* ev */ SubmitEvent, Any]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      inline def setOnsubmitNull: Self = StObject.set(x, "onsubmit", null)
      
      inline def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      inline def setOnsuspend(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      inline def setOnsuspendNull: Self = StObject.set(x, "onsuspend", null)
      
      inline def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
      
      inline def setOntimeupdate(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      inline def setOntimeupdateNull: Self = StObject.set(x, "ontimeupdate", null)
      
      inline def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
      
      inline def setOntoggle(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "ontoggle", value.asInstanceOf[js.Any])
      
      inline def setOntoggleNull: Self = StObject.set(x, "ontoggle", null)
      
      inline def setOntoggleUndefined: Self = StObject.set(x, "ontoggle", js.undefined)
      
      inline def setOntouchcancel(value: js.ThisFunction1[AuthWindow, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchcancel", value.asInstanceOf[js.Any])
      
      inline def setOntouchcancelNull: Self = StObject.set(x, "ontouchcancel", null)
      
      inline def setOntouchcancelUndefined: Self = StObject.set(x, "ontouchcancel", js.undefined)
      
      inline def setOntouchend(value: js.ThisFunction1[AuthWindow, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchend", value.asInstanceOf[js.Any])
      
      inline def setOntouchendNull: Self = StObject.set(x, "ontouchend", null)
      
      inline def setOntouchendUndefined: Self = StObject.set(x, "ontouchend", js.undefined)
      
      inline def setOntouchmove(value: js.ThisFunction1[AuthWindow, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchmove", value.asInstanceOf[js.Any])
      
      inline def setOntouchmoveNull: Self = StObject.set(x, "ontouchmove", null)
      
      inline def setOntouchmoveUndefined: Self = StObject.set(x, "ontouchmove", js.undefined)
      
      inline def setOntouchstart(value: js.ThisFunction1[AuthWindow, /* ev */ TouchEvent, Any]): Self = StObject.set(x, "ontouchstart", value.asInstanceOf[js.Any])
      
      inline def setOntouchstartNull: Self = StObject.set(x, "ontouchstart", null)
      
      inline def setOntouchstartUndefined: Self = StObject.set(x, "ontouchstart", js.undefined)
      
      inline def setOntransitioncancel(value: js.ThisFunction1[AuthWindow, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitioncancel", value.asInstanceOf[js.Any])
      
      inline def setOntransitioncancelNull: Self = StObject.set(x, "ontransitioncancel", null)
      
      inline def setOntransitioncancelUndefined: Self = StObject.set(x, "ontransitioncancel", js.undefined)
      
      inline def setOntransitionend(value: js.ThisFunction1[AuthWindow, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionend", value.asInstanceOf[js.Any])
      
      inline def setOntransitionendNull: Self = StObject.set(x, "ontransitionend", null)
      
      inline def setOntransitionendUndefined: Self = StObject.set(x, "ontransitionend", js.undefined)
      
      inline def setOntransitionrun(value: js.ThisFunction1[AuthWindow, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionrun", value.asInstanceOf[js.Any])
      
      inline def setOntransitionrunNull: Self = StObject.set(x, "ontransitionrun", null)
      
      inline def setOntransitionrunUndefined: Self = StObject.set(x, "ontransitionrun", js.undefined)
      
      inline def setOntransitionstart(value: js.ThisFunction1[AuthWindow, /* ev */ TransitionEvent, Any]): Self = StObject.set(x, "ontransitionstart", value.asInstanceOf[js.Any])
      
      inline def setOntransitionstartNull: Self = StObject.set(x, "ontransitionstart", null)
      
      inline def setOntransitionstartUndefined: Self = StObject.set(x, "ontransitionstart", js.undefined)
      
      inline def setOnunhandledrejection(value: js.ThisFunction1[AuthWindow, /* ev */ PromiseRejectionEvent, Any]): Self = StObject.set(x, "onunhandledrejection", value.asInstanceOf[js.Any])
      
      inline def setOnunhandledrejectionNull: Self = StObject.set(x, "onunhandledrejection", null)
      
      inline def setOnunhandledrejectionUndefined: Self = StObject.set(x, "onunhandledrejection", js.undefined)
      
      inline def setOnunload(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onunload", value.asInstanceOf[js.Any])
      
      inline def setOnunloadNull: Self = StObject.set(x, "onunload", null)
      
      inline def setOnunloadUndefined: Self = StObject.set(x, "onunload", js.undefined)
      
      inline def setOnvolumechange(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      inline def setOnvolumechangeNull: Self = StObject.set(x, "onvolumechange", null)
      
      inline def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
      
      inline def setOnwaiting(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
      
      inline def setOnwaitingNull: Self = StObject.set(x, "onwaiting", null)
      
      inline def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
      
      inline def setOnwebkitanimationend(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationend", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationendNull: Self = StObject.set(x, "onwebkitanimationend", null)
      
      inline def setOnwebkitanimationendUndefined: Self = StObject.set(x, "onwebkitanimationend", js.undefined)
      
      inline def setOnwebkitanimationiteration(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationiterationNull: Self = StObject.set(x, "onwebkitanimationiteration", null)
      
      inline def setOnwebkitanimationiterationUndefined: Self = StObject.set(x, "onwebkitanimationiteration", js.undefined)
      
      inline def setOnwebkitanimationstart(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkitanimationstart", value.asInstanceOf[js.Any])
      
      inline def setOnwebkitanimationstartNull: Self = StObject.set(x, "onwebkitanimationstart", null)
      
      inline def setOnwebkitanimationstartUndefined: Self = StObject.set(x, "onwebkitanimationstart", js.undefined)
      
      inline def setOnwebkittransitionend(value: js.ThisFunction1[AuthWindow, /* ev */ Event, Any]): Self = StObject.set(x, "onwebkittransitionend", value.asInstanceOf[js.Any])
      
      inline def setOnwebkittransitionendNull: Self = StObject.set(x, "onwebkittransitionend", null)
      
      inline def setOnwebkittransitionendUndefined: Self = StObject.set(x, "onwebkittransitionend", js.undefined)
      
      inline def setOnwheel(value: js.ThisFunction1[AuthWindow, /* ev */ WheelEvent, Any]): Self = StObject.set(x, "onwheel", value.asInstanceOf[js.Any])
      
      inline def setOnwheelNull: Self = StObject.set(x, "onwheel", null)
      
      inline def setOnwheelUndefined: Self = StObject.set(x, "onwheel", js.undefined)
      
      inline def setOpen(value: () => WindowProxy | Null): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setOpener(value: Any): Self = StObject.set(x, "opener", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOuterHeight(value: Double): Self = StObject.set(x, "outerHeight", value.asInstanceOf[js.Any])
      
      inline def setOuterWidth(value: Double): Self = StObject.set(x, "outerWidth", value.asInstanceOf[js.Any])
      
      inline def setPageXOffset(value: Double): Self = StObject.set(x, "pageXOffset", value.asInstanceOf[js.Any])
      
      inline def setPageYOffset(value: Double): Self = StObject.set(x, "pageYOffset", value.asInstanceOf[js.Any])
      
      inline def setParent(value: WindowProxy): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPerformance(value: Performance): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setPersonalbar(value: BarProp): Self = StObject.set(x, "personalbar", value.asInstanceOf[js.Any])
      
      inline def setPostMessage(value: (/* message */ Any, /* targetOrigin */ String) => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
      
      inline def setPrint(value: () => Unit): Self = StObject.set(x, "print", js.Any.fromFunction0(value))
      
      inline def setPrompt(value: () => String | Null): Self = StObject.set(x, "prompt", js.Any.fromFunction0(value))
      
      inline def setQueueMicrotask(value: /* callback */ VoidFunction => Unit): Self = StObject.set(x, "queueMicrotask", js.Any.fromFunction1(value))
      
      inline def setReleaseEvents(value: () => Unit): Self = StObject.set(x, "releaseEvents", js.Any.fromFunction0(value))
      
      inline def setRemoveEventListener(
        value: (DOMContentLoaded, /* listener */ js.ThisFunction1[AuthWindow, /* ev */ Event, Any]) => Unit
      ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      inline def setReportError(value: /* e */ Any => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
      
      inline def setRequestAnimationFrame(value: /* callback */ FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
      
      inline def setRequestIdleCallback(value: /* callback */ IdleRequestCallback => Double): Self = StObject.set(x, "requestIdleCallback", js.Any.fromFunction1(value))
      
      inline def setResizeBy(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "resizeBy", js.Any.fromFunction2(value))
      
      inline def setResizeTo(value: (/* width */ Double, /* height */ Double) => Unit): Self = StObject.set(x, "resizeTo", js.Any.fromFunction2(value))
      
      inline def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenLeft(value: Double): Self = StObject.set(x, "screenLeft", value.asInstanceOf[js.Any])
      
      inline def setScreenTop(value: Double): Self = StObject.set(x, "screenTop", value.asInstanceOf[js.Any])
      
      inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: () => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction0(value))
      
      inline def setScrollBy(value: () => Unit): Self = StObject.set(x, "scrollBy", js.Any.fromFunction0(value))
      
      inline def setScrollTo(value: () => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction0(value))
      
      inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      inline def setScrollbars(value: BarProp): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
      
      inline def setSelf(value: Window & (/* globalThis */ Any)): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      inline def setSessionStorage(value: Storage): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
      
      inline def setSetInterval(value: (/* handler */ TimerHandler, /* timeout */ Double, /* repeated */ Any) => Double): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      inline def setSetTimeout(value: (/* handler */ TimerHandler, /* timeout */ Double, /* repeated */ Any) => Double): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
      
      inline def setSpeechSynthesis(value: SpeechSynthesis): Self = StObject.set(x, "speechSynthesis", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusbar(value: BarProp): Self = StObject.set(x, "statusbar", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setStructuredClone(value: /* value */ Any => Any): Self = StObject.set(x, "structuredClone", js.Any.fromFunction1(value))
      
      inline def setToolbar(value: BarProp): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setTop(value: WindowProxy): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopNull: Self = StObject.set(x, "top", null)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setVisualViewport(value: VisualViewport): Self = StObject.set(x, "visualViewport", value.asInstanceOf[js.Any])
      
      inline def setVisualViewportNull: Self = StObject.set(x, "visualViewport", null)
      
      inline def setVisualViewportUndefined: Self = StObject.set(x, "visualViewport", js.undefined)
      
      inline def setWindow(value: Window & (/* globalThis */ Any)): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def set___jsl(value: Record[String, Any]): Self = StObject.set(x, "___jsl", value.asInstanceOf[js.Any])
      
      inline def set___jslUndefined: Self = StObject.set(x, "___jsl", js.undefined)
    }
  }
}
