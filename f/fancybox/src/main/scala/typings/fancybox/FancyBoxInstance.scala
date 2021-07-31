package typings.fancybox

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxInstance
  extends StObject
     with FancyBoxInstanceMethods {
  
  @JSName("$caption")
  var $caption: js.UndefOr[JQuery] = js.native
  
  @JSName("$refs")
  var $refs: js.UndefOr[FancyBoxRefs] = js.native
  
  @JSName("$trigger")
  var $trigger: js.UndefOr[JQuery] = js.native
  
  var FullScreen: FancyBoxFullScreen = js.native
  
  var Guestures: FancyBoxGestures = js.native
  
  var SlideShow: FancyBoxSlideShow = js.native
  
  var Thumbs: FancyThumbs = js.native
  
  var currIndex: Double = js.native
  
  var currPos: Double = js.native
  
  var current: FancyBoxSlide = js.native
  
  var firstRun: Boolean = js.native
  
  var group: js.Array[FancyBoxGroupItem] = js.native
  
  var hasHiddenControls: Boolean = js.native
  
  var id: Double = js.native
  
  var idleInterval: Double = js.native
  
  var idleSecondsCounter: Double = js.native
  
  var isAnimating: Boolean = js.native
  
  var isIdle: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  var opts: FancyBoxOptions = js.native
  
  var prevIndex: Double = js.native
  
  var prevPos: Double = js.native
  
  var slides: NumberDictionary[FancyBoxSlide] = js.native
}
