package typings.framerMotion.distThreeEntryMod

import typings.framerMotion.anon.`1`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  var current: HTMLElement | Any
  
  def getProps(): `1`
}
object Owner {
  
  inline def apply(current: HTMLElement | Any, getProps: () => `1`): Owner = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getProps = js.Any.fromFunction0(getProps))
    __obj.asInstanceOf[Owner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: HTMLElement | Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGetProps(value: () => `1`): Self = StObject.set(x, "getProps", js.Any.fromFunction0(value))
  }
}
