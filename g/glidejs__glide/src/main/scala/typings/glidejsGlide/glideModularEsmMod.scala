package typings.glidejsGlide

import typings.glidejsGlide.anon.Modify
import typings.glidejsGlide.glidejsGlideStrings.move
import typings.glidejsGlide.glidejsGlideStrings.moveDotafter
import typings.glidejsGlide.glidejsGlideStrings.translateDotjump
import typings.glidejsGlide.mod.AnchorsComponent
import typings.glidejsGlide.mod.AutoplayComponent
import typings.glidejsGlide.mod.BreakpointsComponent
import typings.glidejsGlide.mod.BuildComponent
import typings.glidejsGlide.mod.ClonesComponent
import typings.glidejsGlide.mod.Component
import typings.glidejsGlide.mod.ControlsComponent
import typings.glidejsGlide.mod.Events
import typings.glidejsGlide.mod.EventsBus
import typings.glidejsGlide.mod.GapsComponent
import typings.glidejsGlide.mod.HtmlComponent
import typings.glidejsGlide.mod.ImagesComponent
import typings.glidejsGlide.mod.KeyboardComponent
import typings.glidejsGlide.mod.MoveComponent
import typings.glidejsGlide.mod.MoveContext
import typings.glidejsGlide.mod.Options
import typings.glidejsGlide.mod.PeekComponent
import typings.glidejsGlide.mod.Properties
import typings.glidejsGlide.mod.ResizeComponent
import typings.glidejsGlide.mod.RunComponent
import typings.glidejsGlide.mod.RunCurrentMovementContext
import typings.glidejsGlide.mod.RunEvents
import typings.glidejsGlide.mod.SizesComponent
import typings.glidejsGlide.mod.SwipeComponent
import typings.glidejsGlide.mod.TransitionComponent
import typings.glidejsGlide.mod.TranslateComponent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glideModularEsmMod {
  
  @JSImport("@glidejs/glide/dist/glide.modular.esm", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Glide {
    def this(selector: String) = this()
    def this(selector: String, options: Options) = this()
  }
  
  @JSImport("@glidejs/glide/dist/glide.modular.esm", "Anchors")
  @js.native
  val Anchors: ComponentFunction[AnchorsComponent] = js.native
  
  @JSImport("@glidejs/glide/dist/glide.modular.esm", "Autoplay")
  @js.native
  val Autoplay: ComponentFunction[AutoplayComponent] = js.native
  
  @JSImport("@glidejs/glide/dist/glide.modular.esm", "Breakpoints")
  @js.native
  val Breakpoints: ComponentFunction[BreakpointsComponent] = js.native
  
  @JSImport("@glidejs/glide/dist/glide.modular.esm", "Controls")
  @js.native
  val Controls: ComponentFunction[ControlsComponent] = js.native
  
  @JSImport("@glidejs/glide/dist/glide.modular.esm", "Images")
  @js.native
  val Images: ComponentFunction[ImagesComponent] = js.native
  
  @JSImport("@glidejs/glide/dist/glide.modular.esm", "Keyboard")
  @js.native
  val Keyboard: ComponentFunction[KeyboardComponent] = js.native
  
  @JSImport("@glidejs/glide/dist/glide.modular.esm", "Swipe")
  @js.native
  val Swipe: ComponentFunction[SwipeComponent] = js.native
  
  type ComponentFunction[T /* <: Component */] = js.Function3[
    /* glide */ Properties, 
    /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), 
    /* events */ EventsBus, 
    T
  ]
  
  @js.native
  trait Glide extends StObject {
    
    /**
      * A Glide instance is in "uninitialized" mode until a mount() method
      * call. It starts an entire building process.
      */
    def mount(): Properties = js.native
    def mount(components: OptionalComponentOption & (Record[String, ComponentFunction[Component]])): Properties = js.native
    
    /**
      * Registering Transformers
      */
    def mutate(transformers: js.Array[TransformerFunction]): this.type = js.native
    
    def on(
      event: move | moveDotafter | translateDotjump,
      definition: js.Function1[/* context */ MoveContext, Unit]
    ): this.type = js.native
    def on(event: String, definition: js.Function1[/* context */ Record[String, Any], Unit]): this.type = js.native
    def on(event: js.Array[Events], definition: js.Function0[Unit]): this.type = js.native
    def on(event: js.Array[String], definition: js.Function1[/* context */ Record[String, Any], Unit]): this.type = js.native
    def on(event: Events, definition: js.Function0[Unit]): this.type = js.native
    /**
      * Register callback which will be called at the specified events.
      */
    def on(event: RunEvents, definition: js.Function1[/* context */ RunCurrentMovementContext, Unit]): this.type = js.native
  }
  
  /* Inlined std.Omit<@glidejs/glide.@glidejs/glide.BuiltinComponentMap, @glidejs/glide.@glidejs/glide/dist/glide.modular.esm.OptionalComponentNames> & std.Partial<@glidejs/glide.@glidejs/glide/dist/glide.modular.esm.OptionalComponentMap> */
  trait ModularComponentMap extends StObject {
    
    var Anchors: js.UndefOr[AnchorsComponent] = js.undefined
    
    var Autoplay: js.UndefOr[AutoplayComponent] = js.undefined
    
    var Breakpoints: js.UndefOr[BreakpointsComponent] = js.undefined
    
    var Build: BuildComponent
    
    var Clones: ClonesComponent
    
    var Controls: js.UndefOr[ControlsComponent] = js.undefined
    
    var Gaps: GapsComponent
    
    var Html: HtmlComponent
    
    var Images: js.UndefOr[ImagesComponent] = js.undefined
    
    var Keyboard: js.UndefOr[KeyboardComponent] = js.undefined
    
    var Move: MoveComponent
    
    var Peek: PeekComponent
    
    var Resize: ResizeComponent
    
    var Run: RunComponent
    
    var Sizes: SizesComponent
    
    var Swipe: js.UndefOr[SwipeComponent] = js.undefined
    
    var Transition: TransitionComponent
    
    var Translate: TranslateComponent
  }
  object ModularComponentMap {
    
    inline def apply(
      Build: BuildComponent,
      Clones: ClonesComponent,
      Gaps: GapsComponent,
      Html: HtmlComponent,
      Move: MoveComponent,
      Peek: PeekComponent,
      Resize: ResizeComponent,
      Run: RunComponent,
      Sizes: SizesComponent,
      Transition: TransitionComponent,
      Translate: TranslateComponent
    ): ModularComponentMap = {
      val __obj = js.Dynamic.literal(Build = Build.asInstanceOf[js.Any], Clones = Clones.asInstanceOf[js.Any], Gaps = Gaps.asInstanceOf[js.Any], Html = Html.asInstanceOf[js.Any], Move = Move.asInstanceOf[js.Any], Peek = Peek.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Run = Run.asInstanceOf[js.Any], Sizes = Sizes.asInstanceOf[js.Any], Transition = Transition.asInstanceOf[js.Any], Translate = Translate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModularComponentMap]
    }
    
    extension [Self <: ModularComponentMap](x: Self) {
      
      inline def setAnchors(value: AnchorsComponent): Self = StObject.set(x, "Anchors", value.asInstanceOf[js.Any])
      
      inline def setAnchorsUndefined: Self = StObject.set(x, "Anchors", js.undefined)
      
      inline def setAutoplay(value: AutoplayComponent): Self = StObject.set(x, "Autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "Autoplay", js.undefined)
      
      inline def setBreakpoints(value: BreakpointsComponent): Self = StObject.set(x, "Breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "Breakpoints", js.undefined)
      
      inline def setBuild(value: BuildComponent): Self = StObject.set(x, "Build", value.asInstanceOf[js.Any])
      
      inline def setClones(value: ClonesComponent): Self = StObject.set(x, "Clones", value.asInstanceOf[js.Any])
      
      inline def setControls(value: ControlsComponent): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "Controls", js.undefined)
      
      inline def setGaps(value: GapsComponent): Self = StObject.set(x, "Gaps", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: HtmlComponent): Self = StObject.set(x, "Html", value.asInstanceOf[js.Any])
      
      inline def setImages(value: ImagesComponent): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
      
      inline def setKeyboard(value: KeyboardComponent): Self = StObject.set(x, "Keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "Keyboard", js.undefined)
      
      inline def setMove(value: MoveComponent): Self = StObject.set(x, "Move", value.asInstanceOf[js.Any])
      
      inline def setPeek(value: PeekComponent): Self = StObject.set(x, "Peek", value.asInstanceOf[js.Any])
      
      inline def setResize(value: ResizeComponent): Self = StObject.set(x, "Resize", value.asInstanceOf[js.Any])
      
      inline def setRun(value: RunComponent): Self = StObject.set(x, "Run", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: SizesComponent): Self = StObject.set(x, "Sizes", value.asInstanceOf[js.Any])
      
      inline def setSwipe(value: SwipeComponent): Self = StObject.set(x, "Swipe", value.asInstanceOf[js.Any])
      
      inline def setSwipeUndefined: Self = StObject.set(x, "Swipe", js.undefined)
      
      inline def setTransition(value: TransitionComponent): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
      
      inline def setTranslate(value: TranslateComponent): Self = StObject.set(x, "Translate", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@glidejs/glide.@glidejs/glide.BuiltinComponentMap, @glidejs/glide.@glidejs/glide/dist/glide.modular.esm.OptionalComponentNames> */
  trait OptionalComponentMap extends StObject {
    
    var Anchors: AnchorsComponent
    
    var Autoplay: AutoplayComponent
    
    var Breakpoints: BreakpointsComponent
    
    var Controls: ControlsComponent
    
    var Images: ImagesComponent
    
    var Keyboard: KeyboardComponent
    
    var Swipe: SwipeComponent
  }
  object OptionalComponentMap {
    
    inline def apply(
      Anchors: AnchorsComponent,
      Autoplay: AutoplayComponent,
      Breakpoints: BreakpointsComponent,
      Controls: ControlsComponent,
      Images: ImagesComponent,
      Keyboard: KeyboardComponent,
      Swipe: SwipeComponent
    ): OptionalComponentMap = {
      val __obj = js.Dynamic.literal(Anchors = Anchors.asInstanceOf[js.Any], Autoplay = Autoplay.asInstanceOf[js.Any], Breakpoints = Breakpoints.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], Images = Images.asInstanceOf[js.Any], Keyboard = Keyboard.asInstanceOf[js.Any], Swipe = Swipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionalComponentMap]
    }
    
    extension [Self <: OptionalComponentMap](x: Self) {
      
      inline def setAnchors(value: AnchorsComponent): Self = StObject.set(x, "Anchors", value.asInstanceOf[js.Any])
      
      inline def setAutoplay(value: AutoplayComponent): Self = StObject.set(x, "Autoplay", value.asInstanceOf[js.Any])
      
      inline def setBreakpoints(value: BreakpointsComponent): Self = StObject.set(x, "Breakpoints", value.asInstanceOf[js.Any])
      
      inline def setControls(value: ControlsComponent): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
      
      inline def setImages(value: ImagesComponent): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
      
      inline def setKeyboard(value: KeyboardComponent): Self = StObject.set(x, "Keyboard", value.asInstanceOf[js.Any])
      
      inline def setSwipe(value: SwipeComponent): Self = StObject.set(x, "Swipe", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glidejsGlide.glidejsGlideStrings.Anchors
    - typings.glidejsGlide.glidejsGlideStrings.Autoplay
    - typings.glidejsGlide.glidejsGlideStrings.Breakpoints
    - typings.glidejsGlide.glidejsGlideStrings.Controls
    - typings.glidejsGlide.glidejsGlideStrings.Images
    - typings.glidejsGlide.glidejsGlideStrings.Keyboard
    - typings.glidejsGlide.glidejsGlideStrings.Swipe
  */
  trait OptionalComponentNames extends StObject
  object OptionalComponentNames {
    
    inline def Anchors: typings.glidejsGlide.glidejsGlideStrings.Anchors = "Anchors".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.Anchors]
    
    inline def Autoplay: typings.glidejsGlide.glidejsGlideStrings.Autoplay = "Autoplay".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.Autoplay]
    
    inline def Breakpoints: typings.glidejsGlide.glidejsGlideStrings.Breakpoints = "Breakpoints".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.Breakpoints]
    
    inline def Controls: typings.glidejsGlide.glidejsGlideStrings.Controls = "Controls".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.Controls]
    
    inline def Images: typings.glidejsGlide.glidejsGlideStrings.Images = "Images".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.Images]
    
    inline def Keyboard: typings.glidejsGlide.glidejsGlideStrings.Keyboard = "Keyboard".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.Keyboard]
    
    inline def Swipe: typings.glidejsGlide.glidejsGlideStrings.Swipe = "Swipe".asInstanceOf[typings.glidejsGlide.glidejsGlideStrings.Swipe]
  }
  
  trait OptionalComponentOption extends StObject {
    
    var Anchors: js.UndefOr[ComponentFunction[AnchorsComponent]] = js.undefined
    
    var Autoplay: js.UndefOr[ComponentFunction[AutoplayComponent]] = js.undefined
    
    var Breakpoints: js.UndefOr[ComponentFunction[BreakpointsComponent]] = js.undefined
    
    var Controls: js.UndefOr[ComponentFunction[ControlsComponent]] = js.undefined
    
    var Images: js.UndefOr[ComponentFunction[ImagesComponent]] = js.undefined
    
    var Keyboard: js.UndefOr[ComponentFunction[KeyboardComponent]] = js.undefined
    
    var Swipe: js.UndefOr[ComponentFunction[SwipeComponent]] = js.undefined
  }
  object OptionalComponentOption {
    
    inline def apply(): OptionalComponentOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalComponentOption]
    }
    
    extension [Self <: OptionalComponentOption](x: Self) {
      
      inline def setAnchors(
        value: (/* glide */ Properties, /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), /* events */ EventsBus) => AnchorsComponent
      ): Self = StObject.set(x, "Anchors", js.Any.fromFunction3(value))
      
      inline def setAnchorsUndefined: Self = StObject.set(x, "Anchors", js.undefined)
      
      inline def setAutoplay(
        value: (/* glide */ Properties, /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), /* events */ EventsBus) => AutoplayComponent
      ): Self = StObject.set(x, "Autoplay", js.Any.fromFunction3(value))
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "Autoplay", js.undefined)
      
      inline def setBreakpoints(
        value: (/* glide */ Properties, /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), /* events */ EventsBus) => BreakpointsComponent
      ): Self = StObject.set(x, "Breakpoints", js.Any.fromFunction3(value))
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "Breakpoints", js.undefined)
      
      inline def setControls(
        value: (/* glide */ Properties, /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), /* events */ EventsBus) => ControlsComponent
      ): Self = StObject.set(x, "Controls", js.Any.fromFunction3(value))
      
      inline def setControlsUndefined: Self = StObject.set(x, "Controls", js.undefined)
      
      inline def setImages(
        value: (/* glide */ Properties, /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), /* events */ EventsBus) => ImagesComponent
      ): Self = StObject.set(x, "Images", js.Any.fromFunction3(value))
      
      inline def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
      
      inline def setKeyboard(
        value: (/* glide */ Properties, /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), /* events */ EventsBus) => KeyboardComponent
      ): Self = StObject.set(x, "Keyboard", js.Any.fromFunction3(value))
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "Keyboard", js.undefined)
      
      inline def setSwipe(
        value: (/* glide */ Properties, /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), /* events */ EventsBus) => SwipeComponent
      ): Self = StObject.set(x, "Swipe", js.Any.fromFunction3(value))
      
      inline def setSwipeUndefined: Self = StObject.set(x, "Swipe", js.undefined)
    }
  }
  
  type TransformerFunction = js.Function3[
    /* glide */ Properties, 
    /* components */ ModularComponentMap & (Record[String, js.UndefOr[Component]]), 
    /* events */ EventsBus, 
    Modify
  ]
}
