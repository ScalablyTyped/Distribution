package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveToggle extends StObject {
  
  def toggleMenu(): Unit
}
object ResponsiveToggle {
  
  inline def apply(toggleMenu: () => Unit): ResponsiveToggle = {
    val __obj = js.Dynamic.literal(toggleMenu = js.Any.fromFunction0(toggleMenu))
    __obj.asInstanceOf[ResponsiveToggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsiveToggle] (val x: Self) extends AnyVal {
    
    inline def setToggleMenu(value: () => Unit): Self = StObject.set(x, "toggleMenu", js.Any.fromFunction0(value))
  }
}
