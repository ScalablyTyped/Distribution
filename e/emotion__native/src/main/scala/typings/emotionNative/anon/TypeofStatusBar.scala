package typings.emotionNative.anon

import org.scalablytyped.runtime.Instantiable1
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.StatusBar
import typings.reactNative.mod.StatusBarAnimation
import typings.reactNative.mod.StatusBarProps
import typings.reactNative.mod.StatusBarStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStatusBar
  extends StObject
     with Instantiable1[/* props */ ReadonlyStatusBarProps, StatusBar] {
  
  /**
    * The current height of the status bar on the device.
    * @platform android
    */
  var currentHeight: js.UndefOr[Double] = js.native
  
  /**
    * Pop a StatusBar entry from the stack.
    *
    * @param entry Entry returned from `pushStackEntry`.
    */
  def popStackEntry(entry: StatusBarProps): Unit = js.native
  
  /**
    * Push a StatusBar entry onto the stack.
    * The return value should be passed to `popStackEntry` when complete.
    *
    * @param props Object containing the StatusBar props to use in the stack entry.
    */
  def pushStackEntry(props: StatusBarProps): StatusBarProps = js.native
  
  /**
    * Replace an existing StatusBar stack entry with new props.
    *
    * @param entry Entry returned from `pushStackEntry` to replace.
    * @param props Object containing the StatusBar props to use in the replacement stack entry.
    */
  def replaceStackEntry(entry: StatusBarProps, props: StatusBarProps): StatusBarProps = js.native
  
  /**
    * Set the background color for the status bar
    * @param color Background color.
    * @param animated Animate the style change.
    */
  def setBackgroundColor(color: ColorValue): Unit = js.native
  def setBackgroundColor(color: ColorValue, animated: Boolean): Unit = js.native
  
  /**
    * Set the status bar style
    * @param style Status bar style to set
    * @param animated Animate the style change.
    */
  def setBarStyle(style: StatusBarStyle): Unit = js.native
  def setBarStyle(style: StatusBarStyle, animated: Boolean): Unit = js.native
  
  /**
    * Show or hide the status bar
    * @param hidden The dialog's title.
    * @param animation Optional animation when
    *    changing the status bar hidden property.
    */
  def setHidden(hidden: Boolean): Unit = js.native
  def setHidden(hidden: Boolean, animation: StatusBarAnimation): Unit = js.native
  
  /**
    * Control the visibility of the network activity indicator
    * @param visible Show the indicator.
    */
  def setNetworkActivityIndicatorVisible(visible: Boolean): Unit = js.native
  
  /**
    * Control the translucency of the status bar
    * @param translucent Set as translucent.
    */
  def setTranslucent(translucent: Boolean): Unit = js.native
}
