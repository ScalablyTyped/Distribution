package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers extends js.Object {
  
  def apply(by: Matchers): Matchers = js.native
  
  /**
    * Find an element by multiple matchers
    * @param by
    * @example await element(by.text('Product').and(by.id('product_name'));
    */
  def and(by: Matchers): Matchers = js.native
  
  /**
    * by.id will match an id that is given to the view via testID prop.
    * @param id
    * @example // In a React Native component add testID like so:
    * <TouchableOpacity testID={'tap_me'}>
    * // Then match with by.id:
    * await element(by.id('tap_me'));
    */
  def id(id: String): Matchers = js.native
  
  /**
    * Find an element by accessibilityLabel on iOS, or by contentDescription on Android.
    * @param label
    * @example await element(by.label('Welcome'));
    */
  def label(label: String): Matchers = js.native
  
  /**
    * Find an element by text, useful for text fields, buttons.
    * @param text
    * @example await element(by.text('Tap Me'));
    */
  def text(text: String): Matchers = js.native
  
  /**
    * Find an element with an accessibility trait. (iOS only)
    * @example await element(by.traits(['button']));
    */
  def traits(traits: js.Array[String]): Matchers = js.native
  
  /**
    * Find an element by native view type.
    * @param nativeViewType
    * @example await element(by.type('RCTImageView'));
    */
  def `type`(nativeViewType: String): Matchers = js.native
  
  /**
    * Find an element by a matcher with a parent matcher
    * @param parentBy
    * @example await element(by.id('Grandson883').withAncestor(by.id('Son883')));
    */
  def withAncestor(parentBy: Matchers): Matchers = js.native
  
  /**
    * Find an element by a matcher with a child matcher
    * @param childBy
    * @example await element(by.id('Son883').withDescendant(by.id('Grandson883')));
    */
  def withDescendant(childBy: Matchers): Matchers = js.native
}
