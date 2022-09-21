package typings.foundationSites

import org.scalablytyped.runtime.Shortcut
import typings.foundationSites.FoundationSites.FoundationSitesStatic
import typings.foundationSites.FoundationSites.IAbideOptions
import typings.foundationSites.FoundationSites.IAccordionMenuOptions
import typings.foundationSites.FoundationSites.IAccordionOptions
import typings.foundationSites.FoundationSites.IDrilldownOptions
import typings.foundationSites.FoundationSites.IDropdownMenuOptions
import typings.foundationSites.FoundationSites.IDropdownOptions
import typings.foundationSites.FoundationSites.IEqualizerOptions
import typings.foundationSites.FoundationSites.IInterchangeOptions
import typings.foundationSites.FoundationSites.IMagellanOptions
import typings.foundationSites.FoundationSites.IOffCanvasOptions
import typings.foundationSites.FoundationSites.IOrbitOptions
import typings.foundationSites.FoundationSites.IPositionableOptions
import typings.foundationSites.FoundationSites.IResponsiveAccordionTabsOptions
import typings.foundationSites.FoundationSites.IResponsiveMenuOptions
import typings.foundationSites.FoundationSites.IResponsiveToggleOptions
import typings.foundationSites.FoundationSites.IRevealOptions
import typings.foundationSites.FoundationSites.ISliderOptions
import typings.foundationSites.FoundationSites.ISmoothScrollOptions
import typings.foundationSites.FoundationSites.IStickyOptions
import typings.foundationSites.FoundationSites.ITabsOptions
import typings.foundationSites.FoundationSites.ITogglerOptions
import typings.foundationSites.FoundationSites.ITooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod extends Shortcut {
  
  @JSImport("Foundation", JSImport.Namespace)
  @js.native
  val ^ : FoundationSitesStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Abide")
  @js.native
  open class Abide protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Abide {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAbideOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Accordion")
  @js.native
  open class Accordion protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Accordion {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAccordionOptions) = this()
    
    /* CompleteClass */
    override def down(target: JQuery, firstTime: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def toggle(target: JQuery): Unit = js.native
    
    /* CompleteClass */
    override def up(target: JQuery): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "AccordionMenu")
  @js.native
  open class AccordionMenu protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.AccordionMenu {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAccordionMenuOptions) = this()
    
    /* CompleteClass */
    override def down(target: JQuery, firstTime: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hideAll(): Unit = js.native
    
    /* CompleteClass */
    override def showAll(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(target: JQuery): Unit = js.native
    
    /* CompleteClass */
    override def up(target: JQuery): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Drilldown")
  @js.native
  open class Drilldown protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Drilldown {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDrilldownOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Dropdown")
  @js.native
  open class Dropdown protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Dropdown {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDropdownOptions) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "DropdownMenu")
  @js.native
  open class DropdownMenu protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.DropdownMenu {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDropdownMenuOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Equalizer")
  @js.native
  open class Equalizer protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Equalizer {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IEqualizerOptions) = this()
    
    /* CompleteClass */
    override def applyHeight(heights: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    override def applyHeightByRow(groups: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    override def getHeights(cb: js.Function): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def getHeightsByRow(cb: js.Function): js.Array[Any] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Interchange")
  @js.native
  open class Interchange protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Interchange {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IInterchangeOptions) = this()
    
    /* CompleteClass */
    override def replace(path: String): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Magellan")
  @js.native
  open class Magellan protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Magellan {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IMagellanOptions) = this()
    
    /* CompleteClass */
    override def calcPoints(): Unit = js.native
    
    /* CompleteClass */
    override def reflow(): Unit = js.native
    
    /* CompleteClass */
    override def scrollToLoc(location: String): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "OffCanvas")
  @js.native
  open class OffCanvas protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.OffCanvas {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IOffCanvasOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Orbit")
  @js.native
  open class Orbit protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Orbit {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IOrbitOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Positionable")
  @js.native
  open class Positionable protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Positionable {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IPositionableOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "ResponsiveAccordionTabs")
  @js.native
  open class ResponsiveAccordionTabs protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.ResponsiveAccordionTabs {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IResponsiveAccordionTabsOptions) = this()
    
    /* CompleteClass */
    override def close(_target: Any, args: Any*): Any = js.native
    
    /* CompleteClass */
    override def open(_target: Any, args: Any*): Any = js.native
    
    /* CompleteClass */
    var storezfData: Any = js.native
    
    /* CompleteClass */
    override def toggle(_target: Any, args: Any*): Any = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "ResponsiveMenu")
  @js.native
  open class ResponsiveMenu protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.ResponsiveMenu {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IResponsiveMenuOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "ResponsiveToggle")
  @js.native
  open class ResponsiveToggle protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.ResponsiveToggle {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IResponsiveToggleOptions) = this()
    
    /* CompleteClass */
    override def toggleMenu(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Reveal")
  @js.native
  open class Reveal protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Reveal {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IRevealOptions) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Slider")
  @js.native
  open class Slider protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Slider {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ISliderOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "SmoothScroll")
  @js.native
  open class SmoothScroll protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.SmoothScroll {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ISmoothScrollOptions) = this()
    
    /* CompleteClass */
    override def scrollToLoc(loc: String, options: Any, callback: js.Function): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Sticky")
  @js.native
  open class Sticky protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Sticky {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IStickyOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Tabs")
  @js.native
  open class Tabs protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Tabs {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITabsOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Toggler")
  @js.native
  open class Toggler protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Toggler {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITogglerOptions) = this()
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Tooltip")
  @js.native
  open class Tooltip protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Tooltip {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITooltipOptions) = this()
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  type _To = FoundationSitesStatic
  
  /* This means you don't have to write `^`, but can instead just say `foundationMod.foo` */
  override def _to: FoundationSitesStatic = ^
}
