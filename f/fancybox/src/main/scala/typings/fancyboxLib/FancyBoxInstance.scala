package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxInstance extends FancyBoxInstanceMethods {
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
  var currIndex: scala.Double = js.native
  var currPos: scala.Double = js.native
  var current: FancyBoxSlide = js.native
  var firstRun: scala.Boolean = js.native
  var group: js.Array[FancyBoxGroupItem] = js.native
  var hasHiddenControls: scala.Boolean = js.native
  var id: scala.Double = js.native
  var idleInterval: scala.Double = js.native
  var idleSecondsCounter: scala.Double = js.native
  var isAnimating: scala.Boolean = js.native
  var isIdle: scala.Boolean = js.native
  var isVisible: scala.Boolean = js.native
  var opts: FancyBoxOptions = js.native
  var prevIndex: scala.Double = js.native
  var prevPos: scala.Double = js.native
  var slides: org.scalablytyped.runtime.NumberDictionary[FancyBoxSlide] = js.native
}

