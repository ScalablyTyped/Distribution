package typings.ejWebAll.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofdevice extends StObject {
  
  def isAndroid(): Boolean
  
  def isFlat(): Boolean
  
  def isIOS(): Boolean
  
  def isIOS7(): Boolean
  
  def isWindows(): Boolean
}
object Typeofdevice {
  
  @scala.inline
  def apply(
    isAndroid: () => Boolean,
    isFlat: () => Boolean,
    isIOS: () => Boolean,
    isIOS7: () => Boolean,
    isWindows: () => Boolean
  ): Typeofdevice = {
    val __obj = js.Dynamic.literal(isAndroid = js.Any.fromFunction0(isAndroid), isFlat = js.Any.fromFunction0(isFlat), isIOS = js.Any.fromFunction0(isIOS), isIOS7 = js.Any.fromFunction0(isIOS7), isWindows = js.Any.fromFunction0(isWindows))
    __obj.asInstanceOf[Typeofdevice]
  }
  
  @scala.inline
  implicit class TypeofdeviceMutableBuilder[Self <: Typeofdevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAndroid(value: () => Boolean): Self = StObject.set(x, "isAndroid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFlat(value: () => Boolean): Self = StObject.set(x, "isFlat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIOS(value: () => Boolean): Self = StObject.set(x, "isIOS", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIOS7(value: () => Boolean): Self = StObject.set(x, "isIOS7", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsWindows(value: () => Boolean): Self = StObject.set(x, "isWindows", js.Any.fromFunction0(value))
  }
}
