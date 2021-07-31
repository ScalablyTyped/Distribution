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
import typings.foundationSites.FoundationSites.IRevealOptions
import typings.foundationSites.FoundationSites.ISliderOptions
import typings.foundationSites.FoundationSites.IStickyOptions
import typings.foundationSites.FoundationSites.ITabsOptions
import typings.foundationSites.FoundationSites.ITogglerOptions
import typings.foundationSites.FoundationSites.ITooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("Foundation", JSImport.Namespace)
  @js.native
  val ^ : FoundationSitesStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Abide")
  @js.native
  class Abide protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Abide {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAbideOptions) = this()
    
    /* CompleteClass */
    override def addErrorClasses(element: JQuery): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def findFormError(element: JQuery): JQuery = js.native
    
    /* CompleteClass */
    override def findLabel(element: JQuery): Boolean = js.native
    
    /* CompleteClass */
    override def matchValidation(element: JQuery, validators: String, required: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def removeErrorClasses(element: JQuery): Unit = js.native
    
    /* CompleteClass */
    override def removeRadioErrorClasses(groupName: String): Unit = js.native
    
    /* CompleteClass */
    override def requiredChecked(element: JQuery): Boolean = js.native
    
    /* CompleteClass */
    override def resetForm(): Unit = js.native
    
    /* CompleteClass */
    override def validateForm(): Boolean = js.native
    
    /* CompleteClass */
    override def validateInput(element: JQuery): Boolean = js.native
    
    /* CompleteClass */
    override def validateRadio(groupName: String): Boolean = js.native
    
    /* CompleteClass */
    override def validateText(element: JQuery, pattern: String): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Accordion")
  @js.native
  class Accordion protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Accordion {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAccordionOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def down($target: JQuery, firstTime: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def toggle($target: JQuery): Unit = js.native
    
    /* CompleteClass */
    override def up($target: JQuery): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "AccordionMenu")
  @js.native
  class AccordionMenu protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.AccordionMenu {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAccordionMenuOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def down($target: JQuery, firstTime: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hideAll(): Unit = js.native
    
    /* CompleteClass */
    override def toggle($target: JQuery): Unit = js.native
    
    /* CompleteClass */
    override def up($target: JQuery): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Drilldown")
  @js.native
  class Drilldown protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Drilldown {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDrilldownOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Dropdown")
  @js.native
  class Dropdown protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Dropdown {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDropdownOptions) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getPositionClass(): String = js.native
    
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "DropdownMenu")
  @js.native
  class DropdownMenu protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.DropdownMenu {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDropdownMenuOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Equalizer")
  @js.native
  class Equalizer protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Equalizer {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IEqualizerOptions) = this()
    
    /* CompleteClass */
    override def applyHeight(heights: js.Array[js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def applyHeightByRow(groups: js.Array[js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getHeights(cb: js.Function): js.Array[js.Any] = js.native
    
    /* CompleteClass */
    override def getHeightsByRow(cb: js.Function): js.Array[js.Any] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Interchange")
  @js.native
  class Interchange protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Interchange {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IInterchangeOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def replace(path: String): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Magellan")
  @js.native
  class Magellan protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Magellan {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IMagellanOptions) = this()
    
    /* CompleteClass */
    override def calcPoints(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def reflow(): Unit = js.native
    
    /* CompleteClass */
    override def scrollToLoc(location: String): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "OffCanvas")
  @js.native
  class OffCanvas protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.OffCanvas {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IOffCanvasOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Orbit")
  @js.native
  class Orbit protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Orbit {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IOrbitOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Reveal")
  @js.native
  class Reveal protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Reveal {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IRevealOptions) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Slider")
  @js.native
  class Slider protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Slider {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ISliderOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Sticky")
  @js.native
  class Sticky protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Sticky {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IStickyOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Tabs")
  @js.native
  class Tabs protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Tabs {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITabsOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Toggler")
  @js.native
  class Toggler protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Toggler {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITogglerOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("Foundation", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends StObject
       with typings.foundationSites.FoundationSites.Tooltip {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITooltipOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  type _To = FoundationSitesStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FoundationSitesStatic = ^
}
