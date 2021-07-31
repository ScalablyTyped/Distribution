package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupDevices extends StObject {
  
  def clearDesktopBidModifier(): Unit
  
  def clearMobileBidModifier(): Unit
  
  def clearTabletBidModifier(): Unit
  
  def getDesktopBidModifier(): Double
  
  def getMobileBidModifier(): Double
  
  def getTabletBidModifier(): Double
  
  def setDesktopBidModifier(modifier: Double): Unit
  
  def setMobileBidModifier(modifier: Double): Unit
  
  def setTabletBidModifier(modifier: Double): Unit
}
object AdGroupDevices {
  
  @scala.inline
  def apply(
    clearDesktopBidModifier: () => Unit,
    clearMobileBidModifier: () => Unit,
    clearTabletBidModifier: () => Unit,
    getDesktopBidModifier: () => Double,
    getMobileBidModifier: () => Double,
    getTabletBidModifier: () => Double,
    setDesktopBidModifier: Double => Unit,
    setMobileBidModifier: Double => Unit,
    setTabletBidModifier: Double => Unit
  ): AdGroupDevices = {
    val __obj = js.Dynamic.literal(clearDesktopBidModifier = js.Any.fromFunction0(clearDesktopBidModifier), clearMobileBidModifier = js.Any.fromFunction0(clearMobileBidModifier), clearTabletBidModifier = js.Any.fromFunction0(clearTabletBidModifier), getDesktopBidModifier = js.Any.fromFunction0(getDesktopBidModifier), getMobileBidModifier = js.Any.fromFunction0(getMobileBidModifier), getTabletBidModifier = js.Any.fromFunction0(getTabletBidModifier), setDesktopBidModifier = js.Any.fromFunction1(setDesktopBidModifier), setMobileBidModifier = js.Any.fromFunction1(setMobileBidModifier), setTabletBidModifier = js.Any.fromFunction1(setTabletBidModifier))
    __obj.asInstanceOf[AdGroupDevices]
  }
  
  @scala.inline
  implicit class AdGroupDevicesMutableBuilder[Self <: AdGroupDevices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearDesktopBidModifier(value: () => Unit): Self = StObject.set(x, "clearDesktopBidModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearMobileBidModifier(value: () => Unit): Self = StObject.set(x, "clearMobileBidModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearTabletBidModifier(value: () => Unit): Self = StObject.set(x, "clearTabletBidModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDesktopBidModifier(value: () => Double): Self = StObject.set(x, "getDesktopBidModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMobileBidModifier(value: () => Double): Self = StObject.set(x, "getMobileBidModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTabletBidModifier(value: () => Double): Self = StObject.set(x, "getTabletBidModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDesktopBidModifier(value: Double => Unit): Self = StObject.set(x, "setDesktopBidModifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMobileBidModifier(value: Double => Unit): Self = StObject.set(x, "setMobileBidModifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTabletBidModifier(value: Double => Unit): Self = StObject.set(x, "setTabletBidModifier", js.Any.fromFunction1(value))
  }
}
