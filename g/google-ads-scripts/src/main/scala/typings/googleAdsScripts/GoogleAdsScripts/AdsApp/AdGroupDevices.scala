package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starting point for device-dependent ad group configurations. */
trait AdGroupDevices extends StObject {
  
  /** Clears the desktop bid modifier for this ad group. */
  def clearDesktopBidModifier(): Unit
  
  /** Clears the mobile bid modifier for this ad group. */
  def clearMobileBidModifier(): Unit
  
  /** Clears the tablet bid modifier for this ad group. */
  def clearTabletBidModifier(): Unit
  
  /** Returns the desktop bid modifier for this ad group. */
  def getDesktopBidModifier(): Double
  
  /** Returns the mobile bid modifier for this ad group. */
  def getMobileBidModifier(): Double
  
  /** Returns the tablet bid modifier for this ad group. */
  def getTabletBidModifier(): Double
  
  /** Sets the desktop bid modifier for this ad group to the specified value. */
  def setDesktopBidModifier(modifier: Double): Unit
  
  /** Sets the mobile bid modifier for this ad group to the specified value. */
  def setMobileBidModifier(modifier: Double): Unit
  
  /** Sets the tablet bid modifier for this ad group to the specified value. */
  def setTabletBidModifier(modifier: Double): Unit
}
object AdGroupDevices {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AdGroupDevices] (val x: Self) extends AnyVal {
    
    inline def setClearDesktopBidModifier(value: () => Unit): Self = StObject.set(x, "clearDesktopBidModifier", js.Any.fromFunction0(value))
    
    inline def setClearMobileBidModifier(value: () => Unit): Self = StObject.set(x, "clearMobileBidModifier", js.Any.fromFunction0(value))
    
    inline def setClearTabletBidModifier(value: () => Unit): Self = StObject.set(x, "clearTabletBidModifier", js.Any.fromFunction0(value))
    
    inline def setGetDesktopBidModifier(value: () => Double): Self = StObject.set(x, "getDesktopBidModifier", js.Any.fromFunction0(value))
    
    inline def setGetMobileBidModifier(value: () => Double): Self = StObject.set(x, "getMobileBidModifier", js.Any.fromFunction0(value))
    
    inline def setGetTabletBidModifier(value: () => Double): Self = StObject.set(x, "getTabletBidModifier", js.Any.fromFunction0(value))
    
    inline def setSetDesktopBidModifier(value: Double => Unit): Self = StObject.set(x, "setDesktopBidModifier", js.Any.fromFunction1(value))
    
    inline def setSetMobileBidModifier(value: Double => Unit): Self = StObject.set(x, "setMobileBidModifier", js.Any.fromFunction1(value))
    
    inline def setSetTabletBidModifier(value: Double => Unit): Self = StObject.set(x, "setTabletBidModifier", js.Any.fromFunction1(value))
  }
}
