package typings.electron.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.electron.Electron.TouchBarButtonConstructorOptions
import typings.electron.Electron.TouchBarColorPickerConstructorOptions
import typings.electron.Electron.TouchBarConstructorOptions
import typings.electron.Electron.TouchBarGroupConstructorOptions
import typings.electron.Electron.TouchBarLabelConstructorOptions
import typings.electron.Electron.TouchBarPopoverConstructorOptions
import typings.electron.Electron.TouchBarScrubberConstructorOptions
import typings.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typings.electron.Electron.TouchBarSliderConstructorOptions
import typings.electron.Electron.TouchBarSpacerConstructorOptions
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "TouchBar")
@js.native
class TouchBar protected ()
  extends typings.electron.Electron.TouchBar {
  // Docs: https://electronjs.org/docs/api/touch-bar
  /**
    * TouchBar
    */
  def this(options: TouchBarConstructorOptions) = this()
}
object TouchBar {
  
  @JSImport("electron", "TouchBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarButton")
  @js.native
  class TouchBarButton protected ()
    extends typings.electron.Electron.TouchBarButton {
    // Docs: https://electronjs.org/docs/api/touch-bar-button
    /**
      * TouchBarButton
      */
    def this(options: TouchBarButtonConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarButton` */
  @JSImport("electron", "TouchBar.TouchBarButton")
  @js.native
  def TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typings.electron.Electron.TouchBarButton
  ] = js.native
  @scala.inline
  def TouchBarButton_=(
    x: Instantiable1[
      /* options */ TouchBarButtonConstructorOptions, 
      typings.electron.Electron.TouchBarButton
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarButton")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarColorPicker")
  @js.native
  class TouchBarColorPicker protected ()
    extends typings.electron.Electron.TouchBarColorPicker {
    // Docs: https://electronjs.org/docs/api/touch-bar-color-picker
    /**
      * TouchBarColorPicker
      */
    def this(options: TouchBarColorPickerConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarColorPicker` */
  @JSImport("electron", "TouchBar.TouchBarColorPicker")
  @js.native
  def TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typings.electron.Electron.TouchBarColorPicker
  ] = js.native
  @scala.inline
  def TouchBarColorPicker_=(
    x: Instantiable1[
      /* options */ TouchBarColorPickerConstructorOptions, 
      typings.electron.Electron.TouchBarColorPicker
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarColorPicker")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarGroup")
  @js.native
  class TouchBarGroup protected () extends EventEmitter {
    // Docs: https://electronjs.org/docs/api/touch-bar-group
    /**
      * TouchBarGroup
      */
    def this(options: TouchBarGroupConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarGroup` */
  @JSImport("electron", "TouchBar.TouchBarGroup")
  @js.native
  def TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typings.electron.Electron.TouchBarGroup
  ] = js.native
  @scala.inline
  def TouchBarGroup_=(
    x: Instantiable1[
      /* options */ TouchBarGroupConstructorOptions, 
      typings.electron.Electron.TouchBarGroup
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarGroup")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarLabel")
  @js.native
  class TouchBarLabel protected ()
    extends typings.electron.Electron.TouchBarLabel {
    // Docs: https://electronjs.org/docs/api/touch-bar-label
    /**
      * TouchBarLabel
      */
    def this(options: TouchBarLabelConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarLabel` */
  @JSImport("electron", "TouchBar.TouchBarLabel")
  @js.native
  def TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typings.electron.Electron.TouchBarLabel
  ] = js.native
  @scala.inline
  def TouchBarLabel_=(
    x: Instantiable1[
      /* options */ TouchBarLabelConstructorOptions, 
      typings.electron.Electron.TouchBarLabel
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarLabel")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarOtherItemsProxy")
  @js.native
  // Docs: https://electronjs.org/docs/api/touch-bar-other-items-proxy
  /**
    * TouchBarOtherItemsProxy
    */
  class TouchBarOtherItemsProxy () extends EventEmitter
  /* static member */
  /* was `typeof TouchBarOtherItemsProxy` */
  @JSImport("electron", "TouchBar.TouchBarOtherItemsProxy")
  @js.native
  def TouchBarOtherItemsProxy: Instantiable0[typings.electron.Electron.TouchBarOtherItemsProxy] = js.native
  @scala.inline
  def TouchBarOtherItemsProxy_=(x: Instantiable0[typings.electron.Electron.TouchBarOtherItemsProxy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarOtherItemsProxy")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarPopover")
  @js.native
  class TouchBarPopover protected ()
    extends typings.electron.Electron.TouchBarPopover {
    // Docs: https://electronjs.org/docs/api/touch-bar-popover
    /**
      * TouchBarPopover
      */
    def this(options: TouchBarPopoverConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarPopover` */
  @JSImport("electron", "TouchBar.TouchBarPopover")
  @js.native
  def TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typings.electron.Electron.TouchBarPopover
  ] = js.native
  @scala.inline
  def TouchBarPopover_=(
    x: Instantiable1[
      /* options */ TouchBarPopoverConstructorOptions, 
      typings.electron.Electron.TouchBarPopover
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarPopover")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarScrubber")
  @js.native
  class TouchBarScrubber protected ()
    extends typings.electron.Electron.TouchBarScrubber {
    // Docs: https://electronjs.org/docs/api/touch-bar-scrubber
    /**
      * TouchBarScrubber
      */
    def this(options: TouchBarScrubberConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarScrubber` */
  @JSImport("electron", "TouchBar.TouchBarScrubber")
  @js.native
  def TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typings.electron.Electron.TouchBarScrubber
  ] = js.native
  @scala.inline
  def TouchBarScrubber_=(
    x: Instantiable1[
      /* options */ TouchBarScrubberConstructorOptions, 
      typings.electron.Electron.TouchBarScrubber
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarScrubber")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarSegmentedControl")
  @js.native
  class TouchBarSegmentedControl protected ()
    extends typings.electron.Electron.TouchBarSegmentedControl {
    // Docs: https://electronjs.org/docs/api/touch-bar-segmented-control
    /**
      * TouchBarSegmentedControl
      */
    def this(options: TouchBarSegmentedControlConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarSegmentedControl` */
  @JSImport("electron", "TouchBar.TouchBarSegmentedControl")
  @js.native
  def TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typings.electron.Electron.TouchBarSegmentedControl
  ] = js.native
  @scala.inline
  def TouchBarSegmentedControl_=(
    x: Instantiable1[
      /* options */ TouchBarSegmentedControlConstructorOptions, 
      typings.electron.Electron.TouchBarSegmentedControl
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarSegmentedControl")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarSlider")
  @js.native
  class TouchBarSlider protected ()
    extends typings.electron.Electron.TouchBarSlider {
    // Docs: https://electronjs.org/docs/api/touch-bar-slider
    /**
      * TouchBarSlider
      */
    def this(options: TouchBarSliderConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarSlider` */
  @JSImport("electron", "TouchBar.TouchBarSlider")
  @js.native
  def TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typings.electron.Electron.TouchBarSlider
  ] = js.native
  @scala.inline
  def TouchBarSlider_=(
    x: Instantiable1[
      /* options */ TouchBarSliderConstructorOptions, 
      typings.electron.Electron.TouchBarSlider
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarSlider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("electron", "TouchBar.TouchBarSpacer")
  @js.native
  class TouchBarSpacer protected ()
    extends typings.electron.Electron.TouchBarSpacer {
    // Docs: https://electronjs.org/docs/api/touch-bar-spacer
    /**
      * TouchBarSpacer
      */
    def this(options: TouchBarSpacerConstructorOptions) = this()
  }
  /* static member */
  /* was `typeof TouchBarSpacer` */
  @JSImport("electron", "TouchBar.TouchBarSpacer")
  @js.native
  def TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typings.electron.Electron.TouchBarSpacer
  ] = js.native
  @scala.inline
  def TouchBarSpacer_=(
    x: Instantiable1[
      /* options */ TouchBarSpacerConstructorOptions, 
      typings.electron.Electron.TouchBarSpacer
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarSpacer")(x.asInstanceOf[js.Any])
}
